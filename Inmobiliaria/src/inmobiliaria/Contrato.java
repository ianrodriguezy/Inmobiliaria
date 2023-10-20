package inmobiliaria;

import java.time.LocalDate;
import java.util.Date;

public class Contrato {

    private int codContrato, vigente;
    private Inquilino eLinquilino;
    private Propietario eLpropietario;
    private Date fechaInicio, fechaRealizacion, fechaFin;
    private String marca;
    private Propiedad propiedad;
    private String vendedor;

    public Contrato() {
    }

    public Contrato(Inquilino eLinquilino, Propietario eLpropietario, int vigente, Date fechaInicio, Date fechaRealizacion, Date fechaFin, String marca, Propiedad propiedad, String vendedor) {
        this.eLinquilino = eLinquilino;
        this.eLpropietario = eLpropietario;
        this.vigente = vigente;
        this.fechaInicio = fechaInicio;
        this.fechaRealizacion = fechaRealizacion;
        this.fechaFin = fechaFin;
        this.marca = marca;
        this.propiedad = propiedad;
        this.vendedor = vendedor;

    }

    public Contrato(int codContrato, Inquilino eLinquilino, Propietario eLpropietario, int vigente, Date fechaInicio, Date fechaRealizacion, Date fechaFin, String marca, Propiedad propiedad, String vendedor) {
        this.codContrato = codContrato;
        this.eLinquilino = eLinquilino;
        this.eLpropietario = eLpropietario;
        this.vigente = vigente;
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

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaRealizacion() {
        return fechaRealizacion;
    }

    public void setFechaRealizacion(Date fechaRealizacion) {
        this.fechaRealizacion = fechaRealizacion;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
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
