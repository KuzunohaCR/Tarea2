/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.ucenfotec.tarea2ejercicio2.gestor;

import cr.ac.ucenfotec.tarea2ejercicio2.bl.entidades.Motor;
import cr.ac.ucenfotec.tarea2ejercicio2.bl.entidades.Vehiculo;
import java.util.ArrayList;

public class Gestor {

    private ArrayList<Motor> listaMotor = new ArrayList<>();
    private ArrayList<Vehiculo> listaVehiculo = new ArrayList<>();

    /**
     * Crea un nuevo objeto motor y lo agrega en el arreglo
     *
     * @param serieMotor
     * @param silindros
     */
    public void agregarMotor(String serieMotor, int silindros) {
        Motor motores = new Motor(serieMotor, silindros);
        listaMotor.add(motores);

    }

    /**
     * Metodo que regresa la lista de vehiculos
     *
     * @return listaVehiculo
     */
    public ArrayList<Vehiculo> listaVehiculo() {

        return this.listaVehiculo;
    }

    /**
     * Crea un nuevo objeto vehiculo y lo agrega al arreglo
     *
     * @param serieVehiculo
     * @param marca
     * @param nuevoMotor
     */
    public void agregarVehiculo(String serieVehiculo, String marca, Motor nuevoMotor) {
        Vehiculo vehiculos = new Vehiculo(serieVehiculo, marca, nuevoMotor);
        listaVehiculo.add(vehiculos);

    }

    /**
     * crea un nuevo objeto vehiculo
     *
     * @param serieVehiculo
     * @param marca
     * @param nuevoMotor
     * @return nuevoVehiculos
     */
    public Vehiculo regVehiculo(String serieVehiculo, String marca, Motor nuevoMotor) {
        Vehiculo nuevoVehiculos = new Vehiculo(serieVehiculo, marca, nuevoMotor);
        return nuevoVehiculos;
    }
}
