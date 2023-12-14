package cda.java.exercices.tp3;

public class Animal {
    private String nom;
    private String nomScientifique;
    private String genre;

    public Animal(String nom, String nomScientifique, String genre) {
        this.nom = nom;
        this.nomScientifique = nomScientifique;
        this.genre = genre;
    }

    public String getNom() {
        return nom;
    }

    public String getNomScientifique() {
        return nomScientifique;
    }

    public String getGenre() {
        return genre;
    }

    public void manger() {
        System.out.println(nom + " mange.");
    }

    public void emettreSon() {
        System.out.println(nom + " émet un son.");
    }
}
