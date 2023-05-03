package banca.strategy.main;

import banca.flyweight.clase.Cont;
import banca.flyweight.clase.FlyweightFactory;
import banca.strategy.clase.Opertator;
import banca.strategy.clase.VerificarePersoanaJuridica;

public class Main {
    public static void main(String[] args) {
        Opertator opertator = new Opertator();
        opertator.verificaClient();
        opertator.setModVerificare(new VerificarePersoanaJuridica());
        opertator.verificaClient();
    }
}