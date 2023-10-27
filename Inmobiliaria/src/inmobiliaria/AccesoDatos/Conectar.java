
package Inmobiliaria.AccesoDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class Conectar {
    private static final String url="jdbc:mariadb://localhost:3306/inmobiliaria";
    private static final String usuario="root";
    private static final String password="";
    private static Conectar conectar=null;
    private static final String Db="inmobiliaria";


private Conectar(){
        try{
             Class.forName("org.mariadb.jdbc.Driver"); 
        }catch(ClassNotFoundException x){
             JOptionPane.showMessageDialog(null, "Error al cargar el driver "+x.getMessage());
        }
    }
public static Connection getConectar(){
        Connection con=null;
        if(conectar==null){
            conectar= new Conectar(); 
        }
        try{
            con= DriverManager.getConnection(url, usuario , password);
            
            
        }catch(SQLException x){
            JOptionPane.showMessageDialog(null, "Error de conexion: Usuario o contraseña erronea "+x.getMessage());
        }
        return con;
    }
}