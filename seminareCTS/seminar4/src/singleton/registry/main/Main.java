package singleton.registry.main;

import singleton.registry.InstitutiePublica;

public class Main {
    public static void main(String[] args) {
        InstitutiePublica institutiePublica = InstitutiePublica.getInstitutieOptimizare("Politie");
        InstitutiePublica institutiePublica2 = InstitutiePublica.getInstitutieOptimizare("Pompieri");
        InstitutiePublica institutiePublica3 = InstitutiePublica.getInstitutieOptimizare("Politie");

        institutiePublica.setNumarAngajati(10);
        institutiePublica3.setNumarAngajati(20);
        institutiePublica2.setNumarAngajati(5);

        System.out.println(institutiePublica);
        System.out.println(institutiePublica2);
        System.out.println(institutiePublica3);
    }
}
