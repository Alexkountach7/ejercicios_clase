package org.example;

import java.util.Scanner;

public class space_invaders {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce filas:");
        int filas = sc.nextInt();
        String matriz[][] = new String[filas][3];
        for (int i =0; i< matriz.length; i++){
            String fila[] = sc.nextInt().split(
            if(fila.length==matriz[i].length){
                for (int j =0; j<matriz[i].length)

            }
        }
    }
}
