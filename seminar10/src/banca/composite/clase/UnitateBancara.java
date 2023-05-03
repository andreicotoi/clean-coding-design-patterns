package banca.composite.clase;

public interface UnitateBancara {
    void adaugaUnitate(UnitateBancara unitateBancara);
    void stergeUnitate(UnitateBancara unitateBancara);
    void getUnitate(int index);
    void printDescriere(String indentare);
}
