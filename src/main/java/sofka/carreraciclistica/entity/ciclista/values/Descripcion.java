package sofka.carreraciclistica.entity.ciclista.values;

import co.com.sofka.domain.generic.ValueObject;

public class Descripcion implements ValueObject<String> {
    private final String value ;

    public Descripcion(String value) {
        this.value = value;
    }
    public String value(){
        return value;
    }
}
