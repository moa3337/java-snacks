package org.learning.java;

public class Snack9 {
    public static void main(String[] args) {
        int somma = 0;
        double media;

        // Calcolo la somma dei primi 10 numeri con un ciclo for
        for (int i = 1; i <= 10; i++) {
            somma += i;
        }

        // Calcolo la media dividendo la somma per il numero totale di elementi
        media = (double) somma / 10;

        // Stampo la somma e la media dei primi 10 numeri
        System.out.println("La somma dei primi 10 numeri è: " + somma);
        System.out.println("La media dei primi 10 numeri è: " + media);
    }
}
