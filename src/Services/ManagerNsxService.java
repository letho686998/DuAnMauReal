/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;


import DomainModels.NSX;
import Repositories.INhaSX;
import Repositories.NSXRepository;


import ViewModels.QLNsx;
import java.util.ArrayList;

public class ManagerNsxService implements IManagerNSXService {

    private final INhaSX _INhaSX;
    private ArrayList<QLNsx> _lstLNsxs;

    public ManagerNsxService() {
        _INhaSX = new NSXRepository();
        _lstLNsxs = new ArrayList<>();
    }

    @Override
    public ArrayList<QLNsx> selectAllkh() {
        _lstLNsxs = new ArrayList<>();
        var nsxs = _INhaSX.selectAll();
        for (NSX k : nsxs) {
            _lstLNsxs.add(new QLNsx(k.getId(),
                    k.getMa(), k.getTen()));
        }
        return _lstLNsxs;
    }

    @Override
    public QLNsx insert(QLNsx qln) {
        var x = _INhaSX.insert(new NSX(qln.getMa(), qln.getTen()));
        return new QLNsx(x.getMa(), x.getTen());
    }

    @Override
    public QLNsx update(QLNsx qln) {
        var x = _INhaSX.update(new NSX(qln.getId(),qln.getTen(),qln.getMa()));
        return new QLNsx(x.getId(),x.getTen(),x.getMa());
    }

    @Override
    public String delete(String ma) {
        return _INhaSX.delete(ma);
    }

    @Override
    public ArrayList<QLNsx> selectById(String ma) {
        _lstLNsxs = new ArrayList<>();
        var ds = _INhaSX.selectById(ma);
        for (NSX k : ds) {
            _lstLNsxs.add(new QLNsx(k.getId(),
                    k.getMa(), k.getTen()));
        }
        return _lstLNsxs;
     }

}
