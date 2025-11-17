package org.example;

import java.util.Scanner;

public class ejercicio_3 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println(" introduce el numero maximo");
        int maximo = sc.nextInt();
        tabla:
        for (int i =1; i<=9; i++){
            System.out.println("tabla del "+i);

            for (int j=1; j<=10; j++){
                System.out.println(i +"x"+j+"="+(i*j));
                if (i*j>maximo){
                    break tabla;
                }
            }
        }
    }
}
