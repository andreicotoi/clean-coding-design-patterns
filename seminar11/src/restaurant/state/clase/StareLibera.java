package restaurant.state.clase;

public class StareLibera implements IStare {
    @Override
    public void modificaStarea(Masa masa) {
        if (!(masa.getStare() instanceof StareLibera)) {
            System.out.println("Masa nu era libera.");
            masa.setStare(this);
        } else {
            System.out.println("Masa era deja libera.");
        }
    }
}
