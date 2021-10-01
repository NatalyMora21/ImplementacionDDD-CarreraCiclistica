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



}
