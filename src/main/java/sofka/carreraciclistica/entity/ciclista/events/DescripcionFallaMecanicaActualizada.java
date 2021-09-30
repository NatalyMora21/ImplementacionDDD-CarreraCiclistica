package sofka.carreraciclistica.entity.ciclista.events;

import co.com.sofka.domain.generic.DomainEvent;
import sofka.carreraciclistica.entity.ciclista.values.FallaMecanicaId;
import sofka.carreraciclistica.entity.competencia.values.Kilometros;

public class DescripcionFallaMecanicaActualizada extends DomainEvent {
    public DescripcionFallaMecanicaActualizada(FallaMecanicaId fallaIdentity, Kilometros kilometros) {
        super();
    }
}
