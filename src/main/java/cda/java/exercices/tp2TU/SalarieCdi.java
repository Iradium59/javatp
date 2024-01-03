package cda.java.exercices.tp2TU;

public class SalarieCdi extends Salarie {
    public SalarieCdi(Salaire salaire, Identite identite) {
        super(salaire, identite);
    }

    @Override
    public void travailler(int heures) {
        salaire.payer(heures);
    }

    @Override
    public void demenager(Adresse nouvelleAdresse) {
        identite.setAdresse(nouvelleAdresse);
    }

    @Override
    public void augmenter(double pourcentage) {
        salaire.augmenterTauxHoraire(pourcentage);
    }
}

