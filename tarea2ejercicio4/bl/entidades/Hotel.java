/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.ucenfotec.tarea2ejercicio4.bl.entidades;

public class Hotel {

    /**
     * Atributo fechaEntrada del hotel
     */
    private String fechaEntrada;

    /**
     * Atributo fechaSalida del hotel
     */
    private String fechaSalida;

    /**
     * Atributo nombreMascota del hotel
     */
    private String nombreMascota;

    /**
     * Get de fechaEntrada
     *
     * @return fechaEntrada
     */
    public String getFechaEntrada() {
        return fechaEntrada;
    }

    /**
     * Get de fechaSalida
     *
     * @return fechaSalida
     */
    public String getFechaSalida() {
        return fechaSalida;
    }

    /**
     * Get de nombreMascota
     *
     * @return nombreMascota
     */
    public String getNombreMascota() {
        return nombreMascota;
    }

    /**
     * Recive el parametro fechaEntrada para el set
     *
     * @param fechaEntrada fechaEntrada
     */
    public void setFechaEntrada(String fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    /**
     * Recive el parametro fechaSalida para el set
     *
     * @param fechaSalida fechaSalida
     */
    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    /**
     * Recive el parametro nombreMascota para el set
     *
     * @param nombreMascota nombreMascota
     */
    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }

    /**
     * Constructor vacio Hotel
     */
    public Hotel() {
    }

    /**
     * Constructor Hotel con todos los atributos como parametros
     *
     * @param fechaEntrada fechaEntrada
     * @param fechaSalida fechaSalida
     * @param nombreMascota nombreMascota
     */
    public Hotel(String fechaEntrada, String fechaSalida, String nombreMascota) {
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.nombreMascota = nombreMascota;
    }

    @Override
    public String toString() {
        return "Reservacion{" + "fechaEntrada=" + fechaEntrada + ", fechaSalida=" + fechaSalida + ", nombreMascota=" + nombreMascota + '}';
    }

}
