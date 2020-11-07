/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.ucenfotec.proyectofinal.bl.entidades;

public class Persona {

    protected String nombre;
    protected String apellido;
    protected Pais paises;

    public String getApellido() {
        return apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public Pais getPaises() {
        return paises;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPaises(Pais paises) {
        this.paises = paises;
    }

    public Persona(String nombre, String apellido, Pais paises) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.paises = paises;
    }

    public Persona() {
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", paises=" + paises + '}';
    }

}
