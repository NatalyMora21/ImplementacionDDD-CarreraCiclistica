package sofka.carreraciclistica.entity.competencia;

import co.com.sofka.domain.generic.Entity;
import sofka.carreraciclistica.entity.competencia.values.Funciones;
import sofka.carreraciclistica.entity.competencia.values.JuezId;

public class Juez extends Entity<JuezId> {


    protected Nombre nombre;
    protected Funciones funciones;

    public Juez(JuezId juezIdentity, Nombre nombre, Funciones funciones) {
        super(juezIdentity);
        this.nombre = nombre;
        this.funciones=funciones;
    }

    //Comportamientos
    public void actualizarNombre(Nombre nombre){
        this.nombre=nombre;
    }
    public void actualizarNombre(Funciones funciones){
        this.funciones=funciones;
    }

    //Propiedades
    public Nombre nombre() {
        return nombre;
    }

    public Funciones funciones() {
        return funciones;
    }
}
