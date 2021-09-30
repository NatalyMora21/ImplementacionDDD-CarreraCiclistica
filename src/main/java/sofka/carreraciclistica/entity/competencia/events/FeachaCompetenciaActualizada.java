package sofka.carreraciclistica.entity.competencia.events;

import co.com.sofka.domain.generic.DomainEvent;
import sofka.carreraciclistica.entity.competencia.values.FechaInicio;

public class FeachaCompetenciaActualizada extends DomainEvent {
    public FeachaCompetenciaActualizada(FechaInicio fechaInicio) {
        super();
    }
}
