/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import java.util.ArrayList;
import DTO.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author DOANMINH
 */
public class HDBanDAL {
    public static ArrayList<HDBanDTO> getAll(){
        Connection con = DBConectionDAL.KetNoi();
        if(con != null){
            try{
                Statement stmt = con.createStatement();
                String sql = "select * from HDBan";
                ResultSet rs = stmt.executeQuery(sql);
                ArrayList<HDBanDTO> ds = new ArrayList<>();
                while(true){
                    if(!rs.next()) break;
                    String MaHDBan = rs.getString("MaHDBan");
                    String MaNhanVien = rs.getString("MaNhanVien");
                    String NgayBan = rs.getString("NgayBan");
                    String MaKhach = rs.getString("MaKhach");
                    int TongTien = rs.getInt("TongTien");
                    HDBanDTO hoaDon = new HDBanDTO(MaHDBan, MaNhanVien, NgayBan, MaKhach, TongTien);
                    ds.add(hoaDon);
                }
                con.close();
                return ds;
            }catch(SQLException ex){
                return null;
            }
        }
        return null;
    }
    
    public static int Insert(String MaHDBan, String MaNhanVien, String NgayBan,String MaKhach,float TongTien){
        Connection con = DBConectionDAL.KetNoi();
        if(con != null){
            try{
               Statement stmt = con.createStatement();
               String sql = "insert into HDBan(MaHDBan, MaNhanVien, NgayBan, MaKhach,TongTien) values ('"+ MaHDBan +"','"+ MaNhanVien +"','"+ NgayBan +"','"+ MaKhach +"',"+ TongTien +")";
               int rs = stmt.executeUpdate(sql);
               if(rs < 1){
                   con.close();
                   return 0;
               } else {
                   con.close();
                   return 1;
               }
            } catch (SQLException ex){
                return 0;
            }
        }
        return 0;
    }
    
    public static int Update(String MaHDBan, String MaNhanVien, String NgayBan,String MaKhach,float TongTien){
        Connection con = DBConectionDAL.KetNoi();
        if(con != null){
            try{
               Statement stmt = con.createStatement();
               String sql = "update HDBan set NgayBan = '"+ NgayBan +"', MaKhach = '"+ MaKhach +"',TongTien = "+ TongTien +" where MaHDBan = '"+ MaHDBan +"' and MaNhanVien = '"+ MaNhanVien +"'";
               int rs = stmt.executeUpdate(sql);
               if(rs < 1){
                   con.close();
                   return 0;
               } else {
                   con.close();
                   return 1;
               }
            } catch (SQLException ex){
                return 0;
            }
        }
        return 0;
    }
    
    public static int Delete(String MaHDBan){
        Connection con = DBConectionDAL.KetNoi();
        if(con != null){
            try{
                Statement stmt = con.createStatement();
                String sql = "delete from HDBan where MaHDBan = '"+MaHDBan+"'";
                int rs = stmt.executeUpdate(sql);
                if(rs < 1){
                   con.close();
                   return 0;
               } else {
                   con.close();
                   return 1;
               }
            } catch (SQLException ex){
                return 0;
            }
        }
        return 0;
    }
}
