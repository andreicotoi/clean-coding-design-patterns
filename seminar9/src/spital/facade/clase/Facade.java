package spital.facade.clase;

public class Facade {
    private Medic medic;
    private Salon salon;

    public Facade() {
        this.medic = new Medic();
        medic.adaugaPacient(new Pacient("Cotoi Andrei", 9));
        medic.adaugaPacient(new Pacient("Craciun Catalin", 0));
        medic.adaugaPacient(new Pacient("Stoica Valentin", 22));
        this.salon = new Salon();
        salon.adaugaPaturiLibere(232);
        salon.adaugaPaturiLibere(15);
        salon.adaugaPaturiLibere(12);
    }

    public void interneaza(String nume) {
        if (medic.verificaTrimitere(medic.getPacient(nume))) {
            if (salon.verificaPaturiLibere()) {
                if (medic.getPacient(nume).getGravitate() > 4) {
                    salon.ocupaPat();
                    System.out.println(nume + " a fost internat");
                } else {
                    System.out.println("Nu este grav");
                }
            } else {
                System.out.println("Nu exista paturi libere.");
            }
        } else {
            System.out.println("Pacientul nu are trimitere.");
        }
    }
}
