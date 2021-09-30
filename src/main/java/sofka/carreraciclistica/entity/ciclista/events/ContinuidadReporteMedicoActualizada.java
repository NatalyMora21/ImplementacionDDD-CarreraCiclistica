package sofka.carreraciclistica.entity.ciclista.events;

import co.com.sofka.domain.generic.DomainEvent;
import sofka.carreraciclistica.entity.ciclista.values.Continuidad;
import sofka.carreraciclistica.entity.ciclista.values.ReporteId;

public class ContinuidadReporteMedicoActualizada extends DomainEvent {
    public ContinuidadReporteMedicoActualizada(ReporteId reporteIdentity, Continuidad continuidad) {
        super();
    }
}
