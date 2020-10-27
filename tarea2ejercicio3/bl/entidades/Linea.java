/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.ucenfotec.tarea2ejercicio3.bl.entidades;

public class Linea {

    /**
     * cantidad en la linea
     */
    private int cantidad;
    /**
     * producto en la linea
     */
    private Producto producto;

    /**
     * Get del atributo cantidad
     *
     * @return cantidad
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * Get del atributo producto
     *
     * @return producto
     */
    public Producto getProducto() {
        return producto;
    }

    /**
     * Recive el parametro cantidad
     *
     * @param cantidad cantidad
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * Recive el atributo producto como parametro
     *
     * @param producto producto
     */
    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    /**
     * Constructor vacio
     */
    public Linea() {
    }

    /**
     * Constructor que recive como parametros todos los atributos
     *
     * @param cantidad cantidad
     * @param producto producto
     */
    public Linea(int cantidad, Producto producto) {
        this.cantidad = cantidad;
        this.producto = producto;
    }

    @Override
    public String toString() {
        return "Linea{" + "cantidad=" + cantidad + ", producto=" + producto + '}';
    }

}
