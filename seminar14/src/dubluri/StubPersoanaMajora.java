package dubluri;

import model.IPersoana;

public class StubPersoanaMajora implements IPersoana {
    @Override
    public String getSex() {
        return "M";
    }

    @Override
    public int getVarsta() {
        return 18;
    }

    @Override
    public boolean checkCNP() {
        return true;
    }
}
