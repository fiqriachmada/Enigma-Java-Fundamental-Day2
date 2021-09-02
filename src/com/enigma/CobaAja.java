package com.enigma;

import java.util.Scanner;

public class CobaAja {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word;
        System.out.print("Masukkan Huruf atau Kata = ");
        word = scanner.nextLine();
        char[] warray = word.toCharArray();
        System.out.println(isPalindrom(warray));
    }

    public static boolean isPalindrom(char[] word) {
        int i1 = 0;
        int i2 = word.length - 1;
        while (i2 > i1) {
            if (word[i1] != word[i2]) {
                return false;
            }
            ++i1;
            --i2;
        }
        return true;
    }
}
