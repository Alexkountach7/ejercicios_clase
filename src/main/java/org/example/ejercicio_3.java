package org.example;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ejercicio_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador =0;
        int [] numero = new int[25];
        Random aleatorio = new Random();

        for (int i=0; i< numero.length; i++){
            numero[i] = aleatorio.nextInt(101);

        }
        System.out.println(Arrays.toString(numero));
        System.out.print("numero a buscar...");
        int numero_buscar = sc.nextInt();

        for (int i=0; i< numero.length; i++){
            if (numero_buscar == numero[i]){
                contador++;
            }
        }
        System.out.println("el numero "+numero_buscar+" aparece " +contador+" veces el vector");
    }
}