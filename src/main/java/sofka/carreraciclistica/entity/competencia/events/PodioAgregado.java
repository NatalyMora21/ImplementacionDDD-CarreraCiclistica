package sofka.carreraciclistica.entity.competencia.events;

import co.com.sofka.domain.generic.DomainEvent;
import sofka.carreraciclistica.entity.competencia.values.Podio;

public class PodioAgregado extends DomainEvent {
    public PodioAgregado(Podio podio) {
        super();
    }
}
