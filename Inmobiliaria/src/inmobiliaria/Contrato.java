
package inmobiliaria;

import java.time.LocalDate;


public class Contrato {
    
    private int codContrato;
    private Inquilino eLinquilino;
    private LocalDate fechaInicio,fechaRealizacion,fechaFin; 
    private char marca;
    private Propiedad propiedad;
    private String vendedor;

    public Contrato() {
    }

    public Contrato(Inquilino eLinquilino, LocalDate fechaInicio, LocalDate fechaRealizacion, LocalDate fechaFin, char marca, Propiedad propiedad, String vendedor) {
        this.eLinquilino = eLinquilino;
        this.fechaInicio = fechaInicio;
        this.fechaRealizacion = fechaRealizacion;
        this.fechaFin = fechaFin;
        this.marca = marca;
        this.propiedad = propiedad;
        this.vendedor = vendedor;
    }

    public Contrato(int codContrato, Inquilino eLinquilino, LocalDate fechaInicio, LocalDate fechaRealizacion, LocalDate fechaFin, char marca, Propiedad propiedad, String vendedor) {
        this.codContrato = codContrato;
        this.eLinquilino = eLinquilino;
        this.fechaInicio = fechaInicio;
        this.fechaRealizacion = fechaRealizacion;
        this.fechaFin = fechaFin;
        this.marca = marca;
        this.propiedad = propiedad;
        this.vendedor = vendedor;
    }

    public int getCodContrato() {
        return codContrato;
    }

    public void setCodContrato(int codContrato) {
        this.codContrato = codContrato;
    }

    public Inquilino geteLinquilino() {
        return eLinquilino;
    }

    public void seteLinquilino(Inquilino eLinquilino) {
        this.eLinquilino = eLinquilino;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaRealizacion() {
        return fechaRealizacion;
    }

    public void setFechaRealizacion(LocalDate fechaRealizacion) {
        this.fechaRealizacion = fechaRealizacion;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public char getMarca() {
        return marca;
    }

    public void setMarca(char marca) {
        this.marca = marca;
    }

    public Propiedad getPropiedad() {
        return propiedad;
    }

    public void setPropiedad(Propiedad propiedad) {
        this.propiedad = propiedad;
    }

    public String getVendedor() {
        return vendedor;
    }

    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }
    
    
    
    
    
}
