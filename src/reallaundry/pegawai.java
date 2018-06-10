/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reallaundry;

import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;
import javafx.scene.control.Alert;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import static reallaundry.koneksi.getConnection;

/**
 *
 * @author Dzulkarnain Inc
 */
public class pegawai extends javax.swing.JFrame {

    koneksi db = new koneksi();
    Connection conn = getConnection();
    String cari = "";
    /**
     * Creates new form pegawai
     */
    public pegawai() {
        initComponents();
        setLocationRelativeTo(null);
        tableload(jTable1);
        kodeload(txid);
        alert1.setVisible(false);
        alert2.setVisible(false);
        alert3.setVisible(false);
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
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txid = new javax.swing.JTextField();
        txnama = new javax.swing.JTextField();
        txalamat = new javax.swing.JTextField();
        txnohp = new javax.swing.JTextField();
        txsearch = new javax.swing.JTextField();
        search = new javax.swing.JButton();
        cbsearch = new javax.swing.JComboBox();
        alert1 = new javax.swing.JLabel();
        alert2 = new javax.swing.JLabel();
        alert3 = new javax.swing.JLabel();
        save = new javax.swing.JButton();
        edit = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        back = new javax.swing.JButton();
        clear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Data Pegawai", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Comic Sans MS", 1, 16))); // NOI18N

        jTable1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID Pegawai", "Nama Pegawai", "Alamat Pegawai", "Nohp Pegawai"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel1.setText("ID Pegawai");

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel2.setText("Nama Pegawai");

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel3.setText("Alamat Pegawai");

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel4.setText("Nohp Pegawai");

        txid.setEditable(false);
        txid.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N

        txnama.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        txnama.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txnamaKeyTyped(evt);
            }
        });

        txalamat.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        txalamat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txalamatKeyTyped(evt);
            }
        });

        txnohp.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        txnohp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txnohpKeyTyped(evt);
            }
        });

        txsearch.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N

        search.setBackground(new java.awt.Color(203, 203, 203));
        search.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        search.setText("Search");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        cbsearch.setBackground(new java.awt.Color(203, 203, 203));
        cbsearch.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        cbsearch.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ID Pegawai", "Nama Pegawai", "Alamat Pegawai" }));

        alert1.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        alert1.setForeground(new java.awt.Color(255, 0, 0));
        alert1.setText("Data Harus diisi !!");

        alert2.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        alert2.setForeground(new java.awt.Color(255, 0, 0));
        alert2.setText("Data Harus diisi !!");

        alert3.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        alert3.setForeground(new java.awt.Color(255, 0, 0));
        alert3.setText("Data Harus diisi !!");

        save.setBackground(new java.awt.Color(203, 203, 203));
        save.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        save.setText("Add");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        edit.setBackground(new java.awt.Color(203, 203, 203));
        edit.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        edit.setText("Edit");
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });

        delete.setBackground(new java.awt.Color(203, 203, 203));
        delete.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        back.setBackground(new java.awt.Color(203, 203, 203));
        back.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        clear.setBackground(new java.awt.Color(203, 203, 203));
        clear.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        clear.setText("C");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(cbsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(save, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(edit, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txnohp, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(clear)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(alert3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 693, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txalamat, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(alert2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txid, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txnama, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(alert1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(cbsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(search, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txsearch))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txid, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(alert1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txnama, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txalamat, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(alert2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txnohp, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(alert3, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edit, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        txid.setText(String.valueOf(jTable1.getValueAt(jTable1.getSelectedRow(), 0)));
        txnama.setText(String.valueOf(jTable1.getValueAt(jTable1.getSelectedRow(), 1)));
        txalamat.setText(String.valueOf(jTable1.getValueAt(jTable1.getSelectedRow(), 2)));
        txnohp.setText(String.valueOf(jTable1.getValueAt(jTable1.getSelectedRow(), 3)));
        txnama.setBackground(Color.white);
        txalamat.setBackground(Color.white);
        txnohp.setBackground(Color.white);
        alert1.setVisible(false);
        alert2.setVisible(false);
        alert3.setVisible(false);
    }//GEN-LAST:event_jTable1MouseClicked

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
        cari = (String)cbsearch.getSelectedItem();
        if(cari == "ID Pegawai"){
            search1(jTable1);
        }else if(cari == "Nama Pegawai"){
            search2(jTable1);
        }else if(cari == "Alamat Pegawai"){
            search3(jTable1);
        }
    }//GEN-LAST:event_searchActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        // TODO add your handling code here:
        boolean isEmptyFields = false;
        if(txnama.getText().trim().isEmpty()){
            isEmptyFields = true;
            txnama.setBackground(new Color(255, 186, 186));
            alert1.setVisible(true);
        }
        if(txalamat.getText().trim().isEmpty()){
            isEmptyFields = true;
            txalamat.setBackground(new Color(255, 186, 186));
            alert2.setVisible(true);
        }
        if(txnohp.getText().trim().isEmpty()){
            isEmptyFields = true;
            txnohp.setBackground(new Color(255, 186, 186));
            alert3.setVisible(true);
        }
        if(!isEmptyFields){
            try {
                String sql = "INSERT INTO pegawai (id_pegawai, nama_pegawai, alamat_pegawai, nohp_pegawai) VALUES (?,?,?,?)";
                PreparedStatement pst = conn.prepareStatement(sql);

                pst.setString(1, txid.getText().trim());
                pst.setString(2, txnama.getText().trim());
                pst.setString(3, txalamat.getText().trim());
                pst.setString(4, txnohp.getText().trim());

                pst.execute();
                regist reg = new regist();
                reg.setVisible(true);
                reg.v.setText(txid.getText());

                clear();
                tableload(jTable1);
                kodeload(txid);

            } catch (Exception ex) {
                System.out.println(ex);
                JOptionPane.showMessageDialog(null, "Input No.Hp harus berupa angka !!", "WARNING",JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_saveActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
        ImageIcon icon = new ImageIcon("src/images/trash.png");
        int dialogButton = JOptionPane.showConfirmDialog (null, "Yakin Ingin Menghapus?","WARNING", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, icon);
        System.out.println(dialogButton);
        if(dialogButton == JOptionPane.YES_OPTION){
            db.putData("DELETE FROM pegawai WHERE id_pegawai = " + txid.getText());

            clear();
            tableload(jTable1);
            kodeload(txid);

            JOptionPane.showMessageDialog(null, "Data Deleted");
        }else{
            //remove(dialogButton);
        }
    }//GEN-LAST:event_deleteActionPerformed

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
        // TODO add your handling code here:
        try {
            String sql = "UPDATE pegawai SET nama_pegawai = '"
                + txnama.getText() + "', alamat_pegawai = '"
                + txalamat.getText() + "', nohp_pegawai = "
                + txnohp.getText() + " WHERE id_pegawai = " 
                + txid.getText();
            
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.execute();

            clear();
            tableload(jTable1);
            kodeload(txid);

            JOptionPane.showMessageDialog(null, "Data Updated");

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_editActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        // TODO add your handling code here:
        clear();
    }//GEN-LAST:event_clearActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        new menu().setVisible(true);
        dispose();
    }//GEN-LAST:event_backActionPerformed

    private void txnamaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txnamaKeyTyped
        // TODO add your handling code here:
        txnama.setBackground(Color.white);
        alert1.setVisible(false);
    }//GEN-LAST:event_txnamaKeyTyped

    private void txalamatKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txalamatKeyTyped
        // TODO add your handling code here:
        txalamat.setBackground(Color.white);
        alert2.setVisible(false);
    }//GEN-LAST:event_txalamatKeyTyped

    private void txnohpKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txnohpKeyTyped
        // TODO add your handling code here:
        txnohp.setBackground(Color.white);
        alert3.setVisible(false);
    }//GEN-LAST:event_txnohpKeyTyped

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
            java.util.logging.Logger.getLogger(pegawai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pegawai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pegawai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pegawai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pegawai().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel alert1;
    private javax.swing.JLabel alert2;
    private javax.swing.JLabel alert3;
    private javax.swing.JButton back;
    private javax.swing.JComboBox cbsearch;
    private javax.swing.JButton clear;
    private javax.swing.JButton delete;
    private javax.swing.JButton edit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton save;
    private javax.swing.JButton search;
    private javax.swing.JTextField txalamat;
    public static javax.swing.JTextField txid;
    private javax.swing.JTextField txnama;
    public javax.swing.JTextField txnohp;
    private javax.swing.JTextField txsearch;
    // End of variables declaration//GEN-END:variables

    private void tableload(JTable jt) {
        DefaultTableModel dt = (DefaultTableModel) jt.getModel();
        dt.setRowCount(0);
        try {
            ResultSet rset = db.getData("SELECT * FROM pegawai ORDER BY id_pegawai");
            while(rset.next()){
                Vector v = new Vector();
                v.add(rset.getString(1));
                v.add(rset.getString(2));
                v.add(rset.getString(3));
                v.add(rset.getString(4));
                dt.addRow(v);
            }
        } catch (Exception ex) {
            
        }
    }
    
    private void kodeload(JTextField jText) {
        try {
            ResultSet rset = db.getData("SELECT max(id_pegawai) FROM pegawai");
            while(rset.next()){
                int i = rset.getInt(1);
                i += 1;
                jText.setText(String.valueOf(i));
            }
        } catch (Exception ex) {
            
        }
    }
    
    private void search1(JTable jt2) {
        DefaultTableModel dt = (DefaultTableModel) jt2.getModel();
        dt.setRowCount(0);
        try {
            ResultSet rset = db.getData("SELECT * FROM pegawai WHERE id_pegawai LIKE '%" + txsearch.getText() + "%'");
            while(rset.next()){
                Vector v = new Vector();
                v.add(rset.getString(1));
                v.add(rset.getString(2));
                v.add(rset.getString(3));
                v.add(rset.getString(4));
                dt.addRow(v);
            }
        }catch (Exception ex) {
            
        }
    }
    private void search2(JTable jt2) {
        DefaultTableModel dt = (DefaultTableModel) jt2.getModel();
        dt.setRowCount(0);
        try {
            ResultSet rset = db.getData("SELECT * FROM pegawai WHERE nama_pegawai LIKE '%" + txsearch.getText() + "%'");
            while(rset.next()){
                Vector v = new Vector();
                v.add(rset.getString(1));
                v.add(rset.getString(2));
                v.add(rset.getString(3));
                v.add(rset.getString(4));
                dt.addRow(v);
            }
        }catch (Exception ex) {
            
        }
    }
    private void search3(JTable jt2) {
        DefaultTableModel dt = (DefaultTableModel) jt2.getModel();
        dt.setRowCount(0);
        try {
            ResultSet rset = db.getData("SELECT * FROM pegawai WHERE alamat_pegawai LIKE '%" + txsearch.getText() + "%'");
            while(rset.next()){
                Vector v = new Vector();
                v.add(rset.getString(1));
                v.add(rset.getString(2));
                v.add(rset.getString(3));
                v.add(rset.getString(4));
                dt.addRow(v);
            }
        }catch (Exception ex) {
            
        }
    }
    private void clear(){
        kodeload(txid);
        txnama.setText("");
        txalamat.setText("");
        txnohp.setText("");
        txsearch.setText("");
        
        txnama.setBackground(Color.white);
        txalamat.setBackground(Color.white);
        txnohp.setBackground(Color.white);
        alert1.setVisible(false);
        alert2.setVisible(false);
        alert3.setVisible(false);
        
        tableload(jTable1);
    }

}
