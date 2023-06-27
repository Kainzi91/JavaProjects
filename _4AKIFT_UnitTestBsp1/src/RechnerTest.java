import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RechnerTest {
    @Test
    void zweiPlusZweiSollte4sein(){
        Rechner rechner=new Rechner();
        assertEquals(4,rechner.getSumme(2,2));
    }
    @Test
    void zweiPlusMinuZweiSollte0sein(){
        Rechner rechner=new Rechner();
        assertEquals(0,rechner.getSumme(2,-2));
    }
    @Test
    void minusZweiKomma3PlusNullKomma4SollteMinusEinKomma9sein(){
        Rechner rechner=new Rechner();
        assertEquals(-1.9,rechner.getSumme(-2.3,0.4));
    }
    @Test
    void minusEinsKomma9PlusNZweiKomma2SollteMNullKomma3sein(){
        Rechner rechner=new Rechner();
        assertEquals(0.3,rechner.getSumme(-1.9,2.2),0.00000001);
    }

    @Test
    void faktulaetVon1Sollte1sein(){
        Rechner rechner=new Rechner();
        assertEquals(1,rechner.getFakultaet(1));
    }
    @Test
    void faktulaetVon12Sollte479001600sein(){
        Rechner rechner=new Rechner();
        assertEquals(479001600,rechner.getFakultaet(12));
    }

    @Test
    void faktulaetVonMinus1SollteIllegalArgumentExceptionSein(){
        Rechner rechner=new Rechner();
        assertThrows(IllegalArgumentException.class, ()->rechner.getFakultaet(-1));
    }

    @Test
    void ergebnisseSollten012345Sein(){
        Rechner rechner=new Rechner();
        int[] expected={0,1,2,3,4,5};
        assertArrayEquals (expected,rechner.getErgebnisse());
    }


}