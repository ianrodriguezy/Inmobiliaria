
package inmobiliaria;


public class Propiedad {
    private int idPropiedad;
    private String accesibilidad, caracteristica, direccion, forma, zona;
    private Propietario dueño;
    private String estadoPropiedad,tipoPropiedad;
    private Inquilino ocupante;
    private float precioTasado;
    private Inspector revisor;
    private int superficieMinima;

    public Propiedad() {
    }

    public Propiedad(int idPropiedad, String accesibilidad, String caracteristica, String direccion, String forma, String zona, Propietario dueño, String estadoPropiedad, String tipoPropiedad, Inquilino ocupante, float precioTasado, Inspector revisor, int superficieMinima) {
        this.idPropiedad = idPropiedad;
        this.accesibilidad = accesibilidad;
        this.caracteristica = caracteristica;
        this.direccion = direccion;
        this.forma = forma;
        this.zona = zona;
        this.dueño = dueño;
        this.estadoPropiedad = estadoPropiedad;
        this.tipoPropiedad = tipoPropiedad;
        this.ocupante = ocupante;
        this.precioTasado = precioTasado;
        this.revisor = revisor;
        this.superficieMinima = superficieMinima;
    }

    public Propiedad(String accesibilidad, String caracteristica, String direccion, String forma, String zona, Propietario dueño, String estadoPropiedad, String tipoPropiedad, Inquilino ocupante, float precioTasado, Inspector revisor, int superficieMinima) {
        this.accesibilidad = accesibilidad;
        this.caracteristica = caracteristica;
        this.direccion = direccion;
        this.forma = forma;
        this.zona = zona;
        this.dueño = dueño;
        this.estadoPropiedad = estadoPropiedad;
        this.tipoPropiedad = tipoPropiedad;
        this.ocupante = ocupante;
        this.precioTasado = precioTasado;
        this.revisor = revisor;
        this.superficieMinima = superficieMinima;
    }

    public Propiedad(int idPropiedad, String accesibilidad, String caracteristica, String direccion, String forma, String zona, Propietario dueño, String estadoPropiedad, String tipoPropiedad, float precioTasado, Inspector revisor, int superficieMinima) {
        this.idPropiedad = idPropiedad;
        this.accesibilidad = accesibilidad;
        this.caracteristica = caracteristica;
        this.direccion = direccion;
        this.forma = forma;
        this.zona = zona;
        this.dueño = dueño;
        this.estadoPropiedad = estadoPropiedad;
        this.tipoPropiedad = tipoPropiedad;
        this.precioTasado = precioTasado;
        this.revisor = revisor;
        this.superficieMinima = superficieMinima;
    }

    public int getIdPropiedad() {
        return idPropiedad;
    }

    public void setIdPropiedad(int idPropiedad) {
        this.idPropiedad = idPropiedad;
    }

    public String getAccesibilidad() {
        return accesibilidad;
    }

    public void setAccesibilidad(String accesibilidad) {
        this.accesibilidad = accesibilidad;
    }

    public String getCaracteristica() {
        return caracteristica;
    }

    public void setCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public Propietario getDueño() {
        return dueño;
    }

    public void setDueño(Propietario dueño) {
        this.dueño = dueño;
    }

    public String getEstadoPropiedad() {
        return estadoPropiedad;
    }

    public void setEstadoPropiedad(String estadoPropiedad) {
        this.estadoPropiedad = estadoPropiedad;
    }

    public String getTipoPropiedad() {
        return tipoPropiedad;
    }

    public void setTipoPropiedad(String tipoPropiedad) {
        this.tipoPropiedad = tipoPropiedad;
    }

    public Inquilino getOcupante() {
        return ocupante;
    }

    public void setOcupante(Inquilino ocupante) {
        this.ocupante = ocupante;
    }

    public float getPrecioTasado() {
        return precioTasado;
    }

    public void setPrecioTasado(float precioTasado) {
        this.precioTasado = precioTasado;
    }

    public Inspector getRevisor() {
        return revisor;
    }

    public void setRevisor(Inspector revisor) {
        this.revisor = revisor;
    }

    public int getSuperficieMinima() {
        return superficieMinima;
    }

    public void setSuperficieMinima(int superficieMinima) {
        this.superficieMinima = superficieMinima;
    }
    
    
    
}
