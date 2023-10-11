/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inmobiliaria.AccesoDatos;

import static Inmobiliaria.AccesoDatos.PropietarioData.mostrarMensaje;
import inmobiliaria.Inquilino;
import inmobiliaria.Inspector;
import inmobiliaria.Propiedad;
import inmobiliaria.Propietario;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;
/**
 *
 * @author Ian
 */
public class PropiedadData {
    
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
            mostrarMensaje("Error al acceder a la tabla Propietario, " + ex.getMessage(),"Error de conexión","error");
            
        }
        return tipos;
    }
    
    public static List<Propiedad> buscarPropiedadPorPropietario(int id){
        List<Propiedad> propiedades=new ArrayList<>();
        Connection con = null;
        PreparedStatement ps = null;
        con = Conectar.getConectar();
        try{
            String sql= "SELECT `id_prop`, `titulo`, `accesibilidad`, `caracteristicas`, `direccion`, `estadoProp`, `servicios`, `precioTasado`, `superficie_cubierta`, `superficie_total`, `tipoProp`, `zona`, `propietario`, `inquilino`, `revisor` FROM `propiedad_inmueble` WHERE propietario="+id;
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
                p.setZona(rs.getString("zona"));
                Propietario propietario = new Propietario();
                propietario.setIdPropietario(rs.getInt("propietario"));
                p.setDueño(propietario);
                Inquilino i = new Inquilino();
                i.setIdInquilino(rs.getInt("inquilino"));
                p.setOcupante(i);
                Inspector r=new Inspector();
                r.setIdInspector(rs.getInt("revisor"));
                p.setRevisor(r);
                propiedades.add(p);
            }
            ps.close();
        }catch(SQLException ex) {
            mostrarMensaje("Error al acceder a la tabla Propietario, " + ex.getMessage(),"Error de conexión","error");
            System.out.println("acaaaa");
        }
        return propiedades;
    }
}
