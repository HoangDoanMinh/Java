/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai3SW;

import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.ListModel;

/**
 *
 * @author DOANMINH
 */
public class BaiSW extends javax.swing.JFrame {

    /**
     * Creates new form BaiSW
     */
     DefaultListModel LPhai = new DefaultListModel();
     DefaultListModel LTrai = new DefaultListModel();
     
    public BaiSW() {
        this.LTrai = new DefaultListModel();
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
        bnPhai = new javax.swing.JButton();
        bnAllPhai = new javax.swing.JButton();
        bnTrai = new javax.swing.JButton();
        bnAllTrai = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        List1 = new javax.swing.JList();
        jScrollPane2 = new javax.swing.JScrollPane();
        List2 = new javax.swing.JList();
        jButton5 = new javax.swing.JButton();
        bnXoaP = new javax.swing.JButton();
        bnXoaT = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ListView Bài 3");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Danh Sách Môn Thể Thao");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Danh Sách Ưa Thích");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(385, 47, -1, -1));

        bnPhai.setText(">");
        bnPhai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnPhaiActionPerformed(evt);
            }
        });
        jPanel1.add(bnPhai, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 67, -1, -1));

        bnAllPhai.setText(">>");
        bnAllPhai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnAllPhaiActionPerformed(evt);
            }
        });
        jPanel1.add(bnAllPhai, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, -1, -1));

        bnTrai.setText("<");
        bnTrai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnTraiActionPerformed(evt);
            }
        });
        jPanel1.add(bnTrai, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, -1, -1));

        bnAllTrai.setText("<<");
        bnAllTrai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnAllTraiActionPerformed(evt);
            }
        });
        jPanel1.add(bnAllTrai, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 231, -1, -1));

        List1.setBackground(new java.awt.Color(204, 204, 255));
        List1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Đá Banh", "Bóng Chuyền", "Game Thủ", "Bóng Chày", "Cầu Lông", "Bóng rổ", "Điền Kinh" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(List1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 67, 100, 187));

        List2.setBackground(new java.awt.Color(204, 255, 153));
        jScrollPane2.setViewportView(List2);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(384, 67, 130, 187));

        jButton5.setText("add");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, -1, -1));

        bnXoaP.setText("Xoa Phai");
        bnXoaP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnXoaPActionPerformed(evt);
            }
        });
        jPanel1.add(bnXoaP, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 270, -1, -1));

        bnXoaT.setText("Xoa Trai");
        bnXoaT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnXoaTActionPerformed(evt);
            }
        });
        jPanel1.add(bnXoaT, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       // TODO add your handling code here:
         new NhapIteam().setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void bnPhaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnPhaiActionPerformed
        // TODO add your handling code here:
         //DefaultListModel<Luu> model = new DefaultListModel<>();
         //int stt = List1.getSelectedIndex();
        // add item to model
        // String Chuyen = model.getElementAt(stt).toString();   
        List2.setModel(LPhai);
        LPhai.addElement(List1.getSelectedValue());
        
    }//GEN-LAST:event_bnPhaiActionPerformed

    private void bnTraiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnTraiActionPerformed
        // TODO add your handling code here:
        
         List1.setModel(LTrai);
         LTrai.addElement(List2.getSelectedValue());
    }//GEN-LAST:event_bnTraiActionPerformed

    private void bnXoaPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnXoaPActionPerformed
        // TODO add your handling code here:
        ListModel ModePhai2  = List2.getModel();
         ArrayList<String> ArrLP2 = new ArrayList<>();
         for(int i=0;i< ModePhai2.getSize();i++)
         {
            String ten = ModePhai2.getElementAt(i).toString();     
            ArrLP2.add(ten);
         }
         int VT = List2.getSelectedIndex();
         ArrLP2.remove(VT);
         Object[] dataPrai2 = ArrLP2.toArray();
         List2.setListData(dataPrai2);
    }//GEN-LAST:event_bnXoaPActionPerformed

    private void bnXoaTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnXoaTActionPerformed
        // TODO add your handling code here:
        
        ListModel ModeTrai  = List1.getModel();
         ArrayList<String> ArrL = new ArrayList<>();
         for(int i=0;i< ModeTrai.getSize();i++)
         {
            String ten = ModeTrai.getElementAt(i).toString();     
            ArrL.add(ten);
         }
         int VT = List1.getSelectedIndex();
         ArrL.remove(VT);
         Object[] dataTrai = ArrL.toArray();
         List1.setListData(dataTrai);
    }//GEN-LAST:event_bnXoaTActionPerformed

    private void bnAllTraiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnAllTraiActionPerformed
        // TODO add your handling code here:
        ListModel ModeCTrai  = List2.getModel();
         ArrayList<String> ArrLP = new ArrayList<>();
         for(int i=0;i< ModeCTrai.getSize();i++)
         {
           String ten = ModeCTrai.getElementAt(i).toString();     
           ArrLP.add(ten);
        }
         int VT = List2.getSelectedIndex();
         ArrLP.add(List2.getName());
         Object[] dataCTrai = ArrLP.toArray();
         List1.setListData(dataCTrai);
    }//GEN-LAST:event_bnAllTraiActionPerformed

    private void bnAllPhaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnAllPhaiActionPerformed
        // TODO add your handling code here:
        ListModel ModeTrai1  = List1.getModel();
         ArrayList<String> ArrL1 = new ArrayList<>();
         for(int i=0;i< ModeTrai1.getSize();i++)
         {
           String ten = ModeTrai1.getElementAt(i).toString();     
           ArrL1.add(ten);
        }
        // int VT = List2.getSelectedIndex();
         ArrL1.add(List1.getName());
         Object[] dataTrai1 = ArrL1.toArray();
         List2.setListData(dataTrai1);
    }//GEN-LAST:event_bnAllPhaiActionPerformed

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
            java.util.logging.Logger.getLogger(BaiSW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BaiSW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BaiSW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BaiSW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BaiSW().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList List1;
    private javax.swing.JList List2;
    private javax.swing.JButton bnAllPhai;
    private javax.swing.JButton bnAllTrai;
    private javax.swing.JButton bnPhai;
    private javax.swing.JButton bnTrai;
    private javax.swing.JButton bnXoaP;
    private javax.swing.JButton bnXoaT;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
