/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Models.HoKhau;
import Models.NhanKhau;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;

/**
 *
 * @author dangdinhtho
 */
public class DAO {
    private Connection conn;
    public DAO() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/SoHoKhauDienTu", "root","Tho12345");
        } catch (Exception e) {
            e.printStackTrace();
        }
    
}
    public ArrayList<NhanKhau> getListNhanKhau(String s){
        ArrayList<NhanKhau> list = new ArrayList<>();
        String sql = "SELECT * FROM NhanKhau WHERE (HoTen LIKE ? OR BiDanh LIKE ? OR CMND LIKE ? OR SoHoKhau LIKE ?) AND DaMat = FALSE";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, s);
            ps.setString(2, s);
            ps.setString(3, s);
            ps.setString(4, s);
            
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                NhanKhau n = new NhanKhau();
                n.setHoTen(rs.getString("HoTen"));
                n.setBiDanh(rs.getString("BiDanh"));
                n.setSoHoKhau(rs.getString("SoHoKhau"));
                n.setNgaysinh(rs.getDate("NgaySinh"));
                n.setGioiTinh(rs.getString("GioiTinh"));
                n.setQueQuan(rs.getString("QueQuan"));
                n.setDanToc(rs.getString("DanToc"));
                n.setTonGiao(rs.getString("TonGiao"));
                n.setNgheNghiep(rs.getString("NgheNghiep"));
                n.setCMND(rs.getString("CMND"));
                n.setNgayChuyenDen(rs.getDate("NgayChuyenDen"));
                n.setNoiTTTruocKhiChuyenDen(rs.getString("NoiTTTruocKhiChuyenDen"));
                n.setNgayChuyenDi(rs.getDate("NgayChuyenDi"));
                n.setNoiChuyenDi(rs.getString("NoiChuyenDi"));
                n.setLiDoChuyenDi(rs.getString("LyDoChuyenDi"));
                n.setQuanHeVoiChuHo(rs.getString("QuanHeVoiChuHo"));
                n.setID(rs.getInt("ID"));
                n.setLichSuChinhSua(rs.getString("ChinhSua"));
                n.setChuHo(rs.getBoolean("ChuHo"));
                n.setTamTru(rs.getBoolean("TamTru"));
                n.setTamVang(rs.getBoolean("TamVang"));
                n.setDaMat(rs.getBoolean("DaMat"));
                list.add(n);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return list;
    }
    
    public ArrayList<HoKhau> getListHoKhau(String keyWord){
        ArrayList<HoKhau> list = new ArrayList<>();
        String sql = "SELECT * FROM HoKhau WHERE HoTenChuHo LIKE ? OR SoHoKhau LIKE ? ";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, keyWord);
            ps.setString(2, keyWord);
            
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                HoKhau hoKhau = new HoKhau();
                hoKhau.setHoTenChuHo(rs.getNString("HoTenChuHo"));
            hoKhau.setSoHoKhau(rs.getString("SoHoKhau"));
            hoKhau.setDuong(rs.getNString("Duong"));
            hoKhau.setPhuong(rs.getNString("Phuong"));
            hoKhau.setQuan(rs.getNString("Quan"));
            hoKhau.setTinh(rs.getNString("ThanhPho"));
            hoKhau.setSoNha(rs.getString("SoNha"));
            hoKhau.setLichSuChinhSua(rs.getString("ChinhSua"));
                list.add(hoKhau);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return list;
    }
    
    public HoKhau getHoKhau(String soHoKhau){
        HoKhau hoKhau = new HoKhau();
        ArrayList<NhanKhau> nhanKhaus = new ArrayList<>();
        String sql = "SELECT * FROM HoKhau WHERE SoHoKhau = ?";
        try {
           
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, soHoKhau);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
            hoKhau.setHoTenChuHo(rs.getNString("HoTenChuHo"));
            hoKhau.setSoHoKhau(soHoKhau);
            hoKhau.setDuong(rs.getNString("Duong"));
            hoKhau.setPhuong(rs.getNString("Phuong"));
            hoKhau.setQuan(rs.getNString("Quan"));
            hoKhau.setTinh(rs.getNString("ThanhPho"));
            hoKhau.setSoNha(rs.getString("SoNha"));
            hoKhau.setLichSuChinhSua(rs.getString("ChinhSua"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        String sql2 = "SELECT * FROM NhanKhau WHERE SoHoKhau = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql2);
            ps.setString(1, soHoKhau);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                NhanKhau n = new NhanKhau();
                n.setHoTen(rs.getString("HoTen"));
                n.setBiDanh(rs.getString("BiDanh"));
                n.setSoHoKhau(rs.getString("SoHoKhau"));
                n.setNgaysinh(rs.getDate("NgaySinh"));
                n.setGioiTinh(rs.getString("GioiTinh"));
                n.setQueQuan(rs.getString("QueQuan"));
                n.setDanToc(rs.getString("DanToc"));
                n.setTonGiao(rs.getString("TonGiao"));
                n.setNgheNghiep(rs.getString("NgheNghiep"));
                n.setCMND(rs.getString("CMND"));
                n.setNgayChuyenDen(rs.getDate("NgayChuyenDen"));
                n.setNoiTTTruocKhiChuyenDen(rs.getString("NoiTTTruocKhiChuyenDen"));
                n.setNgayChuyenDi(rs.getDate("NgayChuyenDi"));
                n.setNoiChuyenDi(rs.getString("NoiChuyenDi"));
                n.setLiDoChuyenDi(rs.getString("LyDoChuyenDi"));
                n.setQuanHeVoiChuHo(rs.getString("QuanHeVoiChuHo"));
                n.setID(rs.getInt("ID"));
                n.setLichSuChinhSua(rs.getString("ChinhSua"));
                n.setChuHo(rs.getBoolean("ChuHo"));
                n.setTamTru(rs.getBoolean("TamTru"));
                n.setTamVang(rs.getBoolean("TamVang"));
                n.setDaMat(rs.getBoolean("DaMat"));
                nhanKhaus.add(n);
            }
            hoKhau.setDsNhanKhaus(nhanKhaus);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return hoKhau;
    }
    
    public boolean CheckHaveNhanKhau(String CMND){
        if(CMND == null || CMND == "") return false;
        String sql = "SELECT CMND FROM NhanKhau WHERE CMND = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, CMND);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return false;
    }
    
    public boolean CheckHaveHoKhau(String soHoKhau){
        String sql = "SELECT SoHoKhau FROM HoKhau WHERE SoHoKhau = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, soHoKhau);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return false;
    }
    
    public boolean ThemNhanKhau(NhanKhau nhanKhau){
        
        String sql = "";
        
        if(nhanKhau.getNgayChuyenDen() != null ){
            sql = "INSERT INTO NhanKhau (HoTen, BiDanh, NgaySinh, QueQuan, GioiTinh, DanToc, TonGiao, CMND, "
                + "NgheNghiep, NoiTTTruocKhiChuyenDen, QuanHeVoiChuHo, SoHoKhau, ChuHo, TamTru, NgayChuyenDen) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        }
        else{
             sql = "INSERT INTO NhanKhau (HoTen, BiDanh, NgaySinh, QueQuan, GioiTinh, DanToc, TonGiao, CMND, "
                + "NgheNghiep, NoiTTTruocKhiChuyenDen, QuanHeVoiChuHo, SoHoKhau, ChuHo, TamTru) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        }
        
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, nhanKhau.getHoTen());
            ps.setString(2, nhanKhau.getBiDanh());
            ps.setTimestamp(3, new  Timestamp(nhanKhau.getNgaysinh().getTime()));
            ps.setString(4, nhanKhau.getQueQuan());
            ps.setString(5, nhanKhau.getGioiTinh());
            ps.setString(6, nhanKhau.getDanToc());
            ps.setString(7, nhanKhau.getTonGiao());
            ps.setString(8, nhanKhau.getCMND());
            ps.setString(9, nhanKhau.getNgheNghiep());
            
            ps.setString(10, nhanKhau.getNoiTTTruocKhiChuyenDen());
            ps.setString(11, nhanKhau.getQuanHeVoiChuHo());
            ps.setString(12, nhanKhau.getSoHoKhau());
            ps.setBoolean(13, nhanKhau.isChuHo());
            ps.setBoolean(14, nhanKhau.isTamTru());
            
            if(nhanKhau.getNgayChuyenDen() != null ){
                ps.setTimestamp(15, new Timestamp(nhanKhau.getNgayChuyenDen().getTime()));
            }
            
            
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public boolean ThemHoKhau(HoKhau hoKhau){
        String sql = "INSERT INTO HoKhau (SoHoKhau, HoTenChuHo, SoNha, Duong, Phuong, Quan, ThanhPho) VALUE(?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, hoKhau.getSoHoKhau());
            ps.setString(2, hoKhau.getHoTenChuHo());
            ps.setString(3, hoKhau.getSoNha());
            ps.setString(4, hoKhau.getDuong());
            ps.setString(5, hoKhau.getPhuong());
            ps.setString(6, hoKhau.getQuan());
            ps.setString(7, hoKhau.getTinh());
            
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public boolean SuaNhanKhau(NhanKhau nhanKhau){
        
        String sql = "";
        
        if(nhanKhau.getNgayChuyenDi() != null){
            sql = "UPDATE NhanKhau SET HoTen = ?, BiDanh = ?, GioiTinh = ?, TonGiao = ?, NgheNghiep = ?, QuanHeVoiChuHo = ?, ChinhSua = ?, "
                + "ChuHo = ?, SoHoKhau = ?, TamVang = ?, NoiChuyenDi = ?, LyDoChuyenDi = ?, DaMat = ?, NgayChuyenDi = ? WHERE ID = ?";
        }
        else{
            sql = "UPDATE NhanKhau SET HoTen = ?, BiDanh = ?, GioiTinh = ?, TonGiao = ?, NgheNghiep = ?, QuanHeVoiChuHo = ?, ChinhSua = ?, "
                + "ChuHo = ?, SoHoKhau = ?, TamVang = ?, NoiChuyenDi = ?, LyDoChuyenDi = ?, DaMat = ? WHERE ID = ?";
        }
        
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, nhanKhau.getHoTen());
            ps.setString(2, nhanKhau.getBiDanh());
            ps.setString(3, nhanKhau.getGioiTinh());
            ps.setString(4, nhanKhau.getTonGiao());
            ps.setString(5, nhanKhau.getNgheNghiep());
            ps.setString(6, nhanKhau.getQuanHeVoiChuHo());
            ps.setString(7, nhanKhau.getLichSuChinhSua());
            ps.setBoolean(8, nhanKhau.isChuHo());
            ps.setString(9, nhanKhau.getSoHoKhau());
            ps.setBoolean(10, nhanKhau.isTamVang());
            
            ps.setString(11, nhanKhau.getNoiChuyenDi());
            ps.setString(12, nhanKhau.getLiDoChuyenDi());
            ps.setBoolean(13, nhanKhau.isDaMat());
            
            
            if(nhanKhau.getNgayChuyenDi() != null){
              ps.setTimestamp(14, new Timestamp(nhanKhau.getNgayChuyenDi().getTime()));
              ps.setString(15, String.valueOf(nhanKhau.getID()));
            }
            else
                ps.setString(14, String.valueOf(nhanKhau.getID()));
            
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public int getSoNhanKhauTheoGioiTinh(String gioitinh){
        
       
        String sql = "SELECT COUNT(ID) AS Amount FROM NhanKhau WHERE GioiTinh = ? AND DaMat = FALSE";
        try {
           
            int a = 0;
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, gioitinh);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
            a = rs.getInt("Amount");
            }
            
            return a;
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return 0;
    }
    
    public int getSoNhanKhauTheoDoTuoi(int dotuoimin, int dotuoimax){
        
       
        String sql = "SELECT COUNT(ID) AS Amount FROM NhanKhau WHERE (2019 - year(NgaySinh) >= ?) AND (2019 - year(NgaySinh) <= ?) AND DaMat = FALSE";
        try {
           
            int a = 0;
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, String.valueOf(dotuoimin));
            ps.setString(2, String.valueOf(dotuoimax));
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
            a = rs.getInt("Amount");
            }
            
            return a;
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return 0;
    }
    
    public int getSoNhanKhauTheoNam(int nam){
        
        String sql = "SELECT COUNT(ID) AS Amount FROM NhanKhau WHERE ((year(NgaySinh) <= ? AND NgayChuyenDen IS NULL) OR (year(NgayChuyenDen) <= ?)) AND (year(NgayChuyenDi) >= ? OR (year(NgayChuyenDi) <= ? AND DaMat = FALSE) OR NgayChuyenDi IS NULL)";
        try {
           
            int a = 0;
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, String.valueOf(nam));
            ps.setString(2, String.valueOf(nam));
            ps.setString(3, String.valueOf(nam));
            ps.setString(4, String.valueOf(nam));
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
            a = rs.getInt("Amount");
            }
            
            return a;
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return 0;
        
    }
    
    public int getNhanKhauTamTru(){
        
        String sql = "SELECT COUNT(ID) AS Amount FROM NhanKhau WHERE TamTru = TRUE";
        try {
           
            int a = 0;
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
            a = rs.getInt("Amount");
            }
            
            return a;
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return 0;
        
    }
    
    public int getNhanKhauTamVang(){
        
        String sql = "SELECT COUNT(ID) AS Amount FROM NhanKhau WHERE TamVang = TRUE";
        try {
           
            int a = 0;
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
            a = rs.getInt("Amount");
            }
            
            return a;
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return 0;
        
    }
    
    
    
    public boolean SuaHoKhau(HoKhau hoKhau){
        String sql = "UPDATE HoKhau SET HoTenChuHo = ?, SoNha = ?, Duong = ?, Phuong = ?, Quan = ?, ThanhPho = ?, ChinhSua = ? WHERE SoHoKhau = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, hoKhau.getHoTenChuHo());
            ps.setString(2, hoKhau.getSoNha());
            ps.setString(3, hoKhau.getDuong());
            ps.setString(4, hoKhau.getPhuong());
            ps.setString(5, hoKhau.getQuan());
            ps.setString(6, hoKhau.getTinh());
            ps.setString(7, hoKhau.getLichSuChinhSua());
            ps.setString(8, hoKhau.getSoHoKhau());
            
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public static void main(String[] args) {
       
        
        //System.out.println(new DAO().CheckHaveNhanKhau("3"));
       
    }  
    
}
