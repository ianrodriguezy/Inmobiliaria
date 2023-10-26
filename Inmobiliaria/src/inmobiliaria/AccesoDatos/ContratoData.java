package Inmobiliaria.AccesoDatos;

import static Inmobiliaria.AccesoDatos.PropietarioData.mostrarMensaje;
import inmobiliaria.Contrato;
import inmobiliaria.Inquilino;
import inmobiliaria.Propiedad;
import inmobiliaria.Propietario;
import inmobiliaria.Vendedor;
import inmobiliaria.AccesoDatos.VendedorData;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
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
            ps.setString(4, c.getFirmas());
            ps.setInt(5, c.getVendedor().getIdVendedor());
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
    
    
     public static void comprobarVigencia() {
        Contrato c = null;
        String sql = "SELECT `codContrato`, `fechaRealizacion`, `fechaInicio`, `fechaFinal`,  `vigente`, `estado` FROM `contratoalquiler` " ;
        Connection con = null;
        PreparedStatement ps = null;
        con = Conectar.getConectar();
        
        try {
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                c = new Contrato();
                c.setCodContrato(rs.getInt("codContrato"));
                c.setFechaRealizacion(rs.getDate("fechaRealizacion").toLocalDate());
                c.setFechaInicio(rs.getDate("fechaInicio").toLocalDate());
                c.setFechaFin(rs.getDate("fechaFinal").toLocalDate());
                c.setVigente(rs.getInt("vigente"));
                c.setEstado(rs.getInt("estado"));
                
                if(LocalDate.now().isAfter(c.getFechaInicio()) && LocalDate.now().isBefore(c.getFechaFin())){
                    c.setVigente(1);
                }else{
                    c.setVigente(0);
                }
                UpdateVigencia(c);
            }
               ps.close();
                    
        } catch (SQLException ex) {
           mostrarMensaje("Error al acceder a la tabla Contrato, " + ex.getMessage(),"Error de conexión","error");
        }
        
    }
     public static void UpdateVigencia(Contrato c) { 
        Connection con = null;
        PreparedStatement ps = null;
        String sql = "UPDATE contratoalquiler SET vigente=? WHERE codContrato=" + c.getCodContrato();
        con = Conectar.getConectar();

        try {
            ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setInt(1, c.getVigente());

            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();

        } catch (SQLException ex) {
            mostrarMensaje("Error al acceder a la tabla Contrato, " + ex.getMessage(),"Error de conexión","error");
        }

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
            mostrarMensaje("Error al acceder a la tabla Contrato, " + ex.getMessage(),"Error de conexión","error");
        }
        if(mod==1){
            mostrarMensaje("Modificacion exitosa.", "Modicacion del contrato", "info");
        }

    }
     
    public static List<Contrato> listarContratosPorVendedor(int id){
        Connection con = null;
        PreparedStatement ps = null;
        String sql = "SELECT `codContrato`, `fechaRealizacion`, `fechaInicio`, `fechaFinal`, `firmas`, `vendedor`, `eLinquilino`, `propiedad`, `vigente`, `estado`, `propietario` FROM contratoalquiler WHERE vendedor="+id;
        con = Conectar.getConectar();
        List<Contrato> contratos= new ArrayList<>();
        try{
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Contrato c = new Contrato();
                c.setCodContrato(rs.getInt("codContrato"));
                c.setFechaRealizacion(rs.getDate("fechaRealizacion").toLocalDate());
                c.setFechaInicio(rs.getDate("fechaInicio").toLocalDate());
                c.setFechaFin(rs.getDate("fechaFinal").toLocalDate());
                c.setFirmas(rs.getString("firmas"));
                Vendedor v=new Vendedor();
                v=VendedorData.buscarVendedorPorId(rs.getInt("vendedor"));
                c.setVendedor(v);
                Inquilino i= new Inquilino();
                i=InquilinoData.buscarInquilinoPorId(rs.getInt("eLinquilino"));
                c.seteLinquilino(i);
                Propiedad propiedad=new Propiedad();
                propiedad=PropiedadData.buscarPropiedadPorId(rs.getInt("propiedad"));
                c.setPropiedad(propiedad);
                c.setVigente(rs.getInt("vigente"));
                c.setEstado(rs.getInt("estado"));
                Propietario p=new Propietario();
                p=PropietarioData.buscarPropietarioPorId(rs.getInt("propietario"));
                c.seteLpropietario(p);
                contratos.add(c);
        }
        }catch(SQLException ex){
            mostrarMensaje("Error al acceder a la tabla Contrato, " + ex.getMessage(),"Error de conexión","error");
        }
        
        
        return contratos;
    }
    
    public static List<Contrato> listarContratosPorPropietario(int id){
        Connection con = null;
        PreparedStatement ps = null;
        String sql = "SELECT `codContrato`, `fechaRealizacion`, `fechaInicio`, `fechaFinal`, `firmas`, `vendedor`, `eLinquilino`, `propiedad`, `vigente`, `estado`, `propietario` FROM contratoalquiler WHERE propietario="+id;
        con = Conectar.getConectar();
        List<Contrato> contratos= new ArrayList<>();
        try{
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Contrato c = new Contrato();
                c.setCodContrato(rs.getInt("codContrato"));
                c.setFechaRealizacion(rs.getDate("fechaRealizacion").toLocalDate());
                c.setFechaInicio(rs.getDate("fechaInicio").toLocalDate());
                c.setFechaFin(rs.getDate("fechaFinal").toLocalDate());
                c.setFirmas(rs.getString("firmas"));
                Vendedor v=new Vendedor();
                v=VendedorData.buscarVendedorPorId(rs.getInt("vendedor"));
                c.setVendedor(v);
                Inquilino i= new Inquilino();
                i=InquilinoData.buscarInquilinoPorId(rs.getInt("eLinquilino"));
                c.seteLinquilino(i);
                Propiedad propiedad=new Propiedad();
                propiedad=PropiedadData.buscarPropiedadPorId(rs.getInt("propiedad"));
                c.setPropiedad(propiedad);
                c.setVigente(rs.getInt("vigente"));
                c.setEstado(rs.getInt("estado"));
                Propietario p=new Propietario();
                p=PropietarioData.buscarPropietarioPorId(rs.getInt("propietario"));
                c.seteLpropietario(p);
                contratos.add(c);
        }
        }catch(SQLException ex){
            mostrarMensaje("Error al acceder a la tabla Contrato, " + ex.getMessage(),"Error de conexión","error");
        }
        
        
        return contratos;
    }
    public static List<Contrato> listarContratosPorInquilino(int id){
        Connection con = null;
        PreparedStatement ps = null;
        String sql = "SELECT `codContrato`, `fechaRealizacion`, `fechaInicio`, `fechaFinal`, `firmas`, `vendedor`, `eLinquilino`, `propiedad`, `vigente`, `estado`, `propietario` FROM contratoalquiler WHERE eLinquilino="+id;
        con = Conectar.getConectar();
        List<Contrato> contratos= new ArrayList<>();
        try{
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Contrato c = new Contrato();
                c.setCodContrato(rs.getInt("codContrato"));
                c.setFechaRealizacion(rs.getDate("fechaRealizacion").toLocalDate());
                c.setFechaInicio(rs.getDate("fechaInicio").toLocalDate());
                c.setFechaFin(rs.getDate("fechaFinal").toLocalDate());
                c.setFirmas(rs.getString("firmas"));
                Vendedor v=new Vendedor();
                v=VendedorData.buscarVendedorPorId(rs.getInt("vendedor"));
                c.setVendedor(v);
                Inquilino i= new Inquilino();
                i=InquilinoData.buscarInquilinoPorId(rs.getInt("eLinquilino"));
                c.seteLinquilino(i);
                Propiedad propiedad=new Propiedad();
                propiedad=PropiedadData.buscarPropiedadPorId(rs.getInt("propiedad"));
                c.setPropiedad(propiedad);
                c.setVigente(rs.getInt("vigente"));
                c.setEstado(rs.getInt("estado"));
                Propietario p=new Propietario();
                p=PropietarioData.buscarPropietarioPorId(rs.getInt("propietario"));
                c.seteLpropietario(p);
                contratos.add(c);
        }
        }catch(SQLException ex){
            mostrarMensaje("Error al acceder a la tabla Contrato, " + ex.getMessage(),"Error de conexión","error");
        }
        
        
        return contratos;
    }
    
    public static List<Contrato> listarContratosPorPropiedad(int id){
        Connection con = null;
        PreparedStatement ps = null;
        String sql = "SELECT `codContrato`, `fechaRealizacion`, `fechaInicio`, `fechaFinal`, `firmas`, `vendedor`, `eLinquilino`, `propiedad`, `vigente`, `estado`, `propietario` FROM contratoalquiler WHERE propiedad="+id;
        con = Conectar.getConectar();
        List<Contrato> contratos= new ArrayList<>();
        try{
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Contrato c = new Contrato();
                c.setCodContrato(rs.getInt("codContrato"));
                c.setFechaRealizacion(rs.getDate("fechaRealizacion").toLocalDate());
                c.setFechaInicio(rs.getDate("fechaInicio").toLocalDate());
                c.setFechaFin(rs.getDate("fechaFinal").toLocalDate());
                c.setFirmas(rs.getString("firmas"));
                Vendedor v=new Vendedor();
                v=VendedorData.buscarVendedorPorId(rs.getInt("vendedor"));
                c.setVendedor(v);
                Inquilino i= new Inquilino();
                i=InquilinoData.buscarInquilinoPorId(rs.getInt("eLinquilino"));
                c.seteLinquilino(i);
                Propiedad propiedad=new Propiedad();
                propiedad=PropiedadData.buscarPropiedadPorId(rs.getInt("propiedad"));
                c.setPropiedad(propiedad);
                c.setVigente(rs.getInt("vigente"));
                c.setEstado(rs.getInt("estado"));
                Propietario p=new Propietario();
                p=PropietarioData.buscarPropietarioPorId(rs.getInt("propietario"));
                c.seteLpropietario(p);
                contratos.add(c);
        }
        }catch(SQLException ex){
            mostrarMensaje("Error al acceder a la tabla Contrato, " + ex.getMessage(),"Error de conexión","error");
        }
        
        
        return contratos;
    }
    
    public static void CancelarContrato(Contrato c) { 
        Connection con = null;
        PreparedStatement ps = null;
        String sql = "UPDATE contratoalquiler SET estado=? WHERE codContrato="+c.getCodContrato();
        con = Conectar.getConectar();

        try {
            ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, c.getEstado());

            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            mostrarMensaje("Cancelación exitosa.", "Cancelación del contrato", "info");
        } catch (SQLException ex) {
            mostrarMensaje("Error al acceder a la tabla Contrato, " + ex.getMessage(),"Error de conexión","error");
        }
        
            
        

    }
}
