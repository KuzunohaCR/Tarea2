/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.ucenfotec.tarea3ejercicio1.ui;

import java.io.PrintStream;
import java.util.Scanner;

public class UI {

    private PrintStream output = new PrintStream(System.out);
    private Scanner input = new Scanner(System.in).useDelimiter("\n");

    /**
     * muestra menu principal
     */
    public void menu() {
        output.println("Seleccione una opcion");
        output.println("1-Registrar computadora");
        output.println("2-Listar computadora");
        output.println("3-Salir");
    }

    /**
     * Metodo para resumir scanner nextint
     *
     * @return input.nextInt()
     */
    public int leerNumero() {
        return input.nextInt();
    }

    /**
     * Metodo para resumir scanner next
     *
     * @return input.next()
     */
    public String leerTexto() {
        return input.next();
    }

    /**
     * Metodo para resumir output.println
     *
     * @param mensaje
     */
    public void mensaje(String mensaje) {
        output.println(mensaje);
    }
}
