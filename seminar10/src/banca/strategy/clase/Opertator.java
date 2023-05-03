package banca.strategy.clase;

public class Opertator {
    private IModVerificare modVerificare;

    public Opertator() {
        this.modVerificare = new VerificarePersoanaFizica();
    }

    public void setModVerificare(IModVerificare modVerificare) {
        this.modVerificare = modVerificare;
    }

    public void verificaClient() {
        modVerificare.verifica();
    }
}
