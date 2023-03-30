package simple_factory;

public class Asistent extends PersonalSpital {
    public Asistent(String nume) {
        super(nume);
    }

    @Override
    public void afisareDescriere() {
        System.out.println(super.getNume() + " este asistent.");
    }
}
