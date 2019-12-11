/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.DAO;
import Models.HoKhau;
import Models.NhanKhau;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author dangdinhtho
 */
public class ChuyenKhau extends javax.swing.JFrame {

    /**
     * Creates new form ChuyenKhau
     */
    ArrayList<HoKhau> list;
    private ArrayList<NhanKhau> nhanKhaus;
    DAO dao = new DAO();
    private HoKhau hoKhauCu;
    DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy"); 
    
    public ChuyenKhau(ArrayList<NhanKhau> dsNhanKhaus, HoKhau hoKhau) {
        initComponents();
        nhanKhaus = dsNhanKhaus;
        hoKhauCu = hoKhau;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtTimKiem = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        listKetQua = new javax.swing.JList();
        btnHuy = new javax.swing.JButton();
        btnXacNhan = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel1.setText("CHỌN HỘ KHẨU CHUYỂN ĐẾN ");

        txtTimKiem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTimKiemKeyReleased(evt);
            }
        });

        jScrollPane1.setViewportView(listKetQua);

        btnHuy.setText("Huỷ");
        btnHuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuyActionPerformed(evt);
            }
        });

        btnXacNhan.setText("Xác nhận");
        btnXacNhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXacNhanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(btnHuy)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnXacNhan)
                .addGap(65, 65, 65))
            .addGroup(layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                        .addComponent(txtTimKiem)))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHuy)
                    .addComponent(btnXacNhan))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTimKiemKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimKiemKeyReleased
        // TODO add your handling code here:
        SetListKetQua();
        
    }//GEN-LAST:event_txtTimKiemKeyReleased

    private void btnXacNhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXacNhanActionPerformed
        // TODO add your handling code here:
        int select = listKetQua.getSelectedIndex();
        boolean done, done1, done2;
        done = false;
        String thaydoi = "";
        for(int i = 0; i < nhanKhaus.size(); i++){
          nhanKhaus.get(i).setSoHoKhau(list.get(select).getSoHoKhau());
          done = dao.SuaNhanKhau(nhanKhaus.get(i));
          thaydoi += "  + " + nhanKhaus.get(i).getHoTen() + "\n";
        }
        hoKhauCu.setLichSuChinhSua("*" + dateFormat.format(new Date()) + ": \n" + "- Chuyển các nhân khẩu: \n"  + thaydoi + "  đến hộ khẩu " + list.get(select).getSoHoKhau());
        list.get(select).setLichSuChinhSua("*" + dateFormat.format(new Date()) + ": \n" + "- Nhập các nhân khẩu: \n"  + thaydoi + "  từ hộ khẩu " + hoKhauCu.getSoHoKhau());
          done1 = dao.SuaHoKhau(hoKhauCu);
          done2 = dao.SuaHoKhau(list.get(select));
          
          if(done && done1 && done2){
                     JOptionPane.showMessageDialog(null, "Chuyển khẩu thành công.");
                     new XemTTHoKhau(dao.getHoKhau(list.get(select).getSoHoKhau()));
                 }
                 else{
                     JOptionPane.showMessageDialog(null, "Chuyển khẩu thất bại.");
                 }
   
    }//GEN-LAST:event_btnXacNhanActionPerformed

    private void btnHuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuyActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_btnHuyActionPerformed

    /**
     * @param args the command line arguments
     */
   
    
    
    private void  SetListKetQua(){
         String keyWord = "%" + txtTimKiem.getText() + "%";
        list = dao.getListHoKhau(keyWord);
        int length = list.size() < 5 ? list.size() : 5;
        DefaultListModel model = new DefaultListModel();
        for(int i = 0; i < length; i++){
            model.addElement("Số hộ khẩu: " + list.get(i).getSoHoKhau() + " Chủ hộ: "+list.get(i).getHoTenChuHo());
        }
        listKetQua.setModel(model);
        listKetQua.setSelectedIndex(0);
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHuy;
    private javax.swing.JButton btnXacNhan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList listKetQua;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables
}