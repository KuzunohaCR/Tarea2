/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.ucenfotec.proyectofinal.gestor;

import cr.ac.ucenfotec.proyectofinal.bl.entidades.Administrador;
import java.util.ArrayList;
import cr.ac.ucenfotec.proyectofinal.bl.entidades.Album;
import cr.ac.ucenfotec.proyectofinal.bl.entidades.AlbumArtista;
import cr.ac.ucenfotec.proyectofinal.bl.entidades.Artista;
import cr.ac.ucenfotec.proyectofinal.bl.entidades.Cancion;
import cr.ac.ucenfotec.proyectofinal.bl.entidades.Compositor;
import cr.ac.ucenfotec.proyectofinal.bl.entidades.Genero;
import cr.ac.ucenfotec.proyectofinal.bl.entidades.ListaReproduccion;
import cr.ac.ucenfotec.proyectofinal.bl.entidades.Pais;
import cr.ac.ucenfotec.proyectofinal.bl.entidades.Tienda;

public class Gestor {
    
    private Administrador nuevoAdmin = new Administrador();

    private ArrayList<Pais> listaPaises = new ArrayList<>();
    private ArrayList<Genero> listaGenero = new ArrayList();
    private ArrayList<Compositor> listaCompositores = new ArrayList<>();
    private ArrayList<Artista> listaArtistas = new ArrayList<>();
    private ArrayList<Cancion> listaCanciones = new ArrayList<>();
    private ArrayList<AlbumArtista> listaAlbumArtistas = new ArrayList<>();
    private ArrayList<Album> listaAlbums = new ArrayList<>();
    private ArrayList<ListaReproduccion> listaListasReproduccion = new ArrayList<>();
    private ArrayList<Tienda> listaTienda = new ArrayList<>();

    public ArrayList<Pais> listaPais() {

        if (listaPaises.isEmpty()) {
            Pais pais1 = new Pais("1-Venezuela");
            Pais pais2 = new Pais("2-Colombia");
            Pais pais3 = new Pais("3-Argentina");
            Pais pais4 = new Pais("4-Alemania");
            Pais pais5 = new Pais("5-España");

            //Si agrego mas paises tengo que poner mas adds en lista
            listaPaises.add(pais1);
            listaPaises.add(pais2);
            listaPaises.add(pais3);
            listaPaises.add(pais4);
            listaPaises.add(pais5);
        }
        return listaPaises;
    }

    public ArrayList<Genero> listaGenero() {

        if (listaGenero.isEmpty()) {
            Genero genero1 = new Genero("1.Salsa", "Mezcla de los sonidos africanos y caribeños");
            Genero genero2 = new Genero("2.Rock", "Rock es un género reconocido por la predominancia de la guitarra eléctrica");
            Genero genero3 = new Genero("3.Metal", "Género musical que tiene elementos del rock and roll, blues y música clásica");
            Genero genero4 = new Genero("4.Hip Hop", "Su esencia narrativa se expresa a través de los ”raperos” y del sonido");
            Genero genero5 = new Genero("5.Jazz", "Tiene origen por melodías afroamericanas y mezclas de otros ritmos");

            listaGenero.add(genero1);
            listaGenero.add(genero2);
            listaGenero.add(genero3);
            listaGenero.add(genero4);
            listaGenero.add(genero5);
        }
        return listaGenero;
    }

    public ArrayList<Compositor> agregarCompositor(String nombreCompositor, String apellidoCompositor, Pais nuevPais, int edadCompo, Genero nuevGenero) {

        Compositor compositores = new Compositor(edadCompo, nuevGenero, nombreCompositor, apellidoCompositor, nuevPais);
        listaCompositores.add(compositores);
        return listaCompositores;
    }

    public ArrayList<Cancion> agregarCancion(Genero nuevoGeneroCancion, Compositor cancionCompositor, String fechaLanzamiento) {
        Cancion canciones = new Cancion(nuevoGeneroCancion, cancionCompositor, fechaLanzamiento);
        listaCanciones.add(canciones);
        return listaCanciones;
    }

    public ArrayList<AlbumArtista> agregarAlbumArtista(String nombreAlbumArtista, Cancion albumArtistaCancion) {
        AlbumArtista albumArtistas = new AlbumArtista(nombreAlbumArtista, albumArtistaCancion);
        listaAlbumArtistas.add(albumArtistas);
        return listaAlbumArtistas;
    }

    public ArrayList<Album> agregarAlbum(String nombreAlbum, String fechaAlbum, Artista artistaEnAlbum, Cancion albumCancion, String imagenAlbum) {
        Album albunes = new Album(nombreAlbum, fechaAlbum, artistaEnAlbum, albumCancion, imagenAlbum);
        listaAlbums.add(albunes);
        return listaAlbums;
    }

    public ArrayList<Artista> agregarArtista(String nombreArtistico, String fechaNacimiento, String fechaDefuncion, Genero nuevGenero, int edad, String descripcion, AlbumArtista nuevoAlbumEnArtista, String nombreArtista, String apellidoArtista, Pais nuevPais) {
        Artista artistas = new Artista(nombreArtistico, fechaNacimiento, fechaDefuncion, nuevGenero, edad, descripcion, nuevoAlbumEnArtista, nombreArtista, apellidoArtista, nuevPais);
        listaArtistas.add(artistas);
        return listaArtistas;
    }

    public ArrayList<ListaReproduccion> agregarListaCancion(Cancion listaCancion, String nombreLista, int listaCalificacion, String listaFecha) {
        ListaReproduccion litasReproducciones = new ListaReproduccion(listaCancion, nombreLista, listaCalificacion, listaFecha);
        listaListasReproduccion.add(litasReproducciones);
        return listaListasReproduccion;
    }

    public Administrador getAdmin() {
        return this.nuevoAdmin;
    }

    public void crearAdmin(String adminNombre, String adminApellido, Pais nuevPais, int adminEdad, String adminCorreo, String adminNick, String adminContrasenna) {
       this.nuevoAdmin = new Administrador(adminEdad, adminCorreo,adminNick,adminContrasenna,adminNombre,adminApellido,nuevPais);
       
    }

}
