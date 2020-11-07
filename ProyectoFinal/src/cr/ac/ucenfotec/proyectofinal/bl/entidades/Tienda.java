/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.ucenfotec.proyectofinal.bl.entidades;

public class Tienda {

    private Artista tiendaArtista;

    public Artista getTiendaArtista() {
        return tiendaArtista;
    }

    public void setTiendaArtista(Artista tiendaArtista) {
        this.tiendaArtista = tiendaArtista;
    }

    public Tienda(Artista tiendaArtista) {
        this.tiendaArtista = tiendaArtista;
    }

    public Tienda() {
    }

    @Override
    public String toString() {
        return "Tienda{" + "tiendaArtista=" + tiendaArtista + '}';
    }

}
