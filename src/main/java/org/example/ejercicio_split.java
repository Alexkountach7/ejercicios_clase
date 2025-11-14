package org.example;

import java.util.Arrays;

public class ejercicio_split {
    static void main() {
        String cadena = "madrid,barça,valencia,elche";

        String equipos[] = cadena.split(",");

        System.out.println(Arrays.toString(equipos));
    }
}
