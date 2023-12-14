package cda.java.exercices.tp6;

public class Type {
    public String nom;
    public String faiblesse;
    public String resistance;

    public Type(String nom, String faiblesse, String resistance) {
        this.nom = nom;
        this.faiblesse = faiblesse;
        this.resistance = resistance;
    }

    public String getNom() {
        return nom;
    }

    public String getFaiblesse() {
        return faiblesse;
    }

    public String getResistance() {
        return resistance;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setFaiblesse(String faiblesse) {
        this.faiblesse = faiblesse;
    }

    public void setResistance(String resistance) {
        this.resistance = resistance;
    }
}
