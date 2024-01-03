package cda.java.exercices.tp2TU;

public class Salaire {
    private double tauxHoraire;

    public Salaire(double tauxHoraire) {
        this.tauxHoraire = tauxHoraire;
    }

    public double payer(int heures) {
        double salaire = tauxHoraire * heures;
        if (heures > 151) {
            salaire += tauxHoraire * 0.25 * (heures - 151);
        }
        return salaire;
    }

    public double getTauxHoraire() {
        return tauxHoraire;
    }

    public void augmenterTauxHoraire(double pourcentage) {
        tauxHoraire += tauxHoraire * (pourcentage / 100);
    }
}
