/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.ucenfotec.tarea2ejercicio2.ui;

import java.io.PrintStream;
import java.util.Scanner;

public class UI {

    private PrintStream output = new PrintStream(System.out);
    private Scanner input = new Scanner(System.in).useDelimiter("\n");

    /**
     * Imprime el menu
     */
    public void Menu() {
        output.println("Seleccione una opcion");
        output.println("1- Registrar vehiculo");
        output.println("2-Salir");
    }

    /**
     * metodo que resume Scanner next
     *
     * @return input.next()
     */
    public String leerTexto() {
        return input.next();
    }

    /**
     *
     * @return
     */
    public int leerNumero() {
        return input.nextInt();
    }

    /**
     * metodo que resume el comando output.println
     *
     * @param mensaje
     */
    public void mensaje(String mensaje) {
        output.println(mensaje);
    }
}
