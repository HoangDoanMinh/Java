/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.ChatLieuDAL;
import DAL.NhanVienDAL;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import DTO.*;
import java.util.Vector;

/**
 *
 * @author DOANMINH
 */
public class XuLy {
    public static ArrayList<ChatLieuDTO> ChatLieuArray(){
        return ChatLieuDAL.getALL();
    }
    
    public static DefaultTableModel ChatLieuModel(){
        DefaultTableModel model = new DefaultTableModel();
        try{
            for(int i = 0; i < ChatLieuArray().size(); i++){
                Vector<String> h = new Vector();
                h.add(ChatLieuArray().get(i).getMaChatLieu());
                h.add(ChatLieuArray().get(i).getTenChatLieu());
                model.addRow(h);
            }
            return model;
        }catch (Exception ex){
            System.out.println("Lỗi" + ex);
        }
           return null;
    }
    
    public static int InsertChatLieu(String MaChatLieu,String TenChatLieu){
        try{
            return ChatLieuDAL.Insert(MaChatLieu, TenChatLieu);
        } catch (Exception e){
            System.out.println("Lỗi" + e);
            return 0;
        }
    }
    
    public static int UpdateChatLieu(String MaChatLieu, String TenChatLieu){
        try{
            return ChatLieuDAL.Update(MaChatLieu, TenChatLieu);
        } catch (Exception e) {
            System.out.println("Lỗi" + e);
            return 0;
        }
    }
    
//    public static int DeleteChatLieu(int selectedRow){
//        if(selectedRow > -1){
//            ChatLieuModel().removeRow(selectedRow);
//            ChatLieuArray().remove(selectedRow);
//        }
//    }
    public static int DeleteChatLieu(String MaChatLieu){
        try {
            return ChatLieuDAL.Delete(MaChatLieu);
        } catch (Exception e) {
            System.out.println("Lỗi:" + e);
            return 0;
        }
    }
    
    public static ArrayList<NhanVienDTO> NhanVienArray(){
        return NhanVienDAL.getAll();
    }
    
    public static DefaultTableModel NhanVienModel(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Mã Nhân Viên");
        model.addColumn("Tên Nhân Viên");
        model.addColumn("Giới tính");
        model.addColumn("Địa chỉ");
        model.addColumn("Điện thoại");
        model.addColumn("Ngày sinh");
        try{
            for(int i = 0; i < NhanVienArray().size(); i++){
                Vector<String> h = new Vector();
                h.add(NhanVienArray().get(i).getMaNhanVien());
                h.add(NhanVienArray().get(i).getTenNhanVien());
                h.add(NhanVienArray().get(i).getGioiTinh());
                h.add(NhanVienArray().get(i).getDiaChi());
                h.add(NhanVienArray().get(i).getDienTHoai());
                h.add(NhanVienArray().get(i).getNgaySinh());
                model.addRow(h);
            }
            return model;
        }catch (Exception ex){
            System.out.println("Lỗi" + ex);
            return null;
        }
    }
    
    public static int InsertNhanVien(String MaNhanVien, String TenNhanVien, String GioiTinh, String DiaChi, String DienThoai,String NgaySinh){
        return NhanVienDAL.Insert(MaNhanVien, TenNhanVien, GioiTinh, DiaChi, DienThoai, NgaySinh);
    }
    
    public static int UpdateNhanVien(String MaNhanVien, String TenNhanVien, String GioiTinh, String DiaChi, String DienThoai,String NgaySinh){
        return NhanVienDAL.Update(MaNhanVien, TenNhanVien, GioiTinh, DiaChi, DienThoai, NgaySinh);
    }
    
    public static int DeleteNhanVien(String MaNhanVien){
        return NhanVienDAL.Delete(MaNhanVien);
    }
}
