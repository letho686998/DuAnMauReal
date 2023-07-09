/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import DomainModels.SanPham2;
import Repositories.SanPham2Repository;
import java.util.ArrayList;

/**
 *
 * @author LENOVO
 */
public class SanPham2Service {
    private SanPham2Repository sanPham2Repository= new SanPham2Repository();
    public ArrayList<SanPham2> getlistSp(){
        return sanPham2Repository.getListSanPham();
    }
}
