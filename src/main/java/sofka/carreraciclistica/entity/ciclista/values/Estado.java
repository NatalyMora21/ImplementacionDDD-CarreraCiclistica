package sofka.carreraciclistica.entity.ciclista.values;

import sofka.carreraciclistica.entity.competencia.values.Categoria;

public class Estado {

    public enum EstadoCiclista {
        ACTIVO,
        INACTIVO
    }

    private final EstadoCiclista value;

    public Estado(EstadoCiclista value) {
        this.value = value;
    }

    public EstadoCiclista value() {
        return value;
    }
}
