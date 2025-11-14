package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio_4 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int vector[] = {3,5,6,7,1,6};
        int nuevo [] = new int[vector.length-1];

        int posicion_borrador = 2;

        for (int i =0; i<nuevo.length;i++){
            nuevo[i] = vector[i+1];

            if (i<=posicion_borrador){
                nuevo[i]=vector[i+1];
            }else {
                nuevo[i] = vector[i];
            }
        }
        System.out.println(Arrays.toString(nuevo));
    }
}
