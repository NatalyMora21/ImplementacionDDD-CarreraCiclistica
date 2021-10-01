package sofka.carreraciclistica.entity.competencia.command;

import co.com.sofka.domain.generic.Command;
import sofka.carreraciclistica.entity.competencia.values.Exigencia;
import sofka.carreraciclistica.entity.competencia.values.RutaId;

public class ActualizarFuncionJuez extends Command {
    private final RutaId rutaIdentity;
    private final Exigencia exigencia;

    public ActualizarFuncionJuez(RutaId rutaIdentity, Exigencia exigencia) {
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
