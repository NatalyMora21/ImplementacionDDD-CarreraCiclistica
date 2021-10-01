package sofka.carreraciclistica.entity.ciclista.events;

import co.com.sofka.domain.generic.DomainEvent;
import sofka.carreraciclistica.entity.ciclista.values.Descripcion;
import sofka.carreraciclistica.entity.ciclista.values.FallaMecanicaId;
import sofka.carreraciclistica.entity.competencia.values.Kilometros;

public class DescripcionFallaMecanicaActualizada extends DomainEvent {

    private final FallaMecanicaId fallaIdentity;
    private final Descripcion descripcion;
    public DescripcionFallaMecanicaActualizada(FallaMecanicaId fallaIdentity, Descripcion descripcion) {
        super("sofka.ciclista.descripcionFallaMecanicaActualizada");
        this.fallaIdentity = fallaIdentity;
        this.descripcion = descripcion;
    }

    public FallaMecanicaId getFallaIdentity() {
        return fallaIdentity;
    }

    public Descripcion getKilometros() {
        return descripcion;
    }
}
