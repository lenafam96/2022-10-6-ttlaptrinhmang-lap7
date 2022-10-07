/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hocsinh_ui;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author minhc
 */
public class HocSinh_UI extends javax.swing.JFrame {
    public static connectDB connection = new connectDB();

    /**
     * Creates new form HocSinh_UI
     */
    public HocSinh_UI() {
        initComponents();
        LoadData();
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
        txtMahs = new javax.swing.JTextField();
        txtHoten = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtDiemToan = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtDiemViet = new javax.swing.JTextField();
        btnThemMoi = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHocSinh = new javax.swing.JTable();
        btnCapNhat = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Mã học sinh");

        txtMahs.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtHoten.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Họ tên");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Điểm toán");

        txtDiemToan.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Điểm viết");

        txtDiemViet.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btnThemMoi.setText("Thêm mới");
        btnThemMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemMoiActionPerformed(evt);
            }
        });

        btnXoa.setText("Xoá");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        tblHocSinh.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Mã học sinh", "Họ tên", "Điểm toán", "Điểm viết"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblHocSinh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblHocSinhMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblHocSinh);

        btnCapNhat.setText("Cập nhật");
        btnCapNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapNhatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtHoten)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtDiemToan)
                                    .addComponent(txtDiemViet)
                                    .addComponent(txtMahs, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnThemMoi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCapNhat)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnXoa)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtMahs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtHoten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtDiemToan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtDiemViet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThemMoi)
                    .addComponent(btnXoa)
                    .addComponent(btnCapNhat))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LoadData(){
        String SQL = "select * from `hocsinh`";
        ResultSet rs = connection.ExcuteQueryGetTable(SQL);
        Object [] obj = new Object[]{"Mã","Họ tên","Điểm toán","Điểm viết"};
        DefaultTableModel tableModel = new DefaultTableModel(obj,0);
        tblHocSinh.setModel(tableModel);
        try{
            while(rs.next()){
                Object[] item = new Object[4];
                HocSinh hs = new HocSinh(rs);
                item[0] = hs.getMahs();
                item[1] = hs.getHoten();
                item[2] = hs.getDiemToan();
                item[3] = hs.getDiemViet();
                tableModel.addRow(item);
            }
        }
        catch (Exception e) {
            System.out.println(e.toString());
        }
        clearText();
        setWidthColumn();
        disableButton();
    }
    
    private void disableButton(){
        if(tblHocSinh.getSelectedRow()==-1){
            btnCapNhat.setEnabled(false);
            btnXoa.setEnabled(false);
        }
        else{
            btnCapNhat.setEnabled(true);
            btnXoa.setEnabled(true);
        }
    }
    
    private void setWidthColumn(){
        tblHocSinh.getColumnModel().getColumn(0).setPreferredWidth(50);
        tblHocSinh.getColumnModel().getColumn(1).setPreferredWidth(170);
        tblHocSinh.getColumnModel().getColumn(2).setPreferredWidth(60);
        tblHocSinh.getColumnModel().getColumn(3).setPreferredWidth(60);
    }
    
    private void clearText(){
        txtMahs.setText("");
        txtHoten.setText("");
        txtDiemToan.setText("");
        txtDiemViet.setText("");
    }
    
    private int checkIdExist(){
        try {
            String SQL = "select count(*) as `count` from `hocsinh` where ma = '"+txtMahs.getText()+"'";
            ResultSet rs = connection.ExcuteQueryGetTable(SQL);
            return rs.next()?rs.getInt("count"):10;
        } catch (SQLException ex) {
            System.out.println("error");
            return 10;
        }
    }
    
    private boolean checkInvalid(){
        if(txtMahs.getText().isEmpty() || txtHoten.getText().isEmpty() || txtDiemToan.getText().isEmpty() || txtDiemViet.getText().isEmpty())
                return false;
        try {
            Float.parseFloat(txtDiemToan.getText());
        } catch (Exception e) {
            return false;
        }
        try {
            Float.parseFloat(txtDiemViet.getText());
        } catch (Exception e) {
            return false;
        }
        return true;
    }
    
    private boolean checkIdExistToUpdate(int index){
        int count = 0;
        for(int i = 0;i<tblHocSinh.getModel().getRowCount();i++){
            if(i == index)
                continue;
            if(txtMahs.getText().equals(tblHocSinh.getModel().getValueAt(i, 0))){
                count ++;
            }
        }
        return count<1;
    }
    
    private void btnThemMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemMoiActionPerformed
        // TODO add your handling code here:
        if(checkInvalid()){
            if(checkIdExist()<=0){
                String SQL = "insert into `hocsinh` (`ma`,`hoten`,`diemtoan`,`diemviet`) "
                + "values ('"+txtMahs.getText()+"','"+txtHoten.getText()+"','"+txtDiemToan.getText()+"','"+txtDiemViet.getText()+"')";
                connection.ExcuteQueryUpdateDB(SQL);
                LoadData();
            }
            else{
                JOptionPane.showMessageDialog(null, "Mã học sinh đã tồn tại!");
            }
        }
        else
            JOptionPane.showMessageDialog(null, "Thông tin không hợp lệ!");
    }//GEN-LAST:event_btnThemMoiActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        if(checkInvalid()){
            String SQL = "DELETE FROM `hocsinh` WHERE `hocsinh`.`ma` = '"+txtMahs.getText()+"'";
            connection.ExcuteQueryUpdateDB(SQL);
            LoadData();
        }
        else
            JOptionPane.showMessageDialog(null, "Thông tin không hợp lệ!");
    }//GEN-LAST:event_btnXoaActionPerformed

    private void tblHocSinhMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblHocSinhMouseClicked
        // TODO add your handling code here:
        int index = tblHocSinh.getSelectedRow();
        txtMahs.setText(tblHocSinh.getValueAt(index, 0).toString());
        txtHoten.setText(tblHocSinh.getValueAt(index, 1).toString());
        txtDiemToan.setText(tblHocSinh.getValueAt(index, 2).toString());
        txtDiemViet.setText(tblHocSinh.getValueAt(index, 3).toString());
        disableButton();
    }//GEN-LAST:event_tblHocSinhMouseClicked

    private void btnCapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhatActionPerformed
        // TODO add your handling code here:
        if(checkInvalid()){
            if(checkIdExistToUpdate(tblHocSinh.getSelectedRow())){
                String SQL = "update `hocsinh` set `hoten` = '"+txtHoten.getText()+"', `ma` = '"+txtMahs.getText() + "', `diemtoan` = "+txtDiemToan.getText()+ ", `diemviet` = "+txtDiemViet.getText()+" where `ma` = '"+tblHocSinh.getValueAt(tblHocSinh.getSelectedRow(), 0).toString() +"'";
                connection.ExcuteQueryUpdateDB(SQL);
                LoadData();
            }
            else
                JOptionPane.showMessageDialog(null, "Mã học sinh đã tồn tại!");
        }
        else
            JOptionPane.showMessageDialog(null, "Thông tin không hợp lệ!");
    }//GEN-LAST:event_btnCapNhatActionPerformed

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
            java.util.logging.Logger.getLogger(HocSinh_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HocSinh_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HocSinh_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HocSinh_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HocSinh_UI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCapNhat;
    private javax.swing.JButton btnThemMoi;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblHocSinh;
    private javax.swing.JTextField txtDiemToan;
    private javax.swing.JTextField txtDiemViet;
    private javax.swing.JTextField txtHoten;
    private javax.swing.JTextField txtMahs;
    // End of variables declaration//GEN-END:variables
}
