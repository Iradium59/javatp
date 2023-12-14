package cda.java.exercices.tp6;

public class Dresseur {
    public int id;
    public String nom;

    public Dresseur(int id, String nom) {
        this.id = id;
        this.nom = nom;
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

    //TODO: Ajouter une méthode pour initialiser 1 équipe de 6 pokémons
    public void initEquipe() {
        Pokemon pokemon1 = new Pokemon(1,"Pikachu", 100, new Type("Electrique", "Sol", "Eau"));
        Pokemon pokemon2 = new Pokemon(2, "Bulbizarre", 100, new Type("Plante", "Feu", "Eau"));
        Pokemon pokemon3 = new Pokemon(3,"Carapuce", 100, new Type("Eau", "Plante", "Feu"));
        Pokemon pokemon4 = new Pokemon(4, "Salamèche", 100, new Type("Feu", "Eau", "Plante"));
        Pokemon pokemon5 = new Pokemon(5, "Dracaufeu", 100, new Type("Feu", "Eau", "Plante"));
        Pokemon pokemon6 = new Pokemon(6, "Mewtwo", 100, new Type("Psy", "Ténèbres", "Combat"));
    }

}
