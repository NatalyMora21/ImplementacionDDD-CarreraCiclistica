package sofka.carreraciclistica.entity.competencia.command;

import co.com.sofka.domain.generic.Command;
import sofka.carreraciclistica.entity.competencia.values.Funcion;
import sofka.carreraciclistica.entity.competencia.values.JuezId;
import sofka.carreraciclistica.entity.competencia.values.Nombre;

public class AgregarJuez extends Command {
    private final JuezId juezId;
    private final Nombre nombre;
    private final Funcion funcion;

    public AgregarJuez(JuezId juezId, Nombre nombre, Funcion funcion) {
        this.juezId = juezId;
        this.nombre = nombre;
        this.funcion = funcion;
    }

    public JuezId getJuezId() {
        return juezId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Funcion getFuncion() {
        return funcion;
    }
}
