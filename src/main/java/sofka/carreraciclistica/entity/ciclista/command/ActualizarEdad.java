package sofka.carreraciclistica.entity.ciclista.command;

import co.com.sofka.domain.generic.Command;
import sofka.carreraciclistica.entity.ciclista.values.Edad;

public class ActualizarEdad extends Command {
    private final Edad edad;

    public ActualizarEdad(Edad edad) {
        this.edad = edad;
    }

    public Edad getEdad() {
        return edad;
    }
}
