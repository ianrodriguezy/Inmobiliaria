
package inmobiliaria.AccesoDatos;

import Inmobiliaria.AccesoDatos.Conectar;
import static Inmobiliaria.AccesoDatos.PropietarioData.mostrarMensaje;
import inmobiliaria.Vendedor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class VendedorData {
    
    
   public static List<Vendedor> listarVendedor() {
        List<Vendedor> vendedores=new ArrayList<>();
        Connection con = null;
        PreparedStatement ps = null;
        con = Conectar.getConectar();
        
        try{
            String sql= "SELECT * FROM `vendedor` ";
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Vendedor v= new Vendedor();
                v.setIdVendedor(rs.getInt("id_vendedor"));
                v.setApellido(rs.getString("apellido"));
                v.setNombre(rs.getString("nombre"));
                vendedores.add(v);
            }
            ps.close();
        }catch(SQLException ex) {
            mostrarMensaje("Error al acceder a la tabla Vendedor, " + ex.getMessage(),"Error de conexión","error");
            
        }
        return vendedores;
    }
}

