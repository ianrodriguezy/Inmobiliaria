
package inmobiliaria;


public class Vendedor {
    private int idVendedor,dni,telefono;
    private String nombre,apellido;

    public Vendedor() {
    }

    public Vendedor(int idVendedor, String nombre, String apellido,int dni, int telefono) {
        this.idVendedor = idVendedor;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni=dni;
        this.telefono=telefono;
    }
    public Vendedor( String nombre, String apellido,int dni, int telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni=dni;
        this.telefono=telefono;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getIdVendedor() {
        return idVendedor;
    }

    public void setIdVendedor(int idVendedor) {
        this.idVendedor = idVendedor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return  idVendedor + ", " + nombre + ", " + apellido;
    }
    

}
