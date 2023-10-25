
package inmobiliaria.AccesoDatos;

import Inmobiliaria.AccesoDatos.Conectar;
import static Inmobiliaria.AccesoDatos.PropietarioData.mostrarMensaje;
import inmobiliaria.Vendedor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
   
   
   public static Vendedor buscarVendedorPorId(int id) {
        Vendedor v= new Vendedor();
        Connection con = null;
        PreparedStatement ps = null;
        con = Conectar.getConectar();
        String sql= "SELECT * FROM `vendedor` WHERE id_vendedor="+id;
        try{
            
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                v.setIdVendedor(rs.getInt("id_vendedor"));
                v.setApellido(rs.getString("apellido"));
                v.setNombre(rs.getString("nombre"));
                v.setDni(rs.getInt("dni"));
                v.setTelefono(rs.getInt("telefono"));
            }
            ps.close();
        }catch(SQLException ex) {
            mostrarMensaje("Error al acceder a la tabla Vendedor, " + ex.getMessage(),"Error de conexión","error");
            
        }
        return v;
    }
      public static void agregarVendedor(Vendedor v){
        Connection con = null;
        PreparedStatement ps = null;

        String sql = "INSERT INTO vendedor (`apellido`, `nombre`, `dni`, `telefono`) VALUES ('" + v.getApellido() + "','" + v.getNombre() + "','" + v.getDni() + "','" + v.getTelefono() + "')";
        con = Conectar.getConectar();

        try {
            ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();

        } catch (SQLException x) {
            System.out.println("Error " + x.getMessage());
        }
         mostrarMensaje("Alta exitosa.","Creacion de Vendedor","info");
} 
      public static Vendedor buscarVendedorDni(int d,int nuevo) {
        Vendedor v= new Vendedor();
        Connection con = null;
        PreparedStatement ps = null;
        con = Conectar.getConectar();
        String sql= "SELECT * FROM `vendedor` WHERE dni="+d ;
        try{
            
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                v.setIdVendedor(rs.getInt("id_vendedor"));
                v.setApellido(rs.getString("apellido"));
                v.setNombre(rs.getString("nombre"));
                v.setDni(rs.getInt("dni"));
                v.setTelefono(rs.getInt("telefono"));
            }else if (nuevo!=1){
                mostrarMensaje("No existe el Vendedor ","Error al buscar","error");
            }
            ps.close();
        }catch(SQLException ex) {
            mostrarMensaje("Error al acceder a la tabla Vendedor, " + ex.getMessage(),"Error de conexión","error");
            
        }
        return v;
    }
      
       public static void modificarVendedor(Vendedor v){
        String sql = "UPDATE vendedor SET apellido = ?, nombre = ?, dni = ?, telefono = ? WHERE id_vendedor="+v.getIdVendedor();
        Connection con = null;
        PreparedStatement ps = null;
        con = Conectar.getConectar();
        try {

            ps = con.prepareStatement(sql);
            ps.setString(1, v.getApellido());
            ps.setString(2, v.getNombre());
            ps.setInt(3, v.getDni());
            ps.setInt(4, v.getTelefono());
            
            

            int exito = ps.executeUpdate();
            if (exito == 1) {
                mostrarMensaje("Modificado exitosamente.","Modificacion de Vendedor","info");
            } else {
                mostrarMensaje("El Vendedor no existe","Error al eliminar","error");
            }
            ps.close();
        } catch (SQLException ex) {
            mostrarMensaje("Error al acceder a la tabla Vendedor, " + ex.getMessage(),"Error de conexión","error");
        }
    }
}

