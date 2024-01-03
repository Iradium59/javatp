package cda.java.Note;
import static org.junit.Assert.assertEquals;

import java.util.HashMap;

import org.junit.Test;

import cda.java.exercices.moyenne.Note;
public class NoteTest {

    @Test
    public void testCalculMoyenneWithNoNotes() {
        HashMap<Integer, Integer> notesMap = new HashMap<>();
        assertEquals(0, calculerMoyenne(notesMap));
    }

    @Test
    public void testCalculMoyenneWithOneNote() {
        HashMap<Integer, Integer> notesMap = new HashMap<>();
        notesMap.put(0, 15);
        assertEquals(15, calculerMoyenne(notesMap));
    }

    @Test
    public void testCalculMoyenneWithMultipleNotes() {
        HashMap<Integer, Integer> notesMap = new HashMap<>();
        notesMap.put(0, 10);
        notesMap.put(1, 15);
        notesMap.put(2, 20);
        assertEquals(15, calculerMoyenne(notesMap));
    }

    private int calculerMoyenne(HashMap<Integer, Integer> notesMap) {
        Note.calculMoyenne(notesMap);
        return 0;
    }
}