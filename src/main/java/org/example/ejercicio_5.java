package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vector[] = {1, 5, 6, 7, 9};
        int numaux = vector[0];


        for (int i = 0; i < vector.length; i++) {
            vector[i] = vector[i +1];
        }


        vector[vector.length-1] = numaux;


        System.out.println( Arrays.toString(vector));
    }
}
