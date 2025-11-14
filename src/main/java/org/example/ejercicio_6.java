package org.example;

import java.util.Scanner;

public class ejercicio_6 {
    static void main() {

        Scanner sc = new Scanner(System.in);
        int vector[] = {1, 2, 3, 2, 1};
        boolean es_o_no = true;

        for (int i = 0; i < vector.length; i++){
            if (vector[i] != vector[vector.length-1-i]){
                System.out.println("no es");
                es_o_no = false;
                break;

            }

        }
        System.out.println("es polindromo");

    }
}