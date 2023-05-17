package transport.command.model;

public class CommandPlecareCursa implements ICommand {
    private int numarLinie;
    private Automobil automobil;

    public CommandPlecareCursa(int numarLinie, Automobil automobil) {
        this.numarLinie = numarLinie;
        this.automobil = automobil;
    }

    @Override
    public void execute() {
        automobil.plecareInCursa(this.numarLinie);
    }
}
