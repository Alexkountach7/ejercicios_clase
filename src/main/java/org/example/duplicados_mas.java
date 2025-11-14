package org.example;

import java.util.Arrays;
import java.util.Random;

public class duplicados_mas {
    static void main() {
        int numeros[] = {1, 2, 2, 3, 4, 10, 14, 14, 20};
        Random aleatorio = new Random(20);
        boolean comprobar = true;
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = aleatorio.nextInt(10) + 1;

        }
        System.out.println(Arrays.toString(numeros));

        Arrays.sort(numeros);
        System.out.println(Arrays.toString(numeros));
        while (comprobar) {
            comprobar=false;
            for (int i = 0; i < numeros.length; i++) {
                if (i != numeros.length - 1 && numeros[i] == numeros[i + 1]) {

                    System.out.println("duplicado:" + numeros[i]);
                    System.out.println(Arrays.toString(numeros));
                    numeros[i] = aleatorio.nextInt(50) + 1;
                    Arrays.sort(numeros);
                    comprobar = true;

                }
            }
        }
        
    }
}
