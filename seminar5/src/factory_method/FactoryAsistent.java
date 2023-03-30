package factory_method;


public class FactoryAsistent implements Factory {
    @Override
    public PersonalSpital createPersonal(String name) {
        return new Asistent(name);
    }
}
