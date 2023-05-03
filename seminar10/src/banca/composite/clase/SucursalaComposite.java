package banca.composite.clase;

import java.util.ArrayList;
import java.util.List;

public class SucursalaComposite implements UnitateBancara {
    private String nume;
    private int nrAngajati;
    private List<UnitateBancara> listaUnitati;

    public SucursalaComposite(String nume, int nrAngajati) {
        this.nume = nume;
        this.nrAngajati = nrAngajati;
        this.listaUnitati = new ArrayList<>();
    }

    @Override
    public void adaugaUnitate(UnitateBancara unitateBancara) {
        listaUnitati.add(unitateBancara);
    }

    @Override
    public void stergeUnitate(UnitateBancara unitateBancara) {
        listaUnitati.remove(unitateBancara);
    }

    @Override
    public void getUnitate(int index) {
        listaUnitati.get(index);
    }

    @Override
    public void printDescriere(String indentare) {
        System.out.println(indentare + this.nume + " are " + this.nrAngajati + " angajati.");
        for (UnitateBancara unitateBancara : listaUnitati) {
            unitateBancara.printDescriere("---" + indentare);
        }
    }
}
