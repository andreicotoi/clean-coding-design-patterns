package banca.flyweight.clase;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    private Map<String, IClientBanca> mapCont;

    public FlyweightFactory() {
        this.mapCont = new HashMap<>();
    }

    public IClientBanca getDetinator(String nume, String nrTelefon, String adresa) {
        if (!mapCont.containsKey(nume)) {
            IClientBanca clientBanca = new Detinator(nume, nrTelefon, adresa);
            mapCont.put(nume, clientBanca);
            return clientBanca;
        }
        return mapCont.get(nume);
    }
}
