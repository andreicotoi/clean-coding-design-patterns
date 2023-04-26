package spital.decorator.clase;

public class RezultatOnline extends DecoratorAbstract {

    public RezultatOnline(Furnizarerezultat rezultatPeHartie) {
        super(rezultatPeHartie);
    }

    public void afisareRezultatOnline(String diagnostic) {
        System.out.println("Online: " + diagnostic);
    }
}
