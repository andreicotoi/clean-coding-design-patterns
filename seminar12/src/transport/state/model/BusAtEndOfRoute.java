package transport.state.model;

public class BusAtEndOfRoute implements IBusState {
    @Override
    public void changeState(Bus bus) {
        if (!(bus.getState() instanceof BusAtEndOfRoute)) {
            System.out.println("Autobuzul " + bus.getLicensePlate() + " a ajuns la final de linie");
            bus.setState(this);
        } else {
            System.out.println("Autobuzul " + bus.getLicensePlate() + " nu a putut ajunge la finalul liniei");
        }
    }
}
