package sofka.carreraciclistica.entity.ciclista.events;

import co.com.sofka.domain.generic.DomainEvent;
import sofka.carreraciclistica.entity.ciclista.values.Descripcion;
import sofka.carreraciclistica.entity.ciclista.values.ReporteId;

public class DescripcionReporteMedicoctualizado extends DomainEvent {
    public DescripcionReporteMedicoctualizado(ReporteId reporteIdentity, Descripcion descripcion) {
        super();
    }
}
