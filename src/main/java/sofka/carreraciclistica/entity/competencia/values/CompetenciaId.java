package sofka.carreraciclistica.entity.competencia.values;

import co.com.sofka.domain.generic.Identity;

public class CompetenciaId extends Identity {

    public CompetenciaId() {
    }
    public CompetenciaId(String id) {
        super(id);
    }
    public static CompetenciaId of(String id) {
        return new CompetenciaId(id);
    }





}
