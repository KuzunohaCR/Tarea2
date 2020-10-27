/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.ucenfotec.tarea2ejercicio4.controlador;

import cr.ac.ucenfotec.tarea2ejercicio4.bl.entidades.Cita;
import cr.ac.ucenfotec.tarea2ejercicio4.bl.entidades.Duenio;
import cr.ac.ucenfotec.tarea2ejercicio4.bl.entidades.Hotel;
import cr.ac.ucenfotec.tarea2ejercicio4.bl.entidades.Mascota;
import cr.ac.ucenfotec.tarea2ejercicio4.bl.entidades.Usuario;
import cr.ac.ucenfotec.tarea2ejercicio4.gestor.Gestor;
import cr.ac.ucenfotec.tarea2ejercicio4.ui.UI;
import java.util.ArrayList;

public class Controlador {

    private UI interfaz = new UI();
    private Gestor gestor = new Gestor();

    /**
     * Este metodo recive la opcion del menu
     */
    public void mostarMenu() {
        int option = 0;
        do {
            interfaz.menu();
            option = interfaz.leerNumero();
            procesarOpcion(option);
        } while (option != 9);
    }

    /**
     * Este metodo procesa la opcion del menu
     *
     * @param option option
     */
    public void procesarOpcion(int option) {
        switch (option) {
            case 1:
                registrarMascota();
                break;
            case 2:
                listarMascota();
                break;
            case 3:
                reservarCita();
                break;
            case 4:
                listarCita();
                break;
            case 5:
                reservacionHotel();
                break;
            case 6:
                listarHotel();
                break;
            case 7:
                registrarUsuario();
                break;
            case 8:
                listarUsuario();
                break;
            case 9:
                break;
            default:
                interfaz.mensaje("Opcion invalida");
        }
    }

    /**
     * Este metodo pide la informacion para reservar una cita y la envia como
     * parametro
     */
    public void reservarCita() {
        interfaz.mensaje("Escriba el nombre de la mascota");
        String nombreMascota = interfaz.leerTexto();
        interfaz.mensaje("Escriba la fecha de la cita dd/MM/yyyy");
        String fechaCita = interfaz.leerTexto();
        interfaz.mensaje("Escriba la hora");
        String hora = interfaz.leerTexto();
        interfaz.mensaje("Descripcion de la cita");
        String descripcion = interfaz.leerTexto();
        Cita crearCita = gestor.agregarCita(nombreMascota, fechaCita, hora, descripcion);
    }

    /**
     * Este metodo lista la cita
     */
    public void listarCita() {
        ArrayList<Cita> lista = gestor.regresarListaCitas();
        for (int i = 0; i < lista.size(); i++) {
            interfaz.mensaje(lista.get(i).toString());
        }
    }

    /**
     * Este metodo lista Mascota
     */
    public void listarMascota() {
        ArrayList<Mascota> lista = gestor.regresarListaMascotas();
        for (int i = 0; i < lista.size(); i++) {
            interfaz.mensaje(lista.get(i).toString());
        }
    }

    /**
     * Este metodo pide la informacion para la mascota y la envia como parametro
     */
    public void registrarMascota() {
        interfaz.mensaje("Escriba el nombre de la mascota");
        String mascota = interfaz.leerTexto();
        Duenio duenioMasc = this.registrarDuenio();
        String avatar = "foto.jpg";
        interfaz.mensaje("Descripcion de la mascota");
        String descripcion = interfaz.leerTexto();
        interfaz.mensaje("Ranking de la mascota");
        int ranking = interfaz.leerNumero();
        Mascota nuevaMascota = gestor.agregarMascota(mascota, duenioMasc, avatar, descripcion, ranking);
    }

    /**
     * Esta funcion pide los datos del duenio y la envia como parametro
     *
     * @return nuevoDuenio
     */
    public Duenio registrarDuenio() {
        interfaz.mensaje("Escriba el nombre del duenio");
        String duenio = interfaz.leerTexto();
        interfaz.mensaje("El numero de cedula");
        String cedula = interfaz.leerTexto();
        interfaz.mensaje("Escriba el numero de telefono");
        String telefono = interfaz.leerTexto();
        interfaz.mensaje("Escriba la direccion");
        String direccion = interfaz.leerTexto();
        Duenio nuevoDuenio = gestor.agregarDuenio(duenio, cedula, telefono, direccion);
        return nuevoDuenio;
    }

    /**
     * Este metodo pide la informacion de la reservacion al hotel y la envia
     * como parametro
     */
    public void reservacionHotel() {
        interfaz.mensaje("Fecha de entrada dd/MM/yyyy");
        String fechaEntrada = interfaz.leerTexto();
        interfaz.mensaje("Fecha de salida dd/MM/yyyy");
        String fechaSalida = interfaz.leerTexto();
        interfaz.mensaje("Nombre de la mascota");
        String nombreMascota = interfaz.leerTexto();
        Hotel nuevoHotel = gestor.agregarHotel(fechaEntrada, fechaSalida, nombreMascota);
    }

    /**
     * Este metodo lista las reservaciones del hotel
     */
    public void listarHotel() {
        ArrayList<Hotel> lista = gestor.regresarListaHotel();
        for (int i = 0; i < lista.size(); i++) {
            interfaz.mensaje(lista.get(i).toString());
        }
    }

    /**
     * Este metodo pide la informacion del registro de usuario y lo envia como
     * parametro
     */
    public void registrarUsuario() {
        interfaz.mensaje("Escriba su nombre");
        String nombreUsuario = interfaz.leerTexto();
        interfaz.mensaje("Numero de cedula");
        int cedula = interfaz.leerNumero();
        interfaz.mensaje("Escriba el numero de telefono");
        int telefono = interfaz.leerNumero();
        interfaz.mensaje("Escriba la direccion");
        String direccion = interfaz.leerTexto();
        interfaz.mensaje("Activo o Inactivo");
        String estado = interfaz.leerTexto();
        interfaz.mensaje("Escriba el rol Doctor/Doctora o Enfermero/Enfermera");
        String rol = interfaz.leerTexto();
        Usuario nuevoUsuario = gestor.agregarUsuario(nombreUsuario, cedula, telefono, direccion, estado, rol);
    }

    /**
     * Este metodo muestra la lista de usuarios
     */
    public void listarUsuario() {
        ArrayList<Usuario> lista = gestor.regresarListaUsuario();
        for (int i = 0; i < lista.size(); i++) {
            interfaz.mensaje(lista.get(i).toString());
        }
    }
}
