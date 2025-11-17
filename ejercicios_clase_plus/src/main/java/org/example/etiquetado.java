package org.example;

public class etiquetado {
    static void main() {
        bucle_fuera:
        for (int i =0; i<10; i++){
            System.out.println("bucle fuera "+i);
            bucle_dentro:
            for (int j =0; j<=5; j++){
                System.out.println("bucle dentro "+j);
                if (j==4){
                    continue bucle_fuera;
                    //break;
                }
            }
            System.out.println("holaaa");
        }

    }
}
