package factory_method.main;

import factory_method.FactoryBrancardier;
import factory_method.FactoryMedic;
import factory_method.PersonalSpital;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        FactoryMedic factoryMedic = new FactoryMedic();
        FactoryBrancardier factoryBrancardier = new FactoryBrancardier();

        List<PersonalSpital> list = new ArrayList<>();
        list.add(factoryMedic.createPersonal("Matei"));
        list.add(factoryBrancardier.createPersonal("Mircea"));

        for (PersonalSpital ps : list) {
            ps.afisareDescriere();
        }
    }
}
