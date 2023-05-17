package transport.strategy.model;

public class PlataCardCalatorii implements TipPlata{
    public void plateste(double pretBilet) {
        System.out.println("Plata biletului in valoare de "+ pretBilet + " a fost efectuata cu cardul de calatorii");
    }
}
