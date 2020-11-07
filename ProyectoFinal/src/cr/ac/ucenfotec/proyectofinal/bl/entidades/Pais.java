/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.ucenfotec.proyectofinal.bl.entidades;

public class Pais {

    private String nombrePais;

    public String getNombrePais() {
        return nombrePais;
    }

    public void setNombrePais(String nombrePais) {
        this.nombrePais = nombrePais;
    }

    public Pais(String nombrePais) {
        this.nombrePais = nombrePais;
    }

    public Pais() {
    }

    @Override
    public String toString() {
        return "Pais{" + "nombrePais=" + nombrePais + '}';
    }

}
