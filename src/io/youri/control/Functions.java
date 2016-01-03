/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.youri.control;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author YODI YANWAR
 */
public class Functions {
    
    private static Connection koneksi;
    
    public static String host="localhost";
    public static String user="root";
    public static String pwd="";
    public static String db_name="puskesmas_purwasari_db";
    
    public void msgBox(String msg, String title, int type){
        JOptionPane.showMessageDialog(null, msg, title, type);
    }
    
    public UUID generateID(){
        UUID newID = UUID.randomUUID();
        return newID;
    }
    
    public boolean runSQL(String sql){
        Connection koneksi = openDB();
        try{
            PreparedStatement ps = koneksi.prepareStatement(sql);
            ps.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Functions.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    public static Connection openDB(){
        if(koneksi == null){
            koneksi = DBConnection.getKoneksi(host, user, pwd, db_name);
        }
        
        return koneksi;
    }
    
    public void bindingTable(String sql, JTable table){
        try{
            Connection koneksi = openDB();
            
            Statement s = koneksi.createStatement();
            ResultSet rs = s.executeQuery(sql);
            
            table.setModel(DbUtils.resultSetToTableModel(rs));
            
            
        } catch(Exception sqle){
            msgBox("Terjadi Kesalahan", "ERROR", 0);
            System.out.println("Error Messsage : "+sqle.getMessage()+"\n");
            sqle.printStackTrace();
        }
    }
    
    public String getValue(String sql) throws SQLException{
       
      Connection koneksi = openDB();
        Statement s= koneksi.createStatement();
        String value=new String();
        try {
            //  String sql="Select * from tblPeminjaman where kd_pinjam='" + this.TxtKodePeminjaman.getSelectedItem() + "'";
              ResultSet r=s.executeQuery(sql);
              if(r.next())
              {
                  value=r.getString(1);              
              }
        } catch (SQLException ex) {
            Logger.getLogger(Functions.class.getName()).log(Level.SEVERE, null, ex);
            msgBox("Terjadi Kesalahan\nError message :"+ex.getMessage(), "ERROR", 0);
            ex.printStackTrace();
        }
        return value;
    }    

    public  void bindingCombo(String sql,JComboBox obj ,String output)
    {
        try {        
            obj.removeAllItems();
        
            Connection db = openDB();
            Statement s= db.createStatement();           
            ResultSet r=s.executeQuery(sql);
            
            while (r.next()) {
               obj.addItem(r.getString(output));
            }
            r.close();
            s.close();
        }catch(SQLException e) {
            System.out.println(e);
        }
    }
    
    public boolean aksesLogin(String sql) throws SQLException{
        Connection db = openDB();
        Statement s= db.createStatement();
        try {
            //  String sql="Select * from tblPeminjaman where kd_pinjam='" + this.TxtKodePeminjaman.getSelectedItem() + "'";
              ResultSet r=s.executeQuery(sql);
              if(r.next()){
                  return true;
              }else{
                  return false;
              }
        } catch (SQLException ex) {
            Logger.getLogger(Functions.class.getName()).log(Level.SEVERE, null, ex);
            msgBox("Terjadi Kesalahan\nError message :"+ex.getMessage(), "ERROR", 0);
            ex.printStackTrace();            
        }
        return false;       
    }    
}
