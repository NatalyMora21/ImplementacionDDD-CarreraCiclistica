package sofka.carreraciclistica.entity.ciclista.events;

import co.com.sofka.domain.generic.DomainEvent;
import sofka.carreraciclistica.entity.ciclista.values.Continuidad;
import sofka.carreraciclistica.entity.ciclista.values.Descripcion;
import sofka.carreraciclistica.entity.ciclista.values.Diagnostico;
import sofka.carreraciclistica.entity.ciclista.values.ReporteId;

public class ReporteMedicoAgregado extends DomainEvent {

    private final ReporteId reporteIdentity;
    private final Descripcion descripcion;
    private final Diagnostico diagnostico;
    private final Continuidad continuidad;

    public ReporteMedicoAgregado(ReporteId reporteIdentity, Descripcion descripcion, Diagnostico diagnostico, Continuidad continuidad) {
        super("sofka.ciclista.reporteMedicoAgregado");
        this.reporteIdentity = reporteIdentity;
        this.descripcion = descripcion;
        this.diagnostico = diagnostico;
        this.continuidad = continuidad;
    }

    public ReporteId getReporteIdentity() {
        return reporteIdentity;
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }

    public Diagnostico getDiagnostico() {
        return diagnostico;
    }

    public Continuidad getContinuidad() {
        return continuidad;
    }
}
