package cda.java.exercices.palindrome;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Veuillez saisir un nombre : ");
        int nombre = saisirNombre(scanner);
        boolean estPalindrome = isPalindrome(nombre);
        String text = estPalindrome ? "Le nombre est un palindrome" : "Le nombre n'est pas un palidrome";
        System.out.println("Résultat : " + text);
    }

    public static int saisirNombre(Scanner scanner) {
        int nombre;
        do {
            System.out.print("Veuillez saisir un nombre (supérieur à 0 et avec au moins 2 chiffres) : ");
            while (!scanner.hasNextInt()) {
                System.out.println("Veuillez saisir un nombre valide.");
                scanner.next();
            }
            nombre = scanner.nextInt();
        } while (nombre <= 0 || nombre < 10);

        return nombre;
    }

    public static boolean isPalindrome(int nombre) {
        int originalNombre = nombre;
        int reverse = 0;

        while (nombre > 0) {
            int dernierChiffre = nombre % 10;
            reverse = reverse * 10 + dernierChiffre;
            nombre = nombre / 10;
        }
        return originalNombre == reverse;
    }
}

