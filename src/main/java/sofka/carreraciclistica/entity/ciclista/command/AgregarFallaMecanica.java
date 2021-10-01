package sofka.carreraciclistica.entity.ciclista.command;

import co.com.sofka.domain.generic.Command;
import sofka.carreraciclistica.entity.ciclista.values.Cambios;
import sofka.carreraciclistica.entity.ciclista.values.Descripcion;
import sofka.carreraciclistica.entity.ciclista.values.Hora;

public class AgregarFallaMecanica extends Command {

    private final Hora hora;
    private final Descripcion descripcion;
    private final Cambios cambios;

    public AgregarFallaMecanica(Hora hora, Descripcion descripcion, Cambios cambios) {
        this.hora = hora;
        this.descripcion = descripcion;
        this.cambios = cambios;
    }

    public Hora getHora() {
        return hora;
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }

    public Cambios getCambios() {
        return cambios;
    }
}
