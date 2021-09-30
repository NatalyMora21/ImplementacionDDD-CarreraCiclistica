package sofka.carreraciclistica.entity.competencia.events;

import co.com.sofka.domain.generic.DomainEvent;
import sofka.carreraciclistica.entity.competencia.values.TipoCompetencia;

public class TipoCompetenciaActaulizado extends DomainEvent {
    public TipoCompetenciaActaulizado(TipoCompetencia tipo) {
        super();
    }
}
