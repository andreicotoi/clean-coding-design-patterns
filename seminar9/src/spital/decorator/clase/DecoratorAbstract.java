package spital.decorator.clase;

public abstract class DecoratorAbstract implements Furnizarerezultat {
    private Furnizarerezultat rezultatPeHartie;

    public DecoratorAbstract(Furnizarerezultat rezultatPeHartie) {
        this.rezultatPeHartie = rezultatPeHartie;
    }

    @Override
    public void afisareRezultatPeHartie(String diagnostic) {
        rezultatPeHartie.afisareRezultatPeHartie(diagnostic);
    }

    public void afisareRezultatOnline(String diagnostic) {}

}
