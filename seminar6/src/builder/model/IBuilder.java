package builder.model;

public interface IBuilder {
    public ContBancar build();

    public IBuilder setPrimesteSalariu(boolean salariu) ;

    public IBuilder setCardAtasat(boolean cardAtasat);
    public IBuilder setNume(String nume);

    public IBuilder setInternetBanking(boolean internetBanking);
}
