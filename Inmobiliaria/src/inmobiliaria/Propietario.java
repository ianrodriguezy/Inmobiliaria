
package inmobiliaria;

import java.util.ArrayList;


public class Propietario {
    private int idPropietarip;
    private String apellidoPropietario,nombrePropietario,domicilio;
    private int dni;
    private int telefono;
    private ArrayList propiedadesPropias;

    public Propietario() {
    }

    public Propietario(String apellidoPropietario, String nombrePropietario, String domicilio, int dni, int telefono, ArrayList propiedadesPropias) {
        this.apellidoPropietario = apellidoPropietario;
        this.nombrePropietario = nombrePropietario;
        this.domicilio = domicilio;
        this.dni = dni;
        this.telefono = telefono;
        this.propiedadesPropias = propiedadesPropias;
    }

    public Propietario(int idPropietarip, String apellidoPropietario, String nombrePropietario, String domicilio, int dni, int telefono, ArrayList propiedadesPropias) {
        this.idPropietarip = idPropietarip;
        this.apellidoPropietario = apellidoPropietario;
        this.nombrePropietario = nombrePropietario;
        this.domicilio = domicilio;
        this.dni = dni;
        this.telefono = telefono;
        this.propiedadesPropias = propiedadesPropias;
    }

    public int getIdPropietarip() {
        return idPropietarip;
    }

    public void setIdPropietarip(int idPropietarip) {
        this.idPropietarip = idPropietarip;
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
    
    
    
    
    
    
}
