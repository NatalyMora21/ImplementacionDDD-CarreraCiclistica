package sofka.carreraciclistica.entity.competencia;


import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import sofka.carreraciclistica.entity.ciclista.Ciclista;
import sofka.carreraciclistica.entity.ciclista.CiclistaChange;
import sofka.carreraciclistica.entity.ciclista.values.CiclistaId;
import sofka.carreraciclistica.entity.competencia.events.*;
import sofka.carreraciclistica.entity.competencia.values.*;

import java.util.List;
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
        appendChange(new CompetenciaCreada(nombre,tipo,fechaInicio,categoria,ruta)).apply();
    }

    private Competencia(CompetenciaId entityId){
        super(entityId);
        subscribe(new CompetenciaChange(this));
    }

    public static Competencia from(CompetenciaId entityId, List<DomainEvent> events){
        var competencia = new Competencia(entityId);
        events.forEach(competencia::applyEvent);
        return competencia;
    }

    //Comportamientos Agregado

    public void actualizarNombre(NombreCompetencia nuevoNombre) {
        appendChange(new NombreActualizado(nuevoNombre)).apply();
    }

    public void actualizarTipoCompetencia(TipoCompetencia tipo) {
        appendChange(new TipoCompetenciaActaulizado(tipo)).apply();
    }
    public void cambiarFechaCompetencia(FechaInicio fechaInicio) {
        appendChange(new FechaCompetenciaActualizada(fechaInicio)).apply();
    }

    public void asociarCiclista(CiclistaId ciclistaId) {
        appendChange(new CiclistaAsociado(ciclistaId)).apply(); // (10))
    }
    public void agregarRuta(Recorrido recorrido, Kilometros kilometros, Exigencia exigencia) {
        RutaId rutaIdentity = new RutaId();
        appendChange(new RutaAgregada(rutaIdentity, recorrido, kilometros,exigencia)).apply();
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
        appendChange(new FuncionJuezActualizada(juezIdentity, funcion)).apply();
    }
    public void actualizarRecorridoRuta(RutaId rutaIdentity, Recorrido recorrido) {
        appendChange(new RecorridoRutaActualizado(rutaIdentity, recorrido)).apply();
    }
    public void actualizarKilometrosRuta(RutaId rutaIdentity, Kilometros kilometros) {
        appendChange(new KilometrosRutaActualizada(rutaIdentity, kilometros)).apply();
    }
    public void actualizarExigenciaRuta(RutaId rutaIdentity, Exigencia exigencia) {
        appendChange(new ExigenciaRutaActualizada(rutaIdentity, exigencia)).apply();
    }




}