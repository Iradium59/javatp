package cda.java.exercices.tp3;
public class Dauphin extends Animal {
    public Dauphin(String nom, String nomScientifique, String genre) {
        super(nom, "Delphinidae", genre);
    }

    public void nager() {
        System.out.println(getNom() + " nage.");
    }

    public void accoucher() {
        System.out.println(getNom() + " accouche.");
    }

    public void siffler() {
        System.out.println(getNom() + " siffle.");
    }
}
