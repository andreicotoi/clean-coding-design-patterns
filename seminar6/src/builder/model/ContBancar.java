package builder.model;

public class ContBancar {
    private boolean primesteSalariu;
    private boolean cardAtasat;
    private String nume;
    private boolean internetBanking;

    protected ContBancar(boolean salariu, boolean cardAtasat, String nume, boolean internetBanking) {
        this.primesteSalariu = salariu;
        this.cardAtasat = cardAtasat;
        this.nume = nume;
        this.internetBanking = internetBanking;
    }

    protected void setPrimesteSalariu(boolean salariu) {
        this.primesteSalariu = salariu;
    }

    protected void setCardAtasat(boolean cardAtasat) {
        this.cardAtasat = cardAtasat;
    }

    protected void setNume(String nume) {
        this.nume = nume;
    }

    protected void setInternetBanking(boolean internetBanking) {
        this.internetBanking = internetBanking;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("ContBancar{");
        sb.append("salariu=").append(primesteSalariu);
        sb.append(", cardAtasat=").append(cardAtasat);
        sb.append(", nume='").append(nume).append('\'');
        sb.append(", internetBanking=").append(internetBanking);
        sb.append('}');
        return sb.toString();
    }
}
