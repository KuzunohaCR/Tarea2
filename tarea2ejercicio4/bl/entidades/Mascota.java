/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.ucenfotec.tarea2ejercicio4.bl.entidades;

public class Mascota {

    /**
     * Atributo nombre de mascota
     */
    private String nombre;

    /**
     * Atributo duenio de mascota
     */
    private Duenio duenio;
    /**
     * Atributo avatar de mascota
     */
    private String avatar;
    /**
     * Atributo descripcion de mascota
     */
    private String descripcion;
    /**
     * Atributo ranking de mascota
     */
    private int ranking;

    /**
     * Get de avatar
     *
     * @return avatar
     */
    public String getAvatar() {
        return avatar;
    }

    /**
     * Get de descripcion
     *
     * @return descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Get de duenio
     *
     * @return duenio
     */
    public Duenio getDuenio() {
        return duenio;
    }

    /**
     * Get de nombre
     *
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    public int getRanking() {
        return ranking;
    }

    /**
     * Recive el parametro avatar para el set
     *
     * @param avatar avatar
     */
    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    /**
     * Recive el parametro descripcion para el set
     *
     * @param descripcion descripcion
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Recive el parametro duenio para el set
     *
     * @param duenio duenio
     */
    public void setDuenio(Duenio duenio) {
        this.duenio = duenio;
    }

    /**
     * Recive el parametro nombre para el set
     *
     * @param nombre nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * recive el parametro ranking para el set
     *
     * @param ranking ranking
     */
    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    /**
     * Constructor vacio Mascota
     */
    public Mascota() {
    }

    /**
     * Constructor Mascota con todos los atributos como parametros
     *
     * @param nombre nombre
     * @param duenio duenio
     * @param avatar avatar
     * @param descripcion descripcion
     * @param ranking ranking
     */
    public Mascota(String nombre, Duenio duenio, String avatar, String descripcion, int ranking) {
        this.nombre = nombre;
        this.duenio = duenio;
        this.avatar = avatar;
        this.descripcion = descripcion;
        this.ranking = ranking;
    }

    @Override
    public String toString() {
        return "Mascota{" + "nombre=" + nombre + ", duenio=" + duenio + ", avatar=" + avatar + ", descripcion=" + descripcion + ", ranking=" + ranking + '}';
    }

}
