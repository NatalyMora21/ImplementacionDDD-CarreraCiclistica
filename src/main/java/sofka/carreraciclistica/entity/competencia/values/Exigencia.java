package sofka.carreraciclistica.entity.competencia.values;

import co.com.sofka.domain.generic.ValueObject;

public class Exigencia implements ValueObject<Exigencia.TipoExigencia> {

    public enum TipoExigencia {
        BAJA,
        MEDIA,
        ALTA
    }
    private final TipoExigencia value;

    public Exigencia(TipoExigencia value) {
        this.value = value;
    }
    public TipoExigencia value() {
        return value;
    }
}
