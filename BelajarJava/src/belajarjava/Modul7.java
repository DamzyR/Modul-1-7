/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package belajarjava;

import javax.swing.DefaultListModel;
import javax.swing.text.BadLocationException;

/**
 *
 * @author HP
 */
public class Modul7 extends javax.swing.JFrame {

    /**
     * Creates new form Modul7
     */
    public Modul7() {
        initComponents();
        ListModel = new DefaultListModel();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        AreaKota = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        CbMakanan = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ListMinuman = new javax.swing.JList<>();
        bTAMBAH = new javax.swing.JButton();
        bHAPUS = new javax.swing.JButton();
        bUBAH = new javax.swing.JButton();
        bSISIP = new javax.swing.JButton();
        eUbah = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        eKOTA = new javax.swing.JTextField();
        eMAKANAN = new javax.swing.JTextField();
        eMINUMAN = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("KOTA");

        AreaKota.setColumns(20);
        AreaKota.setRows(5);
        jScrollPane1.setViewportView(AreaKota);

        jLabel2.setText("MAKANAN");

        jLabel3.setText("MINUMAN");

        jScrollPane2.setViewportView(ListMinuman);

        bTAMBAH.setText("TAMBAH");
        bTAMBAH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bTAMBAHActionPerformed(evt);
            }
        });

        bHAPUS.setText("HAPUS");
        bHAPUS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bHAPUSActionPerformed(evt);
            }
        });

        bUBAH.setText("UBAH");
        bUBAH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bUBAHActionPerformed(evt);
            }
        });

        bSISIP.setText("SISIP");
        bSISIP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSISIPActionPerformed(evt);
            }
        });

        jLabel4.setText("KOTA");

        jLabel5.setText("MAKANAN");

        jLabel6.setText("MINUMAN");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(89, 89, 89)
                        .addComponent(jLabel2)
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addContainerGap())))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CbMakanan, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 164, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bTAMBAH)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bHAPUS, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bSISIP, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bUBAH, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(eMINUMAN, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(eMAKANAN, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(eKOTA, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(eUbah, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CbMakanan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bTAMBAH)
                    .addComponent(bHAPUS))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(eUbah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bUBAH)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(eMAKANAN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(eKOTA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(eMINUMAN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bSISIP)
                .addGap(61, 61, 61))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bTAMBAHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bTAMBAHActionPerformed
        // TODO add your handling code here:
        AreaKota.append("Gersik"+"\n");
        AreaKota.append("Malang "+"\n");
        AreaKota.append("Surabaya"+"\n");
        
        CbMakanan.insertItemAt("Rujak", 0);
        CbMakanan.insertItemAt("Rawon", 1);
        CbMakanan.insertItemAt("Sate", 2);
        
        ListModel.add(0, "Sprite");
        ListModel.add(1, "Fanta");
        ListModel.add(2, "Es Batu");
        ListModel.add(3, "Kopi");
        ListMinuman.setModel(ListModel);
    }//GEN-LAST:event_bTAMBAHActionPerformed

    private void bHAPUSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bHAPUSActionPerformed
        // TODO add your handling code here:
        if (AreaKota.getLineCount() > 0) {
        try {
            // Mendapatkan posisi awal dan akhir dari baris pertama
            int posisi = AreaKota.getLineStartOffset(0);
            int posisiAkhir = AreaKota.getLineEndOffset(0);
            AreaKota.replaceRange("", posisi, posisiAkhir);
        } catch (BadLocationException e) {
            e.printStackTrace();
        }
    }

    // Hapus item dari cbMakanan (ComboBox)
    if (CbMakanan.getItemCount() > 0) {
        CbMakanan.removeItemAt(0);
    }

    // Hapus item dari ListMinuman (JList)
    if (ListModel.getSize() > 0) {
        ListModel.remove(0);
    }
    }//GEN-LAST:event_bHAPUSActionPerformed

    private void bUBAHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bUBAHActionPerformed
        // TODO add your handling code here:
        if (AreaKota.getLineCount()>0) {
        AreaKota.setSelectionStart(0);
        AreaKota.setSelectionEnd(12);
        int posisi = AreaKota.getSelectedText().indexOf("\n");
        AreaKota.replaceRange(eUbah.getText()+"\n", 0,posisi+1);
        if (posisi == -1)
        AreaKota.replaceRange(eUbah.getText()+"\n",0,8);
        }
        if (CbMakanan.getItemCount()>0){
        CbMakanan.removeItemAt(1);
        CbMakanan.insertItemAt(eUbah.getText(),1);
        }
if (ListModel.getSize()>0){
ListModel.remove(1);
ListModel.insertElementAt(eUbah.getText(),1);
}
    }//GEN-LAST:event_bUBAHActionPerformed

    private void bSISIPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSISIPActionPerformed
        String kota = eKOTA.getText();
        String makanan = eMAKANAN.getText();
        String minuman = eMINUMAN.getText();
        
        AreaKota.append(kota);
        
        CbMakanan.insertItemAt(makanan,0);
        
        ListModel.insertElementAt(minuman,0);
    }//GEN-LAST:event_bSISIPActionPerformed

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
            java.util.logging.Logger.getLogger(Modul7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Modul7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Modul7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Modul7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Modul7().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea AreaKota;
    private javax.swing.JComboBox<String> CbMakanan;
    private javax.swing.JList<String> ListMinuman;
    private javax.swing.JButton bHAPUS;
    private javax.swing.JButton bSISIP;
    private javax.swing.JButton bTAMBAH;
    private javax.swing.JButton bUBAH;
    private javax.swing.JTextField eKOTA;
    private javax.swing.JTextField eMAKANAN;
    private javax.swing.JTextField eMINUMAN;
    private javax.swing.JTextField eUbah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
    DefaultListModel ListModel;
}
