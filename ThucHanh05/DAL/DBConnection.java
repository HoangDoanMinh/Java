/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Doan Minh
 */
public class DBConnection {
    static String dbURL = "jdbc:sqlserver://localhost;databaseName=DOANMINH;user=sa;password=123456";
    public static Connection KetNoi() {
        try {
            Connection conn = DriverManager.getConnection(dbURL);
            if(conn != null)
                System.out.print("Connected!!");
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "Loi!");
            
        }
        return null;
        
    }

    
}
