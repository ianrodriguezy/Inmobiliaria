/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inmobiliaria.AccesoDatos;

import Inmobiliaria.AccesoDatos.Conectar;
import inmobiliaria.Inspector;
import java.util.ArrayList;
import java.util.List;
import java.sql.SQLException;
import static Inmobiliaria.AccesoDatos.PropietarioData.mostrarMensaje;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;





public class InspectorData {
    
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
                inspectores.add(i);
            }
            ps.close();
        }catch(SQLException ex) {
            mostrarMensaje("Error al acceder a la tabla Inspector, " + ex.getMessage(),"Error de conexión","error");
            
        }
        return inspectores;
    }
}
