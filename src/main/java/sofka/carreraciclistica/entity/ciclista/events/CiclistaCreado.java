package sofka.carreraciclistica.entity.ciclista.events;

import co.com.sofka.domain.generic.DomainEvent;
import sofka.carreraciclistica.entity.ciclista.values.Edad;
import sofka.carreraciclistica.entity.ciclista.values.Identificacion;
import sofka.carreraciclistica.entity.ciclista.values.Nombre;

public class CiclistaCreado extends DomainEvent {

    private final Nombre nombre;
    private final Edad edad;
    private final Identificacion identificacion;

    public CiclistaCreado(Nombre nombre, Edad edad, Identificacion identificacion) {
        super("sofka.ciclista.ciclistaCreado");
        this.nombre = nombre;
        this.edad = edad;
        this.identificacion= identificacion;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Edad getEdad() {
        return edad;
    }

    public Identificacion getIdentificacion() {
        return identificacion;
    }
}
