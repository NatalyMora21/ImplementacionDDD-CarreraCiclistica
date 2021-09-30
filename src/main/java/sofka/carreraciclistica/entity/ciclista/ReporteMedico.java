package sofka.carreraciclistica.entity.ciclista;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.domain.generic.Identity;
import sofka.carreraciclistica.entity.ciclista.values.Continuidad;
import sofka.carreraciclistica.entity.ciclista.values.Descripcion;
import sofka.carreraciclistica.entity.ciclista.values.Diagnostico;
import sofka.carreraciclistica.entity.ciclista.values.ReporteId;

public class ReporteMedico extends Entity<ReporteId> {
    protected Descripcion descripcion;
    protected Diagnostico diagnostico;
    protected Continuidad continuidad;

    public ReporteMedico(ReporteId entityId, Descripcion descripcion, Diagnostico diagnostico, Continuidad continuidad) {
        super(entityId);
        this.descripcion = descripcion;
        this.diagnostico = diagnostico;
        this.continuidad = continuidad;
    }

    //Comportamientos

    public void actualizarDescripcion(Descripcion descripcion) {
        this.descripcion= descripcion;
    }
    public void actualizarDiagnostico(Diagnostico diagnostico) {
        this.diagnostico= diagnostico;
    }
    public void actualizarContinuidad(Continuidad continuidad) {
        this.continuidad= continuidad;
    }

    //Propiedades

    public Descripcion descripcion() {
        return descripcion;
    }
    public Diagnostico diagnostico() {
        return diagnostico;
    }
    public Continuidad continuidad() {
        return continuidad;
    }
}
