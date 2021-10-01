package sofka.carreraciclistica.entity.competencia.command;

import co.com.sofka.domain.generic.Command;
import sofka.carreraciclistica.entity.competencia.values.Kilometros;
import sofka.carreraciclistica.entity.competencia.values.RutaId;

public class ActualizarKilometrosRuta extends Command {

    private final RutaId rutaIdentity;
    private final Kilometros kilometros;

    public ActualizarKilometrosRuta(RutaId rutaIdentity, Kilometros kilometros) {
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
