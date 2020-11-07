/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.ucenfotec.proyectofinal.iu;

import java.io.PrintStream;
import java.util.Scanner;

public class IU {

    private PrintStream output = new PrintStream(System.out);
    private Scanner input = new Scanner(System.in).useDelimiter("\n");

    public void mostrarMenuLogin() {
        output.println("Bienvenido a El Baul de los Recuerdos");
        output.println("1. Administrador");
        output.println("2. Usuario");
        output.println("3. Salir");
    }

    public void mostrarMenuAdmin() {
        output.println("Esta en menu Administrador");
        output.println("1. Agregar artista");
        output.println("2. Agregar compositor");
        /*output.println("3. Agregar genero");
        Quitar el comentario y modificar ejecutarMenuAdmin en controlador
         */
        output.println("3. Agregar cancion");
        output.println("4. Salir");
    }

    public void mostrarMenuNoAdmin() {
        output.println("Esta en menu Usuario");
        output.println("1. Agregar cancion");
        output.println("2. Crear Album");
        output.println("3. Crear lista de reproduccion");
        output.println("4. Salir");
    }

    public int leerNumero() {

        return input.nextInt();
    }

    public String leerTexto() {
        return input.next();
    }

    public void imprimirMensaje(String mensaje) {
        output.println(mensaje);
    }
}
