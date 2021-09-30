package sofka.carreraciclistica.entity.competencia.events;

import co.com.sofka.domain.generic.DomainEvent;
import sofka.carreraciclistica.entity.ciclista.values.CiclistaId;
import sofka.carreraciclistica.entity.competencia.Juez;
import sofka.carreraciclistica.entity.competencia.Ruta;
import sofka.carreraciclistica.entity.competencia.values.*;

import java.util.Set;

public class CompetenciaCreada extends DomainEvent {

    protected NombreCompetencia nombre;
    protected TipoCompetencia tipo;
    protected FechaInicio fechaInicio;
    protected Categoria categoria;
    protected Ruta ruta;


    public CompetenciaCreada(NombreCompetencia nombre, TipoCompetencia tipo, FechaInicio fechaInicio, Categoria categoria, Ruta ruta) {
        super("sofka.competencia.competenciaCreada");
        this.nombre= nombre;
        this.tipo= tipo;
        this.fechaInicio= fechaInicio;
        this.categoria= categoria;
        this.ruta= ruta;
    }

    public NombreCompetencia getNombre() {
        return nombre;
    }

    public TipoCompetencia getTipo() {
        return tipo;
    }

    public FechaInicio getFechaInicio() {
        return fechaInicio;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public Ruta getRuta() {
        return ruta;
    }
}
