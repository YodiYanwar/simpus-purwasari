/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.youri.control;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author YODI YANWAR
 */
public class DBConnection {
    //public static String PathReport=System.getProperty("user.dir") + "/src/Laporan/";
    private static Connection koneksi;
    
    public static Connection getKoneksi(String host, String user, String pwd, String db){
        if(koneksi == null){
            try{
                String url = "jdbc:mysql://"+ host +":3306/"+db;
                
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                koneksi = DriverManager.getConnection(url,user,pwd);
                
            } catch(SQLException sqle){
                System.out.println("Error Membuat Koneksi/nMessage : "+sqle.getMessage());
                sqle.printStackTrace();
            }    
        }
        return koneksi;
    }
}
