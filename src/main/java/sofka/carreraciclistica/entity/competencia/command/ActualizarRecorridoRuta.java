package sofka.carreraciclistica.entity.competencia.command;

import co.com.sofka.domain.generic.Command;
import sofka.carreraciclistica.entity.competencia.values.Recorrido;
import sofka.carreraciclistica.entity.competencia.values.RutaId;

public class ActualizarRecorridoRuta extends Command {
    private final RutaId rutaIdentity;
    private final Recorrido recorrido;

    public ActualizarRecorridoRuta(RutaId rutaIdentity, Recorrido recorrido) {
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
