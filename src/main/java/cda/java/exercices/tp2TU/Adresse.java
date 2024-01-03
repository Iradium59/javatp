package cda.java.exercices.tp2TU;

public class Adresse {
    private String voie;
    private String rue;
    private String cp;
    private String ville;
    private String pays;

    public Adresse(String voie, String rue, String cp, String ville, String pays) {
        this.voie = voie;
        this.rue = rue;
        this.cp = cp;
        this.ville = ville;
        this.pays = pays;
    }

    public String getVoie() {
        return voie;
    }

    public String getRue() {
        return rue;
    }

    public String getCp() {
        return cp;
    }

    public String getVille() {
        return ville;
    }

    public String getPays() {
        return pays;
    }
}

