package cda.java.exercices.ElementMajorite;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ElementMajorite {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Saisir un tableau d'entiers
        int[] tableau = saisirTableau(scanner);

        // Trouver l'élément majoritaire
        int elementMajorite = trouverElementMajorite(tableau);

        // Afficher le résultat
        System.out.println("Résultat : " + elementMajorite);
    }

    public static int[] saisirTableau(Scanner scanner) {
        System.out.print("Veuillez saisir la taille du tableau : ");
        int taille = scanner.nextInt();

        int[] tableau = new int[taille];

        System.out.println("Veuillez saisir les éléments du tableau :");
        for (int i = 0; i < taille; i++) {
            System.out.print("Élément " + (i + 1) + " : ");
            tableau[i] = scanner.nextInt();
        }

        return tableau;
    }

    public static int trouverElementMajorite(int[] tableau) {
        Map<Integer, Integer> occurrences = new HashMap<>();

        // Compter les occurrences de chaque élément dans le tableau
        for (int element : tableau) {
            occurrences.put(element, occurrences.getOrDefault(element, 0) + 1);
        }

        // Trouver l'élément avec le plus grand nombre d'occurrences
        int elementMajorite = 0;
        int maxOccurrences = 0;

        for (int element : occurrences.keySet()) {
            int nombreOccurrences = occurrences.get(element);

            if (nombreOccurrences > maxOccurrences) {
                maxOccurrences = nombreOccurrences;
                elementMajorite = element;
            }
        }

        return elementMajorite;
    }
}
