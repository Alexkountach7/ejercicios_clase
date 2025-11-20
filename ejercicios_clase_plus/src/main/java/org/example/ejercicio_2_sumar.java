package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ejercicio_2_sumar {
    static void main() {
        Scanner sc = new Scanner(System.in);
        Random aleatorio = new Random();
        int matriz [][] = new int[aleatorio.nextInt(5)+1][aleatorio.nextInt(5)+1];

        for (int i =0 ; i< matriz.length;i++){
            for (int j =0; j<matriz[i].length; j++){
                matriz [i][j] = aleatorio.nextInt(25)+1;
            }
        }

        for (int fila [] : matriz ){
            System.out.println(Arrays.toString(fila));
        }
        int suma =0;
        for (int i =0; i<matriz[0].length; i++){ // i columnas
            for (int j =0; j< matriz.length; j++){
                suma += matriz[j][i];

            }
            System.out.println("columna: "+i+ " : " +suma);
        }
         suma =0;
        for (int i=0; i< matriz[0].length; i++){
                suma += matriz[0][i];
            System.out.println("fila: "+i+ " : " +suma);
            }

        }

    }

