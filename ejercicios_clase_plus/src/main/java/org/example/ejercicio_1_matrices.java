package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ejercicio_1_matrices {
    static void main() {
        Scanner sc = new Scanner(System.in);
        Random aleatorio = new Random();
        int tamaño = aleatorio.nextInt(8) + 2;

        int matriz[][] = new int[tamaño][tamaño];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                matriz[i][j] = aleatorio.nextInt(50);

            }
        }
        for (int fila[] : matriz) {
            System.out.println(Arrays.toString(fila));
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == j) {
                    System.out.print(matriz[i][j] + "  ");

                }
            }
        }
    }
}
