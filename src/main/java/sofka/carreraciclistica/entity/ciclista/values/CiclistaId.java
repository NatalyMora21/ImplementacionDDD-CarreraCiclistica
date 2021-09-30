package sofka.carreraciclistica.entity.ciclista.values;

import co.com.sofka.domain.generic.Identity;

public class CiclistaId extends Identity {
    public CiclistaId(String id) {
        super(id);
    }
    public CiclistaId() {
    }
    public static CiclistaId of(String id) {
        return new CiclistaId(id);
    }
}
