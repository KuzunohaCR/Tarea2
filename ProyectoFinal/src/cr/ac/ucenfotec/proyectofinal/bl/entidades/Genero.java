/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.ucenfotec.proyectofinal.bl.entidades;

public class Genero {

    //Falta hacer la lista de genero en el lado logico
    private String nombreGenero;
    private String descripcion;

    public String getDescripcion() {
        return descripcion;
    }

    public String getNombreGenero() {
        return nombreGenero;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setNombreGenero(String nombreGenero) {
        this.nombreGenero = nombreGenero;
    }

    public Genero(String nombreGenero, String descripcion) {
        this.nombreGenero = nombreGenero;
        this.descripcion = descripcion;
    }

    public Genero() {
    }

    @Override
    public String toString() {
        return "Genero{" + "nombreGenero=" + nombreGenero + ", descripcion=" + descripcion + '}';
    }

}
