package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class letras_navidad {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce una palabra");
        String palabra = sc.next();

        System.out.println("cantidad de letras");
        String letras = sc.next();
        String palabra_vector[] = palabra.split("");
        String letras_vector[] = letras.split("-");

        System.out.println(Arrays.toString(palabra_vector));
        System.out.println(Arrays.toString(letras_vector));

        if (palabra_vector.length == letras_vector.length){

            for (int i=0; i<letras_vector.length; i++){
                for (int j=0; j<Integer.parseInt(letras_vector[i]); j++){
                    System.out.print(palabra_vector[i]);

                }
            }

        }else {
            System.out.println("datos incorrecto, no hay un numero para cada letra");
        }
    }
}
