package restaurant.proxy.clase;

public class ProxyRestaurant implements IRestaurant {
    private IRestaurant restaurant;

    public ProxyRestaurant(IRestaurant restaurant) {
        this.restaurant = restaurant;
    }

    @Override
    public void rezervaMasa(int numarPersoane) {
        if (numarPersoane >= 4) {
            this.restaurant.rezervaMasa(4);
        } else {
            System.out.println("Rezervarea nu a putut fi facuta");
        }
    }
}
