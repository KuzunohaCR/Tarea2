/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.ucenfotec.poo.tarea.user;

public class Mascota {

    private String nombre;
    private int edad;
    private int ranking;
    private Usuario nuevo;

    /**
     * @param args the command line arguments
     */
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getRaking() {
        return this.ranking;
    }

    public void setRaking(int ranking) {
        this.ranking = ranking;
    }

    public Usuario getNuevo() {
        return nuevo;
    }

    public void setNuevo(Usuario nuev0) {
        this.nuevo = nuevo;
    }

    @Override
    public String toString() {
        return "Mascota:[nombre:" + this.nombre + ", edad:" + this.edad + ", ranking: " + this.ranking + ", dueño:" + this.nuevo + "]";
    }

    public Mascota(String nombre, int edad, int ranking, Usuario nuevo) {
        this.nombre = nombre;
        this.edad = edad;
        this.ranking = ranking;
        this.nuevo = nuevo;
    }

    public Mascota() {
    }
;
}
