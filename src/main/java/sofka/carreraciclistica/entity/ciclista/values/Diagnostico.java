package sofka.carreraciclistica.entity.ciclista.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Diagnostico implements ValueObject <String> {
    private final String value ;

    public Diagnostico(String value) {
        this.value = Objects.requireNonNull( value );
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Diagnostico that = (Diagnostico) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    public String value(){
        return value;
    }
}
