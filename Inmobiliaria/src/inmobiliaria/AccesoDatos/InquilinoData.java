/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inmobiliaria.AccesoDatos;

import static Inmobiliaria.AccesoDatos.PropietarioData.mostrarMensaje;
import inmobiliaria.Inquilino;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import static org.mariadb.jdbc.pool.Pools.close;


public class InquilinoData {
    
    
    public static void agregarInquilino(Inquilino i){ //Agregué los atributos basicos, hay que ver que mas tenemos en cuenta
        Connection con = null;
        PreparedStatement ps = null;

        String sql = "INSERT INTO inquilino ( `apellido`, `nombre`, `dni`, `cuit`, `tipo`, `telefono`, `lugarTrabajo`, `dniGarante`, `nombreGarante`, `supMinima`, `precioAprox`, `estado`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
        con = Conectar.getConectar();

        try {
            
            
            ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, i.getApellido());
            ps.setString(2, i.getNombre());
            ps.setInt(3, i.getDni());  
            ps.setInt(4, i.getCuit());
            ps.setString(5, i.getTipo());
            ps.setInt(6, i.getTelefono());
            ps.setString(7, i.getLugarTrabajo());
            ps.setInt(8, i.getDniGarante());
            ps.setString(9, i.getNombreGarante());
            ps.setInt(10, i.getSupMin());
            ps.setInt(11, i.getPrecioAprox());
            ps.setInt(12, 1);
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            ps.close();
        } catch (SQLException x) {
            System.out.println("Error " + x.getMessage());
        }
         mostrarMensaje("Alta exitosa.","Creacion de propietario","info");
    }
    
    public static Inquilino buscarInquilinoPorId(int id){
        Inquilino i = null;
        String sql = "SELECT `id_inquilino`, `apellido`, `nombre`, `dni`, `cuit`, `tipo`, `telefono`, `lugarTrabajo`, `dniGarante`, `nombreGarante`, `supMinima`, `precioAprox`, `estado` FROM `inquilino` WHERE id_inquilino="+id;
        Connection con = null;
        PreparedStatement ps = null;
        con = Conectar.getConectar();
        try {
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                i = new Inquilino();
                i.setIdInquilino(rs.getInt("id_inquilino"));
                i.setApellido(rs.getString("apellido"));
                i.setNombre(rs.getString("nombre"));                
                i.setDni(rs.getInt("dni"));     
                i.setCuit(rs.getInt("cuit"));  
                i.setTipo(rs.getString("tipo")); 
                i.setTelefono(rs.getInt("telefono"));
                i.setLugarTrabajo(rs.getString("lugarTrabajo")); 
                i.setDniGarante(rs.getInt("dniGarante"));
                i.setNombreGarante(rs.getString("nombreGarante"));
                i.setSupMin(rs.getInt("supMinima"));
                i.setPrecioAprox(rs.getInt("precioAprox"));
                i.setEstado(rs.getInt("estado"));
            } 
            ps.close();
        } catch (SQLException ex) {
            mostrarMensaje("Error al acceder a la tabla Inquilino, " + ex.getMessage(),"Error de conexión","error");
        }

        return i;
    }
    
    public static Inquilino buscarInquilinoPorDni(int dni, int nuevo, int mod) {
        Inquilino i = null;
        String sql;
        if(mod==1){
        sql = "SELECT `id_inquilino`, `apellido`, `nombre`, `dni`, `cuit`, `tipo`, `telefono`, `lugarTrabajo`, `dniGarante`, `nombreGarante`, `supMinima`, `precioAprox`, `estado` FROM `inquilino` WHERE dni=?";
        }else{
            sql = "SELECT `id_inquilino`, `apellido`, `nombre`, `dni`, `cuit`, `tipo`, `telefono`, `lugarTrabajo`, `dniGarante`, `nombreGarante`, `supMinima`, `precioAprox`, `estado` FROM `inquilino` WHERE dni=? AND estado=1";
        }
        Connection con = null;
        PreparedStatement ps = null;
        con = Conectar.getConectar();
        try {

            ps = con.prepareStatement(sql);
            ps.setInt(1, dni);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                i = new Inquilino();
                i.setIdInquilino(rs.getInt("id_inquilino"));
                i.setApellido(rs.getString("apellido"));
                i.setNombre(rs.getString("nombre"));                
                i.setDni(rs.getInt("dni"));   
                i.setCuit(rs.getInt("cuit"));  
                i.setTipo(rs.getString("tipo")); 
                i.setTelefono(rs.getInt("telefono"));
                i.setLugarTrabajo(rs.getString("lugarTrabajo")); 
                i.setDniGarante(rs.getInt("dniGarante"));
                i.setNombreGarante(rs.getString("nombreGarante"));
                i.setSupMin(rs.getInt("supMinima"));
                i.setPrecioAprox(rs.getInt("precioAprox"));
                i.setEstado(rs.getInt("estado"));
            } else if (nuevo!=1){
                mostrarMensaje("No existe el Inquilino ","Error al buscar","error");
            }
            ps.close();
        } catch (SQLException ex) {
            mostrarMensaje("Error al acceder a la tabla Inquilino, " + ex.getMessage(),"Error de conexión","error");
        }

        return i;

    }
    
    public static void modificarInquilino(Inquilino i){
        String sql = "UPDATE `inquilino` SET `apellido`=?,`nombre`=?,`dni`=?,`cuit`=?,`tipo`=?,`telefono`=?,`lugarTrabajo`=?,`dniGarante`=?,`nombreGarante`=?,`supMinima`=?,`precioAprox`=?,`estado`=? WHERE id_inquilino="+i.getIdInquilino();
        Connection con = null;
        PreparedStatement ps = null;
        con = Conectar.getConectar();
        try {

            ps = con.prepareStatement(sql);
            ps.setString(1, i.getApellido());
            ps.setString(2, i.getNombre());
            ps.setInt(3, i.getDni());  
            ps.setInt(4, i.getCuit());
            ps.setString(5, i.getTipo());
            ps.setInt(6, i.getTelefono());
            ps.setString(7, i.getLugarTrabajo());
            ps.setInt(8, i.getDniGarante());
            ps.setString(9, i.getNombreGarante());
            ps.setInt(10, i.getSupMin());
            ps.setInt(11, i.getPrecioAprox());
            ps.setInt(12, i.getEstado());
            

            int exito = ps.executeUpdate();
            if (exito == 1) {
                mostrarMensaje("Modificado exitosamente.","Modificacion de Inquilino","info");
            } else {
                mostrarMensaje("El inquilino no existe","Error al eliminar","error");
            }
            ps.close();
        } catch (SQLException ex) {
            mostrarMensaje("Error al acceder a la tabla Inquilino, " + ex.getMessage(),"Error de conexión","error");
        }
    }
    
    public static boolean multarInquilino(Inquilino i){ //Falta este
        return true;
    }
    
    public static void bajaInquilino(int id){ //Hay que agregar atributo estado en la tabla inquilino
        Connection con = null;
        PreparedStatement ps = null;
        con = Conectar.getConectar();
        
        try {
            String sql = "UPDATE inquilino SET estado = 0 WHERE id_inquilino = "+id;
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int fila = ps.executeUpdate();

            if (fila == 1) {
                mostrarMensaje("Se dio de baja al Inquilino exitosamente.","Baja de Inquilino","info");
            }
            ps.close();
        } catch (SQLException e) {
            mostrarMensaje("Error al acceder a la tabla Inquilino","Error al conectar","error");
        }
    }
    
    public static List<Inquilino> listarInquilinos() {
        List<Inquilino> inquilinos=new ArrayList<>();
        Connection con = null;
        PreparedStatement ps = null;
        con = Conectar.getConectar();
        try{
            String sql= "SELECT * FROM `inquilino` ";
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Inquilino i= new Inquilino();
                i.setIdInquilino(rs.getInt("id_inquilino"));
                i.setApellido(rs.getString("apellido"));
                i.setNombre(rs.getString("nombre"));
                i.setDni(rs.getInt("dni"));
                i.setCuit(rs.getInt("cuit"));  
                i.setTipo(rs.getString("tipo")); 
                i.setTelefono(rs.getInt("telefono"));
                i.setLugarTrabajo(rs.getString("lugarTrabajo")); 
                i.setDniGarante(rs.getInt("dniGarante"));
                i.setNombreGarante(rs.getString("nombreGarante"));
                i.setSupMin(rs.getInt("supMinima"));
                i.setPrecioAprox(rs.getInt("precioAprox"));
                i.setEstado(rs.getInt("estado"));
                inquilinos.add(i);
            }
            ps.close();
        }catch(SQLException ex) {
            mostrarMensaje("Error al acceder a la tabla Inquilino, " + ex.getMessage(),"Error de conexión","error");
            
        }
        close();
        return inquilinos;
    }
    
    public static List<Inquilino> listarInquilinosSinD() {
        List<Inquilino> inquilinos=new ArrayList<>();
        Connection con = null;
        PreparedStatement ps = null;
        con = Conectar.getConectar();
        try{
            String sql= "SELECT * FROM `inquilino` WHERE id_inquilino<>1";
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Inquilino i= new Inquilino();
                i.setIdInquilino(rs.getInt("id_inquilino"));
                i.setApellido(rs.getString("apellido"));
                i.setNombre(rs.getString("nombre"));
                i.setDni(rs.getInt("dni"));
                i.setCuit(rs.getInt("cuit"));  
                i.setTipo(rs.getString("tipo")); 
                i.setTelefono(rs.getInt("telefono"));
                i.setLugarTrabajo(rs.getString("lugarTrabajo")); 
                i.setDniGarante(rs.getInt("dniGarante"));
                i.setNombreGarante(rs.getString("nombreGarante"));
                i.setSupMin(rs.getInt("supMinima"));
                i.setPrecioAprox(rs.getInt("precioAprox"));
                i.setEstado(rs.getInt("estado"));
                inquilinos.add(i);
            }
            ps.close();
        }catch(SQLException ex) {
            mostrarMensaje("Error al acceder a la tabla Inquilino, " + ex.getMessage(),"Error de conexión","error");
            
        }
        close();
        return inquilinos;
    }
}
	
