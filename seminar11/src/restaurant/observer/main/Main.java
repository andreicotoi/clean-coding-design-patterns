package restaurant.observer.main;

import restaurant.observer.clase.Client;
import restaurant.observer.clase.IClient;
import restaurant.observer.clase.Restaurant;

public class Main {
    public static void main(String[] args) {
        IClient client1 = new Client("Alin");
        IClient client2 = new Client("Mihai");
        IClient client3 = new Client("Marius");

        Restaurant restaurant = new Restaurant("Tratoria Monza");
        restaurant.abonareClient(client1);

        restaurant.notificareClienti("salut!");

        restaurant.dezabonareClient(client1);
        restaurant.abonareClient(client2);
        restaurant.abonareClient(client3);

        restaurant.introducereOfertaNoua();

        restaurant.adaugaDiscount(25);
    }
}