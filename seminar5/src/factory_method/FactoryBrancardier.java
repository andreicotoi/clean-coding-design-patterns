package factory_method;


public class FactoryBrancardier implements Factory {
    @Override
    public PersonalSpital createPersonal(String name) {
        return new Brancardier(name);
    }
}
