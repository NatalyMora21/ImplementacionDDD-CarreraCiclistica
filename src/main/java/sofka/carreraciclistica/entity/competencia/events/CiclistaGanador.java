package sofka.carreraciclistica.entity.competencia.events;

import co.com.sofka.domain.generic.DomainEvent;
import sofka.carreraciclistica.entity.ciclista.values.CiclistId;

public class CiclistaGanador extends DomainEvent {
    public CiclistaGanador(CiclistId ciclistaId) {
        super();
    }
}
