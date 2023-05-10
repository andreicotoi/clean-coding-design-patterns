package restaurant.state.clase;

public class StareOcupata implements IStare {
    @Override
    public void modificaStarea(Masa masa) {
        if (!(masa.getStare() instanceof StareOcupata)) {
           System.out.println("Masa nu era ocupata.");
            masa.setStare(this);
        } else {
            System.out.println("Masa era deja ocupata.");
        }
    }
}
