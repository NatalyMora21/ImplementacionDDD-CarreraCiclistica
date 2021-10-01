package sofka.carreraciclistica.entity.competencia.command;

import co.com.sofka.domain.generic.Command;
import sofka.carreraciclistica.entity.ciclista.values.CiclistaId;

public class AsociarCiclista extends Command {
    private final CiclistaId ciclistaId;

    public AsociarCiclista(CiclistaId ciclistaId) {
        this.ciclistaId = ciclistaId;
    }

    public CiclistaId getCiclistaId() {
        return ciclistaId;
    }
}
