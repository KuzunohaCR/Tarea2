/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.ucenfotec.tarea2ejercicio4;

import cr.ac.ucenfotec.tarea2ejercicio4.controlador.Controlador;

/**
 *
 * @author Jorge Rosero
 */
public class Main {

    /**
     * Metodo que ejecuta el programa
     *
     * @param args
     */
    public static void main(String[] args) {
        Controlador ejecutarVeterinaria = new Controlador();
        ejecutarVeterinaria.mostarMenu();
    }

}
