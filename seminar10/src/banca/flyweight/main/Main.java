package banca.flyweight.main;

import banca.composite.clase.Filiala;
import banca.composite.clase.SucursalaComposite;
import banca.composite.clase.UnitateBancara;
import banca.flyweight.clase.Cont;
import banca.flyweight.clase.Detinator;
import banca.flyweight.clase.FlyweightFactory;
import banca.flyweight.clase.IClientBanca;

public class Main {
    public static void main(String[] args) {
        FlyweightFactory fabrica = new FlyweightFactory();
        Cont cont1 = new Cont(2300f, 12);
        Cont cont2 = new Cont(1500f, 13);
        Cont cont3 = new Cont(1000f, 10);

        fabrica.getDetinator("Ion", "0700000000", "Bucuresti").descriere(cont1);
        fabrica.getDetinator("Alin", "07111111111", "Ploiesti").descriere(cont2);
        fabrica.getDetinator("Alin", "07111111111", "Ploiesti");
    }
}