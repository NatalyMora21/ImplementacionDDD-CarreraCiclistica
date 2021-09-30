package sofka.carreraciclistica.entity.ciclista.events;

import co.com.sofka.domain.generic.DomainEvent;
import sofka.carreraciclistica.entity.ciclista.values.Nombre;

public class NombreCiclistaActualizado extends DomainEvent {
    private final Nombre nombre;

    public NombreCiclistaActualizado(Nombre nombre) {
        super("sofka.ciclista.actualizarPuesto");
        this.nombre = nombre;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
