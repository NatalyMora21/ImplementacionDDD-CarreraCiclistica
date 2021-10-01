package sofka.carreraciclistica.entity.ciclista.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Continuidad implements ValueObject<Boolean> {


    private final boolean value;

    public Continuidad(boolean value) {
        this.value = Objects.requireNonNull( value );
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Continuidad that = (Continuidad) o;
        return value == that.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    public Boolean value(){
        return value;
    }
}
