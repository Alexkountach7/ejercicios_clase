package org.example;

import java.util.Random;
import java.util.Scanner;

public class ejercicio_2_matrices {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int matriz [][] = new int[3][3];
        int matriz2 [][] = new int [3][3];
        Random aleatorio = new Random();
System.out.println("MATRIZ 1");
        for (int i =0; i<matriz.length; i++){
            for (int j =0; j<matriz[i].length; j++){
                matriz [i][j] = aleatorio.nextInt(50);
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }
System.out.println("MATRIZ 2");
        for (int i=0; i<matriz2.length;i++){
            for (int j =0; j<matriz[i].length; j++){
                matriz2 [i][j] = aleatorio.nextInt(50);
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }
            for (int i =0; i<matriz.length; i++){
                for (int j =0; j<matriz.length; j++){
                   // if ()
                }
            }
    }
}
