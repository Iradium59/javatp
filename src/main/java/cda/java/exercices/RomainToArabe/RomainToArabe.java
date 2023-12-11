package cda.java.exercices.RomainToArabe;

import java.util.HashMap;
import java.util.Scanner;

public class RomainToArabe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Veuillez saisir un nombre romain : ");
        String nombreRomain = scanner.nextLine().toUpperCase();
        if (estNombreRomainValide(nombreRomain)) {
            int valeurArabe = convertirRomanEnArabe(nombreRomain);
            System.out.println("Résultat : " + valeurArabe);
        } else {
            System.out.println("Le nombre romain saisi n'est pas valide.");
        }
    }

    public static boolean estNombreRomainValide(String nombreRomain) {
        return nombreRomain.matches("[IVXLCDM]+") &&
                nombreRomain.length() > 0 &&
                nombreRomain.length() <= 15;
    }

    public static int convertirRomanEnArabe(String nombreRomain) {
        HashMap<Character, Integer> valeurs = new HashMap<>();
        valeurs.put('I', 1);
        valeurs.put('V', 5);
        valeurs.put('X', 10);
        valeurs.put('L', 50);
        valeurs.put('C', 100);
        valeurs.put('D', 500);
        valeurs.put('M', 1000);
        int resultat = 0;
        int precedenteValeur = 0;
        for (int i = nombreRomain.length() - 1; i >= 0; i--) {
            char chiffreRomain = nombreRomain.charAt(i);
            int valeur = valeurs.get(chiffreRomain);
            if (valeur < precedenteValeur) {
                resultat -= valeur;
            } else {
                resultat += valeur;
            }
            precedenteValeur = valeur;
        }
        return resultat;
    }
}

