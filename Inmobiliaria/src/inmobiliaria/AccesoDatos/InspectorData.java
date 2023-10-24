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





public class InspectorData {
    
    public static void agregarInspector(Inspector i){
        Connection con = null;
        PreparedStatement ps = null;

        String sql = "INSERT INTO inspector (`apellido`, `nombre`, `telefono`) VALUES ('" + i.getApellido() + "','" + i.getNombre() + "','"   +i.getTelefono() + "')";
        con = Conectar.getConectar();

        try {
            ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();

        } catch (SQLException x) {
            System.out.println("Error " + x.getMessage());
        }
         mostrarMensaje("Alta exitosa.","Creacion de Revisor","info");
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
            while(rs.next()){
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
        return i;
    }
   public static Inspector buscarInspectorDni(int d) {
        Inspector i= new Inspector();
        Connection con = null;
        PreparedStatement ps = null;
        con = Conectar.getConectar();
        String sql= "SELECT * FROM `inspector` WHERE dni="+d ;
        try{
            
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
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
        return i;
    }
}
