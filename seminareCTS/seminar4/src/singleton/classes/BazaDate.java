package singleton.classes;

public class BazaDate {
    private int dimensiuneDate;
    private int numarTabele;
    private String denumire;
    private static BazaDate instanta = new BazaDate(100, 2, "myDatabase");

    private BazaDate() {
    }

    public void setDimensiuneDate(int dimensiuneDate) {
        this.dimensiuneDate = dimensiuneDate;
    }

    private BazaDate(int dimensiuneDate, int numarTabele, String denumire) {
        this.dimensiuneDate = dimensiuneDate;
        this.numarTabele = numarTabele;
        this.denumire = denumire;
    }

    public static BazaDate getInstanta() {
        return instanta;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("BazaDate{");
        sb.append("dimensiuneDate=").append(dimensiuneDate);
        sb.append(", numarTabele=").append(numarTabele);
        sb.append(", denumire='").append(denumire).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
