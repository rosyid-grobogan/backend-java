package com.sekolahbackend;

import java.util.ArrayList;
import java.util.List;

public class Function {
    private int nomer1;
    private int nomer2;

    public Function() {}

    public void setNomor1(int nomer1){
        this.nomer1 = nomer1;
    }

    public void setNomer2(int nomer2){
        this.nomer2 = nomer2;
    }

    public int getNomer1(){
        return nomer1;
    }
    public int getNomer2(){
        return nomer2;
    }

    public int perkalian(int nomer1, int nomer2){
        return nomer1 * nomer2;
    }

    public int pembagian(int nomer1, int nomer2){
        //resolve : value / 0
        if (this.nomer2 != 0) {
            return nomer1 / nomer2;
        }else {
            return 0;
        }

    }

    public int penambahan(int nomer1, int nomer2){
        return nomer1 + nomer2;
    }

    public int pengurangan(int nomer1, int nomer2){
        return nomer1 - nomer2;
    }

    public int checkNumber(int inputNumber) {
        if (inputNumber > 0 ) {
            return inputNumber;
        } else {
            System.out.println("Tidak boleh nilai 0");
            return 0;
        }
    }

    //
    public void getPesonData(Person person) {

        //cek instansiasi
        if (person != null) {
            if (person.getNama() != null) {
                System.out.println(person.getNama());
            }else {
                System.out.println("Nama kosong");
            }

            if (person.getAlamat() != null){
                System.out.println(person.getAlamat());
            }
            else {
                System.out.println("Alamat Kosong" );
            }
        }else {
            System.out.println("Data person tidak ada");
        }
    }

    //
    public void addDataBuku() {
        List<Buku> data = new ArrayList<>();
        Buku buku1 = new Buku("Matematika", "Andi", "Erlangga", "");
        data.add( buku1 );


    }

}
