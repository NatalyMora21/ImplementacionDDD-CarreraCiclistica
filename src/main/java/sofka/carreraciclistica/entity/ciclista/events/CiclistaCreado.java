package sofka.carreraciclistica.entity.ciclista.events;

import co.com.sofka.domain.generic.DomainEvent;
import sofka.carreraciclistica.entity.ciclista.values.Edad;
import sofka.carreraciclistica.entity.ciclista.values.Identificacion;
import sofka.carreraciclistica.entity.ciclista.values.Nombre;

public class CiclistaCreado extends DomainEvent {
    public CiclistaCreado(Nombre nombre, Edad edad, Identificacion identificacion) {
        super();
    }
}
