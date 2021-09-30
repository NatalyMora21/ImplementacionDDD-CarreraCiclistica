package sofka.carreraciclistica.entity.competencia.events;

import co.com.sofka.domain.generic.DomainEvent;
import sofka.carreraciclistica.entity.competencia.values.Funcion;
import sofka.carreraciclistica.entity.competencia.values.JuezId;
import sofka.carreraciclistica.entity.competencia.values.Nombre;

public class JuezAgregado extends DomainEvent {
    public JuezAgregado(JuezId juezIdentity, Nombre nombre, Funcion funcion) {
        super();
    }
}
