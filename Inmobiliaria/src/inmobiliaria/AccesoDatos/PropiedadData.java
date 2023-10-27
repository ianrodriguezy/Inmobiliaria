/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inmobiliaria.AccesoDatos;

import static Inmobiliaria.AccesoDatos.PropietarioData.mostrarMensaje;
import inmobiliaria.AccesoDatos.InspectorData;
import inmobiliaria.Inquilino;
import inmobiliaria.Inspector;
import inmobiliaria.Propiedad;
import inmobiliaria.Propietario;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;
import java.util.HashSet;
import static org.mariadb.jdbc.pool.Pools.close;
/**
 *
 * @author Ian
 */
public class PropiedadData {
    public static void agregarPropiedad(Propiedad p){
        Connection con = null;
        PreparedStatement ps = null;

        String sql = "INSERT INTO `propiedad_inmueble`( `titulo`, `accesibilidad`, `caracteristicas`, `direccion`, `estadoProp`, `servicios`, `precioTasado`, `superficie_cubierta`, `superficie_total`, `tipoProp`, `localidad`, `propietario`, `inquilino`, `revisor`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        con = Conectar.getConectar();

        try {
            ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, p.getTitulo());
            ps.setString(2,p.getAccesibilidad());
            ps.setString(3, p.getCaracteristicas());
            ps.setString(4, p.getDireccion());
            ps.setString(5, p.getEstadoPropiedad());
            ps.setString(6, p.getServicios());
            ps.setFloat(7,p.getPrecioTasado());
            ps.setInt(8, p.getSuperficieCub());
            ps.setInt(9,p.getSuperficieTotal());
            ps.setString(10,p.getTipoPropiedad());
            ps.setString(11,p.getLocalidad());
            ps.setInt(12, p.getDueño().getIdPropietario());
            ps.setInt(13, p.getOcupante().getIdInquilino());
            ps.setInt(14, p.getRevisor().getIdInspector());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            ps.close();
        } catch (SQLException ex) {
            mostrarMensaje("Error al acceder a la tabla Propiedades, " + ex.getMessage(),"Error de conexión","error");
        }
         mostrarMensaje("Alta exitosa.","Creacion de propiedad","info");
        close();
    }
    
    public static void modificarPropiedad(Propiedad p){
        Connection con = null;
        PreparedStatement ps = null;

        String sql = "UPDATE propiedad_inmueble SET titulo=?,accesibilidad=?,caracteristicas=?,direccion=?,estadoProp=?,servicios=?,precioTasado=?,superficie_cubierta=?,superficie_total=?,tipoProp=?,localidad=?,propietario=?,inquilino=?,revisor=? WHERE id_prop="+p.getIdPropiedad();
        con = Conectar.getConectar();

        try {
            ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, p.getTitulo());
            ps.setString(2,p.getAccesibilidad());
            ps.setString(3, p.getCaracteristicas());
            ps.setString(4, p.getDireccion());
            ps.setString(5, p.getEstadoPropiedad());
            ps.setString(6, p.getServicios());
            ps.setFloat(7,p.getPrecioTasado());
            ps.setInt(8, p.getSuperficieCub());
            ps.setInt(9,p.getSuperficieTotal());
            ps.setString(10,p.getTipoPropiedad());
            ps.setString(11,p.getLocalidad());
            ps.setInt(12, p.getDueño().getIdPropietario());
            ps.setInt(13, p.getOcupante().getIdInquilino());
            ps.setInt(14, p.getRevisor().getIdInspector());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            ps.close();
        } catch (SQLException ex) {
            mostrarMensaje("Error al acceder a la tabla Propiedades, " + ex.getMessage(),"Error de conexión","error");
        }
         mostrarMensaje("Modificación exitosa.","Modificación de propiedad","info");
        close();
    }
    
    public static List<String> listarTipos() {
        List<String> tipos=new ArrayList<>();
        Connection con = null;
        PreparedStatement ps = null;
        con = Conectar.getConectar();
        try{
            String sql= "SELECT tipoProp FROM `propiedad_inmueble` ";
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                String t= rs.getString("tipoProp");
                tipos.add(t);
            }
            ps.close();
        }catch(SQLException ex) {
            mostrarMensaje("Error al acceder a la tabla Propiedades, " + ex.getMessage(),"Error de conexión","error");
            
        }
         List<String> listaSinDuplicados = eliminarDuplicados(tipos);
close();
        return listaSinDuplicados;
    }
    
    public static List<String> eliminarDuplicados(List<String> lista) {
        HashSet<String> conjunto = new HashSet<>(lista);
        return new ArrayList<>(conjunto);
    }
    
    public static List<Propiedad> buscarPropiedadPorPropietario(int id){
        List<Propiedad> propiedades=new ArrayList<>();
        Connection con = null;
        PreparedStatement ps = null;
        con = Conectar.getConectar();
        try{
            String sql= "SELECT `id_prop`, `titulo`, `accesibilidad`, `caracteristicas`, `direccion`, `estadoProp`, `servicios`, `precioTasado`, `superficie_cubierta`, `superficie_total`, `tipoProp`, `localidad`, `propietario`, `inquilino`, `revisor` FROM `propiedad_inmueble` WHERE propietario="+id;
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Propiedad p = new Propiedad();
                p.setIdPropiedad(rs.getInt("id_prop"));
                p.setTitulo(rs.getString("titulo"));
                p.setAccesibilidad(rs.getString("accesibilidad"));
                p.setCaracteristicas(rs.getString("caracteristicas"));
                p.setDireccion(rs.getString("direccion"));
                p.setEstadoPropiedad(rs.getString("estadoProp"));
                p.setServicios(rs.getString("servicios"));
                p.setPrecioTasado(rs.getFloat("precioTasado"));
                p.setSuperficieCub(rs.getInt("superficie_cubierta"));
                p.setSuperficieTotal(rs.getInt("superficie_total"));
                p.setTipoPropiedad(rs.getString("tipoProp"));
                p.setLocalidad(rs.getString("localidad"));
                Propietario propietario = new Propietario();
                propietario=PropietarioData.buscarPropietarioPorId(rs.getInt("propietario"));
                p.setDueño(propietario);
                Inquilino i = new Inquilino();
                i=InquilinoData.buscarInquilinoPorId(rs.getInt("inquilino"));
                p.setOcupante(i);
                Inspector r=new Inspector();
                r=InspectorData.buscarInspectorPorId(rs.getInt("revisor"));
                p.setRevisor(r);
                propiedades.add(p);
            }
            ps.close();
        }catch(SQLException ex) {
            mostrarMensaje("Error al acceder a la tabla Propiedades, " + ex.getMessage(),"Error de conexión","error");
            
        }
        close();
        return propiedades;
    }
    public static List<Propiedad> buscarPropiedadPorOcupante(int id){
        List<Propiedad> propiedades=new ArrayList<>();
        Connection con = null;
        PreparedStatement ps = null;
        con = Conectar.getConectar();
        try{
            String sql= "SELECT `id_prop`, `titulo`, `accesibilidad`, `caracteristicas`, `direccion`, `estadoProp`, `servicios`, `precioTasado`, `superficie_cubierta`, `superficie_total`, `tipoProp`, `localidad`, `propietario`, `inquilino`, `revisor` FROM `propiedad_inmueble` WHERE inquilino="+id;
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Propiedad p = new Propiedad();
                p.setIdPropiedad(rs.getInt("id_prop"));
                p.setTitulo(rs.getString("titulo"));
                p.setAccesibilidad(rs.getString("accesibilidad"));
                p.setCaracteristicas(rs.getString("caracteristicas"));
                p.setDireccion(rs.getString("direccion"));
                p.setEstadoPropiedad(rs.getString("estadoProp"));
                p.setServicios(rs.getString("servicios"));
                p.setPrecioTasado(rs.getFloat("precioTasado"));
                p.setSuperficieCub(rs.getInt("superficie_cubierta"));
                p.setSuperficieTotal(rs.getInt("superficie_total"));
                p.setTipoPropiedad(rs.getString("tipoProp"));
                p.setLocalidad(rs.getString("localidad"));
                Propietario propietario = new Propietario();
                propietario=PropietarioData.buscarPropietarioPorId(rs.getInt("propietario"));
                p.setDueño(propietario);
                Inquilino i = new Inquilino();
                i=InquilinoData.buscarInquilinoPorId(rs.getInt("inquilino"));
                p.setOcupante(i);
                Inspector r=new Inspector();
                r=InspectorData.buscarInspectorPorId(rs.getInt("revisor"));
                p.setRevisor(r);
                propiedades.add(p);
            }
            ps.close();
        }catch(SQLException ex) {
            mostrarMensaje("Error al acceder a la tabla Propiedades, " + ex.getMessage(),"Error de conexión","error");
            
        }
        close();
        return propiedades;
    }
    public static List<Propiedad> buscarPropiedadPorRevisor(int id){
        List<Propiedad> propiedades=new ArrayList<>();
        Connection con = null;
        PreparedStatement ps = null;
        con = Conectar.getConectar();
        try{
            String sql= "SELECT `id_prop`, `titulo`, `accesibilidad`, `caracteristicas`, `direccion`, `estadoProp`, `servicios`, `precioTasado`, `superficie_cubierta`, `superficie_total`, `tipoProp`, `localidad`, `propietario`, `inquilino`, `revisor` FROM `propiedad_inmueble` WHERE revisor="+id;
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Propiedad p = new Propiedad();
                p.setIdPropiedad(rs.getInt("id_prop"));
                p.setTitulo(rs.getString("titulo"));
                p.setAccesibilidad(rs.getString("accesibilidad"));
                p.setCaracteristicas(rs.getString("caracteristicas"));
                p.setDireccion(rs.getString("direccion"));
                p.setEstadoPropiedad(rs.getString("estadoProp"));
                p.setServicios(rs.getString("servicios"));
                p.setPrecioTasado(rs.getFloat("precioTasado"));
                p.setSuperficieCub(rs.getInt("superficie_cubierta"));
                p.setSuperficieTotal(rs.getInt("superficie_total"));
                p.setTipoPropiedad(rs.getString("tipoProp"));
                p.setLocalidad(rs.getString("localidad"));
                Propietario propietario = new Propietario();
                propietario=PropietarioData.buscarPropietarioPorId(rs.getInt("propietario"));
                p.setDueño(propietario);
                Inquilino i = new Inquilino();
                i=InquilinoData.buscarInquilinoPorId(rs.getInt("inquilino"));
                p.setOcupante(i);
                Inspector r=new Inspector();
                r=InspectorData.buscarInspectorPorId(rs.getInt("revisor"));
                p.setRevisor(r);
                propiedades.add(p);
            }
            ps.close();
        }catch(SQLException ex) {
            mostrarMensaje("Error al acceder a la tabla Propiedades, " + ex.getMessage(),"Error de conexión","error");
            
        }
        close();
        return propiedades;
    }
    public static Propiedad buscarPropiedadPorId(int id){
        Propiedad p = new Propiedad();
        Connection con = null;
        PreparedStatement ps = null;
        con = Conectar.getConectar();
        try{
            String sql= "SELECT `id_prop`, `titulo`, `accesibilidad`, `caracteristicas`, `direccion`, `estadoProp`, `servicios`, `precioTasado`, `superficie_cubierta`, `superficie_total`, `tipoProp`, `localidad`, `propietario`, `inquilino`, `revisor` FROM `propiedad_inmueble` WHERE id_prop="+id;
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                
                p.setIdPropiedad(rs.getInt("id_prop"));
                p.setTitulo(rs.getString("titulo"));
                p.setAccesibilidad(rs.getString("accesibilidad"));
                p.setCaracteristicas(rs.getString("caracteristicas"));
                p.setDireccion(rs.getString("direccion"));
                p.setEstadoPropiedad(rs.getString("estadoProp"));
                p.setServicios(rs.getString("servicios"));
                p.setPrecioTasado(rs.getFloat("precioTasado"));
                p.setSuperficieCub(rs.getInt("superficie_cubierta"));
                p.setSuperficieTotal(rs.getInt("superficie_total"));
                p.setTipoPropiedad(rs.getString("tipoProp"));
                p.setLocalidad(rs.getString("localidad"));
                Propietario propietario = new Propietario();
                propietario=PropietarioData.buscarPropietarioPorId(rs.getInt("propietario"));
                p.setDueño(propietario);
                Inquilino i = new Inquilino();
                i=InquilinoData.buscarInquilinoPorId(rs.getInt("inquilino"));
                p.setOcupante(i);
                Inspector r=new Inspector();
                r=InspectorData.buscarInspectorPorId(rs.getInt("revisor"));
                p.setRevisor(r);
                
            }
            ps.close();
        }catch(SQLException ex) {
            mostrarMensaje("Error al acceder a la tabla Propiedades, " + ex.getMessage(),"Error de conexión","error");
            
        }
        close();
        return p;
    }
    
    public static Propiedad buscarPropiedadPorDireccion(String dire){
        Connection con = null;
        PreparedStatement ps = null;
        con = Conectar.getConectar();
        String direccion= dire.toUpperCase();
        Propiedad p = new Propiedad();
        try{
            String sql= "SELECT `id_prop`, `titulo`, `accesibilidad`, `caracteristicas`, `direccion`, `estadoProp`, `servicios`, `precioTasado`, `superficie_cubierta`, `superficie_total`, `tipoProp`, `localidad`, `propietario`, `inquilino`, `revisor` FROM `propiedad_inmueble` WHERE direccion= '"+direccion+"'";
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){ 
                p.setIdPropiedad(rs.getInt("id_prop"));
                p.setTitulo(rs.getString("titulo"));
                p.setAccesibilidad(rs.getString("accesibilidad"));
                p.setCaracteristicas(rs.getString("caracteristicas"));
                p.setDireccion(rs.getString("direccion"));
                p.setEstadoPropiedad(rs.getString("estadoProp"));
                p.setServicios(rs.getString("servicios"));
                p.setPrecioTasado(rs.getFloat("precioTasado"));
                p.setSuperficieCub(rs.getInt("superficie_cubierta"));
                p.setSuperficieTotal(rs.getInt("superficie_total"));
                p.setTipoPropiedad(rs.getString("tipoProp"));
                p.setLocalidad(rs.getString("localidad"));
               Propietario propietario = new Propietario();
                propietario=PropietarioData.buscarPropietarioPorId(rs.getInt("propietario"));
                p.setDueño(propietario);
                Inquilino i = new Inquilino();
                i=InquilinoData.buscarInquilinoPorId(rs.getInt("inquilino"));
                p.setOcupante(i);
                Inspector r=new Inspector();
                r=InspectorData.buscarInspectorPorId(rs.getInt("revisor"));
                p.setRevisor(r);
                
            }
            ps.close();
        }catch(SQLException ex) {
            mostrarMensaje("Error al acceder a la tabla Propiedades, " + ex.getMessage(),"Error de conexión","error");
            
        }
        close();
        return p;
    }
    
     public static List<Propiedad> buscarPropiedadPorTipo(String tipo){
        Connection con = null;
        PreparedStatement ps = null;
        con = Conectar.getConectar();
        List <Propiedad> propiedades= new ArrayList<>();
        try{
            String sql= "SELECT `id_prop`, `titulo`, `accesibilidad`, `caracteristicas`, `direccion`, `estadoProp`, `servicios`, `precioTasado`, `superficie_cubierta`, `superficie_total`, `tipoProp`, `localidad`, `propietario`, `inquilino`, `revisor` FROM `propiedad_inmueble` WHERE tipoProp= '"+tipo+"'";
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){ 
                Propiedad p = new Propiedad();
                p.setIdPropiedad(rs.getInt("id_prop"));
                p.setTitulo(rs.getString("titulo"));
                p.setAccesibilidad(rs.getString("accesibilidad"));
                p.setCaracteristicas(rs.getString("caracteristicas"));
                p.setDireccion(rs.getString("direccion"));
                p.setEstadoPropiedad(rs.getString("estadoProp"));
                p.setServicios(rs.getString("servicios"));
                p.setPrecioTasado(rs.getFloat("precioTasado"));
                p.setSuperficieCub(rs.getInt("superficie_cubierta"));
                p.setSuperficieTotal(rs.getInt("superficie_total"));
                p.setTipoPropiedad(rs.getString("tipoProp"));
                p.setLocalidad(rs.getString("localidad"));
                Propietario propietario = new Propietario();
                propietario=PropietarioData.buscarPropietarioPorId(rs.getInt("propietario"));
                p.setDueño(propietario);
                Inquilino i = new Inquilino();
                i=InquilinoData.buscarInquilinoPorId(rs.getInt("inquilino"));
                p.setOcupante(i);
                Inspector r=new Inspector();
                r=InspectorData.buscarInspectorPorId(rs.getInt("revisor"));
                p.setRevisor(r);
                propiedades.add(p);
                
            }
            ps.close();
        }catch(SQLException ex) {
            mostrarMensaje("Error al acceder a la tabla Propiedades, " + ex.getMessage(),"Error de conexión","error");
            
        }
        close();
        return propiedades;
    }
    
     public static List<Propiedad> listarPropiedadesDisponiblesReservadas(){
        Connection con = null;
        PreparedStatement ps = null;
        con = Conectar.getConectar();
        List <Propiedad> propiedades= new ArrayList<>();
        try{
            String sql= "SELECT `id_prop`, `titulo`, `accesibilidad`, `caracteristicas`, `direccion`, `estadoProp`, `servicios`, `precioTasado`, `superficie_cubierta`, `superficie_total`, `tipoProp`, `localidad`, `propietario`, `inquilino`, `revisor` FROM `propiedad_inmueble` WHERE estadoProp='Disponible' OR estadoProp='Reservada'";
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){ 
                Propiedad p = new Propiedad();
                p.setIdPropiedad(rs.getInt("id_prop"));
                p.setTitulo(rs.getString("titulo"));
                p.setAccesibilidad(rs.getString("accesibilidad"));
                p.setCaracteristicas(rs.getString("caracteristicas"));
                p.setDireccion(rs.getString("direccion"));
                p.setEstadoPropiedad(rs.getString("estadoProp"));
                p.setServicios(rs.getString("servicios"));
                p.setPrecioTasado(rs.getFloat("precioTasado"));
                p.setSuperficieCub(rs.getInt("superficie_cubierta"));
                p.setSuperficieTotal(rs.getInt("superficie_total"));
                p.setTipoPropiedad(rs.getString("tipoProp"));
                p.setLocalidad(rs.getString("localidad"));
                Propietario propietario = new Propietario();
                propietario=PropietarioData.buscarPropietarioPorId(rs.getInt("propietario"));
                p.setDueño(propietario);
                Inquilino i = new Inquilino();
                i=InquilinoData.buscarInquilinoPorId(rs.getInt("inquilino"));
                p.setOcupante(i);
                Inspector r=new Inspector();
                r=InspectorData.buscarInspectorPorId(rs.getInt("revisor"));
                p.setRevisor(r);
                propiedades.add(p);
                
            }
            ps.close();
        }catch(SQLException ex) {
            mostrarMensaje("Error al acceder a la tabla Propiedades, " + ex.getMessage(),"Error de conexión","error");
            
        }
        close();
        return propiedades;
    }
     
      public static List<Propiedad> listarPropiedadesConContrato(){
        Connection con = null;
        PreparedStatement ps = null;
        con = Conectar.getConectar();
        List <Propiedad> propiedades= new ArrayList<>();
        try{
            String sql= "SELECT propiedad_inmueble.id_prop, propiedad_inmueble.titulo, propiedad_inmueble.accesibilidad, propiedad_inmueble.caracteristicas, propiedad_inmueble.direccion, propiedad_inmueble.estadoProp, propiedad_inmueble.servicios, propiedad_inmueble.precioTasado, propiedad_inmueble.superficie_cubierta, propiedad_inmueble.superficie_total, propiedad_inmueble.tipoProp, propiedad_inmueble.localidad, propiedad_inmueble.propietario, propiedad_inmueble.inquilino, propiedad_inmueble.revisor FROM propiedad_inmueble INNER JOIN contratoalquiler ON propiedad_inmueble.id_prop=contratoalquiler.propiedad";
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){ 
                Propiedad p = new Propiedad();
                p.setIdPropiedad(rs.getInt("id_prop"));
                p.setTitulo(rs.getString("titulo"));
                p.setAccesibilidad(rs.getString("accesibilidad"));
                p.setCaracteristicas(rs.getString("caracteristicas"));
                p.setDireccion(rs.getString("direccion"));
                p.setEstadoPropiedad(rs.getString("estadoProp"));
                p.setServicios(rs.getString("servicios"));
                p.setPrecioTasado(rs.getFloat("precioTasado"));
                p.setSuperficieCub(rs.getInt("superficie_cubierta"));
                p.setSuperficieTotal(rs.getInt("superficie_total"));
                p.setTipoPropiedad(rs.getString("tipoProp"));
                p.setLocalidad(rs.getString("localidad"));
                Propietario propietario = new Propietario();
                propietario=PropietarioData.buscarPropietarioPorId(rs.getInt("propietario"));
                p.setDueño(propietario);
                Inquilino i = new Inquilino();
                i=InquilinoData.buscarInquilinoPorId(rs.getInt("inquilino"));
                p.setOcupante(i);
                Inspector r=new Inspector();
                r=InspectorData.buscarInspectorPorId(rs.getInt("revisor"));
                p.setRevisor(r);
                propiedades.add(p);
                
            }
            ps.close();
        }catch(SQLException ex) {
            mostrarMensaje("Error al acceder a la tabla Propiedades y ContratoAlquiler, " + ex.getMessage(),"Error de conexión","error");
            
        }
        close();

        return propiedades;
    }
     
      public static void ActualizarPrecio(Propiedad p){
        Connection con = null;
        PreparedStatement ps = null;

        String sql = "UPDATE propiedad_inmueble SET precioTasado=? WHERE id_prop="+p.getIdPropiedad();
        con = Conectar.getConectar();

        try {
            ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS); 
            ps.setFloat(1,p.getPrecioTasado());
            
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();

        } catch (SQLException ex) {
            mostrarMensaje("Error al acceder a la tabla Propiedades, " + ex.getMessage(),"Error de conexión","error");
        }
         
        close();
    }
}
