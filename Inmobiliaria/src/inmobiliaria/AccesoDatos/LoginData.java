
package inmobiliaria.AccesoDatos;

import Inmobiliaria.AccesoDatos.Conectar;
import static Inmobiliaria.AccesoDatos.PropietarioData.mostrarMensaje;
import inmobiliaria.Vistas.MenuPrincipal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;


public class LoginData {
    public static boolean ingresar(String user, String pass){
        String sql = "SELECT idUsuario, usuario, contraseña FROM usuarios";
        PreparedStatement ps = null;
        int id=0;
        String usuario=null;
        String contrasenia=null;
        boolean ingreso=false;
        Connection con = null;
        con = Conectar.getConectar();
        try {

            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                id=rs.getInt(1);
                usuario=rs.getString("usuario");
                contrasenia=rs.getString("contraseña");
                
                if(user.equals(usuario)&& pass.equals(contrasenia)){
                    mostrarMensaje("Bienvenido " + usuario, "Ingreso", "info");
                    
                    
                    MenuPrincipal menu = new MenuPrincipal(id);
                    menu.setVisible(true);
                    ingreso=true;
                    break;
                }
            }
            
            
//            if(user.equals(usuario)&& pass.equals(contrasenia)){
//                    mostrarMensaje("Bienvenido " + usuario, "Ingreso", "info");
//                    
//                    
//                    MenuPrincipal menu = new MenuPrincipal(id);
//                    menu.setVisible(true);
//                    ingreso=true;
                    
                    
//                    menu.setExtendedState(JFrame.MAXIMIZED_BOTH);
//                    menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//                    menu.setVisible(true);
//                    ingreso=true;
//                }
            if(!user.equals(usuario)|| !pass.equals(contrasenia)){
                mostrarMensaje("Usuario o contraseña incorrectos.","Error al ingresar","error");
                
                ps.close();
                
            }
        }catch (SQLException ex) {
                        mostrarMensaje("Error al acceder a la tabla usuarios, " + ex.getMessage(),"Error de conexión","error");
                    }
        return ingreso;
 
    }
}
