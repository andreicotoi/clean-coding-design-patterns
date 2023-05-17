package transport.state.model;

public class Bus {
    private IBusState state;
    private String licensePlate;

    public Bus(String licensePlate) {
        this.licensePlate = licensePlate;
        this.state = new BusAtEndOfRoute();
    }

    public IBusState getState() {
        return state;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    protected void setState(IBusState state) {
        this.state = state;
    }

    public void leaveForRoute() {
        IBusState route = new BusInRoute();
        route.changeState(this);
    }

    public void goInService() {
        IBusState state = new BusInService()   ;
        state.changeState(this);
    }

    public void arriveAtTheEndOfRoute() {
        IBusState state = new BusAtEndOfRoute();
        state.changeState(this);
    }
}
