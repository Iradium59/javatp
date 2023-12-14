package cda.java.exercices.tp6;

public class Pokemon {
    public int id;
    public String nom;
    public int pv;
    public Type type;

    public Pokemon(int id, String nom, int pv, Type type) {
        this.id = id;
        this.nom = nom;
        this.pv = pv;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getPv() {
        return pv;
    }

    public void setPv(int pv) {
        this.pv = pv;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public void attaquer(String nom) {
        System.out.println(this.nom + " attaque " + nom);
    }

}
