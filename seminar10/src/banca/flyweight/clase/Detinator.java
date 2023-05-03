package banca.flyweight.clase;

public class Detinator implements IClientBanca {
    private String nume;
    private String nrTelefon;
    private String adresa;

    public Detinator(String nume, String nrTelefon, String adresa) {
        this.nume = nume;
        this.nrTelefon = nrTelefon;
        this.adresa = adresa;
    }

    public void descriere(Cont cont) {
        System.out.println(this.toString() + cont.toString());
    }
}
