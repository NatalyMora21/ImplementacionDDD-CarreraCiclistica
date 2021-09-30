package sofka.carreraciclistica.entity.competencia;


import co.com.sofka.domain.generic.AggregateEvent;
import sofka.carreraciclistica.entity.ciclista.values.CiclistaId;
import sofka.carreraciclistica.entity.competencia.events.*;
import sofka.carreraciclistica.entity.competencia.values.*;

import java.util.Set;

public class Competencia extends AggregateEvent <CompetenciaId>{

    protected NombreCompetencia nombre;
    protected TipoCompetencia tipo;
    protected FechaInicio fechaInicio;
    protected Categoria categoria;
    protected Set<CiclistaId> ciclistas;
    protected Ruta ruta;
    protected Juez juez;
    protected Podio podio;

    public Competencia( CompetenciaId identity, NombreCompetencia nombre, TipoCompetencia tipo, FechaInicio fechaInicio, Categoria categoria,Ruta ruta){
        super(identity);
        appendChange(new CreatedCompetencia(nombre,tipo,fechaInicio,categoria,ruta)).apply();
    }

    //Comportamientos Agregado

    public void actualizarNombre(NombreCompetencia nuevoNombre) {
        appendChange(new NombreActualizado(nuevoNombre)).apply();
    }

    public void actualizarTipoCompetencia(TipoCompetencia tipo) {
        appendChange(new TipoCompetenciaActaulizado(tipo)).apply();
    }
    public void cambiarFechaCompetencia(FechaInicio fechaInicio) {
        appendChange(new FeachaCompetenciaActualizada(fechaInicio)).apply();
    }

    public void asociarCiclista(CiclistaId ciclistaId) {
        appendChange(new CiclistaAsociado(ciclistaId)).apply(); // (10))
    }
    public void agregarRuta(Recorrido recorrido, Kilometros kilometros, Exigencia exigencia) {
        RutaId rutaIdentity = new RutaId();
        appendChange(new RutaAsociada(rutaIdentity, recorrido, kilometros,exigencia)).apply();
    }

    public void agregarJuez(Nombre nombre, Funcion funcion) {// (9)
        JuezId juezIdentity = new JuezId();
        appendChange(new JuezAgregado(juezIdentity, nombre, funcion)).apply(); // (10))
    }

    public void asociarGanador(CiclistaId ciclistaId) {
        appendChange(new CiclistaGanador(ciclistaId)).apply(); // (10))
    }

    public void agregarPodio(Podio podio) {
        appendChange(new PodioAgregado(podio)).apply(); // (10))
    }

    //Comportamientos Entidades

    public void actualizarNombreJuez(JuezId juezIdentity, Nombre nombre) {
        appendChange(new NombreJuezActualizado(juezIdentity, nombre)).apply();
    }
    public void actualizarFuncionesJuez(JuezId juezIdentity, Funcion funcion) {
        appendChange(new FuncionesJuezActualizado(juezIdentity, funcion)).apply();
    }
    public void actualizarRecorridoRuta(RutaId rutaIdentity, Recorrido recorrido) {
        appendChange(new RecorridoJuezActualizada(rutaIdentity, recorrido)).apply();
    }
    public void actualizarKilometrosRuta(RutaId rutaIdentity, Kilometros kilometros) {
        appendChange(new KilometrosRutaActualizada(rutaIdentity, kilometros)).apply();
    }
    public void actualizarExigenciaRuta(RutaId rutaIdentity, Exigencia exigencia) {
        appendChange(new ExigenciaRutaActualizada(rutaIdentity, exigencia)).apply();
    }


}