package test;

import dubluri.FakePersoana;
import dubluri.StubPersoanaMajora;
import dubluri.StubPersoanaMinora;
import model.PachetTuristic;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

import static org.junit.jupiter.api.Assertions.*;

public class AplicaDiscountTest {
    @Tag("tag1")
    @Test
    void NuSeAplicaDiscountTest() {
        FakePersoana fakePersoana = new FakePersoana();
        fakePersoana.setGetVarstaValue(6);
        PachetTuristic pachetTuristic = new PachetTuristic(fakePersoana, "Bali", 150.0);
        pachetTuristic.aplicaDiscountVarstnici(10);
        assertEquals(150, pachetTuristic.getPret());
    }

    @Tag("tag2")
    @Test
    void SeAplicaDiscountTest() {
        FakePersoana fakePersoana = new FakePersoana();
        fakePersoana.setGetVarstaValue(80);
        PachetTuristic pachetTuristic = new PachetTuristic(fakePersoana, "Bali", 150.0);
        pachetTuristic.aplicaDiscountVarstnici(10);
        assertEquals(135.0, pachetTuristic.getPret());
    }
}
