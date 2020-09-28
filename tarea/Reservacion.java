package cr.ac.ucenfotec.poo.tarea;

public class Reservacion {

    private String fechaEntrada;
    private String fechaSalida;
    private String nombreMascota;

    public void setFechaEntrada(String fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public String getFechaEntrada() {
        return this.fechaEntrada;
    }

    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public String getFechaSalia() {
        return this.fechaSalida;
    }

    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }

    public String getNombreMascota() {
        return this.nombreMascota;
    }

    @Override
    public String toString() {
        return "Cita:[nombre:" + this.nombreMascota + ", fecha entrada:" + this.fechaEntrada + ", fecha salida " + this.fechaSalida + "]";
    }

    public Reservacion(String fechaEntrada, String fechaSalia, String nombreMascota) {
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalia;
        this.nombreMascota = nombreMascota;
    }

    public Reservacion() {
    }
;
}
