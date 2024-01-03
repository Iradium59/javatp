package cda.java.exercices.tp2TU;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import cda.java.exercices.tp2TU.*;
class SalarieCdiTest {

    @Test
    void testTravailler() {
        Salaire mockSalaire = mock(Salaire.class);
        Identite mockIdentite = mock(Identite.class);

        SalarieCdi salarieCdi = new SalarieCdi(mockSalaire, mockIdentite);
        salarieCdi.travailler(160);

        verify(mockSalaire).payer(160);
    }

    @Test
    void testDemenager() {
        Salaire mockSalaire = mock(Salaire.class);
        Identite mockIdentite = mock(Identite.class);
        Adresse nouvelleAdresse = new Adresse("Nouvelle Voie", "Nouvelle Rue", "12345", "Nouvelle Ville", "Nouveau Pays");

        SalarieCdi salarieCdi = new SalarieCdi(mockSalaire, mockIdentite);
        salarieCdi.demenager(nouvelleAdresse);

        verify(mockIdentite).setAdresse(nouvelleAdresse);
    }

    @Test
    void testAugmenter() {
        Salaire mockSalaire = mock(Salaire.class);
        Identite mockIdentite = mock(Identite.class);

        SalarieCdi salarieCdi = new SalarieCdi(mockSalaire, mockIdentite);
        salarieCdi.augmenter(10);

        verify(mockSalaire).augmenterTauxHoraire(10);
    }
}

