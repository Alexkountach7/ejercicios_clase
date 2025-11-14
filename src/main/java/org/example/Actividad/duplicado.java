package org.example.Actividad;

import java.util.Arrays;

public class duplicado {
    public static void main(String[] args) {
        int[] original = {1, 2, 2, 3, 4, 4, 4, 5, 5, 6};

        int[] auxiliar = new int[original.length];
        int j = 0;

        auxiliar[j] = original[0];
        j++;


        for (int i = 1; i < original.length; i++) {
            if (original[i] != original[i - 1]) {
                auxiliar[j] = original[i];
                j++;
            }
        }


        int[] limpio = new int[j];
        for (int i = 0; i < j; i++) {
            limpio[i] = auxiliar[i];
        }


        System.out.println("Original: " + Arrays.toString(original));
        System.out.println("Sin duplicados: " + Arrays.toString(limpio));
    }
}
