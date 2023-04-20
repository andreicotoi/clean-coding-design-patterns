package restaurant.adapter.bucatarie;

import restaurant.adapter.bar.SoftBar;

public class AdapterRestaurant extends SoftBar implements iSoftRestaurant {
    public AdapterRestaurant(String denumire) {
        super(denumire);
    }

    @Override
    public void printeazaNota(double totalSuma) {
        super.printeazaNotaBauturi(totalSuma);
    }
}
