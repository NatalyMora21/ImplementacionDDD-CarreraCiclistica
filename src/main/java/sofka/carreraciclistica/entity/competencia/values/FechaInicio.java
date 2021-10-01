package sofka.carreraciclistica.entity.competencia.values;

import co.com.sofka.domain.generic.ValueObject;

import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;

public class FechaInicio implements ValueObject<LocalDate> {

    private final LocalDate value;
    public FechaInicio(LocalDate value) {
        this.value= Objects.requireNonNull(value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FechaInicio that = (FechaInicio) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    public LocalDate value() {
        return value;
    }
}
