package transport.state.model;

public class Main {
    public static void main(String[] args) {
        Bus bus = new Bus("GR99XMS");
        bus.goInService();
        bus.arriveAtTheEndOfRoute();
        bus.arriveAtTheEndOfRoute();
        bus.leaveForRoute();
        bus.goInService();
        bus.arriveAtTheEndOfRoute();
    }
}
