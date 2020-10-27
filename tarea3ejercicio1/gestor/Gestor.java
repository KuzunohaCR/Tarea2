/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.ucenfotec.tarea3ejercicio1.gestor;

import cr.ac.ucenfotec.tarea3ejercicio1.bl.entidades.Computadora;
import cr.ac.ucenfotec.tarea3ejercicio1.bl.entidades.Empleado;
import java.util.ArrayList;

public class Gestor {

    private ArrayList<Empleado> listaEmpleados = new ArrayList<>();
    private ArrayList<Computadora> listaComputadoras = new ArrayList<>();

    /**
     * Crea el arreglo de empleados
     *
     * @param nombre
     * @param cedula
     * @return arreglo empleados
     */
    public ArrayList<Empleado> listaEmpleado(String nombre, String cedula) {
        Empleado empleados = new Empleado(nombre, cedula);
        listaEmpleados.add(empleados);
        return listaEmpleados;
    }

    /**
     * Crea el arreglo de computadores
     *
     * @param serie
     * @param marca
     * @param respComputador
     * @return
     */
    public ArrayList<Computadora> listaComputadora(String serie, String marca, Empleado respComputador) {
        Computadora computadoras = new Computadora(serie, marca, respComputador);
        listaComputadoras.add(computadoras);
        return listaComputadoras;
    }

    /**
     * Guarda el arreglo de computadoras
     *
     * @return listaComputadoras
     */
    public ArrayList<Computadora> listarComputadora() {
        return this.listaComputadoras;
    }
}
