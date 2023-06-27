import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DatenuebernahmeTest {

    @BeforeEach
    void init(){
        System.out.println("Test init() druchgeführt");
    }
    @Test
    void id4123Sollte4123Sein(){
        Datenuebernahme datenuebernahme=new Datenuebernahme();
        datenuebernahme.setId_person(4123);
        assertEquals(4123,datenuebernahme.getId_person());
    }
    @Test
    void idMinus4Sollte0Sein(){
        Datenuebernahme datenuebernahme=new Datenuebernahme();
        datenuebernahme.setId_person(-4);
        assertEquals(0,datenuebernahme.getId_person());
    }
    @Test
    void id0Sollte0Sein(){
        Datenuebernahme datenuebernahme=new Datenuebernahme();
        datenuebernahme.setId_person(0);
        assertEquals(0,datenuebernahme.getId_person());
    }
    @BeforeAll
    static void initAll(){
        System.out.println("Alle Inits durchgeführt");
    }
}