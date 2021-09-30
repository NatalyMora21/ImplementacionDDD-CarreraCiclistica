package sofka.carreraciclistica.entity.competencia.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Podio implements ValueObject <Podio.Props> {
    private final String primerPuesto;
    private final String segundoPuesto;
    private final String tercerPuesto;

    public Podio(String primerPuesto, String segundoPuesto, String tercerPuesto) {
        this.primerPuesto = Objects.requireNonNull(primerPuesto);
        this.segundoPuesto = Objects.requireNonNull(segundoPuesto);
        this.tercerPuesto = Objects.requireNonNull(tercerPuesto);
    }

    public Props value() {

        return new Props() {
            public String primerPuesto() {
                return primerPuesto;
            }

            public String segundoPuesto(){
                return segundoPuesto;
            }
            public String tercerPuesto(){
                return tercerPuesto;
            }
        };

    }

    public interface Props{
        String primerPuesto();
        String segundoPuesto();
        String tercerPuesto();

    }

}
