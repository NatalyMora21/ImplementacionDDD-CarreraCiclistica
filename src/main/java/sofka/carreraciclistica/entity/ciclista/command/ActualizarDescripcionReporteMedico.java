package sofka.carreraciclistica.entity.ciclista.command;

import co.com.sofka.domain.generic.Command;
import sofka.carreraciclistica.entity.ciclista.values.Descripcion;
import sofka.carreraciclistica.entity.ciclista.values.ReporteId;

public class ActualizarDescripcionReporteMedico extends Command {
    private final ReporteId reporteIdentity;
    private final Descripcion descripcion;

    public ActualizarDescripcionReporteMedico(ReporteId reporteIdentity, Descripcion descripcion) {
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
