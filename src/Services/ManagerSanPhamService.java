/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import DomainModels.SanPham;
import Repositories.IKhachHangRepository;
import Repositories.ISanPhamRepository;
import Repositories.KhachHangRepository;
import Repositories.SanPhamRepository;
import ViewModels.QLKhachHang;
import ViewModels.QlSanPham;
import java.util.ArrayList;

public class ManagerSanPhamService implements IManagerSanPhamService {

    private final ISanPhamRepository _isISanPhamRepository;
    private ArrayList<QlSanPham> _lstSanPham;

    public ManagerSanPhamService() {
        _isISanPhamRepository = new SanPhamRepository();
        _lstSanPham = new ArrayList<>();
    }

    @Override
    public ArrayList<QlSanPham> selectAllkh() {
        _lstSanPham = new ArrayList<>();
        var sanphams = _isISanPhamRepository.selectAll();
        for (SanPham sanpham : sanphams) {
            _lstSanPham.add(new QlSanPham(sanpham.getId(), sanpham.getMa(), sanpham.getTen()));
        }
        return _lstSanPham;
    }

    @Override
    public QlSanPham insert(QlSanPham qlSanPham) {
        var x = _isISanPhamRepository.insert(new SanPham( qlSanPham.getMa(), qlSanPham.getTen()));
        return new QlSanPham( x.getMa(), x.getTen());
    }

    @Override
    public QlSanPham update(QlSanPham qlSanPham) {
        var x = _isISanPhamRepository.update(new SanPham( qlSanPham.getId(),qlSanPham.getTen(), qlSanPham.getMa()));
        return new QlSanPham( x.getId(),x.getTen(), x.getMa());
    }

    @Override
    public String delete(String ma) {
        return _isISanPhamRepository.delete(ma);
    }

    @Override
    public ArrayList<QlSanPham> selectById(String ma) {
        _lstSanPham = new ArrayList<>();
        var sap = _isISanPhamRepository.selectById(ma);
        for (SanPham sanPham : sap) {
            _lstSanPham.add(new QlSanPham( sanPham.getMa(), sanPham.getTen()));
        }
        return _lstSanPham;
    }

}
