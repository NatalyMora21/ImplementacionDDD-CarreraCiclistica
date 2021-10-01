package sofka.carreraciclistica.entity.ciclista;

import co.com.sofka.domain.generic.EventChange;
import sofka.carreraciclistica.entity.ciclista.events.*;
import sofka.carreraciclistica.entity.competencia.events.CompetenciaCreada;

public class CiclistaChange extends EventChange {

    public CiclistaChange(Ciclista ciclista) {

        apply((CiclistaCreado event)-> {
            ciclista.nombre = event.getNombre();
            ciclista.edad = event.getEdad();
            ciclista.identificacion = event.getIdentificacion();
        });

        apply((FallaMecanicaAgregada event)-> {
            ciclista.fallasMecanicas.add(
                    new FallaMecanica(
                            event.getFallaIdentity(),
                            event.getHora(),
                            event.getDescripcion(),
                            event.getCambios()
                    )
            );
        });

        apply((ReporteMedicoAgregado event)-> {
            ciclista.reportesMedicos.add(
                    new ReporteMedico(
                            event.getReporteIdentity(),
                            event.getDescripcion(),
                            event.getDiagnostico(),
                            event.getContinuidad()
                    )
            );
        });

        apply((ReporteMedicoAgregado event)-> {
            ciclista.reportesMedicos.add(
                    new ReporteMedico(
                            event.getReporteIdentity(),
                            event.getDescripcion(),
                            event.getDiagnostico(),
                            event.getContinuidad()
                    )
            );
        });

        apply((PuestoActualizado event)-> {
            ciclista.puesto= event.getPuesto();
        });

        apply((ContinuidadReporteMedicoActualizada event)-> {
            ciclista.continuidad= event.getContinuidad();
        });

        apply((ResultadoActualizado event)-> {
            ciclista.resultado = event.getResultado();
        });



    }
}
