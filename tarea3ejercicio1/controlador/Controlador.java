/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.ucenfotec.tarea3ejercicio1.controlador;

import cr.ac.ucenfotec.tarea3ejercicio1.bl.entidades.Computadora;
import cr.ac.ucenfotec.tarea3ejercicio1.bl.entidades.Empleado;
import cr.ac.ucenfotec.tarea3ejercicio1.gestor.Gestor;
import cr.ac.ucenfotec.tarea3ejercicio1.ui.UI;
import java.util.ArrayList;

public class Controlador {

    private UI interfaz = new UI();
    private Gestor nuevGestor = new Gestor();

    /**
     * Recive la opcion del menu
     */
    public void mostrarMenu() {
        int opcion = 0;
        do {
            interfaz.menu();
            opcion = interfaz.leerNumero();
            procesarOpcion(opcion);
        } while (opcion != 3);

    }

    /**
     * registra el objeto computadora
     *
     * @return nuevoComp
     */
    public Computadora registrarComputador() {
        Empleado respComputador = new Empleado();
        respComputador = this.registrarEmpleado();
        interfaz.mensaje("Ingrese la serie del computador");
        String serie = interfaz.leerTexto();
        interfaz.mensaje("Ingrese la marca");
        String marca = interfaz.leerTexto();
        Computadora nuevoComp = new Computadora(serie, marca, respComputador);
        nuevGestor.listaComputadora(serie, marca, respComputador);
        return nuevoComp;
    }

    /**
     * Registra el empleado
     *
     * @return nuevo empleado
     */
    public Empleado registrarEmpleado() {
        interfaz.mensaje("Nombre del empleado");
        String nombre = interfaz.leerTexto();
        interfaz.mensaje("Ingrese la cedula");
        String cedula = interfaz.leerTexto();
        Empleado nuevoEmpleado = new Empleado(nombre, cedula);
        nuevGestor.listaEmpleado(nombre, cedula);
        return nuevoEmpleado;
    }

    /**
     * Reconoce la opcion del menu e inicia metodo registrar computador o listar
     *
     * @param opcion
     */
    private void procesarOpcion(int opcion) {
        switch (opcion) {
            case 1:
                registrarComputador();
                break;
            case 2:
                listarComputador();
                break;
            case 3:
                break;
            default:
                interfaz.mensaje("Opcion invalida");
        }
    }

    /**
     * muestra la lista de computadoras
     */
    private void listarComputador() {
        ArrayList<Computadora> lista = nuevGestor.listarComputadora();
        for (int i = 0; i < lista.size(); i++) {
            interfaz.mensaje(lista.get(i).toString());
        }
    }

}
