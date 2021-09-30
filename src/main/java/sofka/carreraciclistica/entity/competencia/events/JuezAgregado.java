package sofka.carreraciclistica.entity.competencia.events;

import co.com.sofka.domain.generic.DomainEvent;
import sofka.carreraciclistica.entity.competencia.values.Funcion;
import sofka.carreraciclistica.entity.competencia.values.JuezId;
import sofka.carreraciclistica.entity.competencia.values.Nombre;

public class JuezAgregado extends DomainEvent {

    private final JuezId juezId;
    private final Nombre nombre;
    private final Funcion funcion;

    public JuezAgregado(JuezId juezIdentity, Nombre nombre, Funcion funcion) {
        super("sofka.competencia.juezAgregado");
        this.juezId = juezIdentity;
        this.nombre = nombre;
        this.funcion = funcion;
    }

    public JuezId getJuezId() {
        return juezId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Funcion getFuncion() {
        return funcion;
    }
}
