/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import java.awt.Image;

/**
 *
 * @author DOANMINH
 */
public class HangDTO {
    private String MatHang;
    private String TenHang;
    private String MaChatLieu;
    private int SoLuong=0;
    private int DonGiaNhap;
    private int DonGiaBan;
    private String Anh;
    private String GhiChu;

    /**
     * @return the MatHang
     */
    public HangDTO(String MatHang,String TenHang,String MaChatLieu,int SoLuong,int DonGiaNhap,int DonGiaBan,String Anh,String GhiChu)
    {
        this.MatHang=MatHang;
        this.TenHang=TenHang;
        this.MaChatLieu=MaChatLieu;
        this.SoLuong=SoLuong;
        this.DonGiaBan=DonGiaBan;
        this.DonGiaNhap=DonGiaNhap;
        this.Anh=Anh;
        this.GhiChu=GhiChu;
    }
    

    /**
     * @return the GhiChu
     */
    public String getGhiChu() {
        return GhiChu;
    }

    /**
     * @param GhiChu the GhiChu to set
     */
    public void setGhiChu(String GhiChu) {
        this.GhiChu = GhiChu;
    }

    /**
     * @return the MatHang
     */
    public String getMatHang() {
        return MatHang;
    }

    /**
     * @param MatHang the MatHang to set
     */
    public void setMatHang(String MatHang) {
        this.MatHang = MatHang;
    }

    /**
     * @return the TenHang
     */
    public String getTenHang() {
        return TenHang;
    }

    /**
     * @param TenHang the TenHang to set
     */
    public void setTenHang(String TenHang) {
        this.TenHang = TenHang;
    }

    /**
     * @return the MaChatLieu
     */
    public String getMaChatLieu() {
        return MaChatLieu;
    }

    /**
     * @param MaChatLieu the MaChatLieu to set
     */
    public void setMaChatLieu(String MaChatLieu) {
        this.MaChatLieu = MaChatLieu;
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
     * @return the DonGiaNhap
     */
    public int getDonGiaNhap() {
        return DonGiaNhap;
    }

    /**
     * @param DonGiaNhap the DonGiaNhap to set
     */
    public void setDonGiaNhap(int DonGiaNhap) {
        this.DonGiaNhap = DonGiaNhap;
    }

    /**
     * @return the DonGiaBan
     */
    public int getDonGiaBan() {
        return DonGiaBan;
    }

    /**
     * @param DonGiaBan the DonGiaBan to set
     */
    public void setDonGiaBan(int DonGiaBan) {
        this.DonGiaBan = DonGiaBan;
    }

    /**
     * @return the Anh
     */
    public String getAnh() {
        return Anh;
    }

    /**
     * @param Anh the Anh to set
     */
    public void setAnh(String Anh) {
        this.Anh = Anh;
    }
}
