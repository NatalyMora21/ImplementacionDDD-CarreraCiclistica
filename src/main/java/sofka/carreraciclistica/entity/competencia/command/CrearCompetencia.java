package sofka.carreraciclistica.entity.competencia.command;

import co.com.sofka.domain.generic.Command;
import sofka.carreraciclistica.entity.competencia.Ruta;
import sofka.carreraciclistica.entity.competencia.values.*;

public class CrearCompetencia extends Command {

    private final CompetenciaId identity;
    private final NombreCompetencia nombre;
    private final TipoCompetencia tipo;
    private final FechaInicio fechaInicio;
    private final Categoria categoria;
    private final Ruta ruta;

    public CrearCompetencia(CompetenciaId identity, NombreCompetencia nombre, TipoCompetencia tipo, FechaInicio fechaInicio, Categoria categoria, Ruta ruta) {
        this.identity = identity;
        this.nombre = nombre;
        this.tipo = tipo;
        this.fechaInicio = fechaInicio;
        this.categoria = categoria;
        this.ruta = ruta;
    }

    public CompetenciaId getIdentity() {
        return identity;
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
