/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.util.Date;

/**
 *
 * @author dangdinhtho
 */
public class NhanKhau {

    public NhanKhau() {
        this.hoTen = "";
        this.biDanh = "";
        this.CMND = "";
        this.lichSuChinhSua = "";
        this.gioiTinh = "";
        this.queQuan = "";
        this.tonGiao = "";
        this.ngheNghiep = "";
        this.noiTTTruocKhiChuyenDen = "";
        this.danToc = "";
        this.soHoKhau = "";
        this.quanHeVoiChuHo = "";
        this.noiDen = "";
        this.liDoChuyenDi = "";
    }
    
    
    private String hoTen;
    private String biDanh;
    private Date ngaySinh;
    private String CMND;
    private String gioiTinh;
    private String queQuan;
    private String tonGiao;
    private String ngheNghiep;
    private Date ngayChuyenDen;
    private String noiTTTruocKhiChuyenDen;
    private String danToc;
    private String soHoKhau;
    private String quanHeVoiChuHo;
    private boolean chuHo = false;
    private Date ngayChuyenDi;
    private String noiDen;
    private String liDoChuyenDi;
    private int ID;
    private String lichSuChinhSua;
    private boolean TamTru;
    private boolean daMat;
    private String noiChuyenDi;
   

    public String getNoiChuyenDi() {
        return noiChuyenDi;
    }

    public void setNoiChuyenDi(String noiChuyenDi) {
        this.noiChuyenDi = noiChuyenDi;
    }

    public boolean isDaMat() {
        return daMat;
    }

    public void setDaMat(boolean daMat) {
        this.daMat = daMat;
    }

    public boolean isTamTru() {
        return TamTru;
    }

    public void setTamTru(boolean TamTru) {
        this.TamTru = TamTru;
    }

    public boolean isTamVang() {
        return TamVang;
    }

    public void setTamVang(boolean TamVang) {
        this.TamVang = TamVang;
    }
    private boolean TamVang;

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


    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public String getTonGiao() {
        return tonGiao;
    }

    public void setTonGiao(String tonGiao) {
        this.tonGiao = tonGiao;
    }

    public String getNgheNghiep() {
        return ngheNghiep;
    }

    public void setNgheNghiep(String ngheNghiep) {
        this.ngheNghiep = ngheNghiep;
    }

    public Date getNgayChuyenDen() {
        return ngayChuyenDen;
    }

    public void setNgayChuyenDen(Date ngayChuyenDen) {
        this.ngayChuyenDen = ngayChuyenDen;
    }

    public String getNoiTTTruocKhiChuyenDen() {
        return noiTTTruocKhiChuyenDen;
    }

    public void setNoiTTTruocKhiChuyenDen(String noiTTTruocKhiChuyenDen) {
        this.noiTTTruocKhiChuyenDen = noiTTTruocKhiChuyenDen;
    }

    public Date getNgayChuyenDi() {
        return ngayChuyenDi;
    }

    public void setNgayChuyenDi(Date ngayChuyenDi) {
        this.ngayChuyenDi = ngayChuyenDi;
    }

    public String getNoiDen() {
        return noiDen;
    }

    public void setNoiDen(String noiDen) {
        this.noiDen = noiDen;
    }

    public String getLiDoChuyenDi() {
        return liDoChuyenDi;
    }

    public void setLiDoChuyenDi(String liDoChuyenDi) {
        this.liDoChuyenDi = liDoChuyenDi;
    }
    

    public String getCMND() {
        return CMND;
    }

    public void setCMND(String CMND) {
        this.CMND = CMND;
    }

    public String getQuanHeVoiChuHo() {
        return quanHeVoiChuHo;
    }

    public void setQuanHeVoiChuHo(String quanHeVoiChuHo) {
        this.quanHeVoiChuHo = quanHeVoiChuHo;
    }

    public boolean isChuHo() {
        return chuHo;
    }

    public void setChuHo(boolean chuHo) {
        this.chuHo = chuHo;
    }
   

    public String getHoTen() {
        return hoTen;
    }

    public String getBiDanh() {
        return biDanh;
    }

    public Date getNgaysinh() {
        return ngaySinh;
    }

 

    public String getGioiTinh() {
        return gioiTinh;
    }

    public String getDanToc() {
        return danToc;
    }
   

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setBiDanh(String biDanh) {
        this.biDanh = biDanh;
    }

    public void setNgaysinh(Date ngaysinh) {
        this.ngaySinh = ngaysinh;
    }



    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public void setDanToc(String danToc) {
        this.danToc = danToc;
    }

    public String getSoHoKhau() {
        return soHoKhau;
    }

    public void setSoHoKhau(String soHoKhau) {
        this.soHoKhau = soHoKhau;
    }
}
