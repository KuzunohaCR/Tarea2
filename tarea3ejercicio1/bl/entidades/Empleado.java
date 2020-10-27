/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.ucenfotec.tarea3ejercicio1.bl.entidades;

public class Empleado {

    /**
     * Atributo nombre es el nombre del empleado Atributo cedula es la cedula
     * del empleado
     */
    private String nombre;
    private String cedula;

    /**
     * metodo get de la cedula
     *
     * @return cedula
     */
    public String getCedula() {
        return cedula;
    }

    /**
     * metodo get del nombre
     *
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Set que recive el parametro cedula
     *
     * @param cedula
     */
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    /**
     * Set que recive parametro nombre
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Constructor vacio
     */
    public Empleado() {
    }

    /**
     * Constructor que recive todos los atributos
     *
     * @param nombre
     * @param cedula
     */
    public Empleado(String nombre, String cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", cedula=" + cedula + '}';
    }

}
