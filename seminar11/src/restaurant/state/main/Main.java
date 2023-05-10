package restaurant.state.main;

import restaurant.observer.clase.Client;
import restaurant.observer.clase.IClient;
import restaurant.observer.clase.Restaurant;
import restaurant.state.clase.Masa;

public class Main {
    public static void main(String[] args) {
        Masa masa = new Masa(1);

        masa.ocupareMasa();
        masa.ocupareMasa();

        masa.rezervaMasa();

        masa.elibereazaMasa();
    }
}