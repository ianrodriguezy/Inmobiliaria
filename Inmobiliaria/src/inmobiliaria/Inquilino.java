
package inmobiliaria;

import java.util.ArrayList;


public class Inquilino {
    private int idInquilino;
    private String apellido,nombre;
    private char detalle,tipo;
    private int dni;
    private ArrayList propiedades;

    public Inquilino(int idInquilino, String apellido, String nombre, int dni, char detalle, char tipo, ArrayList propiedades) {
        this.idInquilino = idInquilino;
        this.apellido = apellido;
        this.nombre = nombre;
        this.detalle = detalle;
        this.tipo = tipo;
        this.dni = dni;
        this.propiedades = propiedades;
    }

    public Inquilino(String apellido, String nombre, int dni, char detalle, char tipo, ArrayList propiedades) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.detalle = detalle;
        this.tipo = tipo;
        this.dni = dni;
        this.propiedades = propiedades;
    }
    public Inquilino() {
    }

    public int getIdInquilino() {
        return idInquilino;
    }

    public void setIdInquilino(int idInquilino) {
        this.idInquilino = idInquilino;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getDetalle() {
        return detalle;
    }

    public void setDetalle(char detalle) {
        this.detalle = detalle;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public ArrayList getPropiedades() {
        return propiedades;
    }

    public void setPropiedades(ArrayList propiedades) {
        this.propiedades = propiedades;
    }

    
}
