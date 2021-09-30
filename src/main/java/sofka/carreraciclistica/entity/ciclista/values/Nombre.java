package sofka.carreraciclistica.entity.ciclista.values;

import co.com.sofka.domain.generic.ValueObject;
import sofka.carreraciclistica.entity.competencia.values.Recorrido;

public class Nombre implements ValueObject<Nombre.Props> {

    private final String nombre ;
    private final String apellido ;

    public Nombre(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Props value() {

        return new Props() {
            public String nombre() {
                return nombre;
            }
            public String apellido(){
                return apellido;
            }
        };
    }

    public interface Props{
        String nombre();
        String apellido();
    }
}
