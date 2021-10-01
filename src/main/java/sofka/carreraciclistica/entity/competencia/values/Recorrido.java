package sofka.carreraciclistica.entity.competencia.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Recorrido implements ValueObject <Recorrido.Props> {

    private final String lugarInicio;
    private final String lugarFin;

    public Recorrido(String lugarInicio, String lugarFin) {
        this.lugarInicio =  Objects.requireNonNull(lugarInicio);
        this.lugarFin = Objects.requireNonNull(lugarFin);
    }

    public Props value() {

        return new Props() {
            public String lugarInicio() {
                return lugarInicio;
            }
            public String lugarFin(){
                return lugarFin;
            }
        };
    }

    public interface Props{
        String lugarInicio();
        String lugarFin();
    }

}
