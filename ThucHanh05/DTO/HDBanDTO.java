/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author Doan Minh
 */
public class HDBanDTO {
    private String MaHDB;
    private String MaNhanVien;
    private String NgayBan;
    private String MaKhach;
    private int TongTien;

    /**
     * @return the MaHDB
     */
    public HDBanDTO(String MaHDB,String MaNhanVien,String NgayBan,String MaKhach,int TongTien)
    {
        this.MaHDB=MaHDB;
        this.MaKhach=MaKhach;
        this.MaNhanVien=MaNhanVien;
        this.NgayBan=NgayBan;
        this.TongTien=TongTien;
    }
    public String getMaHDB() {
        return MaHDB;
    }

    /**
     * @param MaHDB the MaHDB to set
     */
    public void setMaHDB(String MaHDB) {
        this.MaHDB = MaHDB;
    }

    /**
     * @return the MaNhanVien
     */
    public String getMaNhanVien() {
        return MaNhanVien;
    }

    /**
     * @param MaNhanVien the MaNhanVien to set
     */
    public void setMaNhanVien(String MaNhanVien) {
        this.MaNhanVien = MaNhanVien;
    }

    /**
     * @return the NgayBan
     */
    public String getNgayBan() {
        return NgayBan;
    }

    /**
     * @param NgayBan the NgayBan to set
     */
    public void setNgayBan(String NgayBan) {
        this.NgayBan = NgayBan;
    }

    /**
     * @return the MaKhach
     */
    public String getMaKhach() {
        return MaKhach;
    }

    /**
     * @param MaKhach the MaKhach to set
     */
    public void setMaKhach(String MaKhach) {
        this.MaKhach = MaKhach;
    }

    /**
     * @return the TongTien
     */
    public int getTongTien() {
        return TongTien;
    }

    /**
     * @param TongTien the TongTien to set
     */
    public void setTongTien(int TongTien) {
        this.TongTien = TongTien;
    }
}
