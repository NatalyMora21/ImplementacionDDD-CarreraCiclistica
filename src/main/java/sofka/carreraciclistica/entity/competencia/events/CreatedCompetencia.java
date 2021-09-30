package sofka.carreraciclistica.entity.competencia.events;

import co.com.sofka.domain.generic.DomainEvent;
import sofka.carreraciclistica.entity.competencia.Ruta;
import sofka.carreraciclistica.entity.competencia.values.Categoria;
import sofka.carreraciclistica.entity.competencia.values.FechaInicio;
import sofka.carreraciclistica.entity.competencia.values.NombreCompetencia;
import sofka.carreraciclistica.entity.competencia.values.TipoCompetencia;

public class CreatedCompetencia extends DomainEvent {
    public CreatedCompetencia(NombreCompetencia nombre, TipoCompetencia tipo, FechaInicio fechaInicio, Categoria categoria, Ruta ruta) {
        super();
    }
}
