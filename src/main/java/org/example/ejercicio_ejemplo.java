package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ejercicio_ejemplo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int vector[] = new int[5];
        int vector2[] = new int[5];

        Random aleatorio = new Random();
        int contador = 0;


        //vector = vector2.clone();
        vector2[3] = 5;

        System.out.println("Vector 1: " + Arrays.toString(vector));
        System.out.println("Vector 2: " + Arrays.toString(vector2));

        System.out.println("Longitud del vector: " + vector.length);


        System.out.println("\nVector en orden normal:");
        for (int i = 0; i < vector.length; i++) {
            System.out.println(vector[i]);
        }


        System.out.println("\nVector en orden inverso:");
        for (int i = vector.length - 1; i >= 0; i--) {
            System.out.println(vector[i]);
        }


        int numero[] = new int[8];
        for (int i = 0; i < numero.length; i++) {
            numero[i] = aleatorio.nextInt(501); // número entre 0 y 500
            contador += numero[i];
        }

        System.out.println("Vector aleatorio: " + Arrays.toString(numero));
        System.out.println("Suma total de los elementos: " + contador);


        }

    }
