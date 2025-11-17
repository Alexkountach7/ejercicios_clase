package org.example;

import java.util.Scanner;

public class ejercicio_2 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("intorduce la altura");
        int altura = sc.nextInt();

        for (int i =0; i<altura; i++){

            for (int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
