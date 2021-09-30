package sofka.carreraciclistica.entity.competencia.events;

import co.com.sofka.domain.generic.DomainEvent;
import sofka.carreraciclistica.entity.competencia.values.Exigencia;
import sofka.carreraciclistica.entity.competencia.values.Kilometros;
import sofka.carreraciclistica.entity.competencia.values.Recorrido;
import sofka.carreraciclistica.entity.competencia.values.RutaId;

public class RutaAsociada extends DomainEvent {
    public RutaAsociada(RutaId rutaIdentity, Recorrido recorrido, Kilometros kilometros, Exigencia exigencia) {
        super();
    }
}
