package sofka.carreraciclistica.entity.competencia.values;

import co.com.sofka.domain.generic.ValueObject;

public class Categoria implements ValueObject <Categoria.CategoriaEdad> {

    public enum CategoriaEdad {
        NINOS,
        JOVENES,
        ADULTOS
    }

    private final CategoriaEdad value;

    public Categoria(CategoriaEdad value) {
        this.value = value;
    }

    public CategoriaEdad value() {
        return value;
    }
}
