package sofka.carreraciclistica.entity.competencia.events;

import co.com.sofka.domain.generic.DomainEvent;
import sofka.carreraciclistica.entity.competencia.values.Exigencia;
import sofka.carreraciclistica.entity.competencia.values.RutaId;

public class ExigenciaRutaActualizada extends DomainEvent {
    public ExigenciaRutaActualizada(RutaId rutaIdentity, Exigencia exigencia) {
        super();
    }
}
