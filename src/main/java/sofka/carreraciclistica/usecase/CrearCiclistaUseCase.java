package sofka.carreraciclistica.usecase;


import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.domain.generic.DomainEvent;
import sofka.carreraciclistica.entity.ciclista.Ciclista;
import sofka.carreraciclistica.entity.ciclista.command.CrearCiclista;
import sofka.carreraciclistica.entity.ciclista.values.CiclistaId;
import sofka.carreraciclistica.entity.ciclista.values.Edad;
import sofka.carreraciclistica.entity.ciclista.values.Identificacion;
import sofka.carreraciclistica.entity.ciclista.values.Nombre;

import java.util.List;

public class CrearCiclistaUseCase extends UseCase <RequestCommand<CrearCiclista>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<CrearCiclista> crearCiclistaRequestCommand) {

        var command = crearCiclistaRequestCommand.getCommand();

        var cicilista = new Ciclista(
            command.getEntityId(),
            command.getNombreCiclista(),
            command.getEdadCiclista(),
            command.getIdentificacionCiclista()
        );

        emit().onResponse(new ResponseEvents(cicilista.getUncommittedChanges()));

    }

}
