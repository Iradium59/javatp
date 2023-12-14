package cda.java.exercices.tp6;

public class Main {
    public static void main(String[] args){
        Arene arene = new Arene();
        Dresseur dresseur1 = new Dresseur(1, "José");
        Dresseur dresseur2 = new Dresseur(2, "Josiane");
        arene.demarrerCombat(dresseur1.getNom(),dresseur2.getNom());

    }
}
