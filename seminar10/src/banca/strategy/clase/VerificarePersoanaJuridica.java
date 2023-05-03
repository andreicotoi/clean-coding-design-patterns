package banca.strategy.clase;

public class VerificarePersoanaJuridica implements IModVerificare {

    @Override
    public void verifica() {
        System.out.println("E pers. juridica.");
    }
}
