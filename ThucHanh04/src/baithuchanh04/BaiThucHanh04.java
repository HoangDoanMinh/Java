/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baithuchanh04;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import baithuchanh04.SinhVien;
import com.sun.xml.internal.ws.api.streaming.XMLStreamReaderFactory;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;

/**
 *
 * @author Doan Minh
 */
public class BaiThucHanh04 extends javax.swing.JFrame {
    ArrayList<SinhVien> SV = new ArrayList<>();
    DefaultTableModel model = new DefaultTableModel();

    /**
     * Creates new form BaiThucHanh04
     */
    public BaiThucHanh04() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtMSSV = new javax.swing.JTextField();
        txtHT = new javax.swing.JTextField();
        txtNS = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cbLop = new javax.swing.JComboBox();
        btnThem = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnTim = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        tbDS = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Thao tác"));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("MSSV");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 42, 51, -1));

        jLabel2.setText("Họ tên");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 74, 51, -1));

        jLabel3.setText("Năm sinh");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 97, 63, -1));
        jPanel1.add(txtMSSV, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 39, 193, -1));

        txtHT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHTActionPerformed(evt);
            }
        });
        jPanel1.add(txtHT, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 68, 193, -1));
        jPanel1.add(txtNS, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 94, 193, -1));

        jLabel5.setText("Lớp");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 122, 106, 20));

        cbLop.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "56TH1", "56TH2", "57TH1", "57TH2", " " }));
        jPanel1.add(cbLop, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 122, -1, -1));

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });
        jPanel1.add(btnThem, new org.netbeans.lib.awtextra.AbsoluteConstraints(385, 36, -1, -1));

        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });
        jPanel1.add(btnXoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(385, 65, -1, -1));

        btnSua.setText("Sửa/ Lưu");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });
        jPanel1.add(btnSua, new org.netbeans.lib.awtextra.AbsoluteConstraints(385, 94, -1, -1));

        btnTim.setText("Tìm kiếm");
        btnTim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimActionPerformed(evt);
            }
        });
        jPanel1.add(btnTim, new org.netbeans.lib.awtextra.AbsoluteConstraints(385, 121, -1, -1));

        tbDS.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "MSSV", "Họ tên", "Năm sinh", "Lớp"
            }
        ));
        tbDS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbDSMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(tbDS);

        jPanel1.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 168, -1, 90));

        jButton1.setText("..");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 121, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 11, 544, 265));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtHTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHTActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        String MSSV = txtMSSV.getText();
        String Hoten = txtHT.getText();
        String NamSinh = txtNS.getText();
        String Lop = cbLop.getSelectedItem().toString();
        SinhVien Demo = new SinhVien();
        Demo.setMSSV(MSSV);
        Demo.setHoTen(Hoten);
        Demo.setNamSinh(NamSinh);
        Demo.setLop(Lop);
        SV.add(Demo);

        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("MSSV");
        model.addColumn("Hoten");
        model.addColumn("Namsinh");
        model.addColumn("Lop");

        for ( int i = 0 ; i < SV.size() ; i ++)
        {
            SinhVien sv = SV.get(i);
            Vector <String> Dong = new Vector<>();
            Dong.add(sv.getMSSV());
            Dong.add(sv.getHoTen());
            Dong.add(sv.getNamSinh());
            Dong.add(sv.getLop());
            model.addRow(Dong);
        }
        tbDS.setModel(model);

    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnTimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTimActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tbDSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbDSMouseClicked
        // TODO add your handling code here:
        TableModel model = tbDS.getModel();
        int dong = tbDS.getSelectedRow();
        txtMSSV.setText(model.getValueAt(dong, 1).toString());
        txtHT.setText(model.getValueAt(dong, 2).toString());
        txtNS.setText(model.getValueAt(dong, 3).toString());
        cbLop.setSelectedItem(dong);
    }//GEN-LAST:event_tbDSMouseClicked

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
       // DefaultTableModel model = new DefaultTableModel();
        int dong = tbDS.getSelectedRow();
        int c = dong +1;
        if(dong > -1)
        {
        int a = JOptionPane.showConfirmDialog(null,"Ban co chac la xoa khong");
            if(a==0){
                     model.removeRow(dong);
                     SV.remove(dong);
                     tbDS.setModel(model);
            }
        }    
        else 
        {
            JOptionPane.showConfirmDialog(null,"Ban chua chon dong xoa");
        }
    }//GEN-LAST:event_btnXoaActionPerformed

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
            java.util.logging.Logger.getLogger(BaiThucHanh04.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BaiThucHanh04.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BaiThucHanh04.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BaiThucHanh04.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BaiThucHanh04().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTim;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox cbLop;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable tbDS;
    private javax.swing.JTextField txtHT;
    private javax.swing.JTextField txtMSSV;
    private javax.swing.JTextField txtNS;
    // End of variables declaration//GEN-END:variables
}