/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.ucenfotec.tarea2ejercicio3.bl.entidades;

import java.time.LocalDate;

public class Factura {

    /**
     * Numero de la factura
     */
    private String numero;
    /**
     * Usuario de la factura
     */
    private Usuario usuarios;
    /**
     * Fecha de la factura
     */
    private LocalDate fecha;
    /**
     * Linea de la factura
     */
    private Linea linea;

    /**
     * Get del atributo fecha
     *
     * @return fecha
     */
    public LocalDate getFecha() {
        return fecha;
    }

    /**
     * Get del atributo linea
     *
     * @return linea
     */
    public Linea getLinea() {
        return linea;
    }

    /**
     * Get del atributo numero
     *
     * @return numero
     */
    public String getNumero() {
        return numero;
    }

    /**
     * Get del atributo usuario
     *
     * @return usuarios
     */
    public Usuario getUsuarios() {
        return usuarios;
    }

    /**
     * Recive el parametro fecha
     *
     * @param fecha fecha
     */
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    /**
     * Recive el parametro linea
     *
     * @param linea linea
     */
    public void setLinea(Linea linea) {
        this.linea = linea;
    }

    /**
     * Recive el parametro numero
     *
     * @param numero numero
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }

    /**
     * Recive el parametro usuarios
     *
     * @param usuarios usuarios
     */
    public void setUsuarios(Usuario usuarios) {
        this.usuarios = usuarios;
    }

    /**
     * Constructor vacio
     */
    public Factura() {
    }

    /**
     * Constructor que recive todos los atributos como parametro
     *
     * @param numero numero
     * @param usuarios usuarios
     * @param fecha fecha
     * @param linea linea
     */
    public Factura(String numero, Usuario usuarios, LocalDate fecha, Linea linea) {
        this.numero = numero;
        this.usuarios = usuarios;
        this.fecha = fecha;
        this.linea = linea;
    }

    @Override
    public String toString() {
        return "Factura{" + "numero=" + numero + ", usuarios=" + usuarios + ", fecha=" + fecha + ", linea=" + linea + '}';
    }

}
