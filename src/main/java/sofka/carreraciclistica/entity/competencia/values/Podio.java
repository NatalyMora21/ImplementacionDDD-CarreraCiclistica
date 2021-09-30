package sofka.carreraciclistica.entity.competencia.values;

import co.com.sofka.domain.generic.ValueObject;

public class Podio implements ValueObject <String> {
    private final String primerPuesto;
    private final String segundoPuesto;
    private final String tercerPuesto;

    public Podio(String primerPuesto, String segundoPuesto, String tercerPuesto) {
        this.primerPuesto = primerPuesto;
        this.segundoPuesto = segundoPuesto;
        this.tercerPuesto = tercerPuesto;
    }

    public String value() {
        return null;
    }
}
