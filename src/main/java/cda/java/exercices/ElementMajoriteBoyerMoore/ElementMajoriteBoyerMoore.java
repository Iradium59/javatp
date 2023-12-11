package cda.java.exercices.ElementMajoriteBoyerMoore;

import java.util.Scanner;

public class ElementMajoriteBoyerMoore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] tableau = saisirTableau(scanner);
        int elementMajorite = trouverElementMajorite(tableau);
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
        int candidat = -1;
        int compteur = 0;
        for (int element : tableau) {
            if (compteur == 0) {
                candidat = element;
                compteur = 1;
            } else if (element == candidat) {
                compteur++;
            } else {
                compteur--;
            }
        }
        compteur = 0;
        for (int element : tableau) {
            if (element == candidat) {
                compteur++;
            }
        }
        return (compteur > tableau.length / 2) ? candidat : -1;
    }
}
