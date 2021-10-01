package sofka.carreraciclistica.entity.competencia.command;

import co.com.sofka.domain.generic.Command;
import sofka.carreraciclistica.entity.competencia.values.Podio;

public class AgregarPodio extends Command {

    private final Podio podio;

    public AgregarPodio(Podio podio) {
        this.podio = podio;
    }

    public Podio getPodio() {
        return podio;
    }
}
