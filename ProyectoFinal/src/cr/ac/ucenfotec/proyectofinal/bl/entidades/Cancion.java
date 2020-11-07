/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.ucenfotec.proyectofinal.bl.entidades;

public class Cancion {

    private Genero generos;
    private Compositor cancCompositor;
    private String fechaLanzamiento;

    public Compositor getCancCompositor() {
        return cancCompositor;
    }

    public String getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    public Genero getGeneros() {
        return generos;
    }

    public void setCancCompositor(Compositor cancCompositor) {
        this.cancCompositor = cancCompositor;
    }

    public void setFechaLanzamiento(String fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }

    public void setGeneros(Genero generos) {
        this.generos = generos;
    }

    public Cancion(Genero generos, Compositor cancCompositor, String fechaLanzamiento) {
        this.generos = generos;
        this.cancCompositor = cancCompositor;
        this.fechaLanzamiento = fechaLanzamiento;
    }

    public Cancion() {
    }

    @Override
    public String toString() {
        return "Cancion{" + "generos=" + generos + ", cancCompositor=" + cancCompositor + ", fechaLanzamiento=" + fechaLanzamiento + '}';
    }

}
