package sofka.carreraciclistica.entity.competencia.events;

import co.com.sofka.domain.generic.DomainEvent;
import sofka.carreraciclistica.entity.competencia.values.Recorrido;
import sofka.carreraciclistica.entity.competencia.values.RutaId;

public class RecorridoJuezActualizada extends DomainEvent {
    public RecorridoJuezActualizada(RutaId rutaIdentity, Recorrido recorrido) {
        super();
    }
}
