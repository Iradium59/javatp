package cda.java.exercices.tp3;

public class Lion extends Animal {
    public Lion(String nom, String nomScientifique, String genre) {
        super(nom, nomScientifique, genre);
    }

    public void rugir() {
        System.out.println(getNom() + " rugit.");
    }

    public void dormir() {
        System.out.println(getNom() + " dort.");
    }

    public void seDeplacer() {
        System.out.println(getNom() + " se déplace.");
    }

    public void chasser() {
        System.out.println(getNom() + " chasse.");
    }

    public void seReproduire() {
        System.out.println(getNom() + " se reproduit.");
    }
}
