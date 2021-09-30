package sofka.carreraciclistica.entity.ciclista.events;

import co.com.sofka.domain.generic.DomainEvent;
import sofka.carreraciclistica.entity.ciclista.values.FallaMecanicaId;
import sofka.carreraciclistica.entity.competencia.values.Kilometros;

public class DescripcionFallaMecanicaActualizada extends DomainEvent {

    private final FallaMecanicaId fallaIdentity;
    private final Kilometros kilometros;
    public DescripcionFallaMecanicaActualizada(FallaMecanicaId fallaIdentity, Kilometros kilometros) {
        super("sofka.ciclista.descripcionFallaMecanicaActualizada");
        this.fallaIdentity = fallaIdentity;
        this.kilometros = kilometros;
    }

    public FallaMecanicaId getFallaIdentity() {
        return fallaIdentity;
    }

    public Kilometros getKilometros() {
        return kilometros;
    }
}
