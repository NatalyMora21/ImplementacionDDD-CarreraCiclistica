package sofka.carreraciclistica.entity.ciclista.values;

import co.com.sofka.domain.generic.ValueObject;

public class Puesto implements ValueObject<String> {
    private final String value ;

    public Puesto(String value) {
        this.value = value;
    }
    public String value(){
        return value;
    }
}
