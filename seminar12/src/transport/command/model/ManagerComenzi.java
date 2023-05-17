package transport.command.model;

import java.util.ArrayList;
import java.util.List;

public class ManagerComenzi {
    private List<ICommand> comenzi = new ArrayList<>();

    public void invocaComanda(ICommand command) {
        comenzi.add(command);
    }

    public void executaComanda() {
        if (this.comenzi.size() != 0) {
            this.comenzi.get(0).execute();
            this.comenzi.remove(this.comenzi.get(0));
        }
    }
}
