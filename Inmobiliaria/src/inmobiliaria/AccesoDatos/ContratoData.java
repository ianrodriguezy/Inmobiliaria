
package Inmobiliaria.AccesoDatos;

import static Inmobiliaria.AccesoDatos.PropietarioData.mostrarMensaje;
import inmobiliaria.Contrato;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ContratoData {
    public static void agregarContrato(Contrato c){ //Agregué los atributos basicos, hay que ver que mas tenemos en cuenta
        Connection con = null;
        PreparedStatement ps = null;
        String sql = "INSERT INTO `contratoalquiler`(`codContrato`, `fechaRealizacion`, `fechaInicio`, `fechaFinal`, `marca`, `vendedor`, `eLinquilino`, `propiedad`, `vigente`, `propietario`) VALUES (?,?,?,?,?,?,?,?,?,?)";
        con = Conectar.getConectar();
        
        try {
            ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, c.getCodContrato());
            ps.setDate(2, (Date) c.getFechaRealizacion());
            ps.setDate(3, (Date) c.getFechaInicio());
            ps.setDate(4, (Date) c.getFechaFin());
            ps.setString(5, c.getMarca());
            ps.setString(6, c.getVendedor());
            ps.setInt(7, c.geteLinquilino().getIdInquilino());
            ps.setInt(8, c.getPropiedad().getIdPropiedad());
            ps.setInt(9, c.getVigente());
            ps.setInt(10, c.geteLpropietario().getIdPropietario());
            
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            
        } catch (SQLException ex) {
            System.out.println("Error" + ex.getMessage());
        }
         mostrarMensaje("Alta exitosa.","Creacion del contrato","info");
        
}

    }
