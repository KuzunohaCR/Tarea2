/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.ucenfotec.proyectofinal.bl.entidades;

public class AlbumArtista {

    private String nombreAlbumArtista;
    private Cancion cancionAlbumArtista;

    public Cancion getCancionAlbumArtista() {
        return cancionAlbumArtista;
    }

    public void setCancionAlbumArtista(Cancion cancionAlbumArtista) {
        this.cancionAlbumArtista = cancionAlbumArtista;
    }

    public String getNombreAlbumArtista() {
        return nombreAlbumArtista;
    }

    public void setNombreAlbumArtista(String nombreAlbumArtista) {
        this.nombreAlbumArtista = nombreAlbumArtista;
    }

    public AlbumArtista(String nombreAlbumArtista, Cancion cancionAlbumArtista) {
        this.nombreAlbumArtista = nombreAlbumArtista;
        this.cancionAlbumArtista = cancionAlbumArtista;
    }

    public AlbumArtista() {
    }

    @Override
    public String toString() {
        return "AlbumArtista{" + "nombreAlbumArtista=" + nombreAlbumArtista + ", cancionAlbumArtista=" + cancionAlbumArtista + '}';
    }

}
