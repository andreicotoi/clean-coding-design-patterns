package restaurant.template.clase;

public abstract class IMasa {
    private int numar;

    public IMasa(int numar) {
        this.numar = numar;
    }

    // sa nu avem posibilitatea sa fie apelate in alta ordine
    protected abstract void curataMasa();

    protected abstract void aseazaServetele();

    protected abstract void aseazaTacamuri();

    protected abstract void invitaPersoane();

    public final void ocupaMasa() {
        curataMasa();
        aseazaServetele();
        aseazaTacamuri();
        invitaPersoane();
    }

    public int getNumar() {
        return numar;
    }
}
