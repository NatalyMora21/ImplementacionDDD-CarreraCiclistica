package sofka.carreraciclistica.entity.ciclista.events;

import co.com.sofka.domain.generic.DomainEvent;
import sofka.carreraciclistica.entity.ciclista.values.Continuidad;
import sofka.carreraciclistica.entity.ciclista.values.ReporteId;

public class ContinuidadReporteMedicoActualizada extends DomainEvent {

    private final ReporteId reporteIdentity;
    private final Continuidad continuidad;

    public ContinuidadReporteMedicoActualizada(ReporteId reporteIdentity, Continuidad continuidad) {
        super("sofka.ciclista.continuidadReporteMedicoActualizada");
        this.reporteIdentity = reporteIdentity;
        this.continuidad = continuidad;
    }

    public ReporteId getReporteIdentity() {
        return reporteIdentity;
    }

    public Continuidad getContinuidad() {
        return continuidad;
    }
}
