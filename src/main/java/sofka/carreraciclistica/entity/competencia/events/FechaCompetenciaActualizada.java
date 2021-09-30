package sofka.carreraciclistica.entity.competencia.events;

import co.com.sofka.domain.generic.DomainEvent;
import sofka.carreraciclistica.entity.competencia.values.FechaInicio;

public class FechaCompetenciaActualizada extends DomainEvent {

    private final FechaInicio fechaInicio;

    public FechaCompetenciaActualizada(FechaInicio fechaInicio) {
        super("sofka.competencia.fachaCompetenciaActualizada");
        this.fechaInicio = fechaInicio;
    }

    public FechaInicio getFechaInicio() {
        return fechaInicio;
    }
}
