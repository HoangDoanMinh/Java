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
public class NhanVienDTO {
    private String MaNhanVien;
    private String TenNhanVien;
    private String GioiTinh;
    private String DiaChi;
    private String NgaySinh;
    private String DienTHoai;

    /**
     * @return the MaNhanVien
     */
    public NhanVienDTO (String MaNhanVien,String TenNhanVien,String GioiTinh,String DiaChi,String NgaySinh,String DienTHoai)
    {
        this.MaNhanVien=MaNhanVien;
        this.DienTHoai=DienTHoai;
        this.GioiTinh=GioiTinh;
        this.TenNhanVien=TenNhanVien;
        this.NgaySinh=NgaySinh;
        this.DiaChi=DiaChi;
    }
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
     * @return the TenNhanVien
     */
    public String getTenNhanVien() {
        return TenNhanVien;
    }

    /**
     * @param TenNhanVien the TenNhanVien to set
     */
    public void setTenNhanVien(String TenNhanVien) {
        this.TenNhanVien = TenNhanVien;
    }

    /**
     * @return the GioiTinh
     */
    public String getGioiTinh() {
        return GioiTinh;
    }

    /**
     * @param GioiTinh the GioiTinh to set
     */
    public void setGioiTinh(String GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    /**
     * @return the DiaChi
     */
    public String getDiaChi() {
        return DiaChi;
    }

    /**
     * @param DiaChi the DiaChi to set
     */
    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    /**
     * @return the NgaySinh
     */
    public String getNgaySinh() {
        return NgaySinh;
    }

    /**
     * @param NgaySinh the NgaySinh to set
     */
    public void setNgaySinh(String NgaySinh) {
        this.NgaySinh = NgaySinh;
    }

    /**
     * @return the DienTHoai
     */
    public String getDienTHoai() {
        return DienTHoai;
    }

    /**
     * @param DienTHoai the DienTHoai to set
     */
    public void setDienTHoai(String DienTHoai) {
        this.DienTHoai = DienTHoai;
    }
}
