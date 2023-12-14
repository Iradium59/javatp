package cda.java.exercices.tp3;

public class Ornithorynque extends Animal {
    public Ornithorynque(String nom, String nomScientifique, String genre) {
        super(nom, "Ornithorhynchus anatinus", genre);
    }

    public void grogner() {
        System.out.println(getNom() + " grogne.");
    }

    public void pondreOeufs() {
        System.out.println(getNom() + " pond des œufs.");
    }

    public void allaiter() {
        System.out.println(getNom() + " allaite.");
    }
}

