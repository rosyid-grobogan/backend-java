package com.sekolahbackend;

public class Person {
    private String nama;
    private int umur;
    private String alamat;
    private String jenisKelamin;
    private String pekerjaan;
    private String email;
    private double gaji;

    class BankAccount {

    }

    public Person(){

    }

    public Person (String nama) {
        this.nama = nama;
    }

    public Person (int umur) {

    }

    public String getNama () {    /* -> getter */
        return this.nama;
    }

    public void setNama (String nama) {   /* setter */
        this.nama = nama;
    }

    public Person(String nama, int umur, String alamat) {
        this.nama = nama;
        this.umur = umur;
        this.alamat = alamat;
    }

    public Person(String nama, int umur, String alamat, String jenisKelamin, String pekerjaan, String email, double gaji) {
        this.nama = nama;
        this.umur = umur;
        this.alamat = alamat;
        this.jenisKelamin = jenisKelamin;
        this.pekerjaan = pekerjaan;
        this.email = email;
        this.gaji = gaji;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public String getPekerjaan() {
        return pekerjaan;
    }

    public void setPekerjaan(String pekerjaan) {
        this.pekerjaan = pekerjaan;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getGaji() {
        return gaji;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }
}



/*

setiap kelas punya constructor kosong

- overloading  -> banyak constructor dengan parameter yang berbeda

parameter -> bisa untuk constructor dan method
 */

/*
   conventional

  - variable  -> camel case  (contoh : getDataCustomer)
  - method  -> camel case
  - class  -> dari awal harus huruf besar (CustomerBalance)
 */

/*
eksplore lebih banyak tentang variable
 */

