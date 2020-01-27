package com.sekolahbackend;

public class Buku {

    private String judbuku;
    private String namaPenulis;
    private String penerbit;
    private Date tanggalTerbit;
    private int jumlahPenulis;

    public String getJudbuku() {
        return judbuku;
    }

    public void setJudbuku(String judbuku) {
        this.judbuku = judbuku;
    }

    public String getNamaPenulis() {
        return namaPenulis;
    }

    public void setNamaPenulis(String namaPenulis) {
        this.namaPenulis = namaPenulis;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }

    public Date getTanggalTerbit() {
        return tanggalTerbit;
    }

    public void setTanggalTerbit(Date tanggalTerbit) {
        this.tanggalTerbit = tanggalTerbit;
    }

    public int getJumlahPenulis() {
        return jumlahPenulis;
    }

    public void setJumlahPenulis(int jumlahPenulis) {
        this.jumlahPenulis = jumlahPenulis;
    }

    public Buku(){}
}
