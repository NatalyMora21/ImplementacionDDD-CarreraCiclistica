package sofka.carreraciclistica.entity.competencia.events;

import co.com.sofka.domain.generic.DomainEvent;
import sofka.carreraciclistica.entity.competencia.values.Exigencia;
import sofka.carreraciclistica.entity.competencia.values.RutaId;

public class ExigenciaRutaActualizada extends DomainEvent {

    private final RutaId rutaIdentity;
    private final Exigencia exigencia;

    public ExigenciaRutaActualizada(RutaId rutaIdentity, Exigencia exigencia) {
        super("sofka.competencia.exigenciaRutaActualizada");
        this.rutaIdentity = rutaIdentity;
        this.exigencia = exigencia;
    }

    public RutaId getRutaIdentity() {
        return rutaIdentity;
    }

    public Exigencia getExigencia() {
        return exigencia;
    }
}
