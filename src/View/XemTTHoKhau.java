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
public class XemTTHoKhau extends javax.swing.JFrame {

    /**
     * Creates new form XemTTHoKhau
     */
    private HoKhau hoKhau;

    public HoKhau getHoKhau() {
        return hoKhau;
    }
    private DAO dao = new DAO();
    DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy"); 
    private NhanKhau chuHo;
    
    public XemTTHoKhau(HoKhau hoKhau) {
        initComponents();
       
        btnSuaChuHo.setVisible(false);
        btnXacNhan.setVisible(false);
        btnTachHo.setVisible(false);
            btnChuyenKhau.setVisible(false);
        this.hoKhau = hoKhau;
        chuHo = hoKhau.getChuHo();
        txtSoNha.setText(hoKhau.getSoNha());
        txtDuong.setText(hoKhau.getDuong());
        txtHoTenChuHo.setText(hoKhau.getHoTenChuHo());
        txtPhuong.setText(hoKhau.getPhuong());
        txtQuan.setText(hoKhau.getQuan());
        txtSoHoKhau.setText(hoKhau.getSoHoKhau());
        txtTinh.setText(hoKhau.getTinh());
        txtLichSuChinhSua.setText(hoKhau.getLichSuChinhSua());
        DefaultListModel nhanKhauModel = new DefaultListModel();
        for(int i = 0; i < hoKhau.getDsNhanKhaus().size(); i++){
            if(hoKhau.getDsNhanKhaus().get(i).isDaMat()){
                nhanKhauModel.addElement(hoKhau.getDsNhanKhaus().get(i).getHoTen() + " (Đã mất)");
            }
            else
            nhanKhauModel.addElement(hoKhau.getDsNhanKhaus().get(i).getHoTen());
        }
        dsNhanKhau.setModel(nhanKhauModel);
        dsNhanKhau.setSelectedIndex(0);
       
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
        btnXemTTNhanKhau = new javax.swing.JButton();
        btnThemNhanKhau = new javax.swing.JButton();
        btnChinhSua = new javax.swing.JButton();
        btnQuayLai = new javax.swing.JButton();
        btnXacNhan = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtSoHoKhau = new javax.swing.JTextField();
        txtHoTenChuHo = new javax.swing.JTextField();
        txtSoNha = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtDuong = new javax.swing.JTextField();
        txtPhuong = new javax.swing.JTextField();
        txtQuan = new javax.swing.JTextField();
        txtTinh = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        dsNhanKhau = new javax.swing.JList();
        btnSuaChuHo = new javax.swing.JButton();
        btnTachHo = new javax.swing.JButton();
        btnChuyenKhau = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtLichSuChinhSua = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setText("THÔNG TIN HỘ KHẨU");

        btnXemTTNhanKhau.setText("Xem thông tin nhân khẩu");
        btnXemTTNhanKhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXemTTNhanKhauActionPerformed(evt);
            }
        });

        btnThemNhanKhau.setText("Thêm nhân khẩu");
        btnThemNhanKhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemNhanKhauActionPerformed(evt);
            }
        });

        btnChinhSua.setText("Chỉnh sửa");
        btnChinhSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChinhSuaActionPerformed(evt);
            }
        });

        btnQuayLai.setText("Quay lại");
        btnQuayLai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuayLaiActionPerformed(evt);
            }
        });

        btnXacNhan.setText("Xác nhận thay đổi");
        btnXacNhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXacNhanActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setText("Số hộ khẩu:");

        txtSoHoKhau.setEditable(false);

        txtHoTenChuHo.setEditable(false);

        txtSoNha.setEditable(false);

        jLabel3.setText("Họ tên chủ hộ:");

        jLabel4.setText("Số nhà:");

        jLabel5.setText("Đường (Thôn, Xóm):");

        txtDuong.setEditable(false);

        txtPhuong.setEditable(false);

        txtQuan.setEditable(false);

        txtTinh.setEditable(false);

        jLabel8.setText("Tỉnh (Thành phố):");

        jLabel7.setText("Quận (Huyện, Thị Xã):");

        jLabel6.setText("Phường (Xã, Thị trấn):");

        jLabel9.setText("Danh sách nhân khẩu:");

        dsNhanKhau.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        dsNhanKhau.setFixedCellHeight(30);
        dsNhanKhau.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                dsNhanKhauValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(dsNhanKhau);

        btnSuaChuHo.setText("Chỉ định làm chủ hộ mới");
        btnSuaChuHo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaChuHoActionPerformed(evt);
            }
        });

        btnTachHo.setText("Tách Hộ ");
        btnTachHo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTachHoActionPerformed(evt);
            }
        });

        btnChuyenKhau.setText("Chuyển Khẩu");
        btnChuyenKhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChuyenKhauActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8))
                                .addGap(32, 32, 32)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDuong)
                                    .addComponent(txtPhuong)
                                    .addComponent(txtQuan)
                                    .addComponent(txtSoNha, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtSoHoKhau)
                                    .addComponent(txtHoTenChuHo)
                                    .addComponent(txtTinh)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 11, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnChuyenKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(16, 16, 16))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnSuaChuHo, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTachHo)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtSoHoKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtHoTenChuHo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtSoNha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtDuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtPhuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtQuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtTinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSuaChuHo)
                    .addComponent(btnTachHo)
                    .addComponent(btnChuyenKhau))
                .addGap(10, 10, 10))
        );

        txtLichSuChinhSua.setEditable(false);
        txtLichSuChinhSua.setColumns(20);
        txtLichSuChinhSua.setRows(5);
        jScrollPane2.setViewportView(txtLichSuChinhSua);

        jLabel10.setText("LỊCH SỬ CHỈNH SỬA");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnXemTTNhanKhau)
                        .addGap(26, 26, 26)
                        .addComponent(btnThemNhanKhau)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnChinhSua)
                        .addGap(32, 32, 32)
                        .addComponent(btnXacNhan)
                        .addGap(30, 30, 30)
                        .addComponent(btnQuayLai)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))))
            .addGroup(layout.createSequentialGroup()
                .addGap(242, 242, 242)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnXemTTNhanKhau)
                            .addComponent(btnThemNhanKhau)
                            .addComponent(btnChinhSua)
                            .addComponent(btnQuayLai)
                            .addComponent(btnXacNhan))
                        .addGap(17, 17, 17))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemNhanKhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemNhanKhauActionPerformed
        // TODO add your handling code here:
        new ThemNhanKhau(2, hoKhau.getSoHoKhau()).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnThemNhanKhauActionPerformed

    private void btnXemTTNhanKhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXemTTNhanKhauActionPerformed
        // TODO add your handling code here:
        int select = dsNhanKhau.getSelectedIndex();
        new XemTTNhanKhau(hoKhau.getDsNhanKhaus().get(select)).setVisible(true);
    }//GEN-LAST:event_btnXemTTNhanKhauActionPerformed

    private void btnQuayLaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuayLaiActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_btnQuayLaiActionPerformed

    private void btnChinhSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChinhSuaActionPerformed
        // TODO add your handling code here:
     
            txtDuong.setEditable(true);
            //txtHoTenChuHo.setEditable(true);
            txtPhuong.setEditable(true);
            txtQuan.setEditable(true);
            txtSoNha.setEditable(true);
            txtTinh.setEditable(true);
            
            btnXacNhan.setVisible(true);
                    
            
           // btnChinhSua.setText("Xác Nhận Thay Đổi");
           
     
    }//GEN-LAST:event_btnChinhSuaActionPerformed

    private void btnSuaChuHoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaChuHoActionPerformed
        // TODO add your handling code here:
       
        btnXacNhan.setVisible(true);
        index = dsNhanKhau.getSelectedIndex();
        txtHoTenChuHo.setText(hoKhau.getDsNhanKhaus().get(index).getHoTen());
       
        
    }//GEN-LAST:event_btnSuaChuHoActionPerformed

    private void dsNhanKhauValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_dsNhanKhauValueChanged
        // TODO add your handling code here:
        //System.out.println(dsNhanKhau.getSelectedIndex());
        txtHoTenChuHo.setText(hoKhau.getHoTenChuHo());
        if(hoKhau.getDsNhanKhaus().get(dsNhanKhau.getSelectedIndex()).isChuHo() || dsNhanKhau.getSelectedIndices().length > 1 || hoKhau.getDsNhanKhaus().get(dsNhanKhau.getSelectedIndex()).isDaMat() ) {
            btnSuaChuHo.setVisible(false);
            
        }
        else {
            btnSuaChuHo.setVisible(true);
           
        }
        
        if(hoKhau.getDsNhanKhaus().get(dsNhanKhau.getSelectedIndex()).isChuHo() || hoKhau.getDsNhanKhaus().get(dsNhanKhau.getSelectedIndex()).isDaMat()){
            btnTachHo.setVisible(false);
            btnChuyenKhau.setVisible(false);
        }
        else{
            btnTachHo.setVisible(true);
            btnChuyenKhau.setVisible(true);
        }
        
        
    }//GEN-LAST:event_dsNhanKhauValueChanged

    private void btnXacNhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXacNhanActionPerformed
        // TODO add your handling code here:
        
        
         boolean isChange = false;    
                String thayDoi = "";
                thayDoi = "*" +  dateFormat.format(new Date()) + ": \n";
                if(!hoKhau.getHoTenChuHo().equals(txtHoTenChuHo.getText())){
                    thayDoi += "- Thay đổi chủ hộ từ: \"" + hoKhau.getHoTenChuHo()+ "\" thành \"" + txtHoTenChuHo.getText() + "\"\n";
                    
                    isChange = true;
                }
                if((hoKhau.getSoNha()!= null && !hoKhau.getSoNha().equals(txtSoNha.getText())) 
                        || (hoKhau.getSoNha()== null && !txtSoNha.getText().equals(""))
                        || (hoKhau.getDuong() != null && !hoKhau.getDuong().equals(txtDuong.getText()))
                        || (hoKhau.getDuong() == null && !txtDuong.getText().equals(""))
                        || (hoKhau.getPhuong()!= null && !hoKhau.getPhuong().equals(txtPhuong.getText()))
                        || (hoKhau.getPhuong()== null && !txtPhuong.getText().equals(""))
                        || (hoKhau.getQuan()!= null && !hoKhau.getQuan().equals(txtQuan.getText()))
                        || (hoKhau.getQuan()== null && !txtQuan.getText().equals(""))
                        || (hoKhau.getTinh()!= null && !hoKhau.getTinh().equals(txtTinh.getText()))
                        || (hoKhau.getTinh()== null && !txtTinh.getText().equals(""))){
                    thayDoi += "- Thay đổi địa chỉ hộ từ: \"" + hoKhau.getSoNha() +", " + hoKhau.getDuong()+", " + hoKhau.getPhuong()
                            +", " + hoKhau.getQuan()+", " + hoKhau.getTinh()+ "\"\nThành \"" + txtSoNha.getText() + ", " + txtDuong.getText() + ", " 
                            + txtPhuong.getText() + ", " + txtQuan.getText() + ", " + txtTinh.getText() + "\"\n";
                    
                    isChange = true;
                } 
                
                if(!isChange){
                        thayDoi = "";
                        return;
                    }
            
            int click = JOptionPane.showConfirmDialog(null, "Xác nhận thay đổi thông tin hộ khẩu :\n" + thayDoi, "", JOptionPane.YES_NO_OPTION);
                if(click == JOptionPane.YES_OPTION){
                  
                hoKhau.setDuong(txtDuong.getText());
                hoKhau.setHoTenChuHo(txtHoTenChuHo.getText());
                hoKhau.setPhuong(txtPhuong.getText());
                hoKhau.setQuan(txtQuan.getText());
                hoKhau.setSoNha(txtSoNha.getText());
                hoKhau.setTinh(txtTinh.getText());
                hoKhau.setLichSuChinhSua(thayDoi);
                hoKhau.getChuHo().setQuanHeVoiChuHo("WaitSet");
                hoKhau.getChuHo().setChuHo(false);
                hoKhau.getDsNhanKhaus().get(index).setQuanHeVoiChuHo("Chủ Hộ");
                hoKhau.getDsNhanKhaus().get(index).setChuHo(true);
                
                
                boolean done1 = dao.SuaHoKhau(hoKhau);
                boolean done2 = dao.SuaNhanKhau(chuHo);
                boolean done3 = dao.SuaNhanKhau(hoKhau.getDsNhanKhaus().get(index));
                 if(done1 && done2 && done3){
                     JOptionPane.showMessageDialog(null, "Cập nhật thông tin hộ khẩu thành công.");
                     txtLichSuChinhSua.setText(hoKhau.getLichSuChinhSua());
                     chuHo = hoKhau.getDsNhanKhaus().get(index);
                 }
                 else{
                     JOptionPane.showMessageDialog(null, "Cập nhật thông tin hộ khẩu thất bại.");
                 }
                
                    
                }
                else {
                    //this.setVisible(false);
                }
        
    }//GEN-LAST:event_btnXacNhanActionPerformed

    private void btnTachHoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTachHoActionPerformed
        // TODO add your handling code here:
        ArrayList<NhanKhau> nhanKhaus = new ArrayList<>();
        for(int i = 0; i < dsNhanKhau.getSelectedIndices().length; i++){
            nhanKhaus.add(hoKhau.getDsNhanKhaus().get(dsNhanKhau.getSelectedIndices()[i]));
        }
        new TachHo(nhanKhaus, this).setVisible(true);
    }//GEN-LAST:event_btnTachHoActionPerformed

    private void btnChuyenKhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChuyenKhauActionPerformed
        // TODO add your handling code here:
        ArrayList<NhanKhau> nhanKhaus = new ArrayList<>();
        for(int i = 0; i < dsNhanKhau.getSelectedIndices().length; i++){
            nhanKhaus.add(hoKhau.getDsNhanKhaus().get(dsNhanKhau.getSelectedIndices()[i]));
        }
        new ChuyenKhau(nhanKhaus, hoKhau).setVisible(true);
    }//GEN-LAST:event_btnChuyenKhauActionPerformed

    private int index;
    //private boolean isChangeChuHo;
    
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
            java.util.logging.Logger.getLogger(XemTTHoKhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(XemTTHoKhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(XemTTHoKhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(XemTTHoKhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new XemTTHoKhau().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChinhSua;
    private javax.swing.JButton btnChuyenKhau;
    private javax.swing.JButton btnQuayLai;
    private javax.swing.JButton btnSuaChuHo;
    private javax.swing.JButton btnTachHo;
    private javax.swing.JButton btnThemNhanKhau;
    private javax.swing.JButton btnXacNhan;
    private javax.swing.JButton btnXemTTNhanKhau;
    private javax.swing.JList dsNhanKhau;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txtDuong;
    private javax.swing.JTextField txtHoTenChuHo;
    private javax.swing.JTextArea txtLichSuChinhSua;
    private javax.swing.JTextField txtPhuong;
    private javax.swing.JTextField txtQuan;
    private javax.swing.JTextField txtSoHoKhau;
    private javax.swing.JTextField txtSoNha;
    private javax.swing.JTextField txtTinh;
    // End of variables declaration//GEN-END:variables
}
