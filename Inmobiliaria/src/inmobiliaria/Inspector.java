
package inmobiliaria;


public class Inspector {
    private int idInspector,telefono,dni;
    private String nombre,apellido;

    public Inspector() {
    }

    public Inspector( String nombre, String apellido,int dni, int telefono) {
        this.telefono = telefono;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni=dni;
    }

    public Inspector(int idInspector, String nombre, String apellido,int dni, int telefono) {
        this.idInspector = idInspector;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono=telefono;
        this.dni=dni;
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

    public int getIdInspector() {
        return idInspector;
    }

    public void setIdInspector(int idInspector) {
        this.idInspector = idInspector;
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
        return  idInspector + ", " + nombre + ", " + apellido ;
    }
    

}
