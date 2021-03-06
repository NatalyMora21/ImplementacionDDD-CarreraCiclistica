package sofka.carreraciclistica.entity.competencia.events;

import co.com.sofka.domain.generic.DomainEvent;
import sofka.carreraciclistica.entity.competencia.values.JuezId;
import sofka.carreraciclistica.entity.competencia.values.Nombre;

public class NombreJuezActualizado extends DomainEvent {

    private final JuezId juezIdentity;
    private final Nombre nombre;

    public NombreJuezActualizado(JuezId juezIdentity, Nombre nombre) {
        super("sofka.competencia.funcionJuezActualizada");
        this.juezIdentity = juezIdentity;
        this.nombre=nombre;
    }

    public JuezId getJuezIdentity() {
        return juezIdentity;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
