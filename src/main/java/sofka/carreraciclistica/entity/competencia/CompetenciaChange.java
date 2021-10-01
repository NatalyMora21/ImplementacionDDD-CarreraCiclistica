package sofka.carreraciclistica.entity.competencia;

import co.com.sofka.domain.generic.EventChange;
import sofka.carreraciclistica.entity.competencia.events.*;

public class CompetenciaChange extends EventChange {

    public CompetenciaChange (Competencia competencia) {

        apply((CompetenciaCreada event)-> {
            competencia.nombre = event.getNombre();
            competencia.tipo = event.getTipo();
            competencia.fechaInicio = event.getFechaInicio();
            competencia.categoria = event.getCategoria();
            competencia.ruta = event.getRuta();
        });

        apply((JuezAgregado event) -> {
            var juez = new Juez(
                    event.getJuezId(),
                    event.getNombre(),
                    event.getFuncion()
            );
            competencia.juez = juez;
        });

        apply((RutaAgregada event) -> {
            var ruta = new Ruta(
                    event.getRutaIdentity(),
                    event.getRecorrido(),
                    event.getKilometros(),
                    event.getExigencia()
            );
            competencia.ruta = ruta;
        });

        apply((RutaAgregada event) -> {
            var ruta = new Ruta(
                    event.getRutaIdentity(),
                    event.getRecorrido(),
                    event.getKilometros(),
                    event.getExigencia()
            );
            competencia.ruta = ruta;
        });


        apply((CiclistaAsociado event) -> {
            competencia.ciclistas.add(event.getCiclistaId());
        });

        apply((PodioAgregado event) -> {
            competencia.podio = event.getPodio();
        });


    }
}
