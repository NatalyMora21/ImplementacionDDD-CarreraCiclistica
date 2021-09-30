package sofka.carreraciclistica.entity.competencia.events;

import co.com.sofka.domain.generic.DomainEvent;
import sofka.carreraciclistica.entity.competencia.values.TipoCompetencia;

public class TipoCompetenciaActaulizado extends DomainEvent {

    private final TipoCompetencia tipo;

    public TipoCompetenciaActaulizado(TipoCompetencia tipo) {
        super("sofka.competencia.tipoCompetenciaActaulizado");
        this.tipo = tipo;
    }

    public TipoCompetencia getTipo() {
        return tipo;
    }
}
