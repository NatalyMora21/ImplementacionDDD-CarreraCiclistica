package sofka.carreraciclistica.entity.ciclista.events;

import co.com.sofka.domain.generic.DomainEvent;
import sofka.carreraciclistica.entity.ciclista.values.Diagnostico;
import sofka.carreraciclistica.entity.ciclista.values.ReporteId;

public class DiagnosticoReporteMedicoActualizado extends DomainEvent {
    public DiagnosticoReporteMedicoActualizado(ReporteId reporteIdentity, Diagnostico diagnostico) {
        super();
    }
}
