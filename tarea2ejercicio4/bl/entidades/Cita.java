/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.ucenfotec.tarea2ejercicio4.bl.entidades;

public class Cita {

    /**
     * Atributo nombre de la mascota en la cita
     */
    private String nombreMascota;

    /**
     * Atributo fecha en la cita
     */
    private String fecha;
    /**
     * Atributo hora en la cita
     */
    private String hora;
    /**
     * Atributo observaciones en la cita
     */
    private String observaciones;

    /**
     * Get de la fecha
     *
     * @return fecha
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * Get de la hora
     *
     * @return hora
     */
    public String getHora() {
        return hora;
    }

    /**
     * Get del nombreMascota
     *
     * @return Mascota
     */
    public String getNombreMascota() {
        return nombreMascota;
    }

    /**
     * Get de observaciones
     *
     * @return observaciones
     */
    public String getObservaciones() {
        return observaciones;
    }

    /**
     * Recive el parametro fecha
     *
     * @param fecha fecha
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /**
     * Recive el parametro hora
     *
     * @param hora hora
     */
    public void setHora(String hora) {
        this.hora = hora;
    }

    /**
     * Recive el nombreMascota como parametro
     *
     * @param nombreMascota nombreMascota
     */
    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }

    /**
     * Recive las observaciones como parametro
     *
     * @param observaciones observaciones
     */
    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    /**
     * Constructor vacio de Cita
     */
    public Cita() {
    }

    /**
     * Constructor que tiene todos los atributos como parametros de la cita
     *
     * @param nombreMascota nombreMascota
     * @param fecha fecha
     * @param hora hora
     * @param observaciones observaciones
     */
    public Cita(String nombreMascota, String fecha, String hora, String observaciones) {
        this.nombreMascota = nombreMascota;
        this.fecha = fecha;
        this.hora = hora;
        this.observaciones = observaciones;
    }

    @Override
    public String toString() {
        return "Cita{" + "nombreMascota=" + nombreMascota + ", fecha=" + fecha + ", hora=" + hora + ", observaciones=" + observaciones + '}';
    }

}
