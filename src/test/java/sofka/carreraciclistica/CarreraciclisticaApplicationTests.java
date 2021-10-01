package sofka.carreraciclistica;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import sofka.carreraciclistica.entity.ciclista.command.CrearCiclista;
import sofka.carreraciclistica.entity.ciclista.events.CiclistaCreado;
import sofka.carreraciclistica.entity.ciclista.values.CiclistaId;
import sofka.carreraciclistica.entity.ciclista.values.Edad;
import sofka.carreraciclistica.entity.ciclista.values.Identificacion;
import sofka.carreraciclistica.entity.ciclista.values.Nombre;
import sofka.carreraciclistica.usecase.CrearCiclistaUseCase;

@SpringBootTest
class CarreraciclisticaApplicationTests {

	@Test
	void crearCiclista() {

		var command = new CrearCiclista(
				CiclistaId.of("xxx"),
				new Nombre("Nataly" , "Mora"),
				new Edad("23"),
				new Identificacion("1019135062", Identificacion.TipoDocumento.CC)
		);

		var useCase = new CrearCiclistaUseCase();

		//act
		//Forma de llamar el caso de uso

		var events = UseCaseHandler.getInstance().syncExecutor(useCase, new RequestCommand<>(command))
				.orElseThrow().getDomainEvents();

		//asert --> Consecuencias , el evento del
		var event =(CiclistaCreado)events.get(0);
		//Assertions.assertEquals("Nataly Mora", event.getNombre().value());
		Assertions.assertEquals("23", event.getEdad().value());
		Assertions.assertEquals("1019135062" , event.getIdentificacion().value());
	}

}
