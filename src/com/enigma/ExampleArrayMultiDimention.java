package com.enigma;

public class ExampleArrayMultiDimention {
    public static void main(String[] args) {
        System.out.println("Array Multi Dimention");
//        Customer -> Nama dan Nomer Telepon
        String[][] customers = new String[3][2]; // baris 3 | kolom 2
        customers[0][0] = "Adil";
        customers[0][1] = "0822";
        customers[1][0] = "Anisa";
        customers[1][1] = "0821";

        System.out.println(customers[0][0] + " | " + customers[0][1]);
        System.out.println(customers[1][0] + " | " + customers[1][1]);
    }
}
