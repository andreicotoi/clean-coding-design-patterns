package singleton.registry;

import java.util.HashMap;
import java.util.Map;

public class InstitutiePublica {
    private String denumire;
    private int numarAngajati;

    private static Map<String, InstitutiePublica> registruInstitutii = new HashMap<>();

    private InstitutiePublica(String denumire, int numarAngajati) {
        this.denumire = denumire;
        this.numarAngajati = numarAngajati;
    }

    public void setNumarAngajati(int numarAngajati) {
        this.numarAngajati = numarAngajati;
    }

    public synchronized static InstitutiePublica getInstitutie(String denumire) {
        if (InstitutiePublica.registruInstitutii.containsKey(denumire)) {
            return InstitutiePublica.registruInstitutii.get(denumire);
        } else {
            InstitutiePublica institutiePublica = new InstitutiePublica(denumire, 0);
            InstitutiePublica.registruInstitutii.put(denumire, institutiePublica);
            return institutiePublica;
        }
    }

    public synchronized static InstitutiePublica getInstitutieOptimizare(String denumire) {
        if (!InstitutiePublica.registruInstitutii.containsKey(denumire)) {
            InstitutiePublica.registruInstitutii.put(denumire, new InstitutiePublica(denumire, 0));
        }
        return InstitutiePublica.registruInstitutii.get(denumire);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("InstitutiePublica{");
        sb.append("denumire='").append(denumire).append('\'');
        sb.append(", numarAngajati=").append(numarAngajati);
        sb.append('}');
        return sb.toString();
    }
}
