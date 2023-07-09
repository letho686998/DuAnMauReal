/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import DomainModels.DongSp;
import Repositories.DongSpRepository;
import Repositories.IDongspRepository;
import ViewModels.QlDongSp;
import java.util.ArrayList;

/**
 *
 * @author LENOVO
 */
public class ManagerDongspService implements IManagerDongSpService {

    private final IDongspRepository _idDongspRepository;
    private ArrayList<QlDongSp> _lstqlDongsp;

    public ManagerDongspService() {
        _idDongspRepository = new DongSpRepository();
        _lstqlDongsp = new ArrayList<>();
    }

    @Override
    public ArrayList<QlDongSp> selectAllkh() {
        _lstqlDongsp = new ArrayList<>();
        var x = _idDongspRepository.selectAll();
        for (DongSp dongSp : x) {
            _lstqlDongsp.add(new QlDongSp(dongSp.getId(), dongSp.getMa(), dongSp.getTen()));
        }
        return _lstqlDongsp;
    }

    @Override
    public QlDongSp insert(QlDongSp qlDongSp) {
        var x = _idDongspRepository.insert(new DongSp(qlDongSp.getMa(), qlDongSp.getTen()));
        return new QlDongSp(x.getMa(), x.getTen());
    }

    @Override
    public QlDongSp update(QlDongSp qlDongSp) {
        var x = _idDongspRepository.update(new DongSp(qlDongSp.getMa(), qlDongSp.getTen()));
        return new QlDongSp(x.getMa(), x.getTen());
    }

    @Override
    public String delete(String ma) {
        _idDongspRepository.delete(ma);
        return ma;
    }

    @Override
    public ArrayList<QlDongSp> selectById(String ma) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
