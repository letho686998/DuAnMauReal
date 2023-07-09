/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import DomainModels.ChucVu;
import Repositories.ChucVuRepository;
import Repositories.IChucVuRepository;
import ViewModels.QlChucVu;
import java.util.ArrayList;

public class ManageChucVuService implements IManageChucvuService {

    private final IChucVuRepository _iChucVuRepository;
    private ArrayList<QlChucVu> _listChucVu;

    public ManageChucVuService() {
        _iChucVuRepository = new ChucVuRepository();
        _listChucVu = new ArrayList<>();
    }

    @Override
    public ArrayList<QlChucVu> selectAllkh() {
        _listChucVu = new ArrayList<>();
        var chucVus = _iChucVuRepository.selectAll();
        for (ChucVu chucVu : chucVus) {
            _listChucVu.add(new QlChucVu(chucVu.getMa(), chucVu.getTen()));
        }
        return _listChucVu;
    }

    @Override
    public QlChucVu insert(QlChucVu qlChucVu) {
        var x = _iChucVuRepository.insert(new ChucVu(qlChucVu.getMa(), qlChucVu.getTen()));
        return new QlChucVu(x.getMa(), x.getTen());
    }

    @Override
    public QlChucVu update(QlChucVu qlChucVu) {
        var x = _iChucVuRepository.update(new ChucVu(qlChucVu.getMa(), qlChucVu.getTen()));
        return new QlChucVu(x.getMa(), x.getTen());
    }

    @Override
    public String delete(String ma) {
        return _iChucVuRepository.delete(ma);
    }

    @Override
    public ArrayList<QlChucVu> selectById(String ma) {
        _listChucVu = new ArrayList<>();
        var chv = _iChucVuRepository.selectById(ma);
        for (ChucVu chucVu : chv) {
            _listChucVu.add(new QlChucVu(chucVu.getMa(), chucVu.getTen()));
        }
        return _listChucVu;
    }

}
