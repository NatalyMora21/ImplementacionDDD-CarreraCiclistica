package sofka.carreraciclistica.entity.ciclista;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import sofka.carreraciclistica.entity.ciclista.events.*;
import sofka.carreraciclistica.entity.ciclista.values.*;
import sofka.carreraciclistica.entity.ciclista.values.Nombre;
import sofka.carreraciclistica.entity.competencia.values.Exigencia;
import sofka.carreraciclistica.entity.competencia.values.Kilometros;


import java.util.List;
import java.util.Set;

public class Ciclista extends AggregateEvent<CiclistaId> {
    protected Nombre nombre;
    protected Edad edad;
    protected Identificacion identificacion;
    protected Estado estado;
    protected Resultado resultado;
    protected Puesto puesto;
    protected Continuidad continuidad;
    protected Set<ReporteMedico> reportesMedicos;
    protected Set<FallaMecanica> fallasMecanicas;

    public Ciclista(CiclistaId entityId, Nombre nombre, Edad edad, Identificacion identificacion) {
        super(entityId);
        appendChange(new CiclistaCreado(nombre,edad,identificacion));

    }

    private Ciclista(CiclistaId entityId){
        super(entityId);
        subscribe(new CiclistaChange(this));
    }

    public static Ciclista from(CiclistaId entityId, List<DomainEvent> events){
        var ciclista = new Ciclista(entityId);
        events.forEach(ciclista::applyEvent);
        return ciclista;
    }

    //Comportamiento agregado

    public void actualizarNombre(Nombre nombre) {
        appendChange(new NombreCiclistaActualizado(nombre)).apply();
    }
    public void actualizarEdad(Edad edad) {
        appendChange(new EdadActualizada(edad)).apply();
    }
    public void actualizarIdentifiacion(Identificacion identificacion) {
        appendChange(new IdentificacionActualizada(identificacion)).apply();
    }
    public void actualizarEstado(Estado estado) {
        appendChange(new EstadoActualizado(estado)).apply();
    }
    public void actualizarResultado(Resultado resultado) {
        appendChange(new ResultadoActualizado(resultado)).apply();
    }
    public void actualizarPuesto(Puesto puesto) {
        appendChange(new PuestoActualizado(puesto)).apply();
    }

    public void agregarReporteMedico( Descripcion descripcion, Diagnostico diagnostico, Continuidad continuidad) {
        ReporteId reporteIdentity = new ReporteId();
        appendChange(new ReporteMedicoAgregado(reporteIdentity,descripcion, diagnostico, continuidad)).apply();
    }

    public void agregarFallaMecanica(Hora hora, Descripcion descripcion, Cambios cambios) {
        FallaMecanicaId fallaIdentity = new FallaMecanicaId();
        appendChange(new FallaMecanicaAgregada(fallaIdentity, hora,descripcion, cambios)).apply();
    }

    //Comportamientos de las entidades
    public void actualizarDescripcionReporteMedico(ReporteId reporteIdentity, Descripcion descripcion) {
        appendChange(new DescripcionReporteMedicoactualizado(reporteIdentity, descripcion)).apply();
    }
    public void actualizarDiagnosticoReporteMedico(ReporteId reporteIdentity, Diagnostico diagnostico) {
        appendChange(new DiagnosticoReporteMedicoActualizado(reporteIdentity, diagnostico)).apply();
    }
    public void actualizarContinuidadReporteMedico(ReporteId reporteIdentity, Continuidad continuidad) {
        appendChange(new ContinuidadReporteMedicoActualizada(reporteIdentity, continuidad)).apply();
    }
    public void actualizarDescripcionFallaMecanica(FallaMecanicaId fallaIdentity, Descripcion descripcion) {
        appendChange(new DescripcionFallaMecanicaActualizada(fallaIdentity, descripcion)).apply();
    }
    public void actualizarCambiosFallaMecanica(FallaMecanicaId fallaIdentity, Exigencia exigencia) {
        appendChange(new CambiosFallaMecanicaActualizada(fallaIdentity, exigencia)).apply();
    }

}
