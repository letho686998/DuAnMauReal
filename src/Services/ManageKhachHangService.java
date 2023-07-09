/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import DomainModels.KhachHang;
import Repositories.IKhachHangRepository;
import Repositories.KhachHangRepository;
import ViewModels.QLKhachHang;
import java.util.ArrayList;

public class ManageKhachHangService implements IManageKhachHangService {

    private final IKhachHangRepository _ikhHangRepository;
    private ArrayList<QLKhachHang> _lstQlKhachHang;

    public ManageKhachHangService() {
        _ikhHangRepository = new KhachHangRepository();
        _lstQlKhachHang = new ArrayList<>();
    }

    @Override
    public QLKhachHang insert(QLKhachHang qlkhachHang) {
        // qlkhachHang.setId(null);
        var x = _ikhHangRepository.insert(new KhachHang(qlkhachHang.getMa(), qlkhachHang.getTen(), new java.sql.Date(qlkhachHang.getNgaySinh().getTime()), qlkhachHang.getSdt(), qlkhachHang.getDiaChi(), qlkhachHang.getThanhPho(),
                qlkhachHang.getQuocGia(), qlkhachHang.getMatKhau()));
        return new QLKhachHang(x.getMa(), x.getTen(), new java.sql.Date(x.getNgaySinh().getTime()), x.getSdt(), x.getDiaChi(), x.getThanhPho(), x.getQuocGia(), x.getMatKhau());

    }

    @Override
    public QLKhachHang update(QLKhachHang qlkhachHang) {
        var x = _ikhHangRepository.update(new KhachHang(qlkhachHang.getMa(), qlkhachHang.getTen(), new java.sql.Date(qlkhachHang.getNgaySinh().getTime()), qlkhachHang.getSdt(), qlkhachHang.getDiaChi(), qlkhachHang.getThanhPho(),
                qlkhachHang.getQuocGia(), qlkhachHang.getMatKhau()));
        return new QLKhachHang(x.getMa(), x.getTen(), new java.sql.Date(x.getNgaySinh().getTime()), x.getSdt(), x.getDiaChi(), x.getThanhPho(), x.getQuocGia(), x.getMatKhau());

    }

    @Override
    public String delete(String ma) {
        return _ikhHangRepository.delete(ma);
    }

//    @Override
//    public QLKhachHang selectById(String ma) {
//
//        var x = _ikhHangRepository.selectById(ma);
//        return new QLKhachHang(x.getMa(), x.getTen(),
//                x.getNgaySinh(), x.getSdt(), x.getDiaChi(),
//                x.getThanhPho(), x.getQuocGia(), x.getMatKhau());
//    }
    @Override
    public ArrayList<QLKhachHang> selectAllkh() {
        _lstQlKhachHang = new ArrayList<>();
        var khachhangs = _ikhHangRepository.selectAll();
        for (KhachHang k : khachhangs) {
            _lstQlKhachHang.add(new QLKhachHang(k.getId(), k.getMa(),
                    k.getTen(), k.getNgaySinh(), k.getSdt(), k.getDiaChi(),
                    k.getThanhPho(), k.getQuocGia(), k.getMatKhau()));
        }
        return _lstQlKhachHang;
    }

    @Override
    public ArrayList<QLKhachHang> selectById(String ma) {
        _lstQlKhachHang = new ArrayList<>();
        var khs = _ikhHangRepository.selectById(ma);
        for (KhachHang k : khs) {
            _lstQlKhachHang.add(new QLKhachHang(k.getId(), k.getMa(),
                    k.getTen(), k.getNgaySinh(), k.getSdt(), k.getDiaChi(),
                    k.getThanhPho(), k.getQuocGia(), k.getMatKhau()));

        }
        return _lstQlKhachHang;
    }

}
