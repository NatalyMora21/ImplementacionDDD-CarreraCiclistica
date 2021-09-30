package sofka.carreraciclistica.entity.ciclista;

import co.com.sofka.domain.generic.Entity;
import sofka.carreraciclistica.entity.ciclista.values.Cambios;
import sofka.carreraciclistica.entity.ciclista.values.Descripcion;
import sofka.carreraciclistica.entity.ciclista.values.FallaMecanicaId;
import sofka.carreraciclistica.entity.ciclista.values.Hora;
import sofka.carreraciclistica.entity.competencia.values.Funciones;

public class FallaMecanica  extends Entity<FallaMecanicaId> {

    protected Hora hora;
    protected Descripcion descripcion;
    protected Cambios cambios;

    public FallaMecanica(FallaMecanicaId entityId, Hora hora, Descripcion descripcion, Cambios cambios) {
        super(entityId);
        this.hora = hora;
        this.descripcion = descripcion;
        this.cambios = cambios;
    }

    //Comportamientos
    public void actualizarDescripcion(Descripcion descripcion){
        this.descripcion=descripcion;
    }
    public void actualizarCambios(Cambios cambios){
        this.cambios=cambios;
    }

    //Propiedades
    public Hora hora() {
        return hora;
    }
    public Descripcion descripcion() {
        return descripcion;
    }
    public Cambios cambios() {
        return cambios;
    }
}
