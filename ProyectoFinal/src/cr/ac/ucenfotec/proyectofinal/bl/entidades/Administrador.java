/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.ucenfotec.proyectofinal.bl.entidades;

public class Administrador extends Usuario {

    /**private Tienda adminTienda;

    public Tienda getAdminTienda() {
        return adminTienda;
    }

    public void setAdminTienda(Tienda adminTienda) {
        this.adminTienda = adminTienda;
    }*/

    public Administrador() {
    }

    public Administrador(/*Tienda adminTienda,*/ int edad, String correo, String nombreUsuario, String contrasenna, String nombre, String apellido, Pais paises) {
        super(edad, correo, nombreUsuario, contrasenna, nombre, apellido, paises);
        //this.adminTienda = adminTienda;
    }

    @Override
    public String toString() {
        return "Administrador{" + /*"adminTienda=" + adminTienda + '}' +*/ super.toString();
    }

}
