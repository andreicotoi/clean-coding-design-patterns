package test;

import model.IPersoana;
import model.Persoana;
import org.junit.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

class PersoanaTest {

    @org.junit.jupiter.api.Test
    void getVarstaTestRight() {
        IPersoana persoana = new Persoana("Andrei", "5010218341131");
        assertEquals(22, persoana.getVarsta());
    }

    @org.junit.jupiter.api.Test
    void getVarstaTestBounderyLimitaSuperioara() {
        IPersoana persoana = new Persoana("Andrei", "5230524341131");
        assertEquals(0, persoana.getVarsta());
    }

    @org.junit.jupiter.api.Test
    void getVarstaTestBounderyLimitaInferioara() {
        IPersoana persoana = new Persoana("Andrei", "5000100349832");
        assertEquals(23, persoana.getVarsta());
    }

    @org.junit.jupiter.api.Test
    void getVarstaTestErrorCondition() {
        IPersoana persoana = new Persoana("Andrei", "5270202237712");
        assertThrows(ExceptieNenascut.class, () -> {
            persoana.getVarsta();
        });
    }

    @org.junit.jupiter.api.Test
    void getVarstaTestPerformance() {
        IPersoana persoana = new Persoana("Andrei", "5230524341131");
        assertTimeout(Duration.ofMillis(100), () -> {
            persoana.getVarsta();
        });
    }

    @org.junit.jupiter.api.Test
    void cnpCheckerConformance() {
        Persoana persoana = new Persoana("Andrei", "5230524341131");
        assertEquals(13, persoana.CNP.length());
    }

    @org.junit.jupiter.api.Test
    void ordineVarstaPersoane() {
        Persoana persoana1 = new Persoana("Andrei", "5010100349832");
        Persoana persoana2 = new Persoana("Cotoi", "5000100349832");
        assertTrue(persoana1.getVarsta() < persoana2.getVarsta());
    }

    @org.junit.jupiter.api.Test
    void getVarstaShouldThrowExceptionCNPNull() {
        Persoana persoana1 = new Persoana("Andrei", null);
        assertThrows(ExceptieCNPNull.class, () -> {
            persoana1.getVarsta();
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