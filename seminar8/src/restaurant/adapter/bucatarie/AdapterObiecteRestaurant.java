package restaurant.adapter.bucatarie;

import restaurant.adapter.bar.ISoftBar;
import restaurant.adapter.bar.SoftBar;

public class AdapterObiecteRestaurant implements ISoftBucatarie {
    private ISoftBar softBar;

    public AdapterObiecteRestaurant(ISoftBar softBar) {
        this.softBar = softBar;
    }

    @Override
    public void printeazaNota(double totalPlata) {
        this.softBar.printezaNotaBauturi(totalPlata);
    }
}
