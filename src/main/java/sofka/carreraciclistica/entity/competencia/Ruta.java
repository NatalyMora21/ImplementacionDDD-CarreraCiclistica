package sofka.carreraciclistica.entity.competencia;

import co.com.sofka.domain.generic.Entity;
import sofka.carreraciclistica.entity.competencia.values.Exigencia;
import sofka.carreraciclistica.entity.competencia.values.Kilometros;
import sofka.carreraciclistica.entity.competencia.values.Recorrido;
import sofka.carreraciclistica.entity.competencia.values.RutaId;

public class Ruta extends Entity <RutaId> {

    protected Recorrido recorrido;
    protected Kilometros kilometros;
    protected Exigencia exigencia;

    public Ruta(RutaId entityId, Recorrido recorrido, Kilometros kilometros, Exigencia exigencia) {
        super(entityId);
        this.recorrido = recorrido;
        this.kilometros = kilometros;
        this.exigencia = exigencia;
    }

    //Comportamientos
    public void actualizarRecorrido(Recorrido recorrido){
        this.recorrido=recorrido;
    }
    public void actualizarKiloemtros(Kilometros kilometros){
        this.kilometros=kilometros;
    }

    public void actualizarExigencia(Exigencia exigencia){
        this.exigencia=exigencia;
    }

    //Propiedades
    public Recorrido recorrido() {
        return recorrido;
    }
    public Kilometros kilometros() {
        return kilometros;
    }
    public Exigencia exigencia() {
        return exigencia;
    }
}
