package restaurant.template.clase;

public class Masa extends IMasa {

    public Masa(int numar) {
        super(numar);
    }

    @Override
    protected void curataMasa() {
        System.out.println("Am curatat masa cu numarul " + super.getNumar());
    }

    @Override
    protected void aseazaServetele() {
        System.out.println("Am asezat servetele pentru masa cu numarul " + super.getNumar());
    }

    @Override
    protected void aseazaTacamuri() {
        System.out.println("Am asezat tacamurile pentru masa cu numarul " + super.getNumar());
    }

    @Override
    protected void invitaPersoane() {
        System.out.println("Am invitat persoanele pentru masa cu numarul " + super.getNumar());
    }
}
