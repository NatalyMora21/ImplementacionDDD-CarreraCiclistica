package sofka.carreraciclistica.entity.ciclista.values;

import co.com.sofka.domain.generic.ValueObject;

public class Cambios implements ValueObject<String> {

    private final String value ;

    public Cambios(String value) {
        this.value = value;
    }
    public String value(){
        return value;
    }
}
