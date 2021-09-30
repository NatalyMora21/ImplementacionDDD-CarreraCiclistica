package sofka.carreraciclistica.entity.ciclista.values;

import co.com.sofka.domain.generic.ValueObject;

public class Continuidad implements ValueObject<Boolean> {
    private final boolean value;

    public Continuidad(boolean value) {
        this.value = value;
    }

    public Boolean value(){
        return value;
    }
}
