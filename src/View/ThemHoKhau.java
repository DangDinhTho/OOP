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
public class ThemHoKhau extends javax.swing.JFrame {

    /**
     * Creates new form ThemHoKhau
     */
    private DAO dao = new DAO();
    private NhanKhau chuHo;
    private HoKhau hoKhau = new HoKhau();
    private ArrayList<NhanKhau> nhanKhaus;
    private XemTTHoKhau xemTTHoKhau;
    private boolean isTachHo;
    DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy"); 
    
    public ThemHoKhau(NhanKhau chuHoMoi) {
        initComponents();
        this.chuHo = chuHoMoi;
        txtHoTenChuHo.setText(chuHo.getHoTen());
        txtHoTenChuHo.setEnabled(false);
        listNhanKhau.setVisible(false);
        isTachHo = false;
    }
    
    public ThemHoKhau(NhanKhau chuHoMoi, ArrayList<NhanKhau> nhanKhaus, XemTTHoKhau xemTTHoKhau) {
        initComponents();
        this.chuHo = chuHoMoi;
        this.xemTTHoKhau = xemTTHoKhau;
        this.nhanKhaus = nhanKhaus;
        txtHoTenChuHo.setText(chuHo.getHoTen());
        txtHoTenChuHo.setEnabled(false);
        listNhanKhau.setVisible(true);
        DefaultListModel nhanKhauModel = new DefaultListModel();
        for(int i = 0; i < nhanKhaus.size(); i++){
            nhanKhauModel.addElement(nhanKhaus.get(i).getHoTen());
        }
        listNhanKhau.setModel(nhanKhauModel);
       
        //listNhanKhau.setEnabled(false);
        isTachHo = true;
        
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
        jLabel2 = new javax.swing.JLabel();
        txtSoHoKhau = new javax.swing.JTextField();
        txtHoTenChuHo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtSoNha = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtDuong = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtPhuong = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtQuan = new javax.swing.JTextField();
        txtTinh = new javax.swing.JTextField();
        btnHuy = new javax.swing.JButton();
        btnXacNhan = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listNhanKhau = new javax.swing.JList();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setText("THÊM  HỘ  KHẨU");

        jLabel2.setText("Số  hộ khẩu:");

        jLabel3.setText("Họ tên chủ hộ:");

        jLabel4.setText("Số  nhà:");

        jLabel5.setText("Đường (Thôn, Xóm):");

        jLabel6.setText("Phường (Xã, Thị  trấn):");

        txtPhuong.setText("Gia Thuỵ ");

        jLabel7.setText("Quận (Huyện, Thị xã):");

        jLabel8.setText("Tỉnh  (Thành  phố):");

        txtQuan.setText("Long Biên ");

        txtTinh.setText("Hà Nội ");

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

        listNhanKhau.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listNhanKhau);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPhuong)
                            .addComponent(txtDuong)
                            .addComponent(txtSoNha)
                            .addComponent(txtHoTenChuHo)
                            .addComponent(txtSoHoKhau)
                            .addComponent(txtQuan)
                            .addComponent(txtTinh)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnXacNhan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnHuy)))
                .addGap(84, 84, 84))
            .addGroup(layout.createSequentialGroup()
                .addGap(204, 204, 204)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtHoTenChuHo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(txtSoNha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtSoHoKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(66, 66, 66)))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtDuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtPhuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtQuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtTinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnXacNhan)
                    .addComponent(btnHuy))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnXacNhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXacNhanActionPerformed
        // TODO add your handling code here:
        
        
        
        if(dao.CheckHaveHoKhau(txtSoHoKhau.getText())){
            JOptionPane.showMessageDialog(null, "Hộ khẩu số  " + txtSoHoKhau.getText() + " Đã tồn tại\nKiểm tra lại!");
            
        }
        else {
            boolean done2 = false;
            
            chuHo.setSoHoKhau(txtSoHoKhau.getText());
            chuHo.setQuanHeVoiChuHo("Chủ hộ");
            chuHo.setChuHo(true);
            hoKhau.setSoHoKhau(txtSoHoKhau.getText());
            hoKhau.setHoTenChuHo(txtHoTenChuHo.getText());
            hoKhau.setSoNha(txtSoNha.getText());
            hoKhau.setDuong(txtDuong.getText());
            hoKhau.setPhuong(txtPhuong.getText());
            hoKhau.setQuan(txtQuan.getText());
            hoKhau.setTinh(txtTinh.getText());
            
            if(isTachHo){ 
                    String thaydoi = "";
                for(int i = 0; i < nhanKhaus.size(); i++){
                    nhanKhaus.get(i).setSoHoKhau(txtSoHoKhau.getText());
                    done2 = dao.SuaNhanKhau(nhanKhaus.get(i));
                    thaydoi += " + " + nhanKhaus.get(i).getHoTen() + "\n";
                }
                
                xemTTHoKhau.getHoKhau().setLichSuChinhSua("*" + dateFormat.format(new Date()) + ": \n" + "- Tách các nhân khẩu:\n" + thaydoi + " ra hộ khẩu: " + hoKhau.getSoHoKhau() + "\n");
                done2 = dao.SuaHoKhau(xemTTHoKhau.getHoKhau());
                
                
            }
            else{
                done2 = dao.ThemNhanKhau(chuHo);
            }
          
            boolean done = dao.ThemHoKhau(hoKhau);
            
            if(done && done2){
                
                if(isTachHo){
                    int click = JOptionPane.showConfirmDialog(null, "Tách hộ thành công.\nChỉnh sửa lại quan hệ với chủ hộ của các nhân khẩu!!", "", JOptionPane.YES_OPTION);
                    if(click == JOptionPane.YES_OPTION){
                        new XemTTHoKhau(dao.getHoKhau(hoKhau.getSoHoKhau())).setVisible(true);
                        this.setVisible(false);
                    }
                    
                }
                else{
                    int click = JOptionPane.showConfirmDialog(null, "Thêm hộ khẩu thành công.\n Tiếp tục thêm nhân khẩu? ", "", JOptionPane.YES_NO_OPTION);
                if(click == JOptionPane.YES_OPTION){
                    new ThemNhanKhau(2, hoKhau.getSoHoKhau()).setVisible(true);
                    this.setVisible(false);
                }
                else {
                    this.setVisible(false);
                }
                }
                
                
            }
            else{
                JOptionPane.showMessageDialog(null, "Thêm hộ khẩu thất bại.");
            }
            
        }
        
    }//GEN-LAST:event_btnXacNhanActionPerformed

    private void btnHuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuyActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_btnHuyActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ThemHoKhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThemHoKhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThemHoKhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThemHoKhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHuy;
    private javax.swing.JButton btnXacNhan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList listNhanKhau;
    private javax.swing.JTextField txtDuong;
    private javax.swing.JTextField txtHoTenChuHo;
    private javax.swing.JTextField txtPhuong;
    private javax.swing.JTextField txtQuan;
    private javax.swing.JTextField txtSoHoKhau;
    private javax.swing.JTextField txtSoNha;
    private javax.swing.JTextField txtTinh;
    // End of variables declaration//GEN-END:variables
}