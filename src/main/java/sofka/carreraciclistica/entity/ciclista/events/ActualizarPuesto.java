package sofka.carreraciclistica.entity.ciclista.events;

import co.com.sofka.domain.generic.DomainEvent;
import sofka.carreraciclistica.entity.ciclista.values.Puesto;

public class ActualizarPuesto extends DomainEvent {

    private final Puesto puesto;
    public ActualizarPuesto(Puesto puesto) {
        super("sofka.ciclista.actualizarPuesto");
        this.puesto=puesto;
    }

    public Puesto getPuesto() {
        return puesto;
    }
}
