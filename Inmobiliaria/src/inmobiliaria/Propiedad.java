
package inmobiliaria;


public class Propiedad {
    private int idPropiedad;
    private String accesibilidad, caracteristicas, direccion, servicios, localidad, titulo;
    private Propietario dueño;
    private String estadoPropiedad,tipoPropiedad;
    private Inquilino ocupante;
    private float precioTasado;
    private Inspector revisor;
    private int superficieCub, superficieTotal;

    public Propiedad() {
    }

    public Propiedad(int idPropiedad,String titulo, String accesibilidad, String caracteristicas, String direccion, String servicios, String localidad, Propietario dueño, String estadoPropiedad, String tipoPropiedad, Inquilino ocupante, float precioTasado, Inspector revisor, int superficieCub, int superficieTotal) {
        this.idPropiedad = idPropiedad;
        this.titulo=titulo;
        this.accesibilidad = accesibilidad;
        this.caracteristicas = caracteristicas;
        this.direccion = direccion;
        this.servicios = servicios;
        this.localidad = localidad;
        this.dueño = dueño;
        this.estadoPropiedad = estadoPropiedad;
        this.tipoPropiedad = tipoPropiedad;
        this.ocupante = ocupante;
        this.precioTasado = precioTasado;
        this.revisor = revisor;
        this.superficieCub= superficieCub;
        this.superficieTotal=superficieTotal;
        
    }

    public Propiedad(String titulo, String accesibilidad, String caracteristicas, String direccion, String servicios, String localidad, Propietario dueño, String estadoPropiedad, String tipoPropiedad, Inquilino ocupante, float precioTasado, Inspector revisor, int superficieCub, int superficieTotal) {
        this.titulo=titulo;
        this.accesibilidad = accesibilidad;
        this.caracteristicas = caracteristicas;
        this.direccion = direccion;
        this.servicios = servicios;
        this.localidad = localidad;
        this.dueño = dueño;
        this.estadoPropiedad = estadoPropiedad;
        this.tipoPropiedad = tipoPropiedad;
        this.ocupante = ocupante;
        this.precioTasado = precioTasado;
        this.revisor = revisor;
        this.superficieCub= superficieCub;
        this.superficieTotal=superficieTotal;
    }

    public Propiedad(int idPropiedad, String titulo,String accesibilidad, String caracteristicas, String direccion, String servicios, String localidad, Propietario dueño, String estadoPropiedad, String tipoPropiedad, float precioTasado, Inspector revisor,int superficieCub, int superficieTotal) {
        this.idPropiedad = idPropiedad;
        this.titulo=titulo;
        this.accesibilidad = accesibilidad;
        this.caracteristicas = caracteristicas;
        this.direccion = direccion;
        this.servicios = servicios;
        this.localidad = localidad;
        this.dueño = dueño;
        this.estadoPropiedad = estadoPropiedad;
        this.tipoPropiedad = tipoPropiedad;
        this.precioTasado = precioTasado;
        this.revisor = revisor;
        this.superficieCub= superficieCub;
        this.superficieTotal=superficieTotal;
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

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getServicios() {
        return servicios;
    }

    public void setServicios(String servicios) {
        this.servicios = servicios;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;;
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

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getSuperficieCub() {
        return superficieCub;
    }

    public void setSuperficieCub(int superficieCub) {
        this.superficieCub = superficieCub;
    }

    public int getSuperficieTotal() {
        return superficieTotal;
    }

    public void setSuperficieTotal(int superficieTotal) {
        this.superficieTotal = superficieTotal;
    }

    @Override
    public String toString() {
        return idPropiedad + ", " + titulo ;
    }

    
    
    
    
}
