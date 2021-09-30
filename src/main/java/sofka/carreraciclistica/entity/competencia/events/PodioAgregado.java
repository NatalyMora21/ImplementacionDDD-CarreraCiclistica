package sofka.carreraciclistica.entity.competencia.events;

import co.com.sofka.domain.generic.DomainEvent;
import sofka.carreraciclistica.entity.competencia.values.Podio;

public class PodioAgregado extends DomainEvent {

    private final Podio podio;

    public PodioAgregado(Podio podio) {
        super("sofka.competencia.podioAgregado");
        this.podio= podio;
    }

    public Podio getPodio() {
        return podio;
    }
}
