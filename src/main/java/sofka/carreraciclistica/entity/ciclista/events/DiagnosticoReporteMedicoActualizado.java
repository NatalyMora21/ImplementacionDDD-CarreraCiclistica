package sofka.carreraciclistica.entity.ciclista.events;

import co.com.sofka.domain.generic.DomainEvent;
import sofka.carreraciclistica.entity.ciclista.values.Diagnostico;
import sofka.carreraciclistica.entity.ciclista.values.ReporteId;

public class DiagnosticoReporteMedicoActualizado extends DomainEvent {

    private final ReporteId reporteIdentity;
    private final Diagnostico diagnostico;

    public DiagnosticoReporteMedicoActualizado(ReporteId reporteIdentity, Diagnostico diagnostico) {
        super("sofka.ciclista.diagnosticoReporteMedicoActualizado");
        this.reporteIdentity = reporteIdentity;
        this.diagnostico = diagnostico;
    }

    public ReporteId getReporteIdentity() {
        return reporteIdentity;
    }

    public Diagnostico getDiagnostico() {
        return diagnostico;
    }
}
