package factory_method;

public class Medic extends PersonalSpital {
    public Medic(String nume) {
        super(nume);
    }

    @Override
    public void afisareDescriere() {
        System.out.println(super.getNume() + " este medic.");
    }
}
