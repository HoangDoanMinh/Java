/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author DOANMINH
 */
public class DBConectionDAL {
    java.sql.Connection conn;   
    static Connection connn = null;
    public static Connection KetNoi() {
        String conStrSQL = "jdbc:sqlserver://DOANMINH-PC\\DOANMINH;databasename=QLBanHang;user=sa;password=123123qqq";
        try {
            java.sql.Connection con = DriverManager.getConnection(conStrSQL);
            if(con!=null)
                return connn;
        } catch (SQLException ex) {
            return null;
        }
     return null;
    }
    
}
