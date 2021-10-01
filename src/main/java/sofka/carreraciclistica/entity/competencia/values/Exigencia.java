package sofka.carreraciclistica.entity.competencia.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Exigencia implements ValueObject<Exigencia.TipoExigencia> {

    public enum TipoExigencia {
        BAJA,
        MEDIA,
        ALTA
    }
    private final TipoExigencia value;

    public Exigencia(TipoExigencia value) {
        this.value = Objects.requireNonNull( value );
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Exigencia exigencia = (Exigencia) o;
        return value == exigencia.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    public TipoExigencia value() {
        return value;
    }
}
