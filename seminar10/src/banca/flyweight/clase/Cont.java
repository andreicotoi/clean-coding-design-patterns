package banca.flyweight.clase;

public class Cont {
    private float suma;
    private int nrCont;

    public Cont(float suma, int nrCont) {
        this.suma = suma;
        this.nrCont = nrCont;
    }

    @Override
    public String toString() {
        return "Cont{" +
                "suma=" + suma +
                ", nrCont=" + nrCont +
                '}';
    }
}
