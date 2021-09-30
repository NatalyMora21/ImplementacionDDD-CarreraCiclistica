package sofka.carreraciclistica.entity.competencia.events;

import co.com.sofka.domain.generic.DomainEvent;
import sofka.carreraciclistica.entity.ciclista.values.CiclistaId;

public class CiclistaAsociado extends DomainEvent {

    private final CiclistaId ciclistaId;

    public CiclistaAsociado(CiclistaId ciclistaId) {
        super("sofka.competencia.ciclistaAsociado");
        this.ciclistaId = ciclistaId;
    }

    public CiclistaId getCiclistaId() {
        return ciclistaId;
    }
}
