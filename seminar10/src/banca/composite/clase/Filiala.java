package banca.composite.clase;

public class Filiala implements UnitateBancara {
    private String nume;
    private int nrAngajati;

    public Filiala(String nume, int nrAngajati) {
        this.nume = nume;
        this.nrAngajati = nrAngajati;
    }
    @Override
    public void adaugaUnitate(UnitateBancara unitateBancara) {
        throw new RuntimeException();
    }
    @Override
    public void stergeUnitate(UnitateBancara unitateBancara) {
        throw new RuntimeException();
    }
    @Override
    public void getUnitate(int index) {
        throw new RuntimeException();
    }
    @Override
    public void printDescriere(String indentare) {
       System.out.println(indentare + this.nume + " are " + this.nrAngajati + " angajati.");
    }
}
