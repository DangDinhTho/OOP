/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.util.ArrayList;

/**
 *
 * @author dangdinhtho
 */
public class HoKhau {
    
    private String soHoKhau;
    private String lichSuChinhSua;
    private String hoTenChuHo;
    private String soNha;
    private String duong;
    private String phuong;
    private String quan;
    private String tinh;
    private ArrayList<NhanKhau> dsNhanKhaus;
   

    public NhanKhau getChuHo (){
     
     for(int i = 0; i < dsNhanKhaus.size(); i++){
                    if(dsNhanKhaus.get(i).isChuHo()){
                        return dsNhanKhaus.get(i);
                        
                    }
                }
     return null;
    }

    public String getLichSuChinhSua() {
        return lichSuChinhSua;
    }

    public void setLichSuChinhSua(String lichSuChinhSua) {
        if(this.lichSuChinhSua == null || this.lichSuChinhSua.equals("") || this.lichSuChinhSua.equals("null")){
            this.lichSuChinhSua = lichSuChinhSua;
        }
        else
        this.lichSuChinhSua += lichSuChinhSua;
    }
  
    public String getSoHoKhau() {
        return soHoKhau;
    }

    public String getHoTenChuHo() {
        return hoTenChuHo;
    }

    public String getSoNha() {
        return soNha;
    }

    public String getDuong() {
        return duong;
    }

    public String getPhuong() {
        return phuong;
    }

    public void setSoHoKhau(String soHoKhau) {
        this.soHoKhau = soHoKhau;
    }

    public void setHoTenChuHo(String hoTenChuHo) {
        this.hoTenChuHo = hoTenChuHo;
    }

    public void setSoNha(String soNha) {
        this.soNha = soNha;
    }

    public void setDuong(String duong) {
        this.duong = duong;
    }

    public void setPhuong(String phuong) {
        this.phuong = phuong;
    }

    public void setQuan(String quan) {
        this.quan = quan;
    }

    public void setTinh(String tinh) {
        this.tinh = tinh;
    }

    public void setDsNhanKhaus(ArrayList<NhanKhau> dsNhanKhaus) {
        this.dsNhanKhaus = dsNhanKhaus;
    }

    public String getQuan() {
        return quan;
    }

    public String getTinh() {
        return tinh;
    }

    public ArrayList<NhanKhau> getDsNhanKhaus() {
        return dsNhanKhaus;
    }
    
    
}
