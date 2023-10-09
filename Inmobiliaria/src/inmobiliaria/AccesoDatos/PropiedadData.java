/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inmobiliaria.AccesoDatos;

import static Inmobiliaria.AccesoDatos.PropietarioData.mostrarMensaje;
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
}
