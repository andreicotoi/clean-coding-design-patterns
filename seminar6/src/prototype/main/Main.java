package prototype.main;

import prototype.model.ContBancar;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> documente = new HashMap<>();
        documente.put("CI", 2);
        documente.put("Certificat nastere", 2);
        documente.put("Adeverinta munca", 6);


        ContBancar contBancar1 = new ContBancar("Andrei", documente, 10);
        ContBancar contBancarCopie = (ContBancar) contBancar1.cloneaza();

        System.out.println(contBancar1);
        System.out.println(contBancarCopie);
        System.out.println(contBancar1 == contBancarCopie);
    }
}
