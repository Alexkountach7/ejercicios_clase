package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio3_tabla_alumnos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("¿Cuántos estudiantes tienes?");
        int estudiantes = sc.nextInt();

        System.out.println("¿Cuántas asignaturas tienes?");
        int asignaturas = sc.nextInt();

        String notas[][] = new String[estudiantes + 1][asignaturas + 1];

        // Primera columna donde introduzco nombres de estudiantes
        notas[0][0] = "Estudiantes";

        for (int i = 1; i < notas.length; i++) {
            System.out.println("Introduce el alumno " + i + ":");
            notas[i][0] = sc.next();
        }

             // Primera fila donde meto nombres de asignaturas
        for (int j = 1; j < notas[0].length; j++) {
            System.out.println("Introduce la asignatura " + j + ":");
            notas[0][j] = sc.next();
        }

        // Rellenar las notas
        for (int i = 1; i < notas.length; i++) {
            for (int j = 1; j < notas[i].length; j++) {
                System.out.println("Introduce la nota de " + notas[i][0] + " en " + notas[0][j] + ":");
                notas[i][j] = sc.next();
            }
        }

        // Mostrar tabla completa
        System.out.println("=== TABLA DE NOTAS ===");
        for (String[] fila : notas) {
            System.out.println(Arrays.toString(fila));
        }
        int suma_notas =0;
        for (int i=1; i< notas.length; i++){
            for (int j = 0; j<notas[i].length; j++){
                suma_notas += Integer.parseInt(notas[i][j]);
                }
            System.out.println("la media  de" +notas[i][0] + "es" +(double)(suma_notas/asignaturas));
            }
        int suma_nota_media=0;
        for (int i=1; i<notas[0].length; i++ ){
            suma_nota_media =0;
            for (int j=1; j<notas.length; j++) {
                suma_notas += Integer.parseInt(notas[j][i]);
            }
            System.out.println("la media de "+notas[0][1] + "es "+(double)(suma_notas/estudiantes));
        }
        }
    }

