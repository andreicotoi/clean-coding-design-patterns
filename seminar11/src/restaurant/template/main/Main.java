package restaurant.template.main;

import restaurant.template.clase.IMasa;
import restaurant.template.clase.Masa;

public class Main {
    public static void main(String[] args) {
        IMasa masa = new Masa(1);
        masa.ocupaMasa();
    }
}
