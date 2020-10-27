/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.ucenfotec.tarea2ejercicio3.bl.entidades;

public class Producto {

    /**
     * Atributo con el codigo del producto
     */
    private String codigo;
    /**
     * Atributo con la descripcion del producto
     */
    private String descripcion;
    /**
     * Atributo con el precio del producto
     */
    private double precio;

    /**
     * Get del codigo
     *
     * @return codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Get de la descripcion
     *
     * @return descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Get del precio
     *
     * @return precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Set que recive el parametro codigo
     *
     * @param codigo codigo
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * Set de la descrioncio con el parametro descripcion
     *
     * @param descripcion descripcion
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Set que recive como parametro el atributo precio
     *
     * @param precio precio
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * Constructor vacio
     */
    public Producto() {
    }

    /**
     * Constructor que recive el parametro codigo,descripcion y precio
     *
     * @param codigo codigo
     * @param descripcion descripcion
     * @param precio precio
     */
    public Producto(String codigo, String descripcion, double precio) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" + "codigo=" + codigo + ", descripcion=" + descripcion + ", precio=" + precio + '}';
    }

}
