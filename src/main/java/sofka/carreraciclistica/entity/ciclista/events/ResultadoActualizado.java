package sofka.carreraciclistica.entity.ciclista.events;

import co.com.sofka.domain.generic.DomainEvent;
import sofka.carreraciclistica.entity.ciclista.values.Resultado;

public class ResultadoActualizado extends DomainEvent {
    private final Resultado resultado;
    public ResultadoActualizado(Resultado resultado) {
        super("sofka.ciclista.actualizarPuesto");
        this.resultado = resultado;
    }

    public Resultado getResultado() {
        return resultado;
    }
}
