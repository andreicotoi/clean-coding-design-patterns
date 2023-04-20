package restaurant.adapter.bar;

public class SoftBar implements iSoftBar {
    private String denumire;

    public SoftBar(String denumire) {
        this.denumire = denumire;
    }

    public void printeazaNotaBauturi(double totalSuma) {
        System.out.println("Barul " + this.denumire +
                " a emis nota aferenta bauturilor consumate in valoare de " + totalSuma);
    }
}
