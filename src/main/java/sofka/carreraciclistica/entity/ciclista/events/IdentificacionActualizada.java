package sofka.carreraciclistica.entity.ciclista.events;

import co.com.sofka.domain.generic.DomainEvent;
import sofka.carreraciclistica.entity.ciclista.values.Identificacion;

public class IdentificacionActualizada extends DomainEvent {

    private final Identificacion identificacion;

    public IdentificacionActualizada(Identificacion identificacion) {
        super("sofka.ciclista.identificacionActualizada");
        this.identificacion = identificacion;
    }

    public Identificacion getIdentificacion() {
        return identificacion;
    }
}
