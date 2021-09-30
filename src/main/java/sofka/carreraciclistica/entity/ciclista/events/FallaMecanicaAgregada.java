package sofka.carreraciclistica.entity.ciclista.events;

import co.com.sofka.domain.generic.DomainEvent;
import sofka.carreraciclistica.entity.ciclista.values.Cambios;
import sofka.carreraciclistica.entity.ciclista.values.Descripcion;
import sofka.carreraciclistica.entity.ciclista.values.FallaMecanicaId;
import sofka.carreraciclistica.entity.ciclista.values.Hora;

public class FallaMecanicaAgregada extends DomainEvent {
    private final FallaMecanicaId fallaIdentity;
    private final Hora hora;
    private final Descripcion descripcion;
    private final Cambios cambios;

    public FallaMecanicaAgregada(FallaMecanicaId fallaIdentity, Hora hora, Descripcion descripcion, Cambios cambios) {
        super("sofka.ciclista.fallaMecanicaAgregada");
        this.fallaIdentity = fallaIdentity;
        this.hora = hora;
        this.descripcion = descripcion;
        this.cambios = cambios;
    }

    public FallaMecanicaId getFallaIdentity() {
        return fallaIdentity;
    }

    public Hora getHora() {
        return hora;
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }

    public Cambios getCambios() {
        return cambios;
    }
}
