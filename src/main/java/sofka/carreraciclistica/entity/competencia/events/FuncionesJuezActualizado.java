package sofka.carreraciclistica.entity.competencia.events;

import co.com.sofka.domain.generic.DomainEvent;
import sofka.carreraciclistica.entity.competencia.values.Funciones;
import sofka.carreraciclistica.entity.competencia.values.JuezId;

public class FuncionesJuezActualizado extends DomainEvent {
    public FuncionesJuezActualizado(JuezId juezIdentity, Funciones funciones) {
        super();
    }
}
