package cda.java.demos.exception;

public class GestionExceptionDemo {
    public static void main(String[] args) throws MonExceptionPersoException{
        int dividende = 10;
        int diviseur = 0;


        try {
            int resultat = dividende / diviseur;
            System.out.println("Le résultat est " + resultat);
        } catch (ArithmeticException e){
            throw new MonExceptionPersoException("C'est pété lol");
        } finally {
            System.out.println("J'ai fait du code");
        }
    }
}
