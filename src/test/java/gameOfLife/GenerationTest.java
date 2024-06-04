package gameOfLife;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GenerationTest {

    //wir testen nur die public Methoden, da wir auf
    //private Methoden keinen direkten, sondern einen indirekten
    //Zugriff haben

    //initialisieren Test
    @Test
    public void initialisierenZeile3Spalte3Tot(){
        Generation zustand = new Generation(6); //zusatnd ein Generations-Objekt mit dem Parameter-Wert 6 (6x6)
        assertEquals(Zelle.TOT, zustand.generation[3][3]);  //um auf den Array-Wert [3][3] zuzugreifen müssen wir .generation anwenden
    }

    @Test
    public void initialisierenZeile1Spalte1Lebendig(){
        Generation zustand = new Generation(6);
        assertEquals(Zelle.LEBENDIG, zustand.generation[1][1]);
    }

    //der Test geht nicht, da die Groesse 3 zu klein ist
    //aufgrund der initialisierten Felder in der Klasse die
    //mindestens eine Groesse von 5 benötigt
    public void initialisierenGroesse3Zeile1Spalte1Lebendig(){
        Generation zustand = new Generation(3);
        assertEquals(Zelle.LEBENDIG, zustand.generation[1][1]);
    }

    //simuliereNaechsteGeneration Test
    //gibt nichts zurück, sondern verändert den inneren Zustand
    //der Generation
    @Test
    public void naechsteGenerationZeile1Spalte1Stirbt1LNachbar(){
        Generation zustand = new Generation(5);
        //Methode ist void
        zustand.simuliereNaechsteGeneration();
        assertEquals(Zelle.TOT, zustand.generation[1][1]);
    }

    @Test
    public void naechsteGenerationZeile2Spalte1BleibtLebendig2LNachbarn(){
        Generation zustand = new Generation(5);
        zustand.simuliereNaechsteGeneration();
        assertEquals(Zelle.LEBENDIG, zustand.generation[2][1]);
    }

    @Test
    public void naechsteGenerationZeile2Spalte4BleibtLebendig3LNachbarn(){
        Generation zustand = new Generation(6);
        //Erstellen uns ein dummy lebenden Nachbarn
        zustand.generation[2][5] = Zelle.LEBENDIG;
        zustand.simuliereNaechsteGeneration();
        assertEquals(Zelle.LEBENDIG, zustand.generation[2][4]);
    }

    @Test
    public void naechsteGenerationZeile2Spalte4Stirbt4LNachbarn(){
        Generation zustand = new Generation(6);
        zustand.generation[2][5] = Zelle.LEBENDIG;
        zustand.generation[3][5] = Zelle.LEBENDIG;
        zustand.simuliereNaechsteGeneration();
        assertEquals(Zelle.TOT, zustand.generation[2][4]);
    }

    @Test
    public void naechsteGenerationZeile2Spalte3WirdLebendig3LNachbarn(){
        Generation zustand = new Generation(6);
        zustand.simuliereNaechsteGeneration();
        assertEquals(Zelle.LEBENDIG, zustand.generation[2][3]);
    }

    @Test
    public void naechsteGenerationZeile1Spalte0BleibtTot2LNachbarn(){
        Generation zustand = new Generation(6);
        zustand.simuliereNaechsteGeneration();
        assertEquals(Zelle.TOT, zustand.generation[1][0]);
    }

    @Test
    public void naechsteGenerationZeile2Spalte3BleibtTot4LNachbarn(){
        Generation zustand = new Generation(6);
        zustand.generation[3][3] = Zelle.LEBENDIG;
        zustand.simuliereNaechsteGeneration();
        assertEquals(Zelle.TOT, zustand.generation[2][3]);
    }


}