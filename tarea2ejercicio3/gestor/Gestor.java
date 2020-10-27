/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.ucenfotec.tarea2ejercicio3.gestor;

import cr.ac.ucenfotec.tarea2ejercicio3.bl.entidades.Factura;
import cr.ac.ucenfotec.tarea2ejercicio3.bl.entidades.Linea;
import cr.ac.ucenfotec.tarea2ejercicio3.bl.entidades.Producto;
import cr.ac.ucenfotec.tarea2ejercicio3.bl.entidades.Usuario;
import java.time.LocalDate;
import java.util.ArrayList;

public class Gestor {

    private ArrayList<Factura> listaFacturas = new ArrayList<>();

    /**
     * Funcion para crear Usuario
     *
     * @param nomUsuario nomUsuario
     * @param identificacion identificacion
     * @param genero genero
     * @param fechaNacimiento fechaNacimiento
     * @param edad edad
     * @return usuarios
     */
    public Usuario crearUsuario(String nomUsuario, String identificacion, String genero, String fechaNacimiento, int edad) {
        Usuario usuarios = new Usuario(nomUsuario, identificacion, genero, fechaNacimiento, edad);
        return usuarios;
    }

    /**
     * Funcion para crear el objeto Producto
     *
     * @param codigo codigo
     * @param descProducto descProducto
     * @param precio precio
     * @return productos
     */
    public Producto crearProducto(String codigo, String descProducto, double precio) {
        Producto productos = new Producto(codigo, descProducto, precio);
        return productos;
    }

    /**
     * Funcion para crear el objeto Linea
     *
     * @param cantidad cantidad
     * @param nuevoProducto nuevoProducto
     * @return lineas
     */
    public Linea crearLinea(int cantidad, Producto nuevoProducto) {
        Linea lineas = new Linea(cantidad, nuevoProducto);
        return lineas;
    }

    /**
     * Funcion para crear el objeto Factura
     *
     * @param numFactura numFactura
     * @param nuevoUsuario nuevoUsuario
     * @param fecha fecha
     * @param nuevaLinea nuevaLinea
     * @return facturas
     */
    public Factura crearFactura(String numFactura, Usuario nuevoUsuario, LocalDate fecha, Linea nuevaLinea) {
        Factura facturas = new Factura(numFactura, nuevoUsuario, fecha, nuevaLinea);
        listaFacturas.add(facturas);
        return facturas;
    }

    /**
     * Funcion para la lista de Factura
     *
     * @return listaFacturas
     */
    public ArrayList<Factura> listaFactura() {
        return this.listaFacturas;
    }

}
