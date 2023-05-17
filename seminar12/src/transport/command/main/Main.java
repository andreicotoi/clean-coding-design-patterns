package transport.command.main;

import transport.command.model.Autobuz;
import transport.command.model.Automobil;
import transport.command.model.CommandPlecareCursa;
import transport.command.model.ManagerComenzi;

public class Main {
    public static void main(String[] args) {
        ManagerComenzi managerComenzi = new ManagerComenzi();

        Automobil autobuz = new Autobuz(13);

        managerComenzi.invocaComanda(new CommandPlecareCursa(10, new Autobuz(1)));
        managerComenzi.invocaComanda(new CommandPlecareCursa(11, autobuz));
        managerComenzi.invocaComanda(new CommandPlecareCursa(12, new Autobuz(3)));
        managerComenzi.invocaComanda(new CommandPlecareCursa(11, autobuz));

        managerComenzi.executaComanda();
        managerComenzi.executaComanda();
        managerComenzi.invocaComanda(new CommandPlecareCursa(10, new Autobuz(23)));
        managerComenzi.executaComanda();
        managerComenzi.executaComanda();
        managerComenzi.executaComanda();
    }
}
