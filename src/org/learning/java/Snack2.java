package org.learning.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Snack2 {
    private static List<String> nomi = new ArrayList<>();
    private static List<String> cognomi = new ArrayList<>();

    public static void main(String[] args) {
        // Popoliamo le liste con nomi e cognomi fittizi
        popolaListe();

        // Generiamo 10 nomi casuali
        for (int i = 0; i < 10; i++) {
            String nomeCasuale = generaNomeCasuale();
            String cognomeCasuale = generaCognomeCasuale();
            System.out.println((i + 1) + ". " + nomeCasuale + " " + cognomeCasuale);
        }
    }

    // Metodo per popolare le liste di nomi e cognomi fittizi
    private static void popolaListe() {
        nomi.add("Mario");
        nomi.add("Luigi");
        nomi.add("Giulia");
        nomi.add("Sara");
        nomi.add("Antonio");

        cognomi.add("Rossi");
        cognomi.add("Bianchi");
        cognomi.add("Verdi");
        cognomi.add("Ferrari");
        cognomi.add("Russo");
    }

    // Metodo per generare un nome casuale
    private static String generaNomeCasuale() {
        Random random = new Random();
        int indice = random.nextInt(nomi.size());
        return nomi.get(indice);
    }

    // Metodo per generare un cognome casuale
    private static String generaCognomeCasuale() {
        Random random = new Random();
        int indice = random.nextInt(cognomi.size());
        return cognomi.get(indice);
    }
}
