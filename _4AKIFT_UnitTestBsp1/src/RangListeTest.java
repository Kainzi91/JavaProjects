import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RangListeTest {

    @Test
    void fiftySolleEsein(){
        RangListe rangListe=new RangListe();
        rangListe.setWert(50);
        assertEquals("E",rangListe.getRang());
    }
    @Test
    void nullSolleEsein(){
        RangListe rangListe=new RangListe();
        rangListe.setWert(0);
        assertEquals("E",rangListe.getRang());
    }
    @Test
    void nintynineSolleEsein(){
        RangListe rangListe=new RangListe();
        rangListe.setWert(99);
        assertEquals("E",rangListe.getRang());
    }
    @Test
    void hundretSolleZsein(){
        RangListe rangListe=new RangListe();
        rangListe.setWert(100);
        assertEquals("Z",rangListe.getRang());
    }
    @Test
    void hundertOneSolleZsein(){
        RangListe rangListe=new RangListe();
        rangListe.setWert(101);
        assertEquals("Z",rangListe.getRang());
    }
    @Test
    void thousandSolleZsein(){
        RangListe rangListe=new RangListe();
        rangListe.setWert(1000);
        assertEquals("Z",rangListe.getRang());
    }
    @Test
    void thousandOneSolleDsein(){
        RangListe rangListe=new RangListe();
        rangListe.setWert(1001);
        assertEquals("D",rangListe.getRang());
    }
    @Test
    void tenthousandSolleDsein(){
        RangListe rangListe=new RangListe();
        rangListe.setWert(10000);
        assertEquals("D",rangListe.getRang());
    }

    @Test
    void Minus1SollteIllegalArgumentExceptionSein(){
        RangListe rangListe=new RangListe();
        assertThrows(IllegalArgumentException.class, ()->rangListe.setWert(-1));
    }


}