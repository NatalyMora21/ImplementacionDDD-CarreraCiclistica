package sofka.carreraciclistica.entity.ciclista.command;

import co.com.sofka.domain.generic.Command;
import sofka.carreraciclistica.entity.ciclista.values.Descripcion;
import sofka.carreraciclistica.entity.ciclista.values.FallaMecanicaId;

public class ActualizarDescripcionFallaMecanica extends Command {

    private final FallaMecanicaId fallaIdentity;
    private final Descripcion descripcion;

    public ActualizarDescripcionFallaMecanica(FallaMecanicaId fallaIdentity, Descripcion descripcion) {
        this.fallaIdentity = fallaIdentity;
        this.descripcion = descripcion;
    }

    public FallaMecanicaId getFallaIdentity() {
        return fallaIdentity;
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }
}
