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
public class ChatLieuDTO {
    private String MaChatLieu;
    private String TenChatLieu;

    /**
     * @return the MaChatLieu
     */
    public ChatLieuDTO(String MaChatLieu,String TenChatLieu)
    {
        this.MaChatLieu=MaChatLieu;
        this.TenChatLieu=TenChatLieu;
    }
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
     * @return the TenChatLieu
     */
    public String getTenChatLieu() {
        return TenChatLieu;
    }

    /**
     * @param TenChatLieu the TenChatLieu to set
     */
    public void setTenChatLieu(String TenChatLieu) {
        this.TenChatLieu = TenChatLieu;
    }
}
