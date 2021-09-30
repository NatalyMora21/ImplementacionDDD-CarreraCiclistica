package sofka.carreraciclistica.entity.competencia.values;

import co.com.sofka.domain.generic.ValueObject;

public class NombreCompetencia implements ValueObject<String> {

    private final String value ;

    public NombreCompetencia(String value) {
        this.value = value;
    }

    public String value(){
        return value;
    }
}
