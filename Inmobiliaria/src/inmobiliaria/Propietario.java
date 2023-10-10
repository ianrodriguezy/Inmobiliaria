
package inmobiliaria;

import java.util.ArrayList;


public class Propietario {
    private int idPropietario;
    private String apellidoPropietario,nombrePropietario,domicilio;
    private int dni;
    private int telefono;
    private ArrayList propiedadesPropias;
    private int estado;
    
    public Propietario() {
    }

    public Propietario(String apellidoPropietario, String nombrePropietario, String domicilio, int dni, int telefono, int estado, ArrayList propiedadesPropias) {
        this.apellidoPropietario = apellidoPropietario;
        this.nombrePropietario = nombrePropietario;
        this.domicilio = domicilio;
        this.dni = dni;
        this.telefono = telefono;
        this.estado=estado;
        this.propiedadesPropias = propiedadesPropias;
    }
    public Propietario(String apellidoPropietario, String nombrePropietario, String domicilio, int dni, int telefono,int estado) {
        this.apellidoPropietario = apellidoPropietario;
        this.nombrePropietario = nombrePropietario;
        this.domicilio = domicilio;
        this.dni = dni;
        this.telefono = telefono;
        this.estado=estado;
    }
    
    public Propietario(int idPropietario, String apellidoPropietario, String nombrePropietario, String domicilio, int dni, int telefono,int estado) {
        this.idPropietario = idPropietario;
        this.apellidoPropietario = apellidoPropietario;
        this.nombrePropietario = nombrePropietario;
        this.domicilio = domicilio;
        this.dni = dni;
        this.telefono = telefono;
        this.estado=estado;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public int getIdPropietario() {
        return idPropietario;
    }

    public void setIdPropietario(int idPropietarip) {
        this.idPropietario = idPropietarip;
    }

    public String getApellidoPropietario() {
        return apellidoPropietario;
    }

    public void setApellidoPropietario(String apellidoPropietario) {
        this.apellidoPropietario = apellidoPropietario;
    }

    public String getNombrePropietario() {
        return nombrePropietario;
    }

    public void setNombrePropietario(String nombrePropietario) {
        this.nombrePropietario = nombrePropietario;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
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

    public ArrayList getPropiedadesPropias() {
        return propiedadesPropias;
    }

    public void setPropiedadesPropias(ArrayList propiedadesPropias) {
        this.propiedadesPropias = propiedadesPropias;
    }

    @Override
    public String toString() {
        return  apellidoPropietario + ", " + nombrePropietario +  ", " + dni ;
    }
    
    
    
    
    
    
}
