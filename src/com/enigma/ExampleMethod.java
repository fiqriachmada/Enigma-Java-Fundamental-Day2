package com.enigma;

import java.util.Scanner;

public class ExampleMethod {
    static void greetings(String fullName, int age) {
        System.out.println("Halo saya " + fullName + ", umur saya adalah " + age);
    }

    static String kenalan(String name, int ages) {
        return "Halo saya " + name + ", umur saya adalah " + ages;
    }

    static int calculatePlus(int numberOne, int numberTwo) {
        int resultPlus = numberOne + numberTwo;
        return resultPlus;
    }

    static int calculateMinus(int numberOne, int numberTwo) {
        int resultMinus = numberOne - numberTwo;
        return resultMinus;
    }

    static int calculateMultiple(int numberOne, int numberTwo) {
        int resultMultiple = numberOne * numberTwo;
        return resultMultiple;
    }

    static int calculateDivide(int numberOne, int numberTwo) {
        int resultDivide = numberOne / numberTwo;
        return resultDivide;
    }

    static int calculateModulo(int numberOne, int numberTwo) {
        int resultModulo = numberOne % numberTwo;
        return resultModulo;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        greetings("Mada", 23);
        String print = kenalan("Frinda", 21);
        System.out.println(print);
        int pilih;
        pilih = scanner.nextInt();
        int result;
        switch (pilih) {
            case 1:
                System.out.println("Hitung Penambahan");
                result = calculatePlus(100, 200);
                System.out.println("Hasilnya adalah " + result);
                break;
            case 2:
                System.out.println("Hitung Pengurangan");
                result = calculateMinus(100, 200);
                System.out.println("Hasilnya adalah " + result);
                break;
            case 3:
                System.out.println("Hitung Perkalian");
                result = calculateMultiple(100, 200);
                System.out.println("Hasilnya adalah " + result);
                break;
            case 4:
                System.out.println("Hitung Pembagian");
                result = calculateDivide(100, 200);
                System.out.println("Hasilnya adalah " + result);
                break;
            case 5:
                System.out.println("Hitung Modulo");
                result = calculateModulo(100, 200);
                System.out.println("Hasilnya adalah " + result);
                break;
        }
    }
}
