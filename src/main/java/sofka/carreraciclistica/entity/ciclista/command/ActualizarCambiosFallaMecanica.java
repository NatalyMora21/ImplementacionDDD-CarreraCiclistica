package sofka.carreraciclistica.entity.ciclista.command;

import co.com.sofka.domain.generic.Command;
import sofka.carreraciclistica.entity.ciclista.values.FallaMecanicaId;
import sofka.carreraciclistica.entity.competencia.values.Exigencia;

public class ActualizarCambiosFallaMecanica extends Command {

    private final FallaMecanicaId fallaIdentity;
    private final Exigencia exigencia;

    public ActualizarCambiosFallaMecanica(FallaMecanicaId fallaIdentity, Exigencia exigencia) {
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
