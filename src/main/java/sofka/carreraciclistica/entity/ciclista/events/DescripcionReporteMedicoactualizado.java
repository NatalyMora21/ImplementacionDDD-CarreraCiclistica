package sofka.carreraciclistica.entity.ciclista.events;

import co.com.sofka.domain.generic.DomainEvent;
import sofka.carreraciclistica.entity.ciclista.values.Descripcion;
import sofka.carreraciclistica.entity.ciclista.values.ReporteId;

public class DescripcionReporteMedicoactualizado extends DomainEvent {

    private final ReporteId reporteIdentity;
    private final Descripcion descripcion;

    public DescripcionReporteMedicoactualizado(ReporteId reporteIdentity, Descripcion descripcion) {
        super("sofka.ciclista.descripcionReporteMedicoactualizado");
        this.reporteIdentity = reporteIdentity;
        this.descripcion = descripcion;
    }

    public ReporteId getReporteIdentity() {
        return reporteIdentity;
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }
}
