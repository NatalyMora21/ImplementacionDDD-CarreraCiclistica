package sofka.carreraciclistica.entity.competencia.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Date;

public class FechaInicio implements ValueObject<Date> {

    private final Date value;
    public FechaInicio(Date value) {
        this.value=value;
    }

    public Date value() {
        return value;
    }
}
