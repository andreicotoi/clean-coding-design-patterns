package singleton.classes;

public class Secretariat {
    private int numarBirou;
    private int numarAngajati;
    private static Secretariat instanta = null ;

    private Secretariat(int numarBirou, int numarAngajati) {
        this.numarBirou = numarBirou;
        this.numarAngajati = numarAngajati;
    }

    public synchronized static Secretariat getInstanta(int numarBirou, int numarAngajati) {
        if (instanta == null) {
            Secretariat.instanta = new Secretariat(numarBirou, numarAngajati);
        }
        return Secretariat.instanta;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Secretariat{");
        sb.append("numarBirou=").append(numarBirou);
        sb.append(", numarAngajati=").append(numarAngajati);
        sb.append('}');
        return sb.toString();
    }
}
