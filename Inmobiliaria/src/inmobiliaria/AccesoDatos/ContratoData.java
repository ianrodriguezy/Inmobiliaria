package Inmobiliaria.AccesoDatos;

import static Inmobiliaria.AccesoDatos.PropietarioData.mostrarMensaje;
import inmobiliaria.Contrato;
import inmobiliaria.Inquilino;
import inmobiliaria.Propiedad;
import inmobiliaria.Propietario;
import inmobiliaria.Vendedor;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ContratoData {

    public static void agregarContrato(Contrato c) { //Agregué los atributos basicos, hay que ver que mas tenemos en cuenta
        Connection con = null;
        PreparedStatement ps = null;
        String sql = "INSERT INTO `contratoalquiler`( `fechaRealizacion`, `fechaInicio`, `fechaFinal`, `firmas`, `vendedor`, `eLinquilino`, `propiedad`, `vigente`,`estado`, `propietario`) VALUES (?,?,?,?,?,?,?,?,?,?)";
        con = Conectar.getConectar();

        try {
            ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            java.sql.Date fR = java.sql.Date.valueOf(c.getFechaRealizacion());
            java.sql.Date fI = java.sql.Date.valueOf(c.getFechaInicio());
            java.sql.Date fF = java.sql.Date.valueOf(c.getFechaFin());
            ps.setDate(1, (Date) fR);
            ps.setDate(2, (Date) fI);
            ps.setDate(3, (Date) fF);
            ps.setInt(4, c.getVendedor().getIdVendedor());
            ps.setString(5, c.getFirmas());
            ps.setInt(6, c.geteLinquilino().getIdInquilino());
            ps.setInt(7, c.getPropiedad().getIdPropiedad());
            ps.setInt(8, c.getVigente());
            ps.setInt(9, c.getEstado());
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
        String sql = "SELECT `codContrato`, `fechaRealizacion`, `fechaInicio`, `fechaFinal`, `firmas`, `vendedor`, `eLinquilino`, `propiedad`, `vigente`, `estado`, `propietario` FROM `contratoalquiler` WHERE codContrato =" + cod ;
        Connection con = null;
        PreparedStatement ps = null;
        con = Conectar.getConectar();
        
        try {
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                c = new Contrato();
                c.setCodContrato(rs.getInt("codContrato"));
                c.setFechaRealizacion(rs.getDate("fechaRealizacion").toLocalDate());
                c.setFechaInicio(rs.getDate("fechaInicio").toLocalDate());
                c.setFechaFin(rs.getDate("fechaFinal").toLocalDate());
                c.setFirmas(rs.getString("firmas"));
                Vendedor v=new Vendedor();
                v.setIdVendedor(rs.getInt("vendedor"));
                c.setVendedor(v);
                Inquilino i=new Inquilino();
                i.setIdInquilino(rs.getInt("eLinquilino"));
                c.seteLinquilino(i);
                Propiedad p= new Propiedad();
                p.setIdPropiedad(rs.getInt("propiedad"));
                c.setPropiedad(p);
                c.setVigente(rs.getInt("vigente"));
                c.setEstado(rs.getInt("estado"));
                Propietario propietario=new Propietario();
                propietario.setIdPropietario(rs.getInt("propietario"));
                c.seteLpropietario(propietario);
                
            }
               ps.close();
                    
        } catch (SQLException ex) {
           mostrarMensaje("Error al acceder a la tabla Contrato, " + ex.getMessage(),"Error de conexión","error");
        }
        
        return c;        

    }
    
    
     public static Contrato ActualizarVigencia() {
        Contrato c = null;
        String sql = "SELECT `codContrato`, `fechaRealizacion`, `fechaInicio`, `fechaFinal`, `firmas`, `vendedor`, `eLinquilino`, `propiedad`, `vigente`, `estado`, `propietario` FROM `contratoalquiler` " ;
        Connection con = null;
        PreparedStatement ps = null;
        con = Conectar.getConectar();
        
        try {
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                c = new Contrato();
                c.setCodContrato(rs.getInt("codContrato"));
                c.setFechaRealizacion(rs.getDate("fechaRealizacion").toLocalDate());
                c.setFechaInicio(rs.getDate("fechaInicio").toLocalDate());
                c.setFechaFin(rs.getDate("fechaFinal").toLocalDate());
                c.setFirmas(rs.getString("firmas"));
                Vendedor v=new Vendedor();
                v.setIdVendedor(rs.getInt("vendedor"));
                c.setVendedor(v);
                Inquilino i=new Inquilino();
                i.setIdInquilino(rs.getInt("eLinquilino"));
                c.seteLinquilino(i);
                Propiedad p= new Propiedad();
                p.setIdPropiedad(rs.getInt("propiedad"));
                c.setPropiedad(p);
                c.setVigente(rs.getInt("vigente"));
                c.setEstado(rs.getInt("estado"));
                Propietario propietario=new Propietario();
                propietario.setIdPropietario(rs.getInt("propietario"));
                c.seteLpropietario(propietario);
                if(LocalDate.now().isAfter(c.getFechaInicio()) && LocalDate.now().isBefore(c.getFechaFin())){
                    System.out.println(LocalDate.now().isAfter(c.getFechaInicio()) && LocalDate.now().isBefore(c.getFechaFin()));
                    c.setVigente(1);
                }else{
                    c.setVigente(0);
                }
                ModificarContrato(c,0);
            }
               ps.close();
                    
        } catch (SQLException ex) {
           mostrarMensaje("Error al acceder a la tabla Contrato, " + ex.getMessage(),"Error de conexión","error");
        }
        
        return c;        

    }
     
     public static void ModificarContrato(Contrato c,int mod) { 
        Connection con = null;
        PreparedStatement ps = null;
        String sql = "UPDATE contratoalquiler SET fechaRealizacion=?,fechaInicio=?,fechaFinal=?,firmas=?,vendedor=?,eLinquilino=?,propiedad=?,vigente=?,estado=?,propietario=? WHERE codContrato="+c.getCodContrato();
        con = Conectar.getConectar();

        try {
            ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            java.sql.Date fR = java.sql.Date.valueOf(c.getFechaRealizacion());
            java.sql.Date fI = java.sql.Date.valueOf(c.getFechaInicio());
            java.sql.Date fF = java.sql.Date.valueOf(c.getFechaFin());
            ps.setDate(1, (Date) fR);
            ps.setDate(2, (Date) fI);
            ps.setDate(3, (Date) fF);
            ps.setInt(4, c.getVendedor().getIdVendedor());
            ps.setString(5, c.getFirmas());
            ps.setInt(6, c.geteLinquilino().getIdInquilino());
            ps.setInt(7, c.getPropiedad().getIdPropiedad());
            ps.setInt(8, c.getVigente());
            ps.setInt(9, c.getEstado());
            ps.setInt(10, c.geteLpropietario().getIdPropietario());

            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();

        } catch (SQLException ex) {
            System.out.println("Error" + ex.getMessage());
        }
        if(mod==1){
            mostrarMensaje("Modificacion exitosa.", "Modicacion del contrato", "info");
        }

    }
}
