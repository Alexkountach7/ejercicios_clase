package org.example;

import java.util.Arrays;

public class ejercicio_2 {
    static void main() {

        int vecto [] = {6,5,2,4,3};
        int aux =0;
        for (int i = 0; i< vecto.length/2; i++){
            aux = vecto[i];
            vecto[i] = vecto[vecto.length-1-i];
            vecto[vecto.length-1-i]=aux;

        }
        System.out.println(Arrays.toString(vecto));
    }
}
