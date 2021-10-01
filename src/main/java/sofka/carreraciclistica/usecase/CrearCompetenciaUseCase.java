package sofka.carreraciclistica.usecase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import sofka.carreraciclistica.entity.competencia.Competencia;
import sofka.carreraciclistica.entity.competencia.command.CrearCompetencia;

public class CrearCompetenciaUseCase extends UseCase<RequestCommand<CrearCompetencia> , ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<CrearCompetencia> crearCompetenciaRequestCommand) {
        var command = crearCompetenciaRequestCommand.getCommand();

        var competencia= new Competencia(
                command.getIdentity(),
                command.getNombre(),
                command.getTipo(),
                command.getFechaInicio(),
                command.getCategoria(),
                command.getRuta()
        );

        emit().onResponse(new ResponseEvents(competencia.getUncommittedChanges()));
    }
}
