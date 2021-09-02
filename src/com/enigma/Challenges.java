package com.enigma;

public class Challenges {
    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 4, 5, 6};
        Integer[] anotherNumbers = {4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < anotherNumbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[j] == anotherNumbers[i]) {
                    System.out.println(numbers[j] = anotherNumbers[i]);
                } else {
                    System.out.print("");
                }
            }
        }
    }
}
