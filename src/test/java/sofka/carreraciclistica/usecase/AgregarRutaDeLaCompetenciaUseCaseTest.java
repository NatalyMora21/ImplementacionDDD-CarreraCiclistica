package sofka.carreraciclistica.usecase;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import sofka.carreraciclistica.entity.competencia.command.AgregarRuta;
import sofka.carreraciclistica.entity.competencia.values.*;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class AgregarRutaDeLaCompetenciaUseCaseTest {

    private static final String ID_RUTA = "xxx-R";

    @Mock
    private DomainEventRepository repository;

    @Test
    @DisplayName("Prueba que valida la asociación de una ruta a la competencia");
    void agregarRutaCompetencia () {

        var command = new AgregarRuta(
                CompetenciaId.of("xxx-C"),
                new RutaId(ID_RUTA),
                new Recorrido("Parque-Inicio", "Parque-Fin"),
                new Kilometros("10"),
                new Exigencia(Exigencia.TipoExigencia.MEDIA)

        );

        var useCase = new AgregarRutaUseCase();
        Mockito.when(repository.getEventsBy(ID_RUTA)).thenReturn(EventStored());
        useCase.addRepository(repository);

        //act
        var events = UseCaseHandler.getInstance()
                .setIdentifyExecutor(ID_RUTA)
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();
    }

}