/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.autonoma.actores;

import co.edu.autonoma.interfaces.InterfazPanelControl;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author nikof
 */
public class InterpreteMensajes {

    private InterfazPanelControl panel;
    private JSONParser parser;

    public InterpreteMensajes() {
        parser = new JSONParser();
    }

    public void setPanel(InterfazPanelControl panel) {
        this.panel = panel;
    }
    
    public void interpretarMensaje(String mensajeIn) {
        JSONObject obj;
        String operacion = "";
        String resultado = "";
        String operario = "";
        String chat = "";
        
        try {
            obj = (JSONObject)parser.parse(mensajeIn);
            
            resultado = (String)obj.get("resultado");
            operacion = (String)obj.get("operacion");
            operario = (String)obj.get("operario");
            
        } catch (ParseException ex) {
            System.out.println("Error procesando el mensaje");
            return;
        }
        
        if(operacion.trim().equalsIgnoreCase("chat") && resultado.trim().equalsIgnoreCase("200")){
            chat = (String)obj.get("chat");
        }
        
        if(operacion.trim().equalsIgnoreCase("encender") && resultado.trim().equalsIgnoreCase("200")){
            System.out.println(obj.get("reactor"));
            int idReactor = Integer.parseInt((String)obj.get("reactor"));
            
            panel.encenderReactor(idReactor);
            chat = "encendió el reactor " + idReactor;
        }
        
        if(operacion.trim().equalsIgnoreCase("encender") && resultado.trim().equalsIgnoreCase("500")){
            int idReactor = Integer.parseInt((String)obj.get("reactor"));
            chat = "ERROR!! NO SE PUEDE ENCENDER EL REACTOR " + idReactor;
        }
        
        if(operacion.trim().equalsIgnoreCase("apagar") && resultado.trim().equalsIgnoreCase("200")){
            int idReactor = Integer.parseInt((String)obj.get("reactor"));
            
            panel.apagarReactor(idReactor);
            chat = "apagó el reactor " + idReactor;
        }
        
        if(operacion.trim().equalsIgnoreCase("apagar") && resultado.trim().equalsIgnoreCase("500")){
            int idReactor = Integer.parseInt((String)obj.get("reactor"));
            
            chat = "ERROR!! NO SE PUEDE APAGAR EL REACTOR " + idReactor;
        }
        
        if(operacion.trim().equalsIgnoreCase("reparar") && resultado.trim().equalsIgnoreCase("200")){
            int idReactor = Integer.parseInt((String)obj.get("reactor"));
            
            panel.repararReactor(idReactor);
            chat = "reparó el reactor " + idReactor;
        }
        
        if(operacion.trim().equalsIgnoreCase("reparar") && resultado.trim().equalsIgnoreCase("500")){
            int idReactor = Integer.parseInt((String)obj.get("reactor"));
            
            chat = "ERROR!! NO SE PUEDE REPARAR EL REACTOR " + idReactor;
        }
        
        if(operacion.trim().equalsIgnoreCase("cargar") && resultado.trim().equalsIgnoreCase("200")){
            int idReactor = Integer.parseInt((String)obj.get("reactor"));
            double carga = (Double)obj.get("carga");
            
            panel.cargarReactor(idReactor,carga);
            chat = "cargó el reactor " + idReactor + " a " + carga;
        }
        
        if(operacion.trim().equalsIgnoreCase("cargar") && resultado.trim().equalsIgnoreCase("300")){
            int idReactor = Integer.parseInt((String)obj.get("reactor"));
            
            panel.danarReactor(idReactor);
            chat = "dañó el reactor " + idReactor + " por exceso de carga";
        }
        
        if(operacion.trim().equalsIgnoreCase("cargar") && resultado.trim().equalsIgnoreCase("500")){
            int idReactor = Integer.parseInt((String)obj.get("reactor"));
            
            chat = "ERROR!! CARGANDO EL REACTOR " + idReactor;
        }
        
        if(operacion.trim().equalsIgnoreCase("cargar") && resultado.trim().equalsIgnoreCase("500")){
            int idReactor = Integer.parseInt((String)obj.get("reactor"));
            
            chat = "ERROR!! CARGANDO EL REACTOR " + idReactor;
        }
        
        if(panel==null) System.out.println("PANEL ES NULL");
        panel.mensajeChat(operario+": "+chat);
                
    }
    
    
}
