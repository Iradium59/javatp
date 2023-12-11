package cda.java.exercices.calculTTC;

import java.util.Scanner;

public class PrixTTC {
    public static void main(String[] args) {
        Scanner saisiPrix = new Scanner(System.in);

        float saisiUser = saisirPrixHT(saisiPrix);
        calculPrixTTC(saisiUser);
    }

    public static float saisirPrixHT(Scanner scanner) {
        float prixHT;
        do {
            System.out.print("Veuillez saisir le prix HT (nombre positif) : ");
            while (!scanner.hasNextFloat()) {
                System.out.println("Veuillez saisir un nombre valide.");
                scanner.next(); // Effacer la saisie incorrecte
            }
            prixHT = scanner.nextFloat();
        } while (prixHT <= 0);

        return prixHT;
    }

    public static void calculPrixTTC(float prixHT) {
        double tauxTVA = 0.20;
        double prixTTC = prixHT * (1 + tauxTVA);

        System.out.println("Le prix TTC est : " + prixTTC);
    }
}
