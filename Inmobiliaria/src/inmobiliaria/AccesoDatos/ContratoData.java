package Inmobiliaria.AccesoDatos;

import static Inmobiliaria.AccesoDatos.PropietarioData.mostrarMensaje;
import inmobiliaria.Contrato;
import inmobiliaria.Inquilino;
import inmobiliaria.Propiedad;
import inmobiliaria.Propietario;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ContratoData {

    public static void agregarContrato(Contrato c) { //Agregué los atributos basicos, hay que ver que mas tenemos en cuenta
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
        mostrarMensaje("Alta exitosa.", "Creacion del contrato", "info");

    }

    public static Contrato buscarContratoporCod(int cod) {
        Contrato c = null;
        String sql = "SELECT `codContrato`, `fechaRealizacion`, `fechaInicio`, `fechaFinal`, `marca`, `vendedor`, `eLinquilino`, `propiedad`, `vigente`, `propietario` FROM `contratoalquiler` WHERE codContrato =" + cod ;
        Connection con = null;
        PreparedStatement ps = null;
        con = Conectar.getConectar();
        
        try {
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                c = new Contrato();
                c.setCodContrato(rs.getInt("codContrato"));
                c.setFechaRealizacion(rs.getDate("fechaRealizacion"));
                c.setFechaInicio(rs.getDate("fechaInicio"));
                c.setFechaFin(rs.getDate("fechaFinal"));
                c.setMarca(rs.getString("marca"));
                c.setVendedor(rs.getString("vendedor"));
                c.seteLinquilino((Inquilino) rs.getObject("eLinquilino"));
                c.setPropiedad((Propiedad) rs.getObject("propiedad"));
                c.setVigente(rs.getInt("vigente"));
                c.seteLpropietario((Propietario) rs.getObject("propietario"));
                
            }
               ps.close();
                    
        } catch (SQLException ex) {
           mostrarMensaje("Error al acceder a la tabla Contrato, " + ex.getMessage(),"Error de conexión","error");
        }
        
        return c;        

    }
}
