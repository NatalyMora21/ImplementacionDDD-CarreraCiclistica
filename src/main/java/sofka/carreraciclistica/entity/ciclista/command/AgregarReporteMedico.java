package sofka.carreraciclistica.entity.ciclista.command;

import co.com.sofka.domain.generic.Command;
import sofka.carreraciclistica.entity.ciclista.values.Continuidad;
import sofka.carreraciclistica.entity.ciclista.values.Descripcion;
import sofka.carreraciclistica.entity.ciclista.values.Diagnostico;

public class AgregarReporteMedico extends Command {

    private final Descripcion descripcion;
    private final Diagnostico diagnostico;
    private final Continuidad continuidad;

    public AgregarReporteMedico(Descripcion descripcion, Diagnostico diagnostico, Continuidad continuidad) {
        this.descripcion = descripcion;
        this.diagnostico = diagnostico;
        this.continuidad = continuidad;
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }
}
