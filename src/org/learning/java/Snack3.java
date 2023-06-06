package org.learning.java;

public class Snack3 {
    public static void main(String[] args) {
        int[] numeri = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int somma = 0;

        // Calcola la somma degli elementi in posizione dispari
        for (int i = 1; i < numeri.length; i += 2) {
            somma += numeri[i];
        }

        System.out.println("La somma degli elementi in posizione dispari è: " + somma);
    }
}
