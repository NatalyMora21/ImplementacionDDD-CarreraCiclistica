package sofka.carreraciclistica.usecase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.business.support.TriggeredEvent;
import org.springframework.scheduling.Trigger;
import sofka.carreraciclistica.entity.ciclista.Ciclista;
import sofka.carreraciclistica.entity.ciclista.events.ContinuidadReporteMedicoActualizada;
import sofka.carreraciclistica.entity.ciclista.events.EstadoActualizado;
import sofka.carreraciclistica.entity.ciclista.values.CiclistaId;
import sofka.carreraciclistica.entity.ciclista.values.Continuidad;
import sofka.carreraciclistica.entity.ciclista.values.Estado;

public class AlterarCiclistaQueSaleDeCompetenciaUseCase extends UseCase<TriggeredEvent<ContinuidadReporteMedicoActualizada>, ResponseEvents> {

    @Override
    public void executeUseCase(TriggeredEvent<ContinuidadReporteMedicoActualizada> continuidadReporteMedicoActualizadaTriggeredEvent) {

        var event = continuidadReporteMedicoActualizadaTriggeredEvent.getDomainEvent();
        var ciclista= Ciclista.from(CiclistaId.of(event.aggregateRootId()),this.retrieveEvents());


        if(event.getContinuidad().value()==Boolean.FALSE){
            ciclista.actualizarEstado(new Estado(Estado.EstadoCiclista.INACTIVO));
            emit().onResponse(new ResponseEvents(ciclista.getUncommittedChanges()));
        }

    }
}
