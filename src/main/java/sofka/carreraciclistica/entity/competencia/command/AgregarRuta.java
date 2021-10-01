package sofka.carreraciclistica.entity.competencia.command;

import co.com.sofka.domain.generic.Command;
import sofka.carreraciclistica.entity.competencia.values.*;

public class AgregarRuta extends Command {

    private final CompetenciaId competenciaId;
    private final RutaId rutaIdentity;
    private final Recorrido recorrido;
    private final Kilometros kilometros;
    private final Exigencia exigencia;

    public AgregarRuta(CompetenciaId competenciaId, RutaId rutaIdentity, Recorrido recorrido, Kilometros kilometros, Exigencia exigencia) {
        this.competenciaId = competenciaId;
        this.rutaIdentity = rutaIdentity;
        this.recorrido = recorrido;
        this.kilometros = kilometros;
        this.exigencia = exigencia;
    }

    public CompetenciaId getCompetenciaId() {
        return competenciaId;
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
