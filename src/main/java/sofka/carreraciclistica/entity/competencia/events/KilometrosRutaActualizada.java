package sofka.carreraciclistica.entity.competencia.events;

import co.com.sofka.domain.generic.DomainEvent;
import sofka.carreraciclistica.entity.competencia.values.Kilometros;
import sofka.carreraciclistica.entity.competencia.values.RutaId;

public class KilometrosRutaActualizada extends DomainEvent {
    public KilometrosRutaActualizada(RutaId rutaIdentity, Kilometros kilometros) {
        super();
    }
}
