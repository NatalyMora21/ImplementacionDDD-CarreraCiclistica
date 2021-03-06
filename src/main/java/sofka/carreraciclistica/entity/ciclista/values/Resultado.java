package sofka.carreraciclistica.entity.ciclista.values;

import co.com.sofka.domain.generic.ValueObject;
import sofka.carreraciclistica.entity.competencia.values.Recorrido;

import java.util.Objects;

public class Resultado implements ValueObject<Resultado.Props> {

    private final String tiempo;
    private final String kilometrosRecorridos;
    private final String velocidad;

    public Resultado(String tiempo, String kilometrosRecorridos, String velocidad) {
        this.tiempo = Objects.requireNonNull(tiempo);
        this.kilometrosRecorridos = Objects.requireNonNull(kilometrosRecorridos);
        this.velocidad =Objects.requireNonNull( velocidad);
    }

    public Props value() {

        return new Props() {
            public String tiempo() {
                return tiempo;
            }
            public String kilometrosRecorridos(){
                return kilometrosRecorridos;
            }
            public String velocidad(){
                return velocidad;
            }
        };
    }

    public interface Props{
        String tiempo();
        String kilometrosRecorridos();
        String velocidad();
    }

}
