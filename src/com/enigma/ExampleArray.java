package com.enigma;

import java.util.Scanner;

public class ExampleArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("String");
        String member1 = "Jack";
        String member2 = "Lina";
        String member3 = "Sparrow";

        System.out.println(member1 + ", " + member2 + ", " + member3 + "\n");

        System.out.println("Array");
//        Cara pertama
        String[] members = new String[3]; // 0 | 1 | 2

        members[0] = "Jack";
        members[1] = "Lina";
        members[2] = "Sparrow";


        System.out.println(members[0] + ", " + members[1] + ", " + members[2] + "\n");

        System.out.println("Mengisi Ulang members");

        members[0] = "Mada";
        members[1] = "Mas Jution";
        members[2] = "Mba Tika";
//        members[1] = scanner.nextLine();
        System.out.println(members[0] + ", " + members[1] + ", " + members[2] + "\n");

//        members[3] = "Tono"; // Array index out of range
//        System.out.println(members[3]+"\n");

//        Cara kedua
        String[] country = {"Indonesia", "Italia", "Jerman", "Brunei Darusalam", "Mexico"};
        System.out.println(country[0] + ", " + country[1] + ", " + country[2] + ", " + country[3] + ", " + country[4] + "\n" + "Panjang Array = " + country.length);
    }
}
