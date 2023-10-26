
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
        String sql = "SELECT idUsuario,usuario, contraseña FROM usuarios";
        PreparedStatement ps = null;
        int id;
        String usuario=null;
        String contrasenia=null;
        boolean ingreso=false;
        try {
            Connection con = null;
            
            con = Conectar.getConectar();
            ps = con.prepareStatement(sql);
            
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                id=rs.getInt(1);
                usuario=rs.getString(2);
                contrasenia=rs.getString(3);
                
            }
            if(user.equals(usuario)&& pass.equals(contrasenia)){
                    mostrarMensaje("Bienvenido " + usuario, "Ingreso", "info");
                    
                    if(usuario.equals("Franco")){
                    MenuPrincipal menu = new MenuPrincipal(1);
                    menu.setVisible(true);
                    ingreso=true;
                    }else if(usuario.equals("Carlos")){
                        MenuPrincipal menu = new MenuPrincipal(2);
                        menu.setVisible(true);
                    ingreso=true;
                    }
//                    menu.setExtendedState(JFrame.MAXIMIZED_BOTH);
//                    menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//                    menu.setVisible(true);
//                    ingreso=true;
                }
            else if(!user.equals(usuario)|| pass.equals(contrasenia)){
                mostrarMensaje("Usuario o contraseña incorrectos.","Error al ingresar","error");
                
                ps.close();
            }
        }catch (SQLException ex) {
                        mostrarMensaje("Error al acceder a la tabla usuarios, " + ex.getMessage(),"Error de conexión","error");
                    }
        return ingreso;
 
    }
}
