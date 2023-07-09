/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DomainModels;


public class Mausac {
    private String Id;
    private String ma;
    private String ten;

    public Mausac() {
    }

    public Mausac( String ma, String ten) {
        
        this.ma = ma;
        this.ten = ten;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    @Override
    public String toString() {
        return "Mausac{" + "Id=" + Id + ", ma=" + ma + ", ten=" + ten + '}';
    }
    
}
