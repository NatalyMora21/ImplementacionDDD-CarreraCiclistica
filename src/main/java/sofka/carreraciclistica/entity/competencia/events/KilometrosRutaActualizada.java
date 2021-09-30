package sofka.carreraciclistica.entity.competencia.events;

import co.com.sofka.domain.generic.DomainEvent;
import sofka.carreraciclistica.entity.competencia.values.Kilometros;
import sofka.carreraciclistica.entity.competencia.values.RutaId;

public class KilometrosRutaActualizada extends DomainEvent {

    private final RutaId rutaIdentity;
    private final Kilometros kilometros;
    public KilometrosRutaActualizada(RutaId rutaIdentity, Kilometros kilometros) {
        super("sofka.competencia.juezAgregado");
        this.rutaIdentity = rutaIdentity;
        this.kilometros = kilometros;
    }

    public RutaId getRutaIdentity() {
        return rutaIdentity;
    }

    public Kilometros getKilometros() {
        return kilometros;
    }
}
