/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.ucenfotec.tarea3ejercicio1.bl.entidades;

public class Computadora {

    /**
     * Serie es el atributo de la serie de la computadora Marca es el atributo
     * de la marca de la computadora responsable es el atributo del objeto
     * empleado
     */
    private String serie;
    private String marca;
    private Empleado responsable;

    /**
     * Get del atributo marca
     *
     * @return marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Get del atributo responsable
     *
     * @return responsable
     */
    public Empleado getResponsable() {
        return responsable;
    }

    /**
     * Get del atributo serie
     *
     * @return serie
     */
    public String getSerie() {
        return serie;
    }

    /**
     * recive el atributo marca
     *
     * @param marca
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * recive el atributo responsable
     *
     * @param responsable
     */
    public void setResponsable(Empleado responsable) {
        this.responsable = responsable;
    }

    /**
     * recive parametro el atributo serie
     *
     * @param serie
     */
    public void setSerie(String serie) {
        this.serie = serie;
    }

    /**
     * Constructor vacio
     */
    public Computadora() {
    }

    /**
     * Constructor de computadora que recive todos los atributos como parametros
     *
     * @param serie
     * @param marca
     * @param responsable
     */
    public Computadora(String serie, String marca, Empleado responsable) {
        this.serie = serie;
        this.marca = marca;
        this.responsable = responsable;
    }

    @Override
    public String toString() {
        return "Computadora{" + "serie=" + serie + ", marca=" + marca + ", responsable=" + responsable + '}';
    }

}
