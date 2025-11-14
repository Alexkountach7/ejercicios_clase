package org.example;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class new_rulee {
    static void main() {
        Scanner sc = new Scanner(System.in);
        Random aleatorio = new Random();
        String par_impar_apuesta;
        final String colores [] = {"rojo", "negro"};
        Integer numeros[] = new Integer[37];
        for (int i =0; i< numeros.length; i++){
            numeros[i]=i;
        }
        final String par_impar[] = {"par","impar"};

        System.out.println("introduce tu nuemro (0-36)....");
        int numero_apuesta = sc.nextInt();

        if (!Arrays.asList(numeros).contains(numero_apuesta)){
            System.out.println("error el numero no es valido");
            return;
        }
        if (numero_apuesta !=0){
            System.out.println("introduce color");
            String color_apuesta = sc.next();
            if (!Arrays.asList(colores).contains(color_apuesta.toLowerCase())){
                System.out.println("el color debe ser rojo o negro");
                return;
            }
            System.out.println("introduce par o impar");
             par_impar_apuesta = sc.next();
            if (!Arrays.asList(par_impar).contains(par_impar_apuesta.toLowerCase())){
                System.out.println("error debe ser par impar");
                return;
            }

        }
        String color_sorteo = colores[aleatorio.nextInt(2)];
        int numero_sorteo = aleatorio.nextInt(37);

        if (numero_sorteo%2==0){
            par_impar_apuesta ="par";
        }else {
            par_impar_apuesta = "impar";
        }
        System.out.println("ha salido "+numero_sorteo+ " " +par_impar);
        //if (numero_apuesta == numero_sorteo && color_sorteo.equals(color)){
            System.out.println("has ganado");
        //} else if (numero_apuesta == numero_sorteo) {

        }
    }
//}
