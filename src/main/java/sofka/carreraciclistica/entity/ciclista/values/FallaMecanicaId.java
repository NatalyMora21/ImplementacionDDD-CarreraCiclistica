package sofka.carreraciclistica.entity.ciclista.values;

import co.com.sofka.domain.generic.Identity;

public class FallaMecanicaId extends Identity {

    public FallaMecanicaId(String id) {
        super(id);
    }

    public FallaMecanicaId() {
    }

    public static FallaMecanicaId of(String id) {
        return new FallaMecanicaId(id);
    }
}
