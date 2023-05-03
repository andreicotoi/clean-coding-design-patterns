package banca.composite.main;

import banca.composite.clase.Filiala;
import banca.composite.clase.SucursalaComposite;
import banca.composite.clase.UnitateBancara;

public class Main {
    public static void main(String[] args) {
        UnitateBancara sucursalaComposite1 = new SucursalaComposite("Sucursala1", 100);
        UnitateBancara sucursalaComposite2 = new SucursalaComposite("Sucursala2", 90);
        UnitateBancara agentie1 = new SucursalaComposite("Agentie1", 30);
        UnitateBancara agentie2 = new SucursalaComposite("Agentie2", 30);
        UnitateBancara filiala1 = new Filiala("Filiala1", 9);
        UnitateBancara filiala2 = new Filiala("Filiala2", 5);
        UnitateBancara filiala3 = new Filiala("Filiala3", 8);
        sucursalaComposite1.adaugaUnitate(sucursalaComposite2);
        sucursalaComposite1.adaugaUnitate(agentie1);
        sucursalaComposite1.adaugaUnitate(filiala1);
        sucursalaComposite2.adaugaUnitate(agentie2);
        sucursalaComposite2.adaugaUnitate(filiala2);
        agentie1.adaugaUnitate(filiala3);
        sucursalaComposite1.printDescriere("---");
    }
}