package builder.model;

public class ContBancarBuilder implements IBuilder {
    private boolean primesteSalariu;
    private boolean cardAtasat;
    private String nume;
    private boolean internetBanking;

    public ContBancarBuilder() {
        this.primesteSalariu = false;
        this.cardAtasat = false;
        this.nume = "Anonim";
        this.internetBanking = false;
    }

    public ContBancarBuilder setPrimesteSalariu(boolean salariu) {
        this.primesteSalariu = salariu;
        return this;
    }

    public IBuilder setCardAtasat(boolean cardAtasat) {
        this.cardAtasat = cardAtasat;
        return this;
    }

    public IBuilder setNume(String nume) {
        this.nume = nume;
        return this;
    }

    public IBuilder setInternetBanking(boolean internetBanking) {
        this.internetBanking = internetBanking;
        return this;
    }

    public ContBancar build() {
        return new ContBancar(this.primesteSalariu, this.cardAtasat, this.nume, this.internetBanking);
    }
}
