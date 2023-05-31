package dubluri;

import model.IPersoana;

public class FakePersoana implements IPersoana {

    private int getVarstaValue;
    private boolean checkCNPValue;

    @Override
    public String getSex() {
        return null;
    }

    @Override
    public int getVarsta() {
        return getVarstaValue;
    }

    public void setGetVarstaValue(int getVarstaValue) {
        this.getVarstaValue = getVarstaValue;
    }

    @Override
    public boolean checkCNP() {
        return checkCNPValue;
    }

    public void setCheckCNPValue(boolean checkCNPValue) {
        this.checkCNPValue = checkCNPValue;
    }
}
