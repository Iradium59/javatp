package cda.java.exercices.tp3;

public class Main {
    public static void main(String[] args) {
        Lion lion = new Lion("Ruben", "Gros Chat", "Mâle");
        lion.manger();
        lion.emettreSon();
        lion.rugir();
        lion.dormir();
        lion.seDeplacer();
        lion.chasser();
        lion.seReproduire();

        Dauphin dauphin = new Dauphin("Flipper", "Poisson", "Femelle");
        dauphin.manger();
        dauphin.emettreSon();
        dauphin.nager();
        dauphin.accoucher();
        dauphin.siffler();

        Ornithorynque ornithorynque = new Ornithorynque("Fred", "Truc Bizarre", "Mâle");
        ornithorynque.manger();
        ornithorynque.emettreSon();
        ornithorynque.grogner();
        ornithorynque.pondreOeufs();
        ornithorynque.allaiter();
    }
}