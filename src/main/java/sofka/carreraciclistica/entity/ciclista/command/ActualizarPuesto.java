package sofka.carreraciclistica.entity.ciclista.command;

import co.com.sofka.domain.generic.Command;
import sofka.carreraciclistica.entity.ciclista.values.Puesto;

public class ActualizarPuesto extends Command {

    private final Puesto puesto;

    public ActualizarPuesto(Puesto puesto) {
        this.puesto = puesto;
    }

    public Puesto getPuesto() {
        return puesto;
    }
}
