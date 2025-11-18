package org.example;

import java.util.Scanner;

public class ejercicio_4 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce el rango");
        int rango = sc.nextInt();

        primo:
        for (int i =2; i<=rango; i++) {

            for (int j = 2; j <= 1; j++) {
                if (i % j == 0){
                    continue primo;
                }
            }
        }
        //System.out.println(i);
    }
}
