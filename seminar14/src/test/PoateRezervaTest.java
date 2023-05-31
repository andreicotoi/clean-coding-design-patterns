package test;

import dubluri.StubPersoanaMajora;
import dubluri.StubPersoanaMinora;
import model.PachetTuristic;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

import static org.junit.jupiter.api.Assertions.*;

public class PoateRezervaTest {
    @Test
    void MinorRezervareTest() {
        StubPersoanaMinora stubPersoana = new StubPersoanaMinora();
        PachetTuristic pachetTuristic = new PachetTuristic(stubPersoana, "Bali", 150.0);
        assertFalse(pachetTuristic.poateRezerva());
    }

    @Test
    void MajorRezervareTest() {
        StubPersoanaMajora stubPersoana = new StubPersoanaMajora();
        PachetTuristic pachetTuristic = new PachetTuristic(stubPersoana, "Bali", 150.0);
        assertTrue(pachetTuristic.poateRezerva());
    }
}
