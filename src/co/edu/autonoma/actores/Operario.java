/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.autonoma.actores;

import co.edu.autonoma.gui.PanelControlPlantaN;
import co.edu.autonoma.interfaces.InterfazPanelControl;
import co.edu.autonoma.redes.RedEntrada;
import co.edu.autonoma.redes.RedSalida;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nikof
 */
public class Operario {
    private String nombre;
    private String ipServidor;
    
    private Socket socket;
    private DataInputStream in;
    private DataOutputStream out;
    
    private RedEntrada redEntrada;
    private RedSalida redSalida;
    
    private EscritorMensajes escritor;
    
    public Operario(){
        this.ipServidor=null;
        this.nombre = null;
        
        redEntrada = new RedEntrada();
        redSalida = new RedSalida();
        this.escritor = new EscritorMensajes(this.nombre);
    }
    
    public boolean conectarAServidor(){
        
        int serverPort = 9090;
        
        if(ipServidor.isEmpty()){
            return false;
        }

        try{
            System.out.println("Conectando al servidor");

            socket = new Socket(this.ipServidor, serverPort);

            System.out.println("Extracción de flujo I/O");

            in = new DataInputStream(socket.getInputStream());
            out = new DataOutputStream(socket.getOutputStream());
            
            //SE HACE LA RED DE SALIDA
            redSalida.setOut(out);
            
        }catch(UnknownHostException ex){
            System.out.println("Error conectando al servidor " + ex.getMessage());
            return false;
        } catch (IOException ex) {
            System.out.println("Error de IO" + ex.getMessage());
            return false;
        }
        
        return true;
    }
    
    public void iniciarRedEntrada(InterfazPanelControl panel){
        this.redEntrada.setIn(this.in);
        this.redEntrada.setPanel(panel);
        
        this.redEntrada.start();
    }
    
    public void enviarMensajeChat(String mensajeParaChat) {
        
        String mensajeEnviar = this.escritor.escribirMensajeChat(mensajeParaChat);
        
        this.redSalida.enviarMensaje(mensajeEnviar);
    }
    
    public void enviarMensajeEncender(int idReactor){
        String mensajeEnviar = this.escritor.escribirMensajeEncender(idReactor);
        
        this.redSalida.enviarMensaje(mensajeEnviar);
    }
    
    public void enviarMensajeApagar(int idReactor) {
        String mensajeEnviar = this.escritor.escribirMensajeApagar(idReactor);
        
        this.redSalida.enviarMensaje(mensajeEnviar);
    }

    public void enviarMensajeReparar(int idReactor) {
        String mensajeEnviar = this.escritor.escribirMensajeReparar(idReactor);
        
        this.redSalida.enviarMensaje(mensajeEnviar);
    }

    public void enviarMensajeCargar(int idReactor, double valorCarga) {
        String mensajeEnviar = this.escritor.escribirMensajeCargar(idReactor,valorCarga);
        
        this.redSalida.enviarMensaje(mensajeEnviar);
    }
    
    public Socket getSocket() {
        return socket;
    }

    public DataInputStream getIn() {
        return in;
    }

    public DataOutputStream getOut() {
        return out;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIpServidor() {
        return ipServidor;
    }

    public void setIpServidor(String ipServidor) {
        this.ipServidor = ipServidor;
    }

}
