package sofka.carreraciclistica.entity.ciclista.events;

import co.com.sofka.domain.generic.DomainEvent;
import sofka.carreraciclistica.entity.ciclista.values.Resultado;

public class ResultadoActualizado extends DomainEvent {
    public ResultadoActualizado(Resultado resultado) {
        super();
    }
}
