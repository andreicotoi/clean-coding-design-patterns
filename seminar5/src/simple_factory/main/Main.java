package simple_factory.main;

import simple_factory.PersonalSpital;
import simple_factory.SimpleFactory;
import simple_factory.TipPersonal;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        SimpleFactory simpleFactory = new SimpleFactory();
        List<PersonalSpital> personalSpitalList = new ArrayList<>();

        PersonalSpital personalSpital = simpleFactory.createPersonal(TipPersonal.Medic, "Andrei");
        PersonalSpital personalSpital2 = simpleFactory.createPersonal(TipPersonal.Asistent, "Gigi");
        PersonalSpital personalSpital3 = simpleFactory.createPersonal(TipPersonal.Brancardier, "Valentin");
        PersonalSpital personalSpital4 = simpleFactory.createPersonal(TipPersonal.Brancardier, "Cosmin");
        PersonalSpital personalSpital5 = simpleFactory.createPersonal(TipPersonal.Anestezist, "Matei", 5);

        personalSpitalList.addAll(List.of(personalSpital, personalSpital2, personalSpital3, personalSpital4, personalSpital5));

        for (PersonalSpital ps : personalSpitalList) {
            ps.afisareDescriere();
        }
    }
}
