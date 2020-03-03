/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.autonoma.actores;

import co.edu.autonoma.gui.Login;

/**
 *
 * @author nikof
 */
public class Principal {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        Operario operario = new Operario();
        
        Login login = new Login(operario);
        login.setLocationRelativeTo(null);
        login.setVisible(true);
        
    }
    
}
