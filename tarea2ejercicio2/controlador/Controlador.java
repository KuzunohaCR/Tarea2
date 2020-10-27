/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.ucenfotec.tarea2ejercicio2.controlador;

import cr.ac.ucenfotec.tarea2ejercicio2.bl.entidades.Motor;
import cr.ac.ucenfotec.tarea2ejercicio2.bl.entidades.Vehiculo;
import cr.ac.ucenfotec.tarea2ejercicio2.gestor.Gestor;
import cr.ac.ucenfotec.tarea2ejercicio2.ui.UI;
import java.util.ArrayList;

public class Controlador {

    private UI interfaz = new UI();
    private Gestor nuevGestor = new Gestor();

    /**
     * Lee la opcion del menu
     */
    public void leerMenu() {
        int opcion = 0;
        do {
            interfaz.Menu();
            opcion = interfaz.leerNumero();
            procesarOpcion(opcion);
        } while (opcion != 2);
    }

    /**
     * Procesa la opcion del menu
     *
     * @param opcion
     */
    public void procesarOpcion(int opcion) {
        switch (opcion) {
            case 1:
                crearVehiculo();
                break;
            case 2:
                break;
        }
    }

    /**
     * Obtiene los datos para crear vehiculo
     *
     * @return nuevoVehiculo
     */
    public Vehiculo crearVehiculo() {
        interfaz.mensaje("Serie del vehiculo");
        String serieVehiculo = interfaz.leerTexto();
        interfaz.mensaje("Marca del vehiculo");
        String marca = interfaz.leerTexto();
        Motor nuevoMotor = new Motor();
        nuevoMotor = this.crearMotor();
        Vehiculo nuevoVehiculo = nuevGestor.regVehiculo(serieVehiculo, marca, nuevoMotor);
        nuevGestor.agregarVehiculo(serieVehiculo, marca, nuevoMotor);
        this.listarGrupos();
        return nuevoVehiculo;
    }

    /**
     * Obtiene los datos para crear el motor
     *
     * @return nuevoMotor
     */
    public Motor crearMotor() {
        interfaz.mensaje("Serie del motor");
        String serieMotor = interfaz.leerTexto();
        interfaz.mensaje("Cantidad de silindros");
        int silindros = interfaz.leerNumero();
        Motor nuevoMotor = new Motor(serieMotor, silindros);
        nuevGestor.agregarMotor(serieMotor, silindros);
        return nuevoMotor;
    }

    /**
     * Lista los vehiculos
     */
    public void listarGrupos() {
        ArrayList<Vehiculo> lista = nuevGestor.listaVehiculo();

        for (int i = 0; i < lista.size(); i++) {
            interfaz.mensaje(lista.get(i).toString());
        }
    }

}
