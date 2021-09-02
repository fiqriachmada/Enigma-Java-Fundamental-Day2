package com.enigma;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Challnges2 {
    static String isPrime(int n) {
        // Corner case
        if (n <= 1) {
            return "bukan bilangan prima";
        }
        // Check from 2 to n-1
        for (int i = 2; i < n; i++)
            if (n % i == 0) {
                return "bilangan prima";
            }
        return "bukan bilangan prima";
    }

    public static void main(String args[]) {
        System.out.println(isPrime(3));
        System.out.println(isPrime(6));
        Integer[] number = {2, 4, 7, 5, 9};
        int min = Collections.min(Arrays.asList(number));

        int max = Collections.max(Arrays.asList(number));

        // printing minimum and maximum numbers
        System.out.println("Min : " + min);
        System.out.println("Max : " + max);
    }
}
