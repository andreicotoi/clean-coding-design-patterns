package restaurant.adapter.bucatarie;

public class Bucatarie implements ISoftBucatarie {
    private String numeBucatar;

    public Bucatarie(String numeBucatar) {
        this.numeBucatar = numeBucatar;
    }

    @Override
    public void printeazaNota(double totalPlata) {
        System.out.println("Bucatarul " + this.numeBucatar);
        System.out.println("Nota dvs. este in valoare de " + totalPlata);
    }
}
