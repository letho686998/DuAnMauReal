/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import DomainModels.NhanVien;
import Repositories.INhanVienrepository;
import Repositories.NhanVienRepository;
import ViewModels.QLNhanVien;
import java.util.ArrayList;

public class ManagerNhanVienService implements IManageNhanVienService {

    private final INhanVienrepository _inINhanVienrepository;
    private ArrayList<QLNhanVien> _lstqlNhanVien;

    public ManagerNhanVienService() {
        _inINhanVienrepository = new NhanVienRepository();
        _lstqlNhanVien = new ArrayList<>();
    }

    @Override
    public ArrayList<QLNhanVien> selectAllkh() {
        _lstqlNhanVien = new ArrayList<>();
        var nhanviens = _inINhanVienrepository.selectAll();
        for (NhanVien nhanvien : nhanviens) {
            _lstqlNhanVien.add(new QLNhanVien(nhanvien.getId(), nhanvien.getMa(),
                    nhanvien.getTen(), nhanvien.getGioiTinh(),
                    nhanvien.getNgaySinh(), nhanvien.getDiaChi(),
                    nhanvien.getSdt(), nhanvien.getMatKhau(),
                    nhanvien.getIdCh(), nhanvien.getIdCv(), nhanvien.getIdGuiBC(),
                    nhanvien.getTrangThai()
            ));
        }
        return _lstqlNhanVien;
    }

    @Override
    public QLNhanVien insert(QLNhanVien qLNhanVien) {
        var x = _inINhanVienrepository.insert(new NhanVien(qLNhanVien.getMa(), qLNhanVien.getTen(), qLNhanVien.getGioiTinh(), new java.sql.Date(qLNhanVien.getNgaySinh().getTime()),
                qLNhanVien.getDiaChi(), qLNhanVien.getSdt(), qLNhanVien.getMatKhau(), qLNhanVien.getTrangThai()));
        return new QLNhanVien(x.getMa(), x.getTen(), x.getGioiTinh(), new java.sql.Date(x.getNgaySinh().getTime()), x.getDiaChi(), x.getSdt(), x.getMatKhau(), x.getTrangThai());
    }

    @Override
    public QLNhanVien update(QLNhanVien qLNhanVien) {
     var x = _inINhanVienrepository.update(new NhanVien(qLNhanVien.getMa(), qLNhanVien.getTen(), qLNhanVien.getGioiTinh(), new java.sql.Date(qLNhanVien.getNgaySinh().getTime()),
                qLNhanVien.getDiaChi(), qLNhanVien.getSdt(), qLNhanVien.getMatKhau(), qLNhanVien.getTrangThai()));
        return new QLNhanVien(x.getMa(), x.getTen(), x.getGioiTinh(), new java.sql.Date(x.getNgaySinh().getTime()), x.getDiaChi(), x.getSdt(), x.getMatKhau(), x.getTrangThai());
    }

    @Override
    public String delete(String ma) {
        return _inINhanVienrepository.delete(ma);
      }

    @Override
    public ArrayList<QLNhanVien> selectById(String ma) {
        _lstqlNhanVien= new ArrayList<>();
        var nhanViens = _inINhanVienrepository.selectById(ma);
        for (NhanVien nhanVien : nhanViens) {
            _lstqlNhanVien.add(new QLNhanVien(nhanVien.getMa(), nhanVien.getTen(), nhanVien.getGioiTinh(),
                    nhanVien.getNgaySinh(), nhanVien.getDiaChi(), nhanVien.getSdt(), nhanVien.getMatKhau(), nhanVien.getTrangThai()));
        }
        return _lstqlNhanVien;
      }

}
