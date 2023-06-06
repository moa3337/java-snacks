package org.learning.java;

import java.util.Scanner;

public class Snack1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Chiedo all'utente di inserire un numero
        System.out.print("Inserisci un numero: ");
        int numero = input.nextInt();

        // Controllo se il numero è pari o dispari utilizzando l'operatore modulo %
        if (numero % 2 == 0) {
            // Se il numero è pari viene stampato il numero stesso
            System.out.println("Il numero inserito è pari: " + numero);
        } else {
            // Se il numero è dispari viene stampato il numero successivo
            int numeroSuccessivo = numero + 1;
            System.out.println("Il numero inserito è dispari. Il numero successivo è: " + numeroSuccessivo);
        }
    }
}
