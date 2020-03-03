/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.autonoma.redes;

import co.edu.autonoma.interfaces.InterfazPanelControl;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nikof
 */
public class RedEntrada extends Thread{
    
    private DataInputStream in;
    private InterfazPanelControl panel;
    
    @Override
    public void run(){
        
        while(true){
            
            try {
                String mensajeIn = in.readUTF();
                System.out.println("RED ENTRADA: se recibio el mensaje " + mensajeIn);
            } catch (IOException ex) {
                System.out.println("RED ENTRADA: error en la recepcion de mensajes " + ex.getMessage());
            }
            
        }
        
    }

    public void setIn(DataInputStream in) {
        this.in = in;
    }

    public void setPanel(InterfazPanelControl panel) {
        this.panel = panel;
    }
}
