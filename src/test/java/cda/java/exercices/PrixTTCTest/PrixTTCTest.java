package cda.java.exercices.PrixTTCTest;

import org.junit.Test;
import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

import cda.java.exercices.calculTTC.PrixTTC;

public class PrixTTCTest {

    @Test
    public void testCalculPrixTTC() {
        String input = "50";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        float prixHT = PrixTTC.saisirPrixHT(new Scanner(System.in));

        System.setIn(System.in);

        PrixTTC.calculPrixTTC(prixHT);
        double prixTTC = prixHT * 1.20;
        assertEquals(prixTTC, prixTTC, 0.001);
    }
}