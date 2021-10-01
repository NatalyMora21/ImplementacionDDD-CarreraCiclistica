package sofka.carreraciclistica.entity.ciclista.command;

import co.com.sofka.domain.generic.Command;
import sofka.carreraciclistica.entity.ciclista.values.Continuidad;
import sofka.carreraciclistica.entity.ciclista.values.ReporteId;

public class ActualizarContinuidadReporteMedico extends Command {

    private final ReporteId reporteIdentity;
    private final Continuidad continuidad;

    public ActualizarContinuidadReporteMedico(ReporteId reporteIdentity, Continuidad continuidad) {
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
