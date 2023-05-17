package restaurant.adapter.bar;

public class SoftBar implements ISoftBar{
    private String denumire;

    public SoftBar(String denumire) {
        this.denumire = denumire;
    }

    @Override
    public void printezaNotaBauturi(double totalPlata) {
        System.out.println("Barul " + this.denumire + " a emis nota de " + totalPlata);
    }
}
