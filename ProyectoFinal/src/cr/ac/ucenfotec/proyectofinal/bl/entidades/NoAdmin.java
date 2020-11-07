/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.ucenfotec.proyectofinal.bl.entidades;

public class NoAdmin extends Usuario {

    private int identificacion;
    private Cancion noAdminCancion;
    private ListaReproduccion noAdminLista;
    private Album noAdminAlbum;

    public int getIdentificacion() {
        return identificacion;
    }

    public Album getNoAdminAlbum() {
        return noAdminAlbum;
    }

    public Cancion getNoAdminCancion() {
        return noAdminCancion;
    }

    public ListaReproduccion getNoAdminLista() {
        return noAdminLista;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public void setNoAdminAlbum(Album noAdminAlbum) {
        this.noAdminAlbum = noAdminAlbum;
    }

    public void setNoAdminCancion(Cancion noAdminCancion) {
        this.noAdminCancion = noAdminCancion;
    }

    public void setNoAdminLista(ListaReproduccion noAdminLista) {
        this.noAdminLista = noAdminLista;
    }

    public NoAdmin() {
    }

    public NoAdmin(int identificacion, Cancion noAdminCancion, ListaReproduccion noAdminLista, Album noAdminAlbum, int edad, String correo, String nombreUsuario, String contrasenna, String nombre, String apellido, Pais paises) {
        super(edad, correo, nombreUsuario, contrasenna, nombre, apellido, paises);
        this.identificacion = identificacion;
        this.noAdminCancion = noAdminCancion;
        this.noAdminLista = noAdminLista;
        this.noAdminAlbum = noAdminAlbum;
    }

    @Override
    public String toString() {
        return "NoAdmin{" + "identificacion=" + identificacion + ", noAdminCancion=" + noAdminCancion + ", noAdminLista=" + noAdminLista + ", noAdminAlbum=" + noAdminAlbum + '}' + super.toString();
    }

}
