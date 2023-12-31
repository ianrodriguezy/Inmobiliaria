/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inmobiliaria.AccesoDatos;

import Inmobiliaria.AccesoDatos.Conectar;
import static Inmobiliaria.AccesoDatos.PropietarioData.mostrarMensaje;
import inmobiliaria.Inspector;
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





public class InspectorData {
    
    public static void agregarInspector(Inspector i){
        Connection con = null;
        PreparedStatement ps = null;

        String sql = "INSERT INTO inspector (`apellido`, `nombre`, `dni`, `telefono`) VALUES ('" + i.getApellido() + "','" + i.getNombre() + "','" + i.getDni() + "','" +i.getTelefono() + "')";
        con = Conectar.getConectar();

        try {
            ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            ps.close();
        } catch (SQLException x) {
            System.out.println("Error " + x.getMessage());
        }
         mostrarMensaje("Alta exitosa.","Creacion de Revisor","info");
         close();
}
    
   public static List<Inspector> listarInspector() {
        List<Inspector> inspectores=new ArrayList<>();
        Connection con = null;
        PreparedStatement ps = null;
        con = Conectar.getConectar();
        
        try{
            String sql= "SELECT * FROM `inspector` ";
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Inspector i= new Inspector();
                i.setIdInspector(rs.getInt("id_inspector"));
                i.setApellido(rs.getString("apellido"));
                i.setNombre(rs.getString("nombre"));
                i.setDni(rs.getInt("dni"));
                i.setTelefono(rs.getInt("telefono"));
                inspectores.add(i);
            }
            ps.close();
        }catch(SQLException ex) {
            mostrarMensaje("Error al acceder a la tabla Inspector, " + ex.getMessage(),"Error de conexión","error");
            
        }
        close();
        return inspectores;
    }
   
   public static Inspector buscarInspectorPorId(int id) {
        Inspector i= new Inspector();
        Connection con = null;
        PreparedStatement ps = null;
        con = Conectar.getConectar();
        String sql= "SELECT * FROM `inspector` WHERE id_inspector="+id;
        try{
            
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                i.setIdInspector(rs.getInt("id_inspector"));
                i.setApellido(rs.getString("apellido"));
                i.setNombre(rs.getString("nombre"));
                i.setDni(rs.getInt("dni"));
                i.setTelefono(rs.getInt("telefono"));
            }
            ps.close();
        }catch(SQLException ex) {
            mostrarMensaje("Error al acceder a la tabla Inspector, " + ex.getMessage(),"Error de conexión","error");
            
        }
        close();
        return i;
    }
   public static Inspector buscarInspectorDni(int d,int nuevo) {
        Inspector i= new Inspector();
        Connection con = null;
        PreparedStatement ps = null;
        con = Conectar.getConectar();
        
        String sql= "SELECT * FROM `inspector` WHERE dni="+d ;
        
        try{
            
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                i.setIdInspector(rs.getInt("id_inspector"));
                i.setApellido(rs.getString("apellido"));
                i.setNombre(rs.getString("nombre"));
                i.setDni(rs.getInt("dni"));
                i.setTelefono(rs.getInt("telefono"));
            }else if (nuevo!=1){
                mostrarMensaje("No existe el Revisor ","Error al buscar","error");
            }
            ps.close();
        }catch(SQLException ex) {
            mostrarMensaje("Error al acceder a la tabla Inspector, " + ex.getMessage(),"Error de conexión","error");
            
        }
        close();
        return i;
    }
   public static void modificarInspector(Inspector i){
        String sql = "UPDATE inspector SET apellido = ?, nombre = ?, dni = ?, telefono = ? WHERE id_inspector="+i.getIdInspector();
        Connection con = null;
        PreparedStatement ps = null;
        con = Conectar.getConectar();
        try {

            ps = con.prepareStatement(sql);
            ps.setString(1, i.getApellido());
            ps.setString(2, i.getNombre());
            ps.setInt(3, i.getDni());
            ps.setInt(4, i.getTelefono());
            
            

            int exito = ps.executeUpdate();
            if (exito == 1) {
                mostrarMensaje("Modificado exitosamente.","Modificacion de Revisor","info");
            } else {
                mostrarMensaje("El Revisor no existe","Error al eliminar","error");
            }
            ps.close();
        } catch (SQLException ex) {
            mostrarMensaje("Error al acceder a la tabla Inspector, " + ex.getMessage(),"Error de conexión","error");
        }
        close();
    }
   

}
