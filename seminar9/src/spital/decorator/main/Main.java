package spital.decorator.main;

import spital.decorator.clase.DecoratorAbstract;
import spital.decorator.clase.Furnizarerezultat;
import spital.decorator.clase.RezultatOnline;
import spital.decorator.clase.RezultatPeHartie;

public class Main {
    public static void main(String[] args) {
        Furnizarerezultat rezultatPeHartie = new RezultatPeHartie();
        rezultatPeHartie.afisareRezultatPeHartie("Raceala");

        DecoratorAbstract decoratorAbstract = new RezultatOnline(rezultatPeHartie);
        decoratorAbstract.afisareRezultatOnline("Raceala");
        decoratorAbstract.afisareRezultatPeHartie("Gripa");
    }
}