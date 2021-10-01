package sofka.carreraciclistica.entity.ciclista.command;

import co.com.sofka.domain.generic.Command;
import sofka.carreraciclistica.entity.ciclista.values.Estado;

public class ActualizarEstadoCiclista extends Command {

    private final Estado estado;

    public ActualizarEstadoCiclista(Estado estado) {
        this.estado = estado;
    }

    public Estado getEstado() {
        return estado;
    }
}
