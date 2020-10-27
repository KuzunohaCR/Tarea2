/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.ucenfotec.tarea2ejercicio4.bl.entidades;

public class Usuario {

    /**
     * Atributo nombre de Usuario
     */
    private String nombre;
    /**
     * Atributo cedula de Usuario
     */
    private int cedula;
    /**
     * Atributo telefono de Usuario
     */
    private int telefono;
    /**
     * Atributo direccion de Usuario
     */
    private String direccion;
    /**
     * Atributo estado de Usuario
     */
    private String estado;
    /**
     * Atributo rol de Usuario
     */
    private String rol;

    /**
     * Get de cedula
     *
     * @return cedula
     */
    public int getCedula() {
        return cedula;
    }

    /**
     * Get de direccion
     *
     * @return direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Get de estado
     *
     * @return estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Get de nombre
     *
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Get de rol
     *
     * @return rol
     */
    public String getRol() {
        return rol;
    }

    /**
     * Get de telefono
     *
     * @return telefono
     */
    public int getTelefono() {
        return telefono;
    }

    /**
     * Recive atributo cedula
     *
     * @param cedula cedula
     */
    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    /**
     * Recive atributo direccion
     *
     * @param direccion direccion
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * Recive atributo estado
     *
     * @param estado estado
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * Recive atributo nombre
     *
     * @param nombre nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Recive atributo rol
     *
     * @param rol rol
     */
    public void setRol(String rol) {
        this.rol = rol;
    }

    /**
     * Recive atributo telefono para el set
     *
     * @param telefono telefono
     */
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    /**
     * Constructor vacio
     */
    public Usuario() {
    }

    /**
     * Constructor Usuario con todos los atributos como parametros
     *
     * @param nombre nombre
     * @param cedula cedula
     * @param telefono telefono
     * @param direccion direccion
     * @param estado estado
     * @param rol rol
     */
    public Usuario(String nombre, int cedula, int telefono, String direccion, String estado, String rol) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.telefono = telefono;
        this.direccion = direccion;
        this.estado = estado;
        this.rol = rol;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", cedula=" + cedula + ", telefono=" + telefono + ", direccion=" + direccion + ", estado=" + estado + ", rol=" + rol + '}';
    }

}
