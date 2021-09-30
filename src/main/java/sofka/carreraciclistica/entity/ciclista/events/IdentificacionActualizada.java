package sofka.carreraciclistica.entity.ciclista.events;

import co.com.sofka.domain.generic.DomainEvent;
import sofka.carreraciclistica.entity.ciclista.values.Identificacion;

public class IdentificacionActualizada extends DomainEvent {
    public IdentificacionActualizada(Identificacion identificacion) {
        super();
    }
}
