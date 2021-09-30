package sofka.carreraciclistica.entity.competencia.events;

import co.com.sofka.domain.generic.DomainEvent;
import sofka.carreraciclistica.entity.competencia.values.NombreCompetencia;

public class NombreActualizado extends DomainEvent {
    public NombreActualizado(NombreCompetencia nuevoNombre) {
        super();
    }
}
