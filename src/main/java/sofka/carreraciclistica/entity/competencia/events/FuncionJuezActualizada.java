package sofka.carreraciclistica.entity.competencia.events;

import co.com.sofka.domain.generic.DomainEvent;
import sofka.carreraciclistica.entity.competencia.values.Funcion;
import sofka.carreraciclistica.entity.competencia.values.JuezId;

public class FuncionJuezActualizada extends DomainEvent {

    private final JuezId juezIdentity;
    private final Funcion funcion;

    public FuncionJuezActualizada(JuezId juezIdentity, Funcion funcion) {
        super("sofka.competencia.funcionJuezActualizada");
        this.juezIdentity = juezIdentity;
        this.funcion = funcion;
    }

    public JuezId getJuezIdentity() {
        return juezIdentity;
    }

    public Funcion getFuncion() {
        return funcion;
    }
}
