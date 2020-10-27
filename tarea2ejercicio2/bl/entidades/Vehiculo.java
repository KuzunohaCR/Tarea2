/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.ucenfotec.tarea2ejercicio2.bl.entidades;

public class Vehiculo {

    /**
     * serieVehiculo es el atributo de la serie marca es el atributo de la marca
     * del vehiculo motor es el objeto motor agregado al vehiculo
     */
    private String serieVehiculo;
    private String marca;
    private Motor motor;

    /**
     * Get del atributo marca
     *
     * @return marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Get del atributo motor
     *
     * @return motor
     */
    public Motor getMotor() {
        return motor;
    }

    /**
     * Get del atributo vehiculo
     *
     * @return serieVehiculo
     */
    public String getSerieVehiculo() {
        return serieVehiculo;
    }

    /**
     * recive parametro marca
     *
     * @param marca
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * recive objeto motor como parametro
     *
     * @param motor
     */
    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    /**
     * recive parametro serieVehiculo
     *
     * @param serieVehiculo
     */
    public void setSerieVehiculo(String serieVehiculo) {
        this.serieVehiculo = serieVehiculo;
    }

    /**
     * Constructor vacio de vehiculo
     */
    public Vehiculo() {
    }

    /**
     * Contructor de vehiculo que recive serie vehiculo, marca y motor
     *
     * @param serieVehiculo
     * @param marca
     * @param motor
     */
    public Vehiculo(String serieVehiculo, String marca, Motor motor) {
        this.serieVehiculo = serieVehiculo;
        this.marca = marca;
        this.motor = motor;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "serieVehiculo=" + serieVehiculo + ", marca=" + marca + ", motor=" + motor + '}';
    }

}
