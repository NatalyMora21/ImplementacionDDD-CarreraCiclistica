package sofka.carreraciclistica.entity.ciclista.events;

import co.com.sofka.domain.generic.DomainEvent;
import sofka.carreraciclistica.entity.ciclista.values.Nombre;

public class NombreCiclistaActualizado extends DomainEvent {
    public NombreCiclistaActualizado(Nombre nombre) {
        super();
    }
}
