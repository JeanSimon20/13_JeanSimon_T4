package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        String letras[][] = {{"A", "B", "C", "D", "E"},
                {"F", "G", "H", "IJ", "K"},
                {"L", "M", "N", "O", "P"},
                {"G", "R", "S", "T", "U"},
                {"V", "W", "X", "Y", "Z"}

        };
        int op;

        String mensaje;
        String men[];
        String men2[];
        System.out.println("Escribe un texto");
        mensaje = leer.nextLine().toUpperCase();

        System.out.println("1. Encriptar");
        System.out.println("2. Desencriptar");
        System.out.println("Elige una opción");
        op = leer.nextInt();
        leer = new Scanner(System.in);


        men = mensaje.split("");
        men2 = mensaje.split("");

        switch (op) {
            case 1:
                char let = ' ';
                char let2 = ' ';


                for (int i = 0; i < mensaje.length() + 1; i++) {
                    for (int j = 0; j < 5; j++) {
                        for (int k = 0; k < 5; k++) {
                            if ((men[i].equals(letras[j][k]))) {
                                let = (char) (j + 65);
                                let2 = (char) (k + 65);
                                System.out.println(let + "" + let2 + " ");

                            }
                            if (men[i].equals((" "))) {
                                System.out.println(" ");
                            }
                        }
                    }
                }
                break;
            case 2:

                int q = 1;
                int w = 12;

                String mensaje2 = "";
                String aux;


                for (int x = 0; x < men2.length; x++) {
                    aux = men2[x];
                    q = (aux.charAt(0)) - 65;
                    w = (aux.charAt(0)) - 65;
                    mensaje2 = letras[q][w];
                    System.out.println(mensaje2);
                }
                break;
            default:
                throw new AssertionError();
        }


    }
}


//BCCDCAAA