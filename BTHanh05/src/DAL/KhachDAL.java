/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;
import DTO.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author DOANMINH
 */
public class KhachDAL {
    public static ArrayList<KhachDTO> getAll(){
        Connection con = DBConectionDAL.KetNoi();
        if(con != null){
            try{
                Statement stmt = con.createStatement();
                String sql = "select * from Khach";
                ResultSet rs = stmt.executeQuery(sql);
                ArrayList<KhachDTO> ds = new ArrayList<>();
                while(true){
                    if(!rs.next()) break;
                    String MaKhach = rs.getString("MaKhach");
                    String TenKhach = rs.getString("TenKhach") ;
                    String DiaChi = rs.getString("DiaChi");
                    String DienThoai = rs.getString("DienThoai");
                    KhachDTO khach= new KhachDTO(MaKhach, TenKhach, DiaChi, DienThoai);
                    ds.add(khach);
                }
                con.close();
                return ds;
            }catch(SQLException ex){
                return null;
            }
        }
        return null;
    }
    
    public static String TenKhach(String MaKhach){
        Connection con = DBConectionDAL.KetNoi();
        if(con != null){
            try{
                Statement stmt = con.createStatement();
                String sql = "select TenKhach from tblKhach where MaKhach='"+ MaKhach +"'";
                ResultSet rs = stmt.executeQuery(sql);
                String TenNhanVien = null;
                if(rs.next()){
                    return rs.getString("TenKhach");
                } else {
                    return null;
                }
            } catch (SQLException ex){
                System.out.println("lỗi" + ex);
                return null;
            }
        }
        return null;
    }
    
    public static String DiaChi(String MaKhach){
        Connection con = DBConectionDAL.KetNoi();
        if(con != null){
            try{
                Statement stmt = con.createStatement();
                String sql = "select DiaChi from tblKhach where MaKhach='"+ MaKhach +"'";
                ResultSet rs = stmt.executeQuery(sql);
                String TenNhanVien = null;
                if(rs.next()){
                    return rs.getString("DiaChi");
                } else {
                    return null;
                }
            } catch (SQLException ex){
                System.out.println("lỗi" + ex);
                return null;
            }
        }
        return null;
    }
    
    public static String DienThoai(String MaKhach){
        Connection con = DBConectionDAL.KetNoi();
        if(con != null){
            try{
                Statement stmt = con.createStatement();
                String sql = "select DienThoai from tblKhach where MaKhach='"+ MaKhach +"'";
                ResultSet rs = stmt.executeQuery(sql);
                String TenNhanVien = null;
                if(rs.next()){
                    return rs.getString("DienThoai");
                } else {
                    return null;
                }
            } catch (SQLException ex){
                System.out.println("lỗi" + ex);
                return null;
            }
        }
        return null;
    }
    
    public static int Insert(String MaKhach,String TenKhach,String DiaChi,String DienThoai){
        Connection con = DBConectionDAL.KetNoi();
        if(con != null){
            try{
               Statement stmt = con.createStatement();
               String sql = "insert into tblKhach(MaKhach, TenKhach, DiaChi, DienThoai) values ('"+ MaKhach +"',N'"+ TenKhach +"','"+ DiaChi +"','"+ DienThoai +"')";
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
    
    public static int Update(String MaKhach,String TenKhach,String DiaChi,String DienThoai){
        Connection con = DBConectionDAL.KetNoi();
        if(con != null){
            try{
               Statement stmt = con.createStatement();
               String sql = "update tblKhach set TenKhach = '"+ TenKhach +"', DiaChi = '"+ DiaChi +"',DienThoai = '"+ DienThoai +"' where MaKhach = '"+ MaKhach +"'";
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
    
    public static int Delete(String MaKhach){
        Connection con = DBConectionDAL.KetNoi();
        if(con != null){
            try{
                Statement stmt = con.createStatement();
                String sql = "delete from tblKhach where MaKhach = '"+MaKhach+"'";
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
