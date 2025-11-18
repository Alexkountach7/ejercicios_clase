package org.example;

import java.util.Arrays;

public class matriz_ejemplo {
    static void main() {
        int matriz [] [] = {{1,2,3},{2,4,6}, {9,6,7}};
        int matriz2 [] [] = new int [3][3];
        System.out.println(matriz[1][2]);
        System.out.println(matriz2 [2][0]);

        for (int i =0; i<matriz.length; i++){
            for (int j=0; j<matriz[i].length; j++){

                System.out.print(matriz[i][j]+ " ");
            }

            System.out.println();
        }

        int vector [] = {1,2,3,4};

        for (int num : vector) {
            System.out.print(num+ " ");
        }
        for (int fila [] :matriz) {
            System.out.println(Arrays.toString(fila));

        }

        for (int fila [] : matriz){
            for (int nums : fila) {
                System.out.print(nums+ "  ");
            }
            System.out.println();
        }
    }
}
