package sofka.carreraciclistica.entity.competencia.events;

import co.com.sofka.domain.generic.DomainEvent;
import sofka.carreraciclistica.entity.competencia.values.JuezId;
import sofka.carreraciclistica.entity.competencia.values.Nombre;

public class NombreJuezActualizado extends DomainEvent {
    public NombreJuezActualizado(JuezId juezIdentity, Nombre nombre) {
        super();
    }
}
