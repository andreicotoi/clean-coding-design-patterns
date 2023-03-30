package builder.main;

import builder.model.ContBancar;
import builder.model.ContBancarBuilder;
import builder.model.ContBuilder;
import builder.model.IBuilder;

public class Main {
    public static void main(String[] args) {
        IBuilder contBuilder = new ContBuilder();
        ContBancar contBancar = contBuilder.setNume("Andreea").setCardAtasat(true).build();
        System.out.println(contBancar);

        ContBancar contBancar2 = contBuilder.setNume("Maria").setCardAtasat(true).build();
        System.out.println(contBancar);
        System.out.println(contBancar2);

        IBuilder contBancarBuilder = new ContBancarBuilder();
        ContBancar contBancar3 = contBancarBuilder.setInternetBanking(true).setNume("Carmen").build();
        ContBancar contBancar4 = contBancarBuilder.setCardAtasat(true).setNume("Mircea").build();
        //ramane internet banking de mai devreme
        System.out.println(contBancar3);
        System.out.println(contBancar4);
    }
}
