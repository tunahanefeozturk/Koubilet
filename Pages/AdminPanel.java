/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.prolab_2.Pages;

import com.mycompany.prolab_2.entity.Admin;
import com.mycompany.prolab_2.entity.Company; 
import com.mycompany.prolab_2.repository.CompanyRepository;
import javax.swing.JOptionPane;

/**
 *
 * @author oztur
 */
public class AdminPanel extends javax.swing.JFrame {
   
    /**
     * Creates new form AdminPanel
     */
    public AdminPanel() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jSplitPane1 = new javax.swing.JSplitPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jSpinner1 = new javax.swing.JSpinner();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jFirmaSil = new javax.swing.JButton();
        jFirmaEkle = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jBedel = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(650, 300));

        jLabel1.setForeground(new java.awt.Color(0, 204, 0));
        jLabel1.setText(" FİRMALAR :");

        jFirmaSil.setBackground(new java.awt.Color(0, 255, 0));
        jFirmaSil.setText("SİL");
        jFirmaSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFirmaSilActionPerformed(evt);
            }
        });

        jFirmaEkle.setBackground(new java.awt.Color(0, 255, 0));
        jFirmaEkle.setText("EKLE");
        jFirmaEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFirmaEkleActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(0, 204, 0));
        jLabel2.setText("ADI");

        jLabel4.setForeground(new java.awt.Color(0, 204, 0));
        jLabel4.setText("Hizmet Bedeli :");

        jBedel.setText("1000 ");
        jBedel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBedelActionPerformed(evt);
            }
        });

        jList1.setBackground(new java.awt.Color(204, 255, 204));
        jList1.setModel(new javax.swing.AbstractListModel<Company>() {
            Company[] companys = CompanyRepository.listele().toArray(new Company[CompanyRepository.listele().size()]);

            public int getSize() { return companys.length; }
            public Company getElementAt(int i) { return companys[i]; }
        });
        jScrollPane5.setViewportView(jList1);

        jLabel3.setText("TL");

        jLabel5.setForeground(new java.awt.Color(0, 204, 0));
        jLabel5.setText("ID");

        jButton1.setBackground(new java.awt.Color(0, 102, 51));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Ana Sayfaya Dön");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jFirmaSil)
                                .addGap(18, 18, 18)
                                .addComponent(jFirmaEkle))
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBedel, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBedel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5))
                .addGap(1, 1, 1)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jFirmaSil)
                    .addComponent(jFirmaEkle))
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jFirmaSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFirmaSilActionPerformed
        
        if(this.jList1.getSelectedValue()!=null){
        CompanyRepository.sil(this.jList1.getSelectedValue().getId()); 
      }
     else{
         JOptionPane.showConfirmDialog(null, "Lütfen silmek istediğiniz firmayı seçiniz.", " ", JOptionPane.WARNING_MESSAGE);
     }
     this.setVisible(false);
          AdminPanel next=new AdminPanel();
          next.setVisible(true);
    }//GEN-LAST:event_jFirmaSilActionPerformed

    private void jFirmaEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFirmaEkleActionPerformed
 
       String  st = JOptionPane.showInputDialog(null, "Eklemek istediğiniz firmanın adı:", "st", JOptionPane.QUESTION_MESSAGE);
       String  ps = JOptionPane.showInputDialog(null, "Eklemek istediğiniz firmanın şifresi:", "ps", JOptionPane.QUESTION_MESSAGE);
       String  ku = JOptionPane.showInputDialog(null, "Eklemek istediğiniz firmanın Şoför ücreti:", "ku", JOptionPane.QUESTION_MESSAGE);
       int k=Integer.parseInt(ku);
       String  hu = JOptionPane.showInputDialog(null, "Eklemek istediğiniz firmanın muavin ücreti:", "hu", JOptionPane.QUESTION_MESSAGE);
       int h=Integer.parseInt(hu);
    
        Company newCompany= CompanyRepository.ekle(st,ps );
        CompanyRepository.guncelle(newCompany.getId(), newCompany.getKullaniciAdi(), newCompany.getSifre(), k, h);
  
         this.setVisible(false);
       AdminPanel next =new AdminPanel();
       next.setVisible(true);
    }//GEN-LAST:event_jFirmaEkleActionPerformed

    private void jBedelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBedelActionPerformed
        int b =Integer.parseInt(jBedel.getText());
        Admin.fiyatBelirle(b);
    }//GEN-LAST:event_jBedelActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       this.setVisible(false);
        ilk next =new ilk();
       next.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed
   
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
            java.util.logging.Logger.getLogger(AdminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField jBedel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jFirmaEkle;
    private javax.swing.JButton jFirmaSil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JList<Company> jList1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
