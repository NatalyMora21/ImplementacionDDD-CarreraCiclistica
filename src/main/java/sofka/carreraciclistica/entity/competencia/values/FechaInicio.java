package sofka.carreraciclistica.entity.competencia.values;

import co.com.sofka.domain.generic.ValueObject;

import java.time.LocalDate;
import java.util.Date;

public class FechaInicio implements ValueObject<LocalDate> {

    private final LocalDate value;
    public FechaInicio(LocalDate value) {
        this.value=value;
    }

    public LocalDate value() {
        return value;
    }
}
