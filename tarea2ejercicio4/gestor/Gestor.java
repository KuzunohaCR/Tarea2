/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.ucenfotec.tarea2ejercicio4.gestor;

import cr.ac.ucenfotec.tarea2ejercicio4.bl.entidades.Cita;
import cr.ac.ucenfotec.tarea2ejercicio4.bl.entidades.Duenio;
import cr.ac.ucenfotec.tarea2ejercicio4.bl.entidades.Hotel;
import cr.ac.ucenfotec.tarea2ejercicio4.bl.entidades.Mascota;
import cr.ac.ucenfotec.tarea2ejercicio4.bl.entidades.Usuario;
import java.util.ArrayList;

public class Gestor {

    private ArrayList<Cita> listaCitas = new ArrayList<>();
    private ArrayList<Duenio> listaDuenios = new ArrayList<>();
    private ArrayList<Mascota> listaMascotas = new ArrayList<>();
    private ArrayList<Hotel> listaHoteles = new ArrayList<>();
    private ArrayList<Usuario> listaUsuarios = new ArrayList<>();

    /**
     * Esta funcion crea el objeto cita y la lista citas
     *
     * @param nombreMascota nombreMascota
     * @param fechaCita fechaCita
     * @param hora hora
     * @param descripcion descripcion
     * @return citas
     */
    public Cita agregarCita(String nombreMascota, String fechaCita, String hora, String descripcion) {
        Cita citas = new Cita(nombreMascota, fechaCita, hora, descripcion);
        listaCitas.add(citas);
        return citas;
    }

    /**
     * Esta funcion regresa la lista de citas al controlador
     *
     * @return listaCitas
     */
    public ArrayList<Cita> regresarListaCitas() {
        return this.listaCitas;
    }

    /**
     * Esta funcion crea el objeto duenio y la lista duenios
     *
     * @param duenio duenio
     * @param cedula cedula
     * @param telefono telefono
     * @param direccion direccion
     * @return duenios
     */
    public Duenio agregarDuenio(String duenio, String cedula, String telefono, String direccion) {
        Duenio duenios = new Duenio(duenio, cedula, telefono, direccion);
        listaDuenios.add(duenios);
        return duenios;
    }

    /**
     * Esta funcion crea el objeto mascota y la lista mascotas
     *
     * @param mascota mascota
     * @param duenioMasc duenioMasc
     * @param avatar avatar
     * @param descripcion descripcion
     * @param ranking ranking
     * @return mascotas
     */
    public Mascota agregarMascota(String mascota, Duenio duenioMasc, String avatar, String descripcion, int ranking) {
        Mascota mascotas = new Mascota(mascota, duenioMasc, avatar, descripcion, ranking);
        listaMascotas.add(mascotas);
        return mascotas;
    }

    /**
     * Esta funcion regresa listaMascotas al controlador
     *
     * @return listaMascotas
     */
    public ArrayList<Mascota> regresarListaMascotas() {
        return this.listaMascotas;
    }

    /**
     * Esta funcion crea el objeto hoteles y la listaHoteles
     *
     * @param fechaEntrada fechaEntrada
     * @param fechaSalida fechaSalida
     * @param nombreMascota nombreMascota
     * @return hoteles
     */
    public Hotel agregarHotel(String fechaEntrada, String fechaSalida, String nombreMascota) {
        Hotel hoteles = new Hotel(fechaEntrada, fechaSalida, nombreMascota);
        listaHoteles.add(hoteles);
        return hoteles;
    }

    /**
     * Esta funcion regresa listaHoteles al controlador
     *
     * @return listaHoteles
     */
    public ArrayList<Hotel> regresarListaHotel() {
        return this.listaHoteles;
    }

    /**
     * Esta funcion crea un usuario y la listaUsuarios
     *
     * @param nombreUsuario nombreUsuario
     * @param cedula cedula
     * @param telefono telefono
     * @param direccion direccion
     * @param estado estado
     * @param rol rol
     * @return usuarios
     */
    public Usuario agregarUsuario(String nombreUsuario, int cedula, int telefono, String direccion, String estado, String rol) {
        Usuario usuarios = new Usuario(nombreUsuario, cedula, telefono, direccion, estado, rol);
        listaUsuarios.add(usuarios);
        return usuarios;
    }

    /**
     * Regresa el arreglo ListaUsuarios al controlador
     *
     * @return listaUsuarios
     */
    public ArrayList<Usuario> regresarListaUsuario() {
        return this.listaUsuarios;
    }
}
