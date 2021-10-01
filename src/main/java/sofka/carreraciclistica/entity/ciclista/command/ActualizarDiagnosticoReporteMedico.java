package sofka.carreraciclistica.entity.ciclista.command;

import co.com.sofka.domain.generic.Command;
import sofka.carreraciclistica.entity.ciclista.values.Diagnostico;
import sofka.carreraciclistica.entity.ciclista.values.ReporteId;

public class ActualizarDiagnosticoReporteMedico extends Command {

    private final ReporteId reporteIdentity;
    private final Diagnostico diagnostico;

    public ActualizarDiagnosticoReporteMedico(ReporteId reporteIdentity, Diagnostico diagnostico) {
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
