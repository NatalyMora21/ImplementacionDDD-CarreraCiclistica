package sofka.carreraciclistica.entity.ciclista.events;

import co.com.sofka.domain.generic.DomainEvent;
import sofka.carreraciclistica.entity.ciclista.values.Puesto;

public class ActualizarPuesto extends DomainEvent {
    public ActualizarPuesto(Puesto puesto) {
        super();
    }
}
