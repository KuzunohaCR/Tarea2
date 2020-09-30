package cr.ac.ucenfotec.poo.tarea.user;

public class Usuario {

    private String nombre;
    private int cedula;
    private int telefono;
    private String direccion;
    private String estado;
    private String rol;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public int getCedula() {
        return this.cedula;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getTelefono() {
        return this.telefono;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getEstado() {
        return this.estado;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getRol() {
        return this.rol;
    }

    @Override
    public String toString() {
        return "Cita:[nombre:" + this.nombre + ", cedula:" + this.cedula + ", telefono: " + this.telefono + ", direccion: " + this.direccion + ", estado: " + this.estado + ", rol: " + this.rol + "]";
    }

    public Usuario(String nombre, int cedula, int telefono, String direccion, String estado, String rol) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.telefono = telefono;
        this.direccion = direccion;
        this.estado = estado;
        this.rol = rol;
    }

    public Usuario() {
    }
;
}
