package restaurant.observer.clase;

import java.util.ArrayList;
import java.util.List;

public class Restaurant implements IRestaurant {
    private String nume;
    private List<IClient> listaClienti;

    public Restaurant(String nume) {
        this.nume = nume;
        this.listaClienti = new ArrayList<>();
    }

    @Override
    public void abonareClient(IClient client) {
        listaClienti.add(client);
    }

    @Override
    public void dezabonareClient(IClient client) {
        listaClienti.remove(client);
    }

    @Override
    public void notificareClienti(String mesaj) {
        for(IClient client : this.listaClienti) {
            client.primesteNotificare(mesaj);
        }
    }

    public void introducereOfertaNoua() {
        notificareClienti("A fost introdusa o oferta noua.");
    }

    public void adaugaDiscount(int discount) {
        notificareClienti("A fost introdus un discount de " + discount + ".");
    }
}
