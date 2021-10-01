package sofka.carreraciclistica.entity.ciclista.values;

import co.com.sofka.domain.generic.ValueObject;
import sofka.carreraciclistica.entity.competencia.values.Categoria;

public class Estado implements ValueObject<Estado.EstadoCiclista> {

    public enum EstadoCiclista {
        ACTIVO,
        INACTIVO
    }

    private final EstadoCiclista value;

    public Estado(EstadoCiclista value) {
        this.value = value;
    }

    public EstadoCiclista value() {
        return value;
    }
}
