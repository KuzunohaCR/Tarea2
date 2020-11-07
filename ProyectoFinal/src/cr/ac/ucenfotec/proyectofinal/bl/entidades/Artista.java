/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.ucenfotec.proyectofinal.bl.entidades;

public class Artista extends Persona {

    private String nombreArtistico;
    private String fechaNacimiento;
    private String fechaDefuncion;
    private Genero artistaGenero;
    private int edad;
    private String descripcion;
    private AlbumArtista artista;

    public AlbumArtista getArtista() {
        return artista;
    }

    public Genero getArtistaGenero() {
        return artistaGenero;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getEdad() {
        return edad;
    }

    public String getFechaDefuncion() {
        return fechaDefuncion;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getNombreArtistico() {
        return nombreArtistico;
    }

    public void setArtista(AlbumArtista artista) {
        this.artista = artista;
    }

    public void setArtistaGenero(Genero artistaGenero) {
        this.artistaGenero = artistaGenero;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setFechaDefuncion(String fechaDefuncion) {
        this.fechaDefuncion = fechaDefuncion;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setNombreArtistico(String nombreArtistico) {
        this.nombreArtistico = nombreArtistico;
    }

    public Artista() {
    }

    public Artista(String nombreArtistico, String fechaNacimiento, String fechaDefuncion, Genero artistaGenero, int edad, String descripcion, AlbumArtista artista, String nombre, String apellido, Pais paises) {
        super(nombre, apellido, paises);
        this.nombreArtistico = nombreArtistico;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaDefuncion = fechaDefuncion;
        this.artistaGenero = artistaGenero;
        this.edad = edad;
        this.descripcion = descripcion;
        this.artista = artista;
    }

    @Override
    public String toString() {
        return "Artista{" + "nombreArtistico=" + nombreArtistico + ", fechaNacimiento=" + fechaNacimiento + ", fechaDefuncion=" + fechaDefuncion + ", artistaGenero=" + artistaGenero + ", edad=" + edad + ", descripcion=" + descripcion + ", artista=" + artista + '}' + super.toString();
    }

}
