package simple_factory;

public class Brancardier extends PersonalSpital {

    public Brancardier(String nume) {
        super(nume);
    }

    @Override
    public void afisareDescriere() {
        System.out.println(super.getNume() + " este brancardier.");
    }
}
