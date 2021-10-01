package sofka.carreraciclistica.usecase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.domain.generic.DomainEvent;
import sofka.carreraciclistica.entity.ciclista.Ciclista;
import sofka.carreraciclistica.entity.ciclista.values.CiclistaId;
import sofka.carreraciclistica.entity.ciclista.values.Edad;
import sofka.carreraciclistica.entity.ciclista.values.Identificacion;
import sofka.carreraciclistica.entity.ciclista.values.Nombre;

import java.util.List;

public class CrearCiclistaUseCasePrueba extends UseCase<CrearCiclistaUseCasePrueba.Request, CrearCiclistaUseCasePrueba.Reponse> {

    @Override
    public void executeUseCase(Request request) {

        var cicilista = new Ciclista(
                CiclistaId.of(request.getId()),
                new Nombre(request.getNombre(),request.getApellido()),
                new Edad(request.getEdad()),
                new Identificacion(request.getIdentificacion(),request.getTipo())
        );

        List<DomainEvent> eventList= cicilista.getUncommittedChanges();
        //Entregar respuesta
        emit().onResponse(new Reponse(eventList));

    }

    public static class Request implements UseCase.RequestValues{
        private final String id;
        private final String nombre;
        private final String apellido;
        private final String edad;
        private final String tipo;
        private final String identificacion;
        private Identificacion.TipoDocumento tipoDocumento;

        public Request(String id, String nombre, String apellido, String edad, String tipo, String identificacion) {
            this.id = id;
            this.nombre = nombre;
            this.apellido = apellido;
            this.edad = edad;
            this.tipo = tipo;
            this.identificacion = identificacion;
        }

        public String getId() {
            return id;
        }

        public String getNombre() {
            return nombre;
        }

        public String getApellido() {
            return apellido;
        }

        public String getEdad() {
            return edad;
        }

        public Identificacion.TipoDocumento getTipo() {

            switch (tipo) {
                case "CC":
                    tipoDocumento = Identificacion.TipoDocumento.CC;
                    break;
                case "TI":
                    tipoDocumento = Identificacion.TipoDocumento.TI;
                    break;
                case "CE":
                    tipoDocumento = Identificacion.TipoDocumento.CE;
                    break;
                case "PA":
                    tipoDocumento = Identificacion.TipoDocumento.PASAPORTE;

            }
            return tipoDocumento;
        }

        public String getIdentificacion() {
            return identificacion;
        }
    }
    public static class Reponse implements UseCase.ResponseValues{

        private final List<DomainEvent> eventList;

        public Reponse(List<DomainEvent> eventList) {
            this.eventList = eventList;
        }

        public List<DomainEvent> getEventList() {
            return eventList;
        }
    }
}
