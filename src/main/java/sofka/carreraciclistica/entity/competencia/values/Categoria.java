package sofka.carreraciclistica.entity.competencia.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Categoria implements ValueObject <Categoria.CategoriaEdad> {

    public enum CategoriaEdad {
        NINOS,
        JOVENES,
        ADULTOS
    }

    private final CategoriaEdad value;

    public Categoria(CategoriaEdad value) {
        this.value = Objects.requireNonNull(value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Categoria categoria = (Categoria) o;
        return value == categoria.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    public CategoriaEdad value() {
        return value;
    }
}
