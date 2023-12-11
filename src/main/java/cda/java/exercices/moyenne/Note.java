package cda.java.exercices.moyenne;

import java.util.Scanner;
import java.util.HashMap;
import java.util.InputMismatchException;
public class Note {
    public static void main(String[] args){
        int nbNotes = 3;
        int i = 0;
        HashMap<Integer, Integer> notesMap = new HashMap<>();
        while (i < nbNotes) {
            Scanner saisieUtilisateur = new Scanner(System.in);
            try {
                System.out.print("Entrez une note entre 0 et 20 (nombre entier) : ");
                int note = saisieUtilisateur.nextInt();
                if (note < 0 || note > 20) {
                    System.out.println("La note doit être entre 0 et 20. Veuillez réessayer.");
                    continue;
                }
                notesMap.put(i, note);
                i++;
            } catch (InputMismatchException e) {
                System.out.println("Veuillez entrer un nombre entier. Réessayez.");
                saisieUtilisateur.next();
            }
        }
        calculMoyenne(notesMap);
    }


    public static void calculMoyenne(HashMap<Integer, Integer> notesMap){
        int somme = 0;
        for (int note : notesMap.values()) {
            somme += note;
        }

        double moyenne = (double) somme / notesMap.size();
        int moyenneArrondie = (int) Math.round(moyenne);
        System.out.println("La moyenne des notes est : " + moyenneArrondie);
    }
}
