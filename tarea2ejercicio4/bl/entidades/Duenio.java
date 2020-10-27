/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.ucenfotec.tarea2ejercicio4.bl.entidades;

public class Duenio {

    /**
     * Atributo nombre de duenio
     */
    private String nombre;

    /**
     * Atributo cedula de duenio
     */
    private String cedula;

    /**
     * Atributo telefono de duenio
     */
    private String telefono;

    /**
     * Atributo direccion de duenio
     */
    private String direccion;

    /**
     * Get del atributo Cedula
     *
     * @return cedula
     */
    public String getCedula() {
        return cedula;
    }

    /**
     * Get del atributo direccion
     *
     * @return direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Get del atributo nombre
     *
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Get del atributo telefono
     *
     * @return telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Recive cedula como parametro para el set
     *
     * @param cedula cedula
     */
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    /**
     * Recive direccion como parametro para el set
     *
     * @param direccion direccion
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * Recive nombre como parametro para el set
     *
     * @param nombre nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Recive telefono como parametro para el set
     *
     * @param telefono telefono
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * Constructor vacio de duenio
     */
    public Duenio() {
    }

    /**
     * Constructor duenio con todos los atributos como parametros
     *
     * @param nombre nombre
     * @param cedula cedula
     * @param telefono telefono
     * @param direccion direccion
     */
    public Duenio(String nombre, String cedula, String telefono, String direccion) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Duenio{" + "nombre=" + nombre + ", cedula=" + cedula + ", telefono=" + telefono + ", direccion=" + direccion + '}';
    }

}
