/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thuchanh02;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import thuchanh02.SinhVien;
/**
 *
 * @author DOANMINH
 */
public class StudentGUI extends javax.swing.JFrame {
    private String GioiTinh;
    private ArrayList<SinhVien> sv = new ArrayList<>();
    private String HoTen;
    private int NamSinh;

    /**
     * Creates new form StudentGUI
     */
    public StudentGUI() {
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

        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        RNam = new javax.swing.JRadioButton();
        RNu = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        txtHT = new javax.swing.JTextField();
        txtNS = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TA1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("Nạp");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 140, -1, -1));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Họ Tên");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Năm Sinh");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 68, -1, -1));

        RNam.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        RNam.setText("Nam");
        jPanel1.add(RNam, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 103, 64, -1));

        RNu.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        RNu.setText("Nữ");
        jPanel1.add(RNu, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 66, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("Thêm");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 133, 80, 30));
        jPanel1.add(txtHT, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 140, -1));
        jPanel1.add(txtNS, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 140, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Giới Tính");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 107, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 190));

        TA1.setColumns(20);
        TA1.setRows(5);
        jScrollPane1.setViewportView(TA1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 580, 160));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String a = txtHT.getText();
        int b = Integer.parseInt(txtNS.getText());
        String GioiTinh = null;
        if(RNam.isSelected())
        {
            GioiTinh = "Nam";
        }
        if(RNu.isSelected())
        {
            GioiTinh = "Nu";
        }
        SinhVien c = new SinhVien();
        c.setHoTen(HoTen);
        c.setGioiTinh(GioiTinh);
        c.setNamSinh(NamSinh);
        sv.add(c);
        JOptionPane.showConfirmDialog(null, "Them Duoc ROi");
        txtHT.setText("");
        txtNS.setText("");
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         for (Object x : sv) {
            String s = "";
            s = ((SinhVien) x).getHoTen() + "\t\t" + ((SinhVien) x).getNamSinh() + "\t\t" + ((SinhVien) x).getGioiTinh() + "\n";
            TA1.insert(s, 0);
        }
        TA1.insert("Họ tên\t\t Năm sinh\t\t Giới tính\n", 0);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(StudentGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton RNam;
    private javax.swing.JRadioButton RNu;
    private javax.swing.JTextArea TA1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtHT;
    private javax.swing.JTextField txtNS;
    // End of variables declaration//GEN-END:variables
}
