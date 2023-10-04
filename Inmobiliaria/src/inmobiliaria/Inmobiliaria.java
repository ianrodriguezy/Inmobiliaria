/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inmobiliaria;

import Inmobiliaria.AccesoDatos.Conectar;
import inmobiliaria.Vistas.Login;
import inmobiliaria.Vistas.MenuPrincipal;


public class Inmobiliaria {

  
    public static void main(String[] args) {
        Conectar.getConectar();
        //Login log = new Login();
        //log.setVisible(true);
        MenuPrincipal menu = new MenuPrincipal();
        menu.setVisible(true);
        
    }
    
}
