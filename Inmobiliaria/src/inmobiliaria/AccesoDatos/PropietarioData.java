/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inmobiliaria.AccesoDatos;

import inmobiliaria.Propietario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

/**
 *
 * @author Ian
 */
public class PropietarioData {
    public static void mostrarMensaje(String mensaje,String titulo,String tipo ){
        JOptionPane optionPane = new JOptionPane(mensaje);
        if(tipo.equals("info")){
            optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        }
        else if(tipo.equals("error")){
            optionPane.setMessageType(JOptionPane.ERROR_MESSAGE);
        }
        JDialog dialog= optionPane.createDialog(titulo);
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);
    }
    
public static void agregarPropietario(Propietario propietario){
        Connection con = null;
        PreparedStatement ps = null;

        String sql = "INSERT INTO propietario (`apellidoPropietario`, `nombrePropietario`, `domicilio`, `dni`, `telefono`) VALUES ('" + propietario.getApellidoPropietario() + "','" + propietario.getNombrePropietario() + "','" + propietario.getDomicilio() + "','" + propietario.getDni() + "','" + propietario.getTelefono() + "')";
        con = Conectar.getConectar();

        try {
            ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();

        } catch (SQLException x) {
            System.out.println("Error " + x.getMessage());
        }
         mostrarMensaje("Alta exitosa.","Creacion de propietario","info");
}

public static Propietario buscarPropietarioPorDni(int dni, int nuevo) {
        Propietario p = null;
        String sql = "SELECT id_propietario, apellidoPropietario, nombrePropietario,domicilio, dni, telefono FROM propietario WHERE dni=?";
        Connection con = null;
        PreparedStatement ps = null;
        con = Conectar.getConectar();
        try {

            ps = con.prepareStatement(sql);
            ps.setInt(1, dni);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                p = new Propietario();
                p.setIdPropietario(rs.getInt("idAlumno"));
                p.setApellidoPropietario(rs.getString("apellidoPropietario"));
                p.setNombrePropietario(rs.getString("nombrePropietario"));
                p.setDomicilio(rs.getString("domicilio"));
                p.setDni(rs.getInt("dni"));
                p.setTelefono(rs.getInt("telefono"));
            } else if (nuevo!=1){
                mostrarMensaje("No existe el Propietario ","Error al buscar","error");
            }
            ps.close();
        } catch (SQLException ex) {
            mostrarMensaje("Error al acceder a la tabla Propietario, " + ex.getMessage(),"Error de conexión","error");
        }

        return p;

    }
}
