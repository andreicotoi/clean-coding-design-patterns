package restaurant.state.clase;

public class Masa {
    private int nr;
    private IStare stare;

    public Masa(int nr) {
        this.nr = nr;
        stare = new StareLibera();
    }

    protected void setStare(IStare stare) {
        this.stare = stare;
    }

    public int getNr() {
        return nr;
    }

    public IStare getStare() {
        return stare;
    }

    public void ocupareMasa() {
        IStare stare = new StareOcupata();
        stare.modificaStarea(this);
    }

    public void rezervaMasa() {
        IStare stare = new StareRezervata();
        stare.modificaStarea(this);
    }

    public void elibereazaMasa() {
        IStare stare = new StareLibera();
        stare.modificaStarea(this);
    }

    public void anuleazaRezervare() {
        IStare stare = new StareLibera();
        stare.modificaStarea(this);
    }
}
