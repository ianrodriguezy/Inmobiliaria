
package inmobiliaria;


public class Inspector {
    private int idInspector;
    private String nombre,apellido;

    public Inspector() {
    }

    public Inspector(int idInspector, String nombre, String apellido) {
        this.idInspector = idInspector;
        this.nombre = nombre;
        this.apellido = apellido;
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
    

}
