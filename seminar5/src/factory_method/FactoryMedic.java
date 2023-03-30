package factory_method;

public class FactoryMedic implements Factory{
    @Override
    public PersonalSpital createPersonal(String name) {
        return new Medic(name);
    }
}
