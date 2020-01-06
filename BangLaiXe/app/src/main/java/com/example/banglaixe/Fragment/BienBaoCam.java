package com.example.banglaixe.Fragment;

public class BienBaoCam {
    private int id;
    private String noiDung;
    private byte[] image;
    private String loaiBien;

    public BienBaoCam(int id,String noiDung, byte[] image, String loaiBien) {
        this.noiDung = noiDung;
        this.image = image;
        this.loaiBien = loaiBien;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNoiDung() {
        return noiDung;
    }

    public void setNoiDung(String noiDung) {
        this.noiDung = noiDung;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public String getLoaiBien() {
        return loaiBien;
    }

    public void setLoaiBien(String loaiBien) {
        this.loaiBien = loaiBien;
    }
}
