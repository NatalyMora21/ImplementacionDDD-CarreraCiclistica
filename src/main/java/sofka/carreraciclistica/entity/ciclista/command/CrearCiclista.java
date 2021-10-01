package sofka.carreraciclistica.entity.ciclista.command;

import co.com.sofka.domain.generic.Command;
import sofka.carreraciclistica.entity.ciclista.values.CiclistaId;
import sofka.carreraciclistica.entity.ciclista.values.Edad;
import sofka.carreraciclistica.entity.ciclista.values.Identificacion;
import sofka.carreraciclistica.entity.ciclista.values.Nombre;

public class CrearCiclista extends Command {

    private final CiclistaId entityId;
    private final Nombre nombreCiclista;
    private final Edad edadCiclista;
    private final Identificacion identificacionCiclista;

    public CrearCiclista(CiclistaId entityId, Nombre nombreCiclista, Edad edadCiclista, Identificacion identificacionCiclista) {
        this.entityId = entityId;
        this.nombreCiclista = nombreCiclista;
        this.edadCiclista = edadCiclista;
        this.identificacionCiclista = identificacionCiclista;
    }

    public CiclistaId getEntityId() {
        return entityId;
    }

    public Nombre getNombreCiclista() {
        return nombreCiclista;
    }

    public Edad getEdadCiclista() {
        return edadCiclista;
    }

    public Identificacion getIdentificacionCiclista() {
        return identificacionCiclista;
    }
}
