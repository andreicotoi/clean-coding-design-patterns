package builder.model;

public class ContBuilder implements IBuilder {
    private ContBancar contBancar;

    public ContBuilder() {
        this.contBancar = new ContBancar(false, false, "Anonim", false);
    }

    public IBuilder setPrimesteSalariu(boolean salariu) {
        this.contBancar.setPrimesteSalariu(salariu);
        return this;
    }

    public IBuilder setCardAtasat(boolean cardAtasat) {
        this.contBancar.setCardAtasat(cardAtasat);
        return this;

    }

    public IBuilder setNume(String nume) {
        this.contBancar.setNume(nume);
        return this;

    }

    public IBuilder setInternetBanking(boolean internetBanking) {
        this.contBancar.setInternetBanking(internetBanking);
        return this;
    }

    @Override
    public ContBancar build() {
        return contBancar;
    }
}
