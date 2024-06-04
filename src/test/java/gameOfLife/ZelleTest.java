package gameOfLife;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ZelleTest {
    Zelle tot;
    Zelle lebendig;
   @BeforeEach
   public void setup(){
        tot = Zelle.TOT;
        lebendig = Zelle.LEBENDIG;
   }

    @Test
    public void lebendig2LebendeNachbarnBleibtLebendig(){
        Zelle zustand = lebendig.simuliereNaechsteGeneration(2);
        assertEquals(Zelle.LEBENDIG, zustand);
    }

    @Test
    public void lebendig3LebendeNachbarnBleibtLebendig(){
        Zelle zustand = lebendig.simuliereNaechsteGeneration(3);
        assertEquals(Zelle.LEBENDIG, zustand);
    }

    @Test
    public void lebendig1LebendeNachbarnStirbt(){
        Zelle zustand = lebendig.simuliereNaechsteGeneration(1);
        assertEquals(Zelle.TOT, zustand);
    }

    @Test
    public void lebendig4LebendeNachbarnStirbt(){
        Zelle zustand = lebendig.simuliereNaechsteGeneration(4);
        assertEquals(Zelle.TOT, zustand);
    }

    @Test
    public void tot3LebendeNachbarnWirdLebendig(){
        Zelle zustand = tot.simuliereNaechsteGeneration(3);
        assertEquals(Zelle.LEBENDIG, zustand);
    }

    @Test
    public void tot4LebendeNachbarnBleibtTot(){
        Zelle zustand = tot.simuliereNaechsteGeneration(4);
        assertEquals(Zelle.TOT, zustand);
    }

    @Test
    public void tot2LebendeNachbarnBleibtTot(){
        Zelle zustand = tot.simuliereNaechsteGeneration(2);
        assertEquals(Zelle.TOT, zustand);
    }
}