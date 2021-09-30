package sofka.carreraciclistica.entity.competencia;

import co.com.sofka.domain.generic.Entity;
import sofka.carreraciclistica.entity.competencia.values.Funcion;
import sofka.carreraciclistica.entity.competencia.values.JuezId;
import sofka.carreraciclistica.entity.competencia.values.Nombre;

public class Juez extends Entity<JuezId> {


    protected Nombre nombre;
    protected Funcion funcion;

    public Juez(JuezId juezIdentity, Nombre nombre, Funcion funcion) {
        super(juezIdentity);
        this.nombre = nombre;
        this.funcion = funcion;
    }

    //Comportamientos
    public void actualizarNombre(Nombre nombre){
        this.nombre=nombre;
    }
    public void actualizarNombre(Funcion funcion){
        this.funcion = funcion;
    }

    //Propiedades
    public Nombre nombre() {
        return nombre;
    }

    public Funcion funciones() {
        return funcion;
    }
}
