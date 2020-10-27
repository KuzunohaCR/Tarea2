/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.ucenfotec.tarea2ejercicio3.controlador;

import cr.ac.ucenfotec.tarea2ejercicio3.bl.entidades.Factura;
import cr.ac.ucenfotec.tarea2ejercicio3.bl.entidades.Linea;
import cr.ac.ucenfotec.tarea2ejercicio3.bl.entidades.Producto;
import cr.ac.ucenfotec.tarea2ejercicio3.bl.entidades.Usuario;
import cr.ac.ucenfotec.tarea2ejercicio3.gestor.Gestor;
import cr.ac.ucenfotec.tarea2ejercicio3.ui.UI;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Controlador {

    private UI interfaz = new UI();
    private Gestor gestor = new Gestor();

    /**
     * Metodo que recive la opcion del menu
     */
    public void mostrarMenu() {
        int opcion = 0;
        do {
            interfaz.Menu();
            opcion = interfaz.leerNumero();
            procesarOpcion(opcion);

        } while (opcion != 2);
    }

    /**
     * Metodo que procesa la opcion del menu
     *
     * @param opcion opcion
     */
    public void procesarOpcion(int opcion) {
        switch (opcion) {
            case 1:
                crearFactura();
                break;
            case 2:
                break;
            default:
                interfaz.mensaje("La opcion es invalida");
        }
    }

    /**
     * Metodo que pide la informacion para crear el objeto factura y la envia
     * como parametros al gestor
     */
    public void crearFactura() {
        interfaz.mensaje("Digite el numero de factura");
        String numFactura = interfaz.leerTexto();
        Usuario nuevoUsuario = this.usuario();
        LocalDate fecha = fecha();
        Linea nuevaLinea = this.registrarLinea();
        Factura nuevaFactura = gestor.crearFactura(numFactura, nuevoUsuario, fecha, nuevaLinea);
        this.listarGrupos();
    }

    /**
     * Funcion que pide la informacion para crear el objeto usuario y la envia
     * como parametros al gestor
     *
     * @return nuevoUsuario
     */
    public Usuario usuario() {
        interfaz.mensaje("Digite su nombre");
        String nomUsuario = interfaz.leerTexto();
        interfaz.mensaje("Numero de identificacion");
        String identificacion = interfaz.leerTexto();
        interfaz.mensaje("Escriba su genero");
        String genero = interfaz.leerTexto();
        interfaz.mensaje("Fecha de nacimiento dd/MM/yyyy");
        String fechaNacimiento = interfaz.leerTexto();
        int edad = calculardEdad(fechaNacimiento);
        Usuario nuevoUsuario = gestor.crearUsuario(nomUsuario, identificacion, genero, fechaNacimiento, edad);
        return nuevoUsuario;
    }

    /**
     * Funcion que pide la informacion para crear el objeto producto y la envia
     * como parametros al gestor
     *
     * @return nuevoProducto
     */
    public Producto registrarProducto() {
        interfaz.mensaje("Codigo del producto");
        String codigo = interfaz.leerTexto();
        interfaz.mensaje("Descripcion del producto");
        String descProducto = interfaz.leerTexto();
        interfaz.mensaje("Precio del producto");
        double precio = interfaz.leerDouble();
        Producto nuevoProducto = gestor.crearProducto(codigo, descProducto, precio);
        return nuevoProducto;
    }

    /**
     * Funcion que pide la informacion para crear el objeto linea y la envia como
     * parametros al gestor
     *
     * @return nuevaLinea
     */
    public Linea registrarLinea() {
        interfaz.mensaje("Cantidad");
        int cantidad = interfaz.leerNumero();
        Producto nuevoProducto = this.registrarProducto();
        Linea nuevaLinea = gestor.crearLinea(cantidad, nuevoProducto);
        return nuevaLinea;
    }

    /**
     * Funcion que calcula la edad reciviendo fechaNacimiento como parametro
     *
     * @param fechaNacimiento fechaNacimiento
     * @return edad
     */
    public int calculardEdad(String fechaNacimiento) {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaNaci = LocalDate.parse(fechaNacimiento, fmt);

        //para calcular la edad
        int edad = Period.between(fechaNaci, LocalDate.now()).getYears();

        return edad;
    }

    /**
     * Funcion para registrar la fecha
     *
     * @return fecha
     */
    public LocalDate fecha() {
        interfaz.mensaje("Escriba la fecha dd/MM/yyyy");
        String fecha = interfaz.leerTexto();
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaFactura = LocalDate.parse(fecha, fmt);
        return fechaFactura;
    }

    /**
     * Metodo para listar el arreglo de facturas
     */
    public void listarGrupos() {
        ArrayList<Factura> lista = gestor.listaFactura();

        for (int i = 0; i < lista.size(); i++) {
            interfaz.mensaje(lista.get(i).toString());
        }
    }
}
