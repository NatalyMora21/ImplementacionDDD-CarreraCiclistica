package sofka.carreraciclistica.entity.competencia.events;

import co.com.sofka.domain.generic.DomainEvent;
import sofka.carreraciclistica.entity.competencia.values.Recorrido;
import sofka.carreraciclistica.entity.competencia.values.RutaId;

public class RecorridoRutaActualizado extends DomainEvent {

    private final RutaId rutaIdentity;
    private final Recorrido recorrido;

    public RecorridoRutaActualizado(RutaId rutaIdentity, Recorrido recorrido) {
        super("sofka.competencia.recorridoRutaActualizado");
        this.rutaIdentity = rutaIdentity;
        this.recorrido = recorrido;
    }

    public RutaId getRutaIdentity() {
        return rutaIdentity;
    }

    public Recorrido getRecorrido() {
        return recorrido;
    }
}
