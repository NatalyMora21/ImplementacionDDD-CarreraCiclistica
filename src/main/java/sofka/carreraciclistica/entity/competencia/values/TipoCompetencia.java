package sofka.carreraciclistica.entity.competencia.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class TipoCompetencia implements ValueObject <TipoCompetencia.Tipo> {

    public enum Tipo {
        CICLISMOPISTA,
        CICLISMOMONSTAÑA,
    }
    private final Tipo value;
    public TipoCompetencia(Tipo value) {
        this.value = Objects.requireNonNull(value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TipoCompetencia that = (TipoCompetencia) o;
        return value == that.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    public Tipo value() {
        return value;
    }

}
