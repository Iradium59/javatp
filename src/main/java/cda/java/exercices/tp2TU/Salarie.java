package cda.java.exercices.tp2TU;

public abstract class Salarie {
    protected Salaire salaire;
    protected Identite identite;

    public Salarie(Salaire salaire, Identite identite) {
        this.salaire = salaire;
        this.identite = identite;
    }

    public abstract void travailler(int heures);

    public abstract void demenager(Adresse nouvelleAdresse);

    public abstract void augmenter(double pourcentage);

    public Salaire getSalaire() {
        return salaire;
    }

    public Identite getIdentite() {
        return identite;
    }
}

