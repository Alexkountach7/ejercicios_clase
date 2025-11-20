package org.example;

import java.util.Scanner;

public class busqueda_matriz {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int matriz [][] = new int[3][3];
        System.out.println("introduce los numeros de la matriz");
        for (int i =0; i< matriz.length; i++){
            for (int j=0; j< matriz.length; j++){

                matriz[i][j] = sc.nextInt();
            }

        }
        System.out.println("mi matriz es: ");
        for (int i=0; i< matriz.length; i++){
            for (int j =0; j< matriz[i].length; j++){
                System.out.print(matriz[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println("introduce una numero");
        int numero = sc.nextInt();
        matriz:
        for (int i =0; i< matriz.length; i++){
            for (int j =0; j< matriz[i].length; j++){
                if (matriz[i][j] == numero){
                    System.out.println("numero encontrado");
                System.out.println("la posicion es linea= " +i +" y la columna = " +j);
                break matriz;
                }

            }
        }
    }
}
