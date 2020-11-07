/*
mirar nota crear cancion
mirar nota crear compositor
mirar la nota en crear artista
 */
package cr.ac.ucenfotec.proyectofinal.controlador;

import cr.ac.ucenfotec.proyectofinal.bl.entidades.Administrador;
import cr.ac.ucenfotec.proyectofinal.bl.entidades.Album;
import cr.ac.ucenfotec.proyectofinal.bl.entidades.AlbumArtista;
import cr.ac.ucenfotec.proyectofinal.bl.entidades.Artista;
import cr.ac.ucenfotec.proyectofinal.bl.entidades.Cancion;
import cr.ac.ucenfotec.proyectofinal.bl.entidades.Compositor;
import cr.ac.ucenfotec.proyectofinal.bl.entidades.Genero;
import cr.ac.ucenfotec.proyectofinal.bl.entidades.ListaReproduccion;
import cr.ac.ucenfotec.proyectofinal.bl.entidades.Pais;
import cr.ac.ucenfotec.proyectofinal.gestor.Gestor;
import cr.ac.ucenfotec.proyectofinal.iu.IU;

public class Controlador {

    private IU interfaz = new IU();
    private Gestor nuevoGestor = new Gestor();

    //Pantalla de Login
    public void ejecutarMenuLogin() {
        int opcionLogin = 0;
        if(nuevoGestor.getAdmin()==null){
            this.crearAdministrador();
        }else{
            do {
            interfaz.mostrarMenuLogin();
            opcionLogin = interfaz.leerNumero();
            procesarLogin(opcionLogin);
        } while (opcionLogin != 3);
        }    
    }

    //Opciones del menu Administrador
    public void ejecutarMenuAdmin() {
        int opcion = 0;

        do {
            interfaz.mostrarMenuAdmin();
            opcion = interfaz.leerNumero();
            procesarOpcion(opcion);
        } while (opcion != 4);
    }

    //Opciones del menu Usuario
    public Pais seleccionarPais() {
        for (Pais paises : nuevoGestor.listaPais()) {
            System.out.println(paises.getNombrePais());
        }
        System.out.println("Elegir el numero del pais");
        int opcionPais = interfaz.leerNumero();
        if (opcionPais >= 6) {
            System.out.println("Valor invalido");
        }
        return nuevoGestor.listaPais().get(opcionPais);
    }

    public Genero seleccionarGenero() {
        for (Genero generos : nuevoGestor.listaGenero()) {
            System.out.println(generos.getNombreGenero());
        }
        System.out.println("Elegir el numero del genero");
        int opcionGenero = interfaz.leerNumero();
        if (opcionGenero >= 6) {
            System.out.println("Valor invalido");
        }
        return nuevoGestor.listaGenero().get(opcionGenero);
    }

    public void ejecutarMenuNoAdmin() {
        int opcion = 0;

        do {
            interfaz.mostrarMenuNoAdmin();
            opcion = interfaz.leerNumero();
            procesarNoAdmin(opcion);
        } while (opcion != 4);
    }

    public void procesarOpcion(int opcion) {

        switch (opcion) {
            case 1:
                crearArtista();
                break;
            case 2:
                crearCompositor();
                break;
            /*case 3:
                crearGenero();
                ;
                break;*/
            case 3:
                crearCancion();
                break;
            case 4:
                break;
            default:
                interfaz.imprimirMensaje("Opcion desconocida");
        }

    }

    public void procesarNoAdmin(int opcion) {

        switch (opcion) {
            case 1:
                crearCancion();
                break;
            case 2:
                crearAlbum();
                break;
            case 3:
                crearListaRepro();
                ;
                break;
            case 4:
                break;
            /*case 5:
                break;*/
            default:
                interfaz.imprimirMensaje("Opcion desconocida");
        }

    }

    public void procesarLogin(int opcion) {
        switch (opcion) {
            case 1:
                ejecutarMenuAdmin();
                break;
            case 2:
                ejecutarMenuNoAdmin();
                break;
            case 3:
                break;
            default:
                interfaz.imprimirMensaje("Opcion desconocida");
        }
    }

    public Cancion crearCancion() {
        //Cambiar por menu correcto de genero
        Genero nuevoGeneroCancion = new Genero();
        nuevoGeneroCancion = this.seleccionarGenero();
        Compositor cancionCompositor = new Compositor();
        cancionCompositor = this.crearCompositor();
        interfaz.imprimirMensaje("Fecha de lanzamiento");
        String fechaLanzamiento = interfaz.leerTexto();
        Cancion nuevaCancion = new Cancion(nuevoGeneroCancion, cancionCompositor, fechaLanzamiento);
        nuevoGestor.agregarCancion(nuevoGeneroCancion, cancionCompositor, fechaLanzamiento);
        return nuevaCancion;
    }

    public ListaReproduccion crearListaRepro() {
        Cancion listaCancion = new Cancion();
        listaCancion = this.crearCancion();
        interfaz.imprimirMensaje("Fecha Creacion");
        String listaFecha = interfaz.leerTexto();
        interfaz.imprimirMensaje("Nombre de la lista");
        String nombreLista = interfaz.leerTexto();
        //Modificar esta parte por el promedio
        interfaz.imprimirMensaje("Calificacion");
        int listaCalificacion = interfaz.leerNumero();
        ListaReproduccion nuevaLista = new ListaReproduccion(listaCancion, nombreLista, listaCalificacion, listaFecha);
        nuevoGestor.agregarListaCancion(listaCancion, nombreLista, listaCalificacion, listaFecha);

        return nuevaLista;

    }

    public Compositor crearCompositor() {
        interfaz.imprimirMensaje("Nombre del compositor");
        String nombreCompositor = interfaz.leerTexto();
        interfaz.imprimirMensaje("Apellido");
        String apellidoCompositor = interfaz.leerTexto();

        //Cambiar por displey de paises
        Pais nuevPais = new Pais();
        nuevPais = this.seleccionarPais();
        interfaz.imprimirMensaje("Edad");
        int edadCompo = interfaz.leerNumero();

        //Cambiar lista por la correcta con menu
        Genero nuevGenero = this.seleccionarGenero();

        Compositor nuevoCompositor = new Compositor(edadCompo, nuevGenero, nombreCompositor, apellidoCompositor, nuevPais);

        nuevoGestor.agregarCompositor(nombreCompositor, apellidoCompositor, nuevPais, edadCompo, nuevGenero);
        interfaz.imprimirMensaje("Compositor Agregado");
        return nuevoCompositor;
    }

    public Artista crearArtista() {

        interfaz.imprimirMensaje("Nombre del artista");
        String nombreArtista = interfaz.leerTexto();
        interfaz.imprimirMensaje("Apellido del artista");
        String apellidoArtista = interfaz.leerTexto();

        //Cambiar por displey de paises
        Pais nuevPais = new Pais();
        nuevPais = this.seleccionarPais();

        interfaz.imprimirMensaje("Nombre artistico");
        String nombreArtistico = interfaz.leerTexto();
        //Cambiar la fecha de nacimiento por el formato correcto
        interfaz.imprimirMensaje("Fecha de nacimiento");
        String fechaNacimiento = interfaz.leerTexto();
        interfaz.imprimirMensaje("Fecha de defuncion");
        String fechaDefuncion = interfaz.leerTexto();
        interfaz.imprimirMensaje("Edad del artista");
        int edad = interfaz.leerNumero();

        //Cambiar lista por la correcta con menu
        Genero nuevGenero = new Genero();
        nuevGenero = this.seleccionarGenero();

        interfaz.imprimirMensaje("Descripcion del artista");
        String descripcion = interfaz.leerTexto();
        AlbumArtista nuevoAlbumEnArtista = new AlbumArtista();
        nuevoAlbumEnArtista = this.crearAlbumArtista();
        Artista nuevoArtista = new Artista(nombreArtistico, fechaNacimiento, fechaDefuncion, nuevGenero, edad, descripcion, nuevoAlbumEnArtista, nombreArtista, apellidoArtista, nuevPais);
        nuevoGestor.agregarArtista(nombreArtistico, fechaNacimiento, fechaDefuncion, nuevGenero, edad, descripcion, nuevoAlbumEnArtista, nombreArtista, apellidoArtista, nuevPais);
        interfaz.imprimirMensaje("Artista Agregado");
        return nuevoArtista;
    }

    public Album crearAlbum() {
        interfaz.imprimirMensaje("Nombre del Album");
        String nombreAlbum = interfaz.leerTexto();
        Cancion albumCancion = new Cancion();
        albumCancion = this.crearCancion();
        interfaz.imprimirMensaje("Fecha de lanzamiento");
        String fechaAlbum = interfaz.leerTexto();
        Artista artistaEnAlbum = new Artista();
        artistaEnAlbum = this.crearArtista();
        interfaz.imprimirMensaje("Suba una imagen");
        String imagenAlbum = ("Foto.jpg");
        Album nuevoAlbum = new Album(nombreAlbum, fechaAlbum, artistaEnAlbum, albumCancion, imagenAlbum);
        nuevoGestor.agregarAlbum(nombreAlbum, fechaAlbum, artistaEnAlbum, albumCancion, imagenAlbum);

        return nuevoAlbum;
    }

    public AlbumArtista crearAlbumArtista() {
        interfaz.imprimirMensaje("Nombre del Album");
        String nombreAlbumArtista = interfaz.leerTexto();
        Cancion albumArtistaCancion = new Cancion();
        albumArtistaCancion = this.crearCancion();
        AlbumArtista nuevoAlbumArtista = new AlbumArtista(nombreAlbumArtista, albumArtistaCancion);
        nuevoGestor.agregarAlbumArtista(nombreAlbumArtista, albumArtistaCancion);

        return nuevoAlbumArtista;
    }

    public void crearAdministrador() {
        interfaz.imprimirMensaje("Escriba su nombre");
        String adminNombre = interfaz.leerTexto();
        interfaz.imprimirMensaje("Escriba su apellido");
        String adminApellido = interfaz.leerTexto();
        Pais nuevPais = new Pais();
        nuevPais = this.seleccionarPais();
        interfaz.imprimirMensaje("Escriba su edad");
        int adminEdad = interfaz.leerNumero();
        interfaz.imprimirMensaje("Escriba su correo");
        String adminCorreo = interfaz.leerTexto();
        interfaz.imprimirMensaje("Escriba su nombre de usuario");
        String adminNick = interfaz.leerTexto();
        interfaz.imprimirMensaje("Escriba su contraseña");
        String adminContrasenna = interfaz.leerTexto();
        nuevoGestor.crearAdmin(adminNombre,adminApellido,nuevPais,adminEdad,adminCorreo,adminNick,adminContrasenna);
    }
    

}
