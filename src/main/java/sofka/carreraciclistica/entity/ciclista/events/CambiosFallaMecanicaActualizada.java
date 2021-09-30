package sofka.carreraciclistica.entity.ciclista.events;

import co.com.sofka.domain.generic.DomainEvent;
import sofka.carreraciclistica.entity.ciclista.values.FallaMecanicaId;
import sofka.carreraciclistica.entity.competencia.values.Exigencia;

public class CambiosFallaMecanicaActualizada extends DomainEvent {

    private final FallaMecanicaId fallaIdentity;
    private final Exigencia exigencia;


    public CambiosFallaMecanicaActualizada(FallaMecanicaId fallaIdentity, Exigencia exigencia) {
        super("sofka.ciclista.CambiosFallaMecanicaActualizado");
        this.fallaIdentity = fallaIdentity;
        this.exigencia = exigencia;
    }

    public FallaMecanicaId getFallaIdentity() {
        return fallaIdentity;
    }

    public Exigencia getExigencia() {
        return exigencia;
    }
}
