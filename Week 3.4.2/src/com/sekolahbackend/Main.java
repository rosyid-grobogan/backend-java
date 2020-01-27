package com.sekolahbackend;

public class Main {
    private static int nomer1;

    public static void main(String[] args) {
        int nomer1 = 14;

        Function function = new Function();
        function.setNomor1(0);
        function.setNomer2(5);

        int perkalian = function.perkalian( function.getNomer1(), function.getNomer2() );
        int pembagian = function.pembagian( function.getNomer1(), function.getNomer2() );
        int penambahan = function.penambahan( function.getNomer1(), function.getNomer2() );
        int pengurangan = function.pengurangan( function.getNomer1(), function.getNomer2() );

        System.out.println( perkalian );
        System.out.println( pembagian );
        System.out.println( penambahan );
        System.out.println( pengurangan );


        System.out.println( Main.nomer1 = 13 );
        System.out.println( nomer1 );

        System.out.println("Cek Angka: "+ function.checkNumber(0));

        Person person = new Person();
        function.getPesonData(person);
    }
}
