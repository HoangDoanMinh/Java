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
public class CTHDBanDTO {
    private String MaHDBan;
    private String MaHang;
    private int SoLuong = 0;
    private int Gia = 0;
    private int GiamGia = 0;
    private int ThanhTien =0;

    /**
     * @return the MaHDBan
     */
    public CTHDBanDTO(String MaHDBan,String MaHang,int SoLuong,int Gia,int GiamGia,int ThanhTien)
    {
        this.MaHDBan=MaHDBan;
        this.MaHang=MaHang;
        this.SoLuong=SoLuong;
        this.Gia=Gia;
        this.ThanhTien=ThanhTien;
        this.GiamGia=GiamGia;
    }
    public String getMaHDBan() {
        return MaHDBan;
    }

    /**
     * @param MaHDBan the MaHDBan to set
     */
    public void setMaHDBan(String MaHDBan) {
        this.MaHDBan = MaHDBan;
    }

    /**
     * @return the MaHang
     */
    public String getMaHang() {
        return MaHang;
    }

    /**
     * @param MaHang the MaHang to set
     */
    public void setMaHang(String MaHang) {
        this.MaHang = MaHang;
    }

    /**
     * @return the SoLuong
     */
    public int getSoLuong() {
        return SoLuong;
    }

    /**
     * @param SoLuong the SoLuong to set
     */
    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    /**
     * @return the Gia
     */
    public int getGia() {
        return Gia;
    }

    /**
     * @param Gia the Gia to set
     */
    public void setGia(int Gia) {
        this.Gia = Gia;
    }

    /**
     * @return the GiamGia
     */
    public int getGiamGia() {
        return GiamGia;
    }

    /**
     * @param GiamGia the GiamGia to set
     */
    public void setGiamGia(int GiamGia) {
        this.GiamGia = GiamGia;
    }

    /**
     * @return the ThanhTien
     */
    public int getThanhTien() {
        return ThanhTien;
    }

    /**
     * @param ThanhTien the ThanhTien to set
     */
    public void setThanhTien(int ThanhTien) {
        this.ThanhTien = ThanhTien;
    }
}
