package cda.java.demos.hashmap;

import java.util.HashMap;
public class Hashmap {
    public static void main(String[] args){
        Eleve[] eleves = new Eleve[5];
        eleves[0] = new Eleve("Dupont", "Jean", "java");
        eleves[1] = new Eleve("Dupont", "Jean", "java");
        eleves[2] = new Eleve("Dupont", "Jean", "react");
        eleves[3] = new Eleve("Dupont", "Jean", "react");
        eleves[4] = new Eleve("Dupont", "Jean", "angular");

        compteurSansHashmap(eleves);
        compteurAvecHashmap(eleves);
    }

    public static void compteurSansHashmap(Eleve[] eleves){
        int eleveJava = 0;
        int eleveReact = 0;
        int eleveAngular = 0;

        for (Eleve eleve: eleves){
            if (eleve.classe.equals("java")){
                eleveJava++;
            } else if (eleve.classe.equals("react")){
                eleveReact++;
            } else if (eleve.classe.equals("angular")){
                eleveAngular++;
            }
        }

        System.out.println("Eleves Java : " + eleveJava);
        System.out.println("Eleves React : " + eleveReact);
        System.out.println("Eleves Angular : " + eleveAngular);
    }

    public static void compteurAvecHashmap(Eleve[] eleves){
        HashMap<String, Integer> eleveParClasse = new HashMap<>();

        for (Eleve eleve: eleves) {
            if (eleveParClasse.containsKey(eleve.classe)){
                eleveParClasse.put(eleve.classe, eleveParClasse.get(eleve.classe) + 1);
            } else {
                eleveParClasse.put(eleve.classe, 1);
            }
        }
    }
}
