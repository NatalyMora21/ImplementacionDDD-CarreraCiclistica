package sofka.carreraciclistica.entity.ciclista.events;

import co.com.sofka.domain.generic.DomainEvent;
import sofka.carreraciclistica.entity.ciclista.values.Estado;

public class EstadoActualizado extends DomainEvent {
    public EstadoActualizado(Estado estado) {
        super();
    }
}
