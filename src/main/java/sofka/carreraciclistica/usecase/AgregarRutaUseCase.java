package sofka.carreraciclistica.usecase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import sofka.carreraciclistica.entity.competencia.Competencia;
import sofka.carreraciclistica.entity.competencia.command.AgregarRuta;
import sofka.carreraciclistica.entity.competencia.values.CompetenciaId;

public class AgregarRutaUseCase extends UseCase <RequestCommand<AgregarRuta>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<AgregarRuta> agregarRutaRequestCommand) {
        var command= agregarRutaRequestCommand.getCommand();
        var competencia = Competencia.from(command.getCompetenciaId(), retrieveEvents(command.getRutaIdentity().value()));
        competencia.agregarRuta(command.getRecorrido(),command.getKilometros(), command.getExigencia());
        emit().onResponse(new ResponseEvents(competencia.getUncommittedChanges()));

    }
}
