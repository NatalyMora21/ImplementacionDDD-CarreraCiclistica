package sofka.carreraciclistica.entity.ciclista.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Identificacion implements ValueObject<Identificacion.Props> {

    public enum TipoDocumento
    {
        TI, CC, CE, PASAPORTE;
    }
    private final String numero;
    private final TipoDocumento tipoDocumento;

    public Identificacion(String numero, TipoDocumento tipoDocumento) {
        this.numero = Objects.requireNonNull( numero );
        this.tipoDocumento = Objects.requireNonNull(tipoDocumento);
    }
    public Props value() {
        return new Props() {
            @Override
            public String numero() {
                return numero;
            }
            @Override
            public TipoDocumento tipoDocumento() {
                return tipoDocumento;
            }
        };
    }
    public interface Props{
        String numero();
        TipoDocumento tipoDocumento();
    }
}
