/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.ucenfotec.tarea2ejercicio3.bl.entidades;

public class Usuario {

    /**
     * nombre del usuario
     */
    private String nombre;
    /**
     * atributo con la identificacion del usuario
     */
    private String identificacion;
    /**
     * atributo con la identificacion del genero
     */
    private String genero;
    /**
     * atributo con la fecha de nacimiento
     */
    private String fechaNacimiento;
    /**
     * atributo con la edad del usuario
     */
    private int edad;

    /**
     * Get de el atributo edad
     *
     * @return edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Get de el atributo fechaNacimiento
     *
     * @return fechaNacimiento
     */
    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * Get de el atributo genero
     *
     * @return genero
     */
    public String getGenero() {
        return genero;
    }

    /**
     * Get de el atributo identificacion
     *
     * @return identificacion
     */
    public String getIdentificacion() {
        return identificacion;
    }

    /**
     * Get de el atributo nombre
     *
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Recive el atributo edad como parametro
     *
     * @param edad edad
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Recive el atributo fechaNacimiento como parametro
     *
     * @param fechaNacimiento fechaNacimiento
     */
    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    /**
     * Recive el atributo genero como parametro
     *
     * @param genero genero
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }

    /**
     * Recive el atributo identificacion como parametro
     *
     * @param identificacion identificacion
     */
    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    /**
     * Recive el atributo nombre como parametro
     *
     * @param nombre nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Contenedor Usuario vacio
     */
    public Usuario() {
    }

    /**
     * Contenedor Usuario con todos los atributos de Usuario como parametros
     *
     * @param nombre nombre
     * @param identificacion identificacion
     * @param genero genero
     * @param fechaNacimiento fechaNacimiento
     * @param edad edad
     */
    public Usuario(String nombre, String identificacion, String genero, String fechaNacimiento, int edad) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.genero = genero;
        this.fechaNacimiento = fechaNacimiento;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", identificacion=" + identificacion + ", genero=" + genero + ", fechaNacimiento=" + fechaNacimiento + ", edad=" + edad + '}';
    }

}
