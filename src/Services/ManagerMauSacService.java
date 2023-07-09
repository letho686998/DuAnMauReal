/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import DomainModels.Mausac;
import Repositories.IMauSacRepository;
import Repositories.MauSacRepository;
import ViewModels.QlMauSac;
import java.util.ArrayList;

/**
 *
 * @author LENOVO
 */
public class ManagerMauSacService implements ImanagerMauSacService {

    private final IMauSacRepository _imaIMauSacRepository;
    private ArrayList<QlMauSac> _lstqlMauSac;

    public ManagerMauSacService() {
        _imaIMauSacRepository = new MauSacRepository();
        _lstqlMauSac = new ArrayList<>();
    }

    @Override
    public ArrayList<QlMauSac> selectAllkh() {
        _lstqlMauSac = new ArrayList<>();
        var x = _imaIMauSacRepository.selectAll();
        for (Mausac mausac : x) {
            _lstqlMauSac.add(new QlMauSac(mausac.getId(),mausac.getMa(), mausac.getTen()));
        }
        return _lstqlMauSac;
    }

    @Override
    public QlMauSac insert(QlMauSac qlMauSac) {
        var x = _imaIMauSacRepository.insert(new Mausac(qlMauSac.getMa(), qlMauSac.getTen()));
        return new QlMauSac(x.getMa(), x.getTen());
    }

    @Override
    public QlMauSac update(QlMauSac qlMauSac) {
        var x = _imaIMauSacRepository.update(new Mausac(qlMauSac.getMa(), qlMauSac.getTen()));
        return new QlMauSac(x.getMa(), x.getTen());
    }

    @Override
    public String delete(String ma) {
        _imaIMauSacRepository.delete(ma);
        return ma;
    }

    @Override
    public ArrayList<QlMauSac> selectById(String ma) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
