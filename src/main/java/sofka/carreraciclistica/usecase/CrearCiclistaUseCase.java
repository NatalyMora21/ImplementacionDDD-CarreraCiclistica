package sofka.carreraciclistica.usecase;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import sofka.carreraciclistica.entity.ciclista.Ciclista;
import sofka.carreraciclistica.entity.ciclista.command.CrearCiclista;
import sofka.carreraciclistica.entity.competencia.Competencia;

public class CrearCiclistaUseCase extends UseCase <RequestCommand<CrearCiclista>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<CrearCiclista> crearCiclistaRequestCommand) {

        var command = crearCiclistaRequestCommand.getCommand();


        var ciclista = new Ciclista(
            command.getEntityId(),
            command.getNombreCiclista(),
            command.getEdadCiclista(),
            command.getIdentificacionCiclista()
        );

        emit().onResponse(new ResponseEvents(ciclista.getUncommittedChanges()));

    }

}
