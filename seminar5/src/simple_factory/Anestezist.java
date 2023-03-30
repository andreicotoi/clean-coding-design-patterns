package simple_factory;

public class Anestezist extends PersonalSpital {
    private Integer aniVechime;

    public Anestezist(String nume, Integer aniVechime) {
        super(nume);
        this.aniVechime = aniVechime;
    }

    @Override
    public void afisareDescriere() {
        System.out.println(super.getNume() + " este anestezist si are o vechime de " + this.aniVechime);
    }
}
