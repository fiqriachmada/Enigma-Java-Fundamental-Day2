package com.enigma;

import java.util.Scanner;

public class ExampleArrayLoopMultiDimention {
    public static void main(String[] args) {
        /*
         * Manampung data customer berisi nama dan nomer telepon
         * Nama dan nomer telepon diisi melalui inputan
         * Jumlah data yg bisa ditampung customers[3][2]
         * */
        Scanner scanner = new Scanner(System.in);
        String[][] customer = new String[3][2];

        for (int i = 0; i < customer.length; i++) {
            for (int j = 0; j < customer[i].length; j++) {
                customer[i][j] = scanner.nextLine();
            }
        }
        for (int i = 0; i < customer.length; i++) {
            for (int j = 0; j < customer[i].length; j++) {
                System.out.print(customer[i][j]);
            }
            System.out.println(" ");
        }
    }
}
