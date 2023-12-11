package cda.java.exercices.ContientDoublon;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ContientDoublon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] tableau = saisirTableau(scanner);
        boolean contientDoublon = contientDoublon(tableau);
        String text = contientDoublon ? "Le tableau contient un doublons" : "Le tableau ne contient pas de doublons";
        System.out.println("Résultat : " + text);
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

    public static boolean contientDoublon(int[] tableau) {
        Set<Integer> elementsUniques = new HashSet<>();
        for (int element : tableau) {
            if (!elementsUniques.add(element)) {
                return true;
            }
        }
        return false;
    }
}


