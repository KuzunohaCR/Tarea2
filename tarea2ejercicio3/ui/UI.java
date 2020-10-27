/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.ucenfotec.tarea2ejercicio3.ui;

import java.io.PrintStream;
import java.util.Scanner;

public class UI {

    private PrintStream output = new PrintStream(System.out);
    private Scanner input = new Scanner(System.in).useDelimiter("\n");

    /**
     * Metodo que muestra el menu
     */
    public void Menu() {
        output.println("Bienvenido");
        output.println("1-Crear factura");
        output.println("2-Salir");
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
     * Funcion que resume el comando input.nextInt
     *
     * @return input.nextInt()
     */
    public int leerNumero() {
        return input.nextInt();
    }

    /**
     * Funcion que resume input.nextDouble
     *
     * @return input.nextDouble()
     */
    public double leerDouble() {
        return input.nextDouble();
    }

    /**
     * Metodo que resume el comando output.println()
     *
     * @param mensaje mensaje
     */
    public void mensaje(String mensaje) {
        output.println(mensaje);
    }
}
