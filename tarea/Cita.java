package cr.ac.ucenfotec.poo.tarea;

public class Cita {

    private String nombreMascota;
    private String fecha;
    private String hora;
    private String observaciones;

    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }

    public String getNombreMascota() {
        return this.nombreMascota;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getFecha() {
        return this.fecha;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getHora() {
        return this.hora;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getObservaciones() {
        return this.observaciones;
    }

    @Override
    public String toString() {
        return "Cita:[nombre:" + this.nombreMascota + ", fecha:" + this.fecha + ", hora: " + this.hora + ", observaciones: " + this.observaciones + "]";
    }

    public Cita(String nombreMascota, String fecha, String hora, String observaciones) {
        this.nombreMascota = nombreMascota;
        this.fecha = fecha;
        this.hora = hora;
        this.observaciones = observaciones;
    }

    public Cita() {
    }
;

}
