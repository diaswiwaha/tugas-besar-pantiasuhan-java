/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package panti_asuhan;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Hp
 */
public class koneksi {
    private static Connection KoneksiDatabase;
    public static Connection koneksiDB() throws SQLException {
        try {
            String DB ="jdbc:mysql://localhost/pantiasuhan";//pantiasuhan ganti jadi nama database masing2
            String user="root";
            String pass="";
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            KoneksiDatabase = (Connection) DriverManager.getConnection(DB,user,pass);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Tidak ada koneksi","Error",
            JOptionPane.INFORMATION_MESSAGE);
            System.err.println(e.getMessage());
            System.exit(0);
        }
         return KoneksiDatabase;
    }
}
