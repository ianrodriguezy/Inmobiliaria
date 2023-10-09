
package inmobiliaria;


public class Vendedor {
    private int idVendedor;
    private String nombre,apellido;

    public Vendedor() {
    }

    public Vendedor(int idVendedor, String nombre, String apellido) {
        this.idVendedor = idVendedor;
        this.nombre = nombre;
        this.apellido = apellido;
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
