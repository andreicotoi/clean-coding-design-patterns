package transport.strategy.main;

import transport.strategy.model.Calator;
import transport.strategy.model.PlataCardBancar;
import transport.strategy.model.PlataCardCalatorii;
import transport.strategy.model.PlataPrinSms;

public class Main {
    public static void main(String[] args) {
        Calator calator = new Calator("Kraken");
        calator.platesteBilet(40);
        calator.setMetodaPlata(new PlataPrinSms());
        calator.platesteBilet(25);
        calator.setMetodaPlata(new PlataCardBancar());
        calator.platesteBilet(14);
        calator.setMetodaPlata(new PlataCardCalatorii());
        calator.platesteBilet(33);
    }
}
