package restaurant.adapter.main;

import restaurant.adapter.bar.SoftBar;
import restaurant.adapter.bar.iSoftBar;
import restaurant.adapter.bucatarie.AdapterRestaurant;
import restaurant.adapter.bucatarie.Bucatarie;
import restaurant.adapter.bucatarie.iSoftRestaurant;

public class Main {

    public static void imprimare(iSoftRestaurant restaurant, double suma) {
        restaurant.printeazaNota(suma);
    }

    public static void main(String[] args) {
        iSoftBar bar = new SoftBar("Alcadibo");
//        bar.printeazaNotaBauturi(240);

        iSoftRestaurant bucatarie = new Bucatarie("George");
//        bucatarie.printeazaNota(300);

//        Main.imprimare(bar, 300);
        Main.imprimare(bucatarie, 500);

        AdapterRestaurant adapterRestaurant = new AdapterRestaurant("Alcadibo");
        adapterRestaurant.printeazaNota(500);
    }
}