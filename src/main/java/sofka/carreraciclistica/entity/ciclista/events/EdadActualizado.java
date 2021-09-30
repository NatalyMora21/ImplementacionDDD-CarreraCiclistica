package sofka.carreraciclistica.entity.ciclista.events;

import co.com.sofka.domain.generic.DomainEvent;
import sofka.carreraciclistica.entity.ciclista.values.Edad;

public class EdadActualizado extends DomainEvent {
    public EdadActualizado(Edad edad) {
        super();
    }
}
