package transport.state.model;

public class BusInRoute implements IBusState{
    @Override
    public void changeState(Bus bus) {
        if(bus.getState() instanceof BusAtEndOfRoute) {
            System.out.println("Autobuzul " + bus.getLicensePlate() + " pleaca in cursa");
            bus.setState(this);
        } else {
            System.out.println("Autobuzul " + bus.getLicensePlate() + " nu a putut pleca in o cursa noua");
        }
    }
}
