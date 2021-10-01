package sofka.carreraciclistica.entity.ciclista.values;

import co.com.sofka.domain.generic.ValueObject;
import sofka.carreraciclistica.entity.competencia.values.Categoria;

import java.util.Objects;

public class Estado implements ValueObject<Estado.EstadoCiclista> {

    public enum EstadoCiclista {
        ACTIVO,
        INACTIVO
    }

    private final EstadoCiclista value;

    public Estado(EstadoCiclista value) {
        this.value = Objects.requireNonNull(value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Estado estado = (Estado) o;
        return value == estado.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    public EstadoCiclista value() {
        return value;
    }
}
