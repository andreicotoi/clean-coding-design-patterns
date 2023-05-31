package test;

import model.IPersoana;
import model.Persoana;
import org.junit.jupiter.api.function.Executable;
import test.ExceptieCNPNull;
import test.ExceptieNenascut;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

class PersoanaTest {

    @org.junit.jupiter.api.Test
    void getVarstaRight() {
        IPersoana persoana = new Persoana("Andrei", "5011026295444");
        assertEquals(21,persoana.getVarsta());
    }

    @org.junit.jupiter.api.Test
    void getVarstaNouNascut() {
        IPersoana persoana = new Persoana("Andrei", "5230524295444");
        assertEquals(0,persoana.getVarsta());
    }

    @org.junit.jupiter.api.Test
    void getVarstaLimitaInferioara() {
        IPersoana persoana = new Persoana("Andrei", "5000101295444");
        assertEquals(23,persoana.getVarsta());
    }

    @org.junit.jupiter.api.Test
    void getVarstaLimitaSuperioara() {
        IPersoana persoana = new Persoana("Andrei", "2991231295444");
        assertEquals(23,persoana.getVarsta());
    }

    @org.junit.jupiter.api.Test
    void getVarstaErrorConditions() {
        IPersoana persoana = new Persoana("Andrei", "5230824295444");
        assertThrows(ExceptieNenascut.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                persoana.getVarsta();
            }
        });
    }

    @org.junit.jupiter.api.Test
    void getVarstaPerformance() {
        IPersoana persoana = new Persoana("Andrei", "2991231295444");
        assertTimeout(Duration.ofMillis(100), new Executable() {
            @Override
            public void execute() throws Throwable {
                persoana.getVarsta();
            }
        });
    }

    @org.junit.jupiter.api.Test
    void cnpLungimeVerificare() {
        Persoana persoana = new Persoana("Andrei", "5000101295444");
        assertEquals(13, persoana.CNP.length());
    }

    @org.junit.jupiter.api.Test
    void ordineVarstaPersoane() {
        IPersoana persoana1 = new Persoana("Andrei", "2991231295444");
        IPersoana persoana2 = new Persoana("Andrei", "5001231295444");
        assertTrue(persoana1.getVarsta() > persoana2.getVarsta());
    }

    @org.junit.jupiter.api.Test
    void CNPNullVerificare() {
        IPersoana persoana = new Persoana("Andrei", null);
        assertThrows(ExceptieCNPNull.class, () ->{
            persoana.getVarsta();
        });
    }

    @org.junit.jupiter.api.Test
    void getVarstaCardinality() {
        IPersoana persoana = new Persoana("Andrei", "5220524295444");
        assertEquals(1,persoana.getVarsta());
    }

    @org.junit.jupiter.api.Test
    void verificaConstructorCrosscheck() {
        Persoana persoana1 = new Persoana("Andrei", "5220524295444");
        Persoana persoana2 = new Persoana();

        persoana2.setCNP("5220524295444");
        persoana2.setNume("Andrei");
        assertEquals(persoana1.getCNP(), persoana2.getCNP());
        assertEquals(persoana1.getNume(), persoana2.getNume());
    }
}
