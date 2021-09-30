package sofka.carreraciclistica.entity.competencia.events;

import co.com.sofka.domain.generic.DomainEvent;
import sofka.carreraciclistica.entity.competencia.values.*;

public class RutaAgregada extends DomainEvent {

    private final RutaId rutaIdentity;
    private final Recorrido recorrido;
    private final Kilometros kilometros;
    private final Exigencia exigencia;

    public RutaAgregada(RutaId rutaIdentity, Recorrido recorrido, Kilometros kilometros, Exigencia exigencia) {
        super("sofka.competencia.rutaAgregada");
        this.rutaIdentity = rutaIdentity;
        this.recorrido = recorrido;
        this.kilometros = kilometros;
        this.exigencia = exigencia;
    }

    public RutaId getRutaIdentity() {
        return rutaIdentity;
    }

    public Recorrido getRecorrido() {
        return recorrido;
    }

    public Kilometros getKilometros() {
        return kilometros;
    }

    public Exigencia getExigencia() {
        return exigencia;
    }
}
