/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.ucenfotec.tarea2ejercicio4.ui;

import java.io.PrintStream;
import java.util.Scanner;

public class UI {

    private PrintStream output = new PrintStream(System.out);
    private Scanner input = new Scanner(System.in).useDelimiter("\n");

    /**
     * Metodo que imprime el menu
     */
    public void menu() {
        output.println("Bienvenido a veterinaria Moka");
        output.println("1-Registrar mascota");
        output.println("2-Listar mascota");
        output.println("3-Reservar cita");
        output.println("4-Listar cita");
        output.println("5-Reservacion en hotel");
        output.println("6-Listar reservaciones");
        output.println("7 Registrar usuario");
        output.println("8 Listar usuario");
        output.println("9 Salir");
    }

    /**
     * Funcion que resume el comando input.nextInt
     *
     * @return input.nextInt()
     */
    public int leerNumero() {
        return input.nextInt();
    }                                                                                                                           

    /**
     * Funcion que resume el comando input.next
     *
     * @return input.next()
     */
    public String leerTexto() {
        return input.next();
    }

    /**
     * Metodo para resumir output.println
     *
     * @param mensaje mensaje
     */
    public void mensaje(String mensaje) {
        output.println(mensaje);
    }
}
