package spital.decorator.clase;

public class RezultatPeHartie implements Furnizarerezultat {
    @Override
    public void afisareRezultatPeHartie(String diagnostic) {
        System.out.println("Hartie: " + diagnostic);
    }
}
