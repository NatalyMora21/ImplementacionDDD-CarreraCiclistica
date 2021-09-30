package sofka.carreraciclistica.entity.competencia.values;

import co.com.sofka.domain.generic.Identity;

public class JuezId  extends Identity {
    public JuezId(){
    }
    public JuezId(String id) {
        super(id);
    }
    public static JuezId of(String id) {
        return new JuezId(id);
    }

}
