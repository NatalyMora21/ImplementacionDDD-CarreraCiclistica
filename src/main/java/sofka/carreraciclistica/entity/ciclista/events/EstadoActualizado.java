package sofka.carreraciclistica.entity.ciclista.events;

import co.com.sofka.domain.generic.DomainEvent;
import sofka.carreraciclistica.entity.ciclista.values.Estado;

public class EstadoActualizado extends DomainEvent {

    private final Estado estado;
    public EstadoActualizado(Estado estado) {
        super("sofka.ciclista.EstadoActualizado");
        this.estado = estado;
    }

    public Estado getEstado() {
        return estado;
    }
}
