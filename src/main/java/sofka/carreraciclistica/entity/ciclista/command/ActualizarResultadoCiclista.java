package sofka.carreraciclistica.entity.ciclista.command;

import co.com.sofka.domain.generic.Command;
import sofka.carreraciclistica.entity.ciclista.values.Resultado;

public class ActualizarResultadoCiclista extends Command {

    private final Resultado resultado;

    public ActualizarResultadoCiclista(Resultado resultado) {
        this.resultado = resultado;
    }

    public Resultado getResultado() {
        return resultado;
    }
}
