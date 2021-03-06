/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.youri.view;

import io.youri.control.Functions;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author YODI YANWAR
 */
public class FormUser extends javax.swing.JInternalFrame {

    /**
     * Creates new form FormUser
     */
    public Functions fungsi;
    public MainMenu main;
            
    public FormUser() {
        getContentPane().setBackground(Color.WHITE);
        initComponents();
        
        inisialisasi();
        load();        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        textPassword = new javax.swing.JTextField();
        textNamaUser = new javax.swing.JTextField();
        textUsername = new javax.swing.JTextField();
        comboKategori = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        buttonHapus = new javax.swing.JButton();
        buttonSimpan = new javax.swing.JButton();
        buttonEdit = new javax.swing.JButton();
        buttonBatal = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableUser = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        comboCari = new javax.swing.JComboBox();
        textCari = new javax.swing.JTextField();
        buttonTutup = new javax.swing.JButton();
        labelId = new javax.swing.JLabel();

        jLayeredPane1.setBorder(javax.swing.BorderFactory.createTitledBorder("User"));

        jLabel2.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        jLabel2.setText("Akses Kategori");

        jLabel3.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        jLabel3.setText("Username");

        jLabel4.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        jLabel4.setText("Password");

        jLabel5.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        jLabel5.setText("Nama");

        textUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textUsernameActionPerformed(evt);
            }
        });

        comboKategori.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", " " }));

        jLabel8.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        jLabel8.setText(":");

        jLabel9.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        jLabel9.setText(":");

        jLabel10.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        jLabel10.setText(":");

        jLabel11.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        jLabel11.setText(":");

        buttonHapus.setText("Hapus");
        buttonHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonHapusActionPerformed(evt);
            }
        });

        buttonSimpan.setText("Simpan");
        buttonSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSimpanActionPerformed(evt);
            }
        });

        buttonEdit.setText("Edit");
        buttonEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditActionPerformed(evt);
            }
        });

        buttonBatal.setText("Batal");
        buttonBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBatalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(textPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(textUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(comboKategori, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                        .addComponent(buttonSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(26, 26, 26)
                                        .addComponent(buttonEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(buttonHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textNamaUser, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(buttonBatal, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(textNamaUser, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboKategori, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonBatal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );
        jLayeredPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(textPassword, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(textNamaUser, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(textUsername, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(comboKategori, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel10, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel11, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(buttonHapus, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(buttonSimpan, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(buttonEdit, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(buttonBatal, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel1.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        jLabel1.setText("Manajemen User");

        jLayeredPane2.setBorder(javax.swing.BorderFactory.createTitledBorder("Daftar User"));

        tableUser.setModel(new javax.swing.table.DefaultTableModel(
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
        tableUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableUserMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableUser);

        jLabel12.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        jLabel12.setText("Cari Berdasar  :");

        comboCari.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nama User", "ID", "Kategori User", "Username", "Password" }));

        textCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textCariActionPerformed(evt);
            }
        });
        textCari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textCariKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jLayeredPane2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(comboCari, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textCari, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 75, Short.MAX_VALUE))))
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(comboCari)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textCari, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jLayeredPane2.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel12, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(comboCari, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(textCari, javax.swing.JLayeredPane.DEFAULT_LAYER);

        buttonTutup.setText("Tutup");
        buttonTutup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTutupActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(labelId, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(buttonTutup, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jLayeredPane2)
                        .addGap(4, 4, 4)))
                .addGap(10, 10, 10))
            .addGroup(layout.createSequentialGroup()
                .addGap(324, 324, 324)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLayeredPane2))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(buttonTutup, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(labelId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textUsernameActionPerformed

    private void buttonTutupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTutupActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_buttonTutupActionPerformed

    private void textCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textCariActionPerformed

    }//GEN-LAST:event_textCariActionPerformed

    private void textCariKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textCariKeyTyped
        cari();
    }//GEN-LAST:event_textCariKeyTyped

    private void buttonSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSimpanActionPerformed
        simpan();
    }//GEN-LAST:event_buttonSimpanActionPerformed

    private void tableUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableUserMouseClicked
        klikTable();
    }//GEN-LAST:event_tableUserMouseClicked

    private void buttonBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBatalActionPerformed
        batal();
    }//GEN-LAST:event_buttonBatalActionPerformed

    private void buttonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditActionPerformed
        edit();
    }//GEN-LAST:event_buttonEditActionPerformed

    private void buttonHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonHapusActionPerformed
        hapus();
    }//GEN-LAST:event_buttonHapusActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonBatal;
    private javax.swing.JButton buttonEdit;
    private javax.swing.JButton buttonHapus;
    private javax.swing.JButton buttonSimpan;
    private javax.swing.JButton buttonTutup;
    private javax.swing.JComboBox comboCari;
    private javax.swing.JComboBox comboKategori;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelId;
    private javax.swing.JTable tableUser;
    private javax.swing.JTextField textCari;
    private javax.swing.JTextField textNamaUser;
    private javax.swing.JTextField textPassword;
    private javax.swing.JTextField textUsername;
    // End of variables declaration//GEN-END:variables

    private void inisialisasi() {
        buttonEdit.setVisible(false);
        buttonHapus.setVisible(false);
        buttonSimpan.setText("Baru");
        buttonBatal.setVisible(false);
        setTextStatus(false);
        labelId.setVisible(false);
    }

    private void load() {
        fungsi = new Functions();
        
        String sql = "SELECT tbl_user.id_user AS ID, tbl_user.nama_user as 'Nama User', "
                + "tbl_kategori_user.nama_kategori_user as 'Kategori User',"
                + " tbl_user.username AS 'Username', tbl_user.passwords AS 'Password' "
                + "FROM tbl_user INNER JOIN tbl_kategori_user ON tbl_user.id_kategori_user=tbl_kategori_user.id_kategori_user"
                + " ORDER BY tbl_user.nama_user";
        
        fungsi.bindingTable(sql, tableUser);       
        
        String sqlCombo ="SELECT nama_kategori_user FROM tbl_kategori_user";
        
        fungsi.bindingCombo(sqlCombo, comboKategori, "nama_kategori_user");  
        
    }

    private void cari() {
        fungsi = new Functions();
        
        String kolomTableDB = "";
        
        if("Nama User".equals(comboCari.getSelectedItem())){
            kolomTableDB = "tbl_user.nama_user";
        } else
        if("ID".equals(comboCari.getSelectedItem())){
            kolomTableDB = "tbl_user.id_user";
        } else
        if("Kategori User".equals(comboCari.getSelectedItem())){
            kolomTableDB = "tbl_kategori_user.nama_kategori_user";
        } else
        if("Username".equals(comboCari.getSelectedItem())){
            kolomTableDB = "tbl_user.username";
        } else
        if ("Password".equals(comboCari.getSelectedItem())){
            kolomTableDB = "tbl_user.passwords";
        }
            
        String sql = "SELECT tbl_user.id_user AS ID, tbl_user.nama_user as 'Nama User', "
                + "tbl_kategori_user.nama_kategori_user as 'Kategori User', "
                + "tbl_user.username AS 'Username', "
                + "tbl_user.passwords AS 'Password' FROM tbl_user "
                + "INNER JOIN tbl_kategori_user ON tbl_user.id_kategori_user=tbl_kategori_user.id_kategori_user "
                + "WHERE "+kolomTableDB+" LIKE '%"+textCari.getText()+"%' ORDER BY tbl_user.nama_user";
        
        fungsi.bindingTable(sql, tableUser);         
    }
    
    private void setTextStatus(boolean status){
        textNamaUser.setEnabled(status);
        textUsername.setEnabled(status);
        textPassword.setEnabled(status);
    }

    private void simpan() {
        if("Baru".equals(buttonSimpan.getText())){
            setTextStatus(true);
            buttonSimpan.setText("Simpan");
            buttonBatal.setVisible(true);
        }else
        if("Simpan".equals(buttonSimpan.getText())){
            
            String sql = "INSERT INTO tbl_user (`nama_user`, `id_kategori_user`, `username`, `passwords`) VALUES"
                    + "('"+textNamaUser.getText()+"',"
                    + "(SELECT tbl_kategori_user.id_kategori_user FROM tbl_kategori_user WHERE tbl_kategori_user.nama_kategori_user='"+comboKategori.getSelectedItem()+"'),"
                    + "'"+textUsername.getText()+"','"+textPassword.getText()+"')";
            
            if(fungsi.runSQL(sql)){
                fungsi.msgBox("Berhasil Menambah Data User", "SUKSES", 1);
                buttonSimpan.setText("Baru");
                clear();
                setTextStatus(false);
                buttonBatal.setVisible(false);
            load();
            } else{
                fungsi.msgBox("Gagal Menambah Data User", "GAGAL", 0);
            }
        }
    }

    private void clear() {
        textCari.setText("");
        textNamaUser.setText("");
        textUsername.setText("");
        textPassword.setText("");
    }

    private void klikTable() {
        buttonEdit.setVisible(true);
        buttonHapus.setVisible(true);
        buttonBatal.setVisible(true);
        buttonSimpan.setVisible(false);
        setTextStatus(true);
        
       int i=this.tableUser.getSelectedRow();
        if(i==-1)
        {
            return;
        }
       
       labelId.setText(String.valueOf(tableUser.getModel().getValueAt(i,0)));
       textNamaUser.setText(String.valueOf(tableUser.getModel().getValueAt(i,1)));
       textUsername.setText((String)tableUser.getModel().getValueAt(i,3));
       textPassword.setText((String)tableUser.getModel().getValueAt(i,4));
       comboKategori.setSelectedItem(String.valueOf(tableUser.getModel().getValueAt(i,2)));
       
    }

    private void batal() {
            clear();
            buttonEdit.setVisible(false);
            buttonHapus.setVisible(false);
            buttonSimpan.setText("Baru");
            buttonSimpan.setVisible(true);
            setTextStatus(false);       
            buttonBatal.setVisible(false);
    }

    private void edit() {
        String sql = "UPDATE tbl_user SET `nama_user`='"+textNamaUser.getText()+"',`id_kategori_user`=("
                + "SELECT tbl_kategori_user.id_kategori_user FROM tbl_kategori_user "
                + "WHERE tbl_kategori_user.nama_kategori_user='"+comboKategori.getSelectedItem()+"'),"
                + "`username`='"+textUsername.getText()+"',`passwords`='"+textPassword.getText()+"' WHERE id_user='"+labelId.getText()+"'";
        
            if(fungsi.runSQL(sql)){
                fungsi.msgBox("Berhasil Mengubah Data User", "SUKSES", 1);
                buttonSimpan.setVisible(true);
                buttonSimpan.setText("Baru");
                buttonEdit.setVisible(false);
                buttonHapus.setVisible(false);
                clear();
                setTextStatus(false);
                buttonBatal.setVisible(false);
            load();
            } else{
                fungsi.msgBox("Gagal Mengubah Data User", "GAGAL", 0);
            }        
    }

    private void hapus() {
        int app;
        if((app = JOptionPane.showConfirmDialog(null,"Hapus Data User ?","Perhatian",JOptionPane.YES_NO_OPTION))==0){
             String sql = "DELETE FROM `tbl_user` WHERE id_user="+labelId.getText()+"";
             
            if(fungsi.runSQL(sql)){
                fungsi.msgBox("Berhasil Manghapus Data User", "SUKSES", 1);
                buttonSimpan.setVisible(true);
                buttonSimpan.setText("Baru");
                buttonEdit.setVisible(false);
                buttonHapus.setVisible(false);
                clear();
                setTextStatus(false);
                buttonBatal.setVisible(false);
            load();
            } else{
                fungsi.msgBox("Gagal Manghapus Data User", "GAGAL", 0);
            }               
        }           
    }
}
