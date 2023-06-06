package org.learning.java;

import java.util.Scanner;

public class Snack8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Inserisci un numero composto da 4 cifre: ");
        int numero = input.nextInt();

        int somma = 0;
        int cifra;

        // Calcolo la somma delle cifre inserite

        // Prendo la prima cifra
        cifra = numero % 10;
        somma += cifra;
        numero /= 10;

        // Prendo la seconda cifra
        cifra = numero % 10;
        somma += cifra;
        numero /= 10;

        // Prendo la terza cifra
        cifra = numero % 10;
        somma += cifra;
        numero /= 10;

        // La quarta cifra è l'ultima
        cifra = numero % 10;
        somma += cifra;

        System.out.println("La somma delle cifre è: " + somma);
    }
    }
