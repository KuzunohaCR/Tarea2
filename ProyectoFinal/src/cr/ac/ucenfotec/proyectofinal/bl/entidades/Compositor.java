/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.ucenfotec.proyectofinal.bl.entidades;

public class Compositor extends Persona {

    private int edad;
    private Genero compGenero;

    public Genero getCompGenero() {
        return compGenero;
    }

    public int getEdad() {
        return edad;
    }

    public void setCompGenero(Genero compGenero) {
        this.compGenero = compGenero;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Compositor(int edad, Genero compGenero, String nombre, String apellido, Pais paises) {
        super(nombre, apellido, paises);
        this.edad = edad;
        this.compGenero = compGenero;
    }

    public Compositor() {
    }

    @Override
    public String toString() {
        return "Compositor{" + "edad=" + edad + ", compGenero=" + compGenero + '}' + super.toString();
    }

}
