
package inmobiliaria;

import java.util.ArrayList;


public class Inquilino {
    private int idInquilino;
    private String apellido,nombre,tipo,lugarTrabajo,nombreGarante;
    private int dni,cuit,telefono,dniGarante,supMin,precioAprox,estado;
    private ArrayList propiedades;

    public Inquilino() {
    }
    
    
    public Inquilino(String apellido, String nombre, String tipo, String lugarTrabajo, String nombreGarante, int dni, int cuit, int telefono, int dniGarante, int supMin, int precioAprox, int estado) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.tipo = tipo;
        this.lugarTrabajo = lugarTrabajo;
        this.nombreGarante = nombreGarante;
        this.dni = dni;
        this.cuit = cuit;
        this.telefono = telefono;
        this.dniGarante = dniGarante;
        this.supMin = supMin;
        this.precioAprox = precioAprox;
        this.estado = estado;
    }

    public Inquilino(int idInquilino, String apellido, String nombre, String tipo, String lugarTrabajo, String nombreGarante, int dni, int cuit, int telefono, int dniGarante, int supMin, int precioAprox, int estado) {
        this.idInquilino = idInquilino;
        this.apellido = apellido;
        this.nombre = nombre;
        this.tipo = tipo;
        this.lugarTrabajo = lugarTrabajo;
        this.nombreGarante = nombreGarante;
        this.dni = dni;
        this.cuit = cuit;
        this.telefono = telefono;
        this.dniGarante = dniGarante;
        this.supMin = supMin;
        this.precioAprox = precioAprox;
        this.estado = estado;
       
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getLugarTrabajo() {
        return lugarTrabajo;
    }

    public void setLugarTrabajo(String lugarTrabajo) {
        this.lugarTrabajo = lugarTrabajo;
    }

    public String getNombreGarante() {
        return nombreGarante;
    }

    public void setNombreGarante(String nombreGarante) {
        this.nombreGarante = nombreGarante;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getCuit() {
        return cuit;
    }

    public void setCuit(int cuit) {
        this.cuit = cuit;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getDniGarante() {
        return dniGarante;
    }

    public void setDniGarante(int dniGarante) {
        this.dniGarante = dniGarante;
    }

    public int getSupMin() {
        return supMin;
    }

    public void setSupMin(int supMin) {
        this.supMin = supMin;
    }

    public int getPrecioAprox() {
        return precioAprox;
    }

    public void setPrecioAprox(int precioAprox) {
        this.precioAprox = precioAprox;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public ArrayList getPropiedades() {
        return propiedades;
    }

    public void setPropiedades(ArrayList propiedades) {
        this.propiedades = propiedades;
    }
    
    @Override
    public String toString() {
        return  idInquilino + ", " + apellido + ", " + nombre ;
    }

    
}
