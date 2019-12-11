/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.DAO;
import Models.HoKhau;
import Models.NhanKhau;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.ListModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author dangdinhtho
 */
public class MainMenu extends javax.swing.JFrame implements ActionListener {

    /**
     * Creates new form MainMenu
     */
    private DAO dao = new DAO();

    public MainMenu() {
        initComponents();
        btnXemTTHoKhau.addActionListener(this);
        btnXemTTNhanKhau.addActionListener(this);

        /*list = new DAO().getListNhanKhau("%N%");
        int length = list.size() < 8 ? list.size() : 8;
        DefaultListModel model = new DefaultListModel();
        for (int i = 0; i < length; i++) {
            model.addElement(list.get(i).getHoTen());
        }

        listKetQua.setModel(model);
        listKetQua.setSelectedIndex(0); */

        comboBoxReport.addItem("Giới tính");
        comboBoxReport.addItem("Độ tuổi");
        comboBoxReport.addItem("Các năm");
        comboBoxReport.addItem("Tạm trú, tạm vắng");
        comboBoxReport.setSelectedIndex(0);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        btnXemTTHoKhau = new javax.swing.JButton();
        btnXemTTNhanKhau = new javax.swing.JButton();
        txtTimKiem = new javax.swing.JTextField();
        btnTimkiem = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listKetQua = new javax.swing.JList();
        btnThemHo = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btnThongKe = new javax.swing.JButton();
        comboBoxReport = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnDangKiTamTru = new javax.swing.JButton();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnXemTTHoKhau.setText("Xem Thông Tin Hộ Khẩu");

        btnXemTTNhanKhau.setText("Xem Thông Tin Nhân Khẩu");

        txtTimKiem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTimKiemKeyReleased(evt);
            }
        });

        btnTimkiem.setText("TÌM KIẾM");
        btnTimkiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimkiemActionPerformed(evt);
            }
        });

        listKetQua.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listKetQua.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listKetQuaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(listKetQua);

        btnThemHo.setText("Thêm hộ");
        btnThemHo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemHoActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnThongKe.setText("Hiển thị thống kê");
        btnThongKe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThongKeActionPerformed(evt);
            }
        });

        jLabel1.setText("Thống kê nhân khẩu theo:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(comboBoxReport, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(btnThongKe)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(comboBoxReport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnThongKe)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel2.setText("SỔ HỘ KHẨU ĐIỆN TỬ ");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/QuocHuy2.png"))); // NOI18N

        btnDangKiTamTru.setText("Đăng kí tạm trú");
        btnDangKiTamTru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangKiTamTruActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(376, 376, 376)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(170, 170, 170)
                                .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(87, 87, 87)))))
                .addGap(18, 18, 18)
                .addComponent(btnTimkiem)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXemTTNhanKhau))
                .addGap(45, 45, 45)
                .addComponent(btnXemTTHoKhau)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnDangKiTamTru, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnThemHo)
                .addGap(32, 32, 32))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTimkiem)))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 119, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnXemTTNhanKhau)
                    .addComponent(btnThemHo)
                    .addComponent(btnXemTTHoKhau)
                    .addComponent(btnDangKiTamTru))
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTimkiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimkiemActionPerformed
        // TODO add your handling code here:
        //String keyWord = "%" + txtTimKiem.getText() + "%";
        //ArrayList<NhanKhau> list = new DAO().getListNhanKhau(keyWord);
        //String name = list.get(0).getHoTen();
        //System.out.println(name);
        SetListKetQua();
    }//GEN-LAST:event_btnTimkiemActionPerformed

    private void txtTimKiemKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimKiemKeyReleased
        // TODO add your handling code here:

        SetListKetQua();
    }//GEN-LAST:event_txtTimKiemKeyReleased

    private void listKetQuaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listKetQuaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_listKetQuaMouseClicked

    private void btnThemHoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemHoActionPerformed
        // TODO add your handling code here:
        btnThemHoClick();
    }//GEN-LAST:event_btnThemHoActionPerformed

    private void btnThongKeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThongKeActionPerformed
        // TODO add your handling code here:
        // ThongKeTheoGioiTinh();
        
        switch (comboBoxReport.getSelectedIndex()) {
            case 0:
                ThongKeTheoGioiTinh();
                break;
            case 1:
                ThongKeTheoDoTuoi();
                break;
            case 2:
                ThongKeTheoNam();
                break;
            case 3:
                ThongKeTheoTamTruTamVang();
                break;
        }
    }//GEN-LAST:event_btnThongKeActionPerformed

    private void btnDangKiTamTruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangKiTamTruActionPerformed
        // TODO add your handling code here:
        new ThemNhanKhau(3, null).setVisible(true);
    }//GEN-LAST:event_btnDangKiTamTruActionPerformed

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
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
                // System.out.println();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDangKiTamTru;
    private javax.swing.JButton btnThemHo;
    private javax.swing.JButton btnThongKe;
    private javax.swing.JButton btnTimkiem;
    private javax.swing.JButton btnXemTTHoKhau;
    private javax.swing.JButton btnXemTTNhanKhau;
    private javax.swing.JComboBox comboBoxReport;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList listKetQua;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables

    //private NhanKhau nhanKhau;
    ArrayList<NhanKhau> list;

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource().equals(btnXemTTHoKhau)) {
            btnXemHoKhauClick();
        } else if (e.getSource().equals(btnXemTTNhanKhau)) {
            btnXemNhanKhauClick();
        }
        //To change body of generated methods, choose Tools | Templates.
    }

    public void btnXemNhanKhauClick() {

        int select = listKetQua.getSelectedIndex();  // lấy chỉ số nhân khẩu đươc chọn 
        
        if (select < 0) {
            // nếu chưa chọn nhân khẩu nào 
            JOptionPane.showMessageDialog(null, "Chọn một đối tượng !!");
            return;
        }
        
        new XemTTNhanKhau(list.get(select)).setVisible(true);    // Mở cửa sổ xem thông tin nhân khẩu với tham số truyền vào là nhân khẩu được chọn 
        
     
    }

    public void btnXemHoKhauClick() {
        //new XemTTHoKhau().setVisible(true);
        //this.dispose();

        int select = listKetQua.getSelectedIndex();
        if (select < 0) {
            // nếu chưa chọn nhân khẩu nào 
            JOptionPane.showMessageDialog(null, "Chọn một đối tượng !!");
            return;
        }
        
         /*if(list.get(select).isTamTru()){
             // nếu là nhân khẩu tạm trú thì ko xem đc hộ khẩu 
            JOptionPane.showMessageDialog(null, "Đây là nhân khẩu tạm trú");
        } */
        else{
             // mở cửa sổ xem thông tin hộ khẩu chứa nhân khẩu với tham số truyền vào là số hộ khẩu của nhân khẩu đã chọn 
            HoKhau hoKhau = new DAO().getHoKhau(list.get(select).getSoHoKhau());
            new XemTTHoKhau(hoKhau).setVisible(true);
        }
    }

    public void btnThemHoClick() {
        // thêm hộ khẩu, đầu tiên sẽ mở cửa sổ thêm nhân khẩu để thêm chủ hộ trước, sau đó mới thêm hộ khẩu của chủ hộ vừa thêm 
        new ThemNhanKhau(1, null).setVisible(true);
    }

    private void SetListKetQua() {
        
        // Hiển thị kết quả tìm kiếm với từ khoá nhập vào từ ô tìm kiếm, trả về danh sách các nhân khẩu đổ vào list 
        
        String keyWord = "%" + txtTimKiem.getText() + "%";
        list = dao.getListNhanKhau(keyWord);
        int length = list.size() < 8 ? list.size() : 8;
        DefaultListModel model = new DefaultListModel();
        for (int i = 0; i < length; i++) {
            if(list.get(i).isChuHo()){
                model.addElement(list.get(i).getHoTen() + " CMND: " + list.get(i).getCMND() + " (Chủ hộ)");  // nếu nhân khẩu là chủ hộ thì thêm "chủ hộ" vào sau model trên kết quả tìm kiếm 
            }
            else if(list.get(i).getCMND().equals("")){
                model.addElement(list.get(i).getHoTen());
            }
            else
                model.addElement(list.get(i).getHoTen() + " CMND: " + list.get(i).getCMND());
        }
        listKetQua.setModel(model);
        listKetQua.setSelectedIndex(0);

    }

    private void ThongKeTheoGioiTinh() {

        int nam = dao.getSoNhanKhauTheoGioiTinh("Nam");
        int nu = dao.getSoNhanKhauTheoGioiTinh("Nữ");
        int GTT3 = dao.getSoNhanKhauTheoGioiTinh("GTT3");

        DefaultCategoryDataset dcd = new DefaultCategoryDataset();
        dcd.setValue(nam, "", "Nam");
        dcd.setValue(nu, "", "Nữ");
        dcd.setValue(GTT3, "", "Giới tính thứ 3");

        String report = "Số nhân khẩu nam: " + nam + " . Số nhân khẩu nữ: " + nu + " . Số nhân khẩu giới tính thứ 3: " + GTT3;

        JFreeChart jFreeChart = ChartFactory.createBarChart("Thống kê theo giới tính", report, "", dcd, PlotOrientation.VERTICAL, false, false, false);

        CategoryPlot plot = jFreeChart.getCategoryPlot();
        //plot.setRangeGridlinePaint();
        ChartFrame chartFrame = new ChartFrame("Thống kê theo giới tính", jFreeChart, false);
        chartFrame.setVisible(true);
        chartFrame.setSize(600, 600);

    }

    private void ThongKeTheoDoTuoi() {

        int duoi3 = dao.getSoNhanKhauTheoDoTuoi(0, 3);
        int mamNon = dao.getSoNhanKhauTheoDoTuoi(3, 6);
        int cap1 = dao.getSoNhanKhauTheoDoTuoi(6, 11);
        int cap2 = dao.getSoNhanKhauTheoDoTuoi(11, 15);
        int cap3 = dao.getSoNhanKhauTheoDoTuoi(15, 18);
        int tuoiLD = dao.getSoNhanKhauTheoDoTuoi(18, 60);
        int nghiHuu = dao.getSoNhanKhauTheoDoTuoi(60, Integer.MAX_VALUE);

        DefaultCategoryDataset dcd = new DefaultCategoryDataset();
        dcd.setValue(duoi3, "", "Dưới 3 tuổi");
        dcd.setValue(mamNon, "", "Mầm non");
        dcd.setValue(cap1, "", "Cấp 1");
        dcd.setValue(cap2, "", "Cấp 2");
        dcd.setValue(cap3, "", "Cấp 3");
        dcd.setValue(tuoiLD, "", "Độ tuổi Lao Động");
        dcd.setValue(nghiHuu, "", "Độ tuổi nghỉ hưu");

        //String report = "Số nhân khẩu nam: " + nam +" . Số nhân khẩu nữ: " + nu + " . Số nhân khẩu giới tính thứ 3: " + GTT3;
        JFreeChart jFreeChart = ChartFactory.createBarChart("Thống kê theo độ tuổi", "", "", dcd, PlotOrientation.VERTICAL, false, false, false);

        CategoryPlot plot = jFreeChart.getCategoryPlot();
        //plot.setRangeGridlinePaint();
        ChartFrame chartFrame = new ChartFrame("Thống kê theo độ tuổi", jFreeChart, false);
        chartFrame.setVisible(true);
        chartFrame.setSize(1000, 600);

    }

    private void ThongKeTheoNam() {

        int n2010 = dao.getSoNhanKhauTheoNam(2010);
        int n2011 = dao.getSoNhanKhauTheoNam(2011);
        int n2012 = dao.getSoNhanKhauTheoNam(2012);
        int n2013 = dao.getSoNhanKhauTheoNam(2013);
        int n2014 = dao.getSoNhanKhauTheoNam(2014);
        int n2015 = dao.getSoNhanKhauTheoNam(2015);
        int n2016 = dao.getSoNhanKhauTheoNam(2016);
        int n2017 = dao.getSoNhanKhauTheoNam(2017);
        int n2018 = dao.getSoNhanKhauTheoNam(2018);
        int n2019 = dao.getSoNhanKhauTheoNam(2019);

        DefaultCategoryDataset dcd = new DefaultCategoryDataset();
        dcd.setValue(n2010, "", "2010");
        dcd.setValue(n2011, "", "2011");
        dcd.setValue(n2012, "", "2012");
        dcd.setValue(n2013, "", "2013");
        dcd.setValue(n2014, "", "2014");
        dcd.setValue(n2015, "", "2015");
        dcd.setValue(n2016, "", "2016");
        dcd.setValue(n2017, "", "2017");
        dcd.setValue(n2018, "", "2018");
        dcd.setValue(n2019, "", "2019");

        //String report = "Số nhân khẩu nam: " + nam +" . Số nhân khẩu nữ: " + nu + " . Số nhân khẩu giới tính thứ 3: " + GTT3;
        JFreeChart jFreeChart = ChartFactory.createLineChart("Thống kê dân số qua các năm", "Năm", "Dân số", dcd, PlotOrientation.VERTICAL, false, true, false);

        CategoryPlot plot = jFreeChart.getCategoryPlot();
        //plot.setRangeGridlinePaint();
        ChartFrame chartFrame = new ChartFrame("Thống kê dân số qua các năm", jFreeChart, false);
        chartFrame.setVisible(true);
        chartFrame.setSize(1000, 600);

    }
    
    private void ThongKeTheoTamTruTamVang() {

        int tamTru = dao.getNhanKhauTamTru();
        int tamVang = dao.getNhanKhauTamVang();

        DefaultCategoryDataset dcd = new DefaultCategoryDataset();
        dcd.setValue(tamTru, "", "Tạm trú");
        dcd.setValue(tamVang, "", "Tạm vắng");

        String report = "Số nhân khẩu tạm trú: " + tamTru + " . Số nhân khẩu tạm vắng: " + tamVang;

        JFreeChart jFreeChart = ChartFactory.createBarChart("Thống kê tạm trú tạm vắng", report, "", dcd, PlotOrientation.VERTICAL, false, false, false);

        CategoryPlot plot = jFreeChart.getCategoryPlot();
        //plot.setRangeGridlinePaint();
        ChartFrame chartFrame = new ChartFrame("Thống kê tạm trú tạm vắng", jFreeChart, false);
        chartFrame.setVisible(true);
        chartFrame.setSize(600, 600);

    }

}
