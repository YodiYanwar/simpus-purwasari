/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.youri.view;

import io.youri.control.Functions;
import java.awt.Color;
import java.sql.Timestamp;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author YODI YANWAR
 */
public class FormKecamatan extends javax.swing.JInternalFrame {

    /**
     * Creates new form ManajemenLokasi
     */
    public Functions fungsi;
    
    public FormKecamatan() {
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

        layerKotaKab = new javax.swing.JLayeredPane();
        layerDaftar = new javax.swing.JLayeredPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableKecamatan = new javax.swing.JTable();
        labelCari = new javax.swing.JLabel();
        textCari = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        buttonSimpan = new javax.swing.JButton();
        buttonEdit = new javax.swing.JButton();
        buttonHapus = new javax.swing.JButton();
        buttonBatal = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        textNamaKecamatan = new javax.swing.JTextField();
        comboNamaKotaKab = new javax.swing.JComboBox();
        labelId = new javax.swing.JLabel();
        labelKotaKab = new javax.swing.JLabel();
        labelTitikDuaKotaKab = new javax.swing.JLabel();
        comboKotaKab = new javax.swing.JComboBox();
        buttonTutup = new javax.swing.JButton();

        layerKotaKab.setBorder(javax.swing.BorderFactory.createTitledBorder("Kecamatan"));

        layerDaftar.setBorder(javax.swing.BorderFactory.createTitledBorder("Daftar Kecamatan"));

        tableKecamatan.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tableKecamatan);

        labelCari.setText("Cari Berdasar Nama Kecamatan    :");

        javax.swing.GroupLayout layerDaftarLayout = new javax.swing.GroupLayout(layerDaftar);
        layerDaftar.setLayout(layerDaftarLayout);
        layerDaftarLayout.setHorizontalGroup(
            layerDaftarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layerDaftarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelCari, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textCari, javax.swing.GroupLayout.DEFAULT_SIZE, 399, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layerDaftarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layerDaftarLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 604, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layerDaftarLayout.setVerticalGroup(
            layerDaftarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layerDaftarLayout.createSequentialGroup()
                .addContainerGap(204, Short.MAX_VALUE)
                .addGroup(layerDaftarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCari, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textCari, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(layerDaftarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layerDaftarLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(54, 54, 54)))
        );
        layerDaftar.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layerDaftar.setLayer(labelCari, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layerDaftar.setLayer(textCari, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel3.setText("Nama Kota / Kabupaten");

        jLabel4.setText(":");

        buttonSimpan.setText("Simpan");

        buttonEdit.setText("Edit");

        buttonHapus.setText("Hapus");

        buttonBatal.setText("Batal");

        jLabel6.setText("Nama Kecamatan");

        jLabel7.setText(":");

        comboNamaKotaKab.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", " " }));

        labelKotaKab.setText("Kota / Kab");

        labelTitikDuaKotaKab.setText(":");

        comboKotaKab.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Kota", "Kab" }));

        javax.swing.GroupLayout layerKotaKabLayout = new javax.swing.GroupLayout(layerKotaKab);
        layerKotaKab.setLayout(layerKotaKabLayout);
        layerKotaKabLayout.setHorizontalGroup(
            layerKotaKabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layerKotaKabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layerKotaKabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layerKotaKabLayout.createSequentialGroup()
                        .addGroup(layerKotaKabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layerKotaKabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layerKotaKabLayout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboNamaKotaKab, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layerKotaKabLayout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(6, 6, 6)
                                .addComponent(textNamaKecamatan, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layerKotaKabLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layerKotaKabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layerKotaKabLayout.createSequentialGroup()
                                .addGap(243, 243, 243)
                                .addComponent(labelId, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layerKotaKabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layerKotaKabLayout.createSequentialGroup()
                                    .addComponent(buttonSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(44, 44, 44)
                                    .addComponent(buttonEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(29, 29, 29)
                                    .addComponent(buttonHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(buttonBatal, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layerKotaKabLayout.createSequentialGroup()
                        .addComponent(labelKotaKab, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labelTitikDuaKotaKab, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboKotaKab, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(layerDaftar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layerKotaKabLayout.setVerticalGroup(
            layerKotaKabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layerKotaKabLayout.createSequentialGroup()
                .addGroup(layerKotaKabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layerKotaKabLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(layerKotaKabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelKotaKab, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelTitikDuaKotaKab, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboKotaKab, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layerKotaKabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboNamaKotaKab, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layerKotaKabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textNamaKecamatan, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(layerKotaKabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buttonSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buttonBatal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(labelId, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 36, Short.MAX_VALUE))
                    .addComponent(layerDaftar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 10, Short.MAX_VALUE))
        );
        layerKotaKab.setLayer(layerDaftar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layerKotaKab.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layerKotaKab.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layerKotaKab.setLayer(buttonSimpan, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layerKotaKab.setLayer(buttonEdit, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layerKotaKab.setLayer(buttonHapus, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layerKotaKab.setLayer(buttonBatal, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layerKotaKab.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layerKotaKab.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layerKotaKab.setLayer(textNamaKecamatan, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layerKotaKab.setLayer(comboNamaKotaKab, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layerKotaKab.setLayer(labelId, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layerKotaKab.setLayer(labelKotaKab, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layerKotaKab.setLayer(labelTitikDuaKotaKab, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layerKotaKab.setLayer(comboKotaKab, javax.swing.JLayeredPane.DEFAULT_LAYER);

        buttonTutup.setText("Tutup");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(buttonTutup, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(layerKotaKab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 9, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(layerKotaKab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(buttonTutup, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonBatal;
    private javax.swing.JButton buttonEdit;
    private javax.swing.JButton buttonHapus;
    private javax.swing.JButton buttonSimpan;
    private javax.swing.JButton buttonTutup;
    private javax.swing.JComboBox comboKotaKab;
    private javax.swing.JComboBox comboNamaKotaKab;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelCari;
    private javax.swing.JLabel labelId;
    private javax.swing.JLabel labelKotaKab;
    private javax.swing.JLabel labelTitikDuaKotaKab;
    private javax.swing.JLayeredPane layerDaftar;
    private javax.swing.JLayeredPane layerKotaKab;
    private javax.swing.JTable tableKecamatan;
    private javax.swing.JTextField textCari;
    private javax.swing.JTextField textNamaKecamatan;
    // End of variables declaration//GEN-END:variables

    private void inisialisasi() {
        buttonEdit.setVisible(false);
        buttonHapus.setVisible(false);
        buttonSimpan.setText("Baru");
        buttonBatal.setVisible(false);
        comboNamaKotaKab.setEnabled(false);
        labelId.setVisible(false);
        
        setTextStatus(false);
    }

    private void load() {
        fungsi = new Functions();
        
        String sql = "SELECT tbl_kecamatan.id_kecamatan AS 'ID', "
                + "tbl_kota_kab.kota_or_kab AS 'Kota / Kab', "
                + "tbl_kota_kab.nama_kota_kab AS 'Nama Kota / Kab', "
                + "tbl_kecamatan.nama_kecamatan AS 'Nama Kecamatan' "
                + "FROM tbl_kecamatan INNER JOIN tbl_kota_kab "
                + "ON tbl_kecamatan.id_kota_kab=tbl_kota_kab.id_kota_kab "
                + "ORDER BY tbl_kecamatan.nama_kecamatan";
        
        fungsi.bindingTable(sql, tableKecamatan);   
        
        String sqlCombo ="SELECT nama_kota_kab FROM tbl_kota_kab";
        
        fungsi.bindingCombo(sqlCombo, comboNamaKotaKab, "nama_kota_kab");         
    }

    private void cari() {
        fungsi = new Functions();
            
        String sql = "SELECT id_kota_kab AS 'ID', "
                + "kota_or_kab AS 'Kota / Kab',"
                + "nama_kota_kab AS 'Nama Kota / Kabupaten' "
                + "FROM tbl_kota_kab "
                + "WHERE nama_kota_kab "
                + "LIKE '%"+textCari.getText()+"%'";
        
        fungsi.bindingTable(sql, tableKotaKab);         
    }
    
    private void setTextStatus(boolean status){
        textNamaKotaKab.setEnabled(status);
    }

    private void simpan() {
        if("Baru".equals(buttonSimpan.getText())){
            setTextStatus(true);
            buttonSimpan.setText("Simpan");
            buttonBatal.setVisible(true);
            comboKotaKab.setEnabled(true);
            
        }else
        if("Simpan".equals(buttonSimpan.getText())){
            
            Date wktInput = new Date();
            Timestamp ts = new Timestamp(wktInput.getTime());
            
            String sql = "INSERT INTO `tbl_kota_kab`(`kota_or_kab`, `nama_kota_kab`) "
                    + "VALUES ('"+comboKotaKab.getSelectedItem()+"','"+textNamaKotaKab.getText()+"')";
            
            if(fungsi.runSQL(sql)){
                fungsi.msgBox("Berhasil Menambah Data Lokasi", "SUKSES", 1);
                buttonSimpan.setText("Baru");
                clear();
                setTextStatus(false);
                buttonBatal.setVisible(false);
                comboKotaKab.setEnabled(false);
            load();
            } else{
                fungsi.msgBox("Gagal Menambah Data Lokasi", "GAGAL", 0);
            }
        }
    }

    private void clear() {
        textCari.setText("");
        textNamaKotaKab.setText("");
        labelId.setText("");
    }

    private void klikTable() {
        
        buttonEdit.setVisible(true);
        buttonHapus.setVisible(true);
        buttonBatal.setVisible(true);
        buttonSimpan.setVisible(false);
        comboKotaKab.setEnabled(true);
        setTextStatus(true);
        
       int i=this.tableKotaKab.getSelectedRow();
        if(i==-1)
        {
            return;
        }
       
       labelId.setText(String.valueOf(tableKotaKab.getModel().getValueAt(i,0)));
       comboKotaKab.setSelectedItem(String.valueOf(tableKotaKab.getModel().getValueAt(i,1)));
       textNamaKotaKab.setText((String)tableKotaKab.getModel().getValueAt(i,2));
    }

    private void batal() {
            clear();
            buttonEdit.setVisible(false);
            buttonHapus.setVisible(false);
            buttonSimpan.setText("Baru");
            buttonSimpan.setVisible(true);
            setTextStatus(false);     
            buttonBatal.setVisible(false);
            comboKotaKab.setEnabled(false);
    }

    private void edit() {
        
            Date wktInput = new Date();
            Timestamp ts = new Timestamp(wktInput.getTime());
            
        String sql = "UPDATE `tbl_kota_kab` "
                + "SET `kota_or_kab`='"+comboKotaKab.getSelectedItem()+"',"
                + "`nama_kota_kab`='"+textNamaKotaKab.getText()+"' "
                + "WHERE `id_kota_kab`='"+labelId.getText()+"'";
        
            if(fungsi.runSQL(sql)){
                fungsi.msgBox("Berhasil Mengubah Data Lokasi", "SUKSES", 1);
                buttonSimpan.setVisible(true);
                buttonSimpan.setText("Baru");
                buttonEdit.setVisible(false);
                buttonHapus.setVisible(false);
                clear();
                setTextStatus(false);
                comboKotaKab.setEnabled(false);
                buttonBatal.setVisible(false);
            load();
            } else{
                fungsi.msgBox("Gagal Mengubah Data Lokasi", "GAGAL", 0);
            }        
    }

    private void hapus() {
        int app;
        if((app = JOptionPane.showConfirmDialog(null,"Hapus Data Pasien ?","Perhatian",JOptionPane.YES_NO_OPTION))==0){
             String sql = "DELETE FROM `tbl_kota_kab` WHERE id_kota_kab='"+labelId.getText()+"'";
             
            if(fungsi.runSQL(sql)){
                fungsi.msgBox("Berhasil Manghapus Data Lokasi", "SUKSES", 1);
                buttonSimpan.setVisible(true);
                buttonSimpan.setText("Baru");
                buttonEdit.setVisible(false);
                buttonHapus.setVisible(false);
                clear();
                setTextStatus(false);
                buttonBatal.setVisible(false);
                comboKotaKab.setEnabled(false);
            load();
            } else{
                fungsi.msgBox("Gagal Manghapus Data Lokasi", "GAGAL", 0);
            }               
        }           
    }

}
