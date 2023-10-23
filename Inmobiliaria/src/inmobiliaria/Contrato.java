package inmobiliaria;

import java.time.LocalDate;
import java.util.Date;

public class Contrato {

    private int codContrato, vigente,estado;
    private Inquilino eLinquilino;
    private Propietario eLpropietario;
    private LocalDate fechaInicio, fechaRealizacion, fechaFin;
    private String firmas;
    private Propiedad propiedad;
    private Vendedor vendedor;

    public Contrato() {
    }

    public Contrato(Inquilino eLinquilino, Propietario eLpropietario, int estado, LocalDate fechaInicio, LocalDate fechaRealizacion, LocalDate fechaFin, String firmas, Propiedad propiedad, Vendedor vendedor) {
        this.eLinquilino = eLinquilino;
        this.eLpropietario = eLpropietario;
        this.vigente = vigente;
        this.fechaInicio = fechaInicio;
        this.fechaRealizacion = fechaRealizacion;
        this.fechaFin = fechaFin;
        this.firmas = firmas;
        this.propiedad = propiedad;
        this.vendedor = vendedor;
        this.estado=estado;
    }

    public Contrato(int codContrato, Inquilino eLinquilino, Propietario eLpropietario, int estado, LocalDate fechaInicio, LocalDate fechaRealizacion, LocalDate fechaFin, String firmas, Propiedad propiedad, Vendedor vendedor) {
        this.codContrato = codContrato;
        this.eLinquilino = eLinquilino;
        this.eLpropietario = eLpropietario;
        this.vigente = vigente;
        this.fechaInicio = fechaInicio;
        this.fechaRealizacion = fechaRealizacion;
        this.fechaFin = fechaFin;
        this.firmas = firmas;
        this.propiedad = propiedad;
        this.vendedor = vendedor;
        this.estado=estado;
        
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

    public Propietario geteLpropietario() {
        return eLpropietario;
    }

    public void seteLpropietario(Propietario eLpropietario) {
        this.eLpropietario = eLpropietario;
    }
    

    public int getVigente() {
        return vigente;
    }

    public void setVigente(int vigente) {
        this.vigente = vigente;
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

    public String getFirmas() {
        return firmas;
    }

    public void setFirmas(String firmas) {
        this.firmas = firmas;
    }

    public Propiedad getPropiedad() {
        return propiedad;
    }

    public void setPropiedad(Propiedad propiedad) {
        this.propiedad = propiedad;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

}
