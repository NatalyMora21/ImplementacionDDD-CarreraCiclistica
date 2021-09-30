package sofka.carreraciclistica.entity.ciclista.events;

import co.com.sofka.domain.generic.DomainEvent;
import sofka.carreraciclistica.entity.ciclista.values.Cambios;
import sofka.carreraciclistica.entity.ciclista.values.Descripcion;
import sofka.carreraciclistica.entity.ciclista.values.FallaMecanicaId;
import sofka.carreraciclistica.entity.ciclista.values.Hora;

public class FallaMecanicaAgregada extends DomainEvent {
    public FallaMecanicaAgregada(FallaMecanicaId fallaIdentity, Hora hora, Descripcion descripcion, Cambios cambios) {
        super();
    }
}
