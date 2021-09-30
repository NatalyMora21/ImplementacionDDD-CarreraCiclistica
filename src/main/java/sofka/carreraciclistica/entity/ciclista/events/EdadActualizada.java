package sofka.carreraciclistica.entity.ciclista.events;

import co.com.sofka.domain.generic.DomainEvent;
import sofka.carreraciclistica.entity.ciclista.values.Edad;

public class EdadActualizada extends DomainEvent {

    private final Edad edad;

    public EdadActualizada(Edad edad) {
        super("sofka.ciclista.edadActualizada");
        this.edad = edad;
    }

    public Edad getEdad() {
        return edad;
    }
}
