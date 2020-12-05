/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.ucenfotec.proyectofinal.bl.entidades;

public class ListaReproduccion {

    private Cancion canciones;
    private String nombreLista;
    private int calificacion;
    private String fechaCreacion;

    public int getCalificacion() {
        return calificacion;
    }

    public Cancion getCanciones() {
        return canciones;
    }

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public String getNombreLista() {
        return nombreLista;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public void setCanciones(Cancion canciones) {
        this.canciones = canciones;
    }

    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public void setNombreLista(String nombreLista) {
        this.nombreLista = nombreLista;
    }

    /**
     * Constructor vacio
     */
    public ListaReproduccion() {
    }
    
    /**
     * Constructor con parametros de la lista de reproduccion
     * @param canciones cancion de la lista de reproduccion
     * @param nombreLista nombre de la lista de reproduccion
     * @param calificacion calificacion de la lista de reproduccion
     * @param fechaCreacion fecha de creacion de la lista de reproduccion
     */
    public ListaReproduccion(Cancion canciones, String nombreLista, int calificacion, String fechaCreacion) {
        this.canciones = canciones;
        this.nombreLista = nombreLista;
        this.calificacion = calificacion;
        this.fechaCreacion = fechaCreacion;
    }
    
    /**
     * 
     * @return 
     */
    @Override
    public String toString() {
        return "ListaReproduccion{" + "canciones=" + canciones + ", nombreLista=" + nombreLista + ", calificacion=" + calificacion + ", fechaCreacion=" + fechaCreacion + '}';
    }

}
