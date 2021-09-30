package sofka.carreraciclistica.entity.competencia.values;

import co.com.sofka.domain.generic.ValueObject;

public class TipoCompetencia implements ValueObject <TipoCompetencia.Tipo> {

    public enum Tipo {
        CICLISMOPISTA,
        CICLISMOMONSTAÑA,
    }
    private final Tipo value;
    public TipoCompetencia(Tipo value) {
        this.value=value;
    }
    public Tipo value() {
        return value;
    }

}
