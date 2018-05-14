/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import java.awt.List;
import java.sql.Statement;
import java.util.ArrayList;
import DAL.DBConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.spi.DirStateFactory;
import DTO.*;

/**
 *
 * @author Doan Minh
 */
public class ChatLieuDAL {
    public static ArrayList<ChatLieuDTO> getAll()
    {
       Connection conn = DBConnection.KetNoi();
       if(conn != null)
       {
           try {
               Statement stm =conn.createStatement();
               String sql = "select * from Hang";
               ResultSet rs = stm.executeQuery(sql);
               ArrayList<ChatLieuDTO> hang = new ArrayList<>();
               while(true)
               {
                   if(!rs.next())
                       break;
                   String MaChatLieu = rs.getString("MaChatLieu");
                   String TenChatLieu = rs.getString("TenChatLieu");
                   DTO.ChatLieuDTO ChatLieu2 = new DTO.ChatLieuDTO(MaChatLieu,TenChatLieu);
                   hang.add(ChatLieu2);
               }
               return hang;
           } catch (SQLException ex) {
               Logger.getLogger(ChatLieuDAL.class.getName()).log(Level.SEVERE, null, ex);
               return null;
           }
       }
       return null;
    }
    public static void main(String[] args) {
        
    }
    
    
}
