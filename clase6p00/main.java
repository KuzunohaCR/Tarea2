/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase6p00;

import java.io.PrintStream;
import java.util.Scanner;
import java.util.Set;

public class main {

    private static Scanner input = new Scanner(System.in).useDelimiter("\n");
    private static PrintStream output = new PrintStream(System.out);

    private static Mascota[] arregloMascotas = new Mascota[50];
    private static Cita[] arregloCitas = new Cita[50];
    private static Usuario[] arregloUsuarios = new Usuario[50];
    private static Reservacion[] arregloReservaciones = new Reservacion[50];

    private static int nextPosicion = 0;
    private static int nextCita = 0;
    private static int nextUsuario = 0;
    private static int nextReserva = 0;

    public static void main(String[] args) {
        int opcion = 0;
        do {
            mostrarMenu();
            opcion = input.nextInt();
            procesarOpcion(opcion);
        } while (opcion != 9);
    }

    private static void mostrarMenu() {
        output.println("Bienvenido a veterinaria");
        output.println("1 Registrar mascota");
        output.println("2 Listar mascota");
        output.println("3 Reservar cita");
        output.println("4 Listar cita");
        output.println("5 Hacer reservacion");
        output.println("6 Listar reservacion");
        output.println("7 Registrar usuario");
        output.println("8 Listar usuario");
        output.println("9 Salir");
        output.println("Ingrese su opcion");
    }

    private static void procesarOpcion(int opcion) {
        switch (opcion) {
            case 1:
                output.println("Nombre de la mascota");
                String nombre = input.next();
                output.println("Edad");
                int edad = input.nextInt();
                output.println("Raking de la mascota");
                int ranking = input.nextInt();
                /*Mascota nueva = new Mascota();
                nueva.setNombre(nombre);
                nueva.setEdad(edad);
                nueva.setRaking(ranking);*/
                Mascota nueva = new Mascota(nombre, edad, ranking);
                arregloMascotas[nextPosicion++] = nueva;

                break;
            case 2:
                for (int cont = 0; cont < arregloMascotas.length; cont++) {
                    if (arregloMascotas[cont] != null) {
                        output.println("#" + (cont + 1) + "" + arregloMascotas[cont]);
                    }
                }
                break;
            case 3:
                output.println("Nombre de la mascota");
                String nombreMascota = input.next();
                output.println("Escriba la fecha: DD/MM/YY");
                String fechaCita = input.next();
                output.println("La hora de la cita: --:--");
                String horaCita = input.next();
                output.println("Observaciones");
                String observaciones = input.next();
                Cita sacarCita = new Cita(nombreMascota, fechaCita, horaCita, observaciones);
                arregloCitas[nextCita++] = sacarCita;

                break;
            case 4:
                for (int contCita = 0; contCita < arregloCitas.length; contCita++) {
                    if (arregloCitas[contCita] != null) {
                        output.println("#" + (contCita + 1) + "" + arregloCitas[contCita]);
                    }
                }
                break;
            case 5:
                output.println("fecha de entrada");
                String fechaEntrada = input.next();
                output.println("fecha de salia");
                String fechaSalida = input.next();
                output.println("nombre de la mascota");
                String mascota = input.next();
                Reservacion resHotel = new Reservacion(fechaEntrada, fechaSalida, mascota);
                arregloReservaciones[nextReserva++] = resHotel;

                break;
            case 6:
                for (int contReserva = 0; contReserva < arregloReservaciones.length; contReserva++) {
                    if (arregloReservaciones[contReserva] != null) {
                        output.println("#" + (contReserva + 1) + "" + arregloReservaciones[contReserva]);
                    }
                }
                break;
            case 7:
                output.println("Ingrese su nombre completo");
                String nombreCompleto = input.next();
                output.println("Digite su cedula");
                int cedula = input.nextInt();
                output.println("Ingrese su numero de telefono");
                int telefono = input.nextInt();
                output.println("Escriba su direccion");
                String direccion = input.next();
                output.println("Indique su estado (activo/inactivo)");
                String estado = input.next();
                output.println("Inique su rol (Doctor/Secretaria)");
                String rol = input.next();
                Usuario regUsuario = new Usuario(nombreCompleto, cedula, telefono, direccion, estado, rol);
                arregloUsuarios[nextUsuario++] = regUsuario;
                break;
            case 8:
                for (int contUsuario = 0; contUsuario < arregloUsuarios.length; contUsuario++) {
                    if (arregloUsuarios[contUsuario] != null) {
                        output.println("#" + (contUsuario + 1) + "" + arregloUsuarios[contUsuario]);
                    }
                }
                break;
            case 9:
                break;
            default:
                output.println("Opcion desconocida");
        }
    }
}
