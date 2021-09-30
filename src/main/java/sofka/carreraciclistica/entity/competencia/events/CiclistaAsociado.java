package sofka.carreraciclistica.entity.competencia.events;

import co.com.sofka.domain.generic.DomainEvent;
import sofka.carreraciclistica.entity.ciclista.values.CiclistaId;

public class CiclistaAsociado extends DomainEvent {
    public CiclistaAsociado(CiclistaId ciclistaId) {
        super();
    }
}
