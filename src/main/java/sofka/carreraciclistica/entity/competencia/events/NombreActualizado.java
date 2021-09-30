package sofka.carreraciclistica.entity.competencia.events;

import co.com.sofka.domain.generic.DomainEvent;
import sofka.carreraciclistica.entity.competencia.values.NombreCompetencia;


public class NombreActualizado extends DomainEvent {

    private final NombreCompetencia nuevoNombre;

    public NombreActualizado(NombreCompetencia nuevoNombre) {
        super("sofka.competencia.funcionJuezActualizada");
        this.nuevoNombre = nuevoNombre;
    }

    public NombreCompetencia getNuevoNombre() {
        return nuevoNombre;
    }
}
