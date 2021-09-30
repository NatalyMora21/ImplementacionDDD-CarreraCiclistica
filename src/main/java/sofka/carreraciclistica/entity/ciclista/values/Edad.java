package sofka.carreraciclistica.entity.ciclista.values;

import co.com.sofka.domain.generic.ValueObject;

public class Edad implements ValueObject<String> {
    private final String value ;

    public Edad(String value) {
        this.value = value;
    }

    public String value(){
        return value;
    }
}
