package com.enigma;

import java.util.Scanner;

public class ExampleArrayLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Array Loop");
        /**
         * Dapat menggunakan for dan/atau for each
         * for untuk mengetahui index dan elemennya
         * forEach bisa cetak langsung index atau elemennya
         * */

        String[] members = new String[5];

        members[0] = "Achmada";
        members[1] = "Fiqri";
        members[2] = "Amin";
        members[3] = "Rasyad";
        members[4] = "Frinda";

        System.out.println("\nforEach");
        int index = 0;
        for (String item : members) {
            System.out.println("Member ke-" + index + " = " + item);
            index++;
        }

        System.out.println("\nfor");
        for (int i = 0; i < members.length; i++) {
            System.out.println("Member ke-" + i + " = " + members[i]);
        }

        /*
         * Buat variabel Array dengan nama languagePrograming yang dapat menyimpan 5 data
         * Data berasal dari inputan
         * */

        System.out.println("Tasks");

        int indeks = 0;
        System.out.print("Masukkan Index = ");
        indeks = scanner.nextInt();
        String[] languagePrograming = new String[indeks];
        for (int i = 0; i < indeks; i++) {
            System.out.print("Nama Bahasa Pemrograman ke " + i + " = ");
            languagePrograming[i] = scanner.next();
//            System.out.println("Member ke-" + i + " = " + members[i]);
        }
        System.out.println("");
        int items = 0;
        for (String item : languagePrograming) {
            System.out.println("Nama Bahasa Pemrograman ke-" + items + " = " + item);
            items++;
        }
        System.out.println("\nPanjang Array-nya = " + languagePrograming.length);
        System.out.println(languagePrograming[1]);
    }
}
