package sofka.carreraciclistica.entity.ciclista.events;

import co.com.sofka.domain.generic.DomainEvent;
import sofka.carreraciclistica.entity.ciclista.values.FallaMecanicaId;
import sofka.carreraciclistica.entity.competencia.values.Exigencia;

public class CambiosFallaMecanicaActualizada extends DomainEvent {
    public CambiosFallaMecanicaActualizada(FallaMecanicaId fallaIdentity, Exigencia exigencia) {
        super();
    }
}
