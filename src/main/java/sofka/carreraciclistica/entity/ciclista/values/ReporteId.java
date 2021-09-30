package sofka.carreraciclistica.entity.ciclista.values;

import co.com.sofka.domain.generic.Identity;
import sofka.carreraciclistica.entity.competencia.values.JuezId;

public class ReporteId extends Identity {

    public ReporteId(String id) {
        super(id);
    }

    public ReporteId() {
    }

    public static ReporteId of(String id) {
        return new ReporteId(id);
    }
}
