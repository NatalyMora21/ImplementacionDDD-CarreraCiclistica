package sofka.carreraciclistica.entity.ciclista.events;

import co.com.sofka.domain.generic.DomainEvent;
import sofka.carreraciclistica.entity.ciclista.values.Continuidad;
import sofka.carreraciclistica.entity.ciclista.values.Descripcion;
import sofka.carreraciclistica.entity.ciclista.values.Diagnostico;
import sofka.carreraciclistica.entity.ciclista.values.ReporteId;

public class ReporteMedicoAgregado extends DomainEvent {
    public ReporteMedicoAgregado(ReporteId reporteIdentity, Descripcion descripcion, Diagnostico diagnostico, Continuidad continuidad) {
        super();
    }
}
