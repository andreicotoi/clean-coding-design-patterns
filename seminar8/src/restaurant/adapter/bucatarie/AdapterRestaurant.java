package restaurant.adapter.bucatarie;

import restaurant.adapter.bar.SoftBar;

public class AdapterRestaurant extends SoftBar implements ISoftBucatarie {
    public AdapterRestaurant(String denumire) {
        super(denumire);
    }

    @Override
    public void printeazaNota(double totalPlata) {
        super.printezaNotaBauturi(totalPlata);
    }
}
