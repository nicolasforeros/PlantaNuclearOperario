/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.autonoma.actores;

import java.io.IOException;
import java.io.StringWriter;
import org.json.simple.JSONObject;

/**
 *
 * @author nikof
 */
class EscritorMensajes {
    String nombreOperario;
    JSONObject obj;

    public EscritorMensajes(String nombreOperario) {
        this.nombreOperario = nombreOperario;
        
        this.obj = new JSONObject();
        this.obj.put("operario", nombreOperario);
    }

    String escribirMensajeChat(String mensajeParaChat) {
        
        obj.put("operacion","chat");
        obj.put("chat",mensajeParaChat);

        StringWriter out = new StringWriter();
        
        try {
            obj.writeJSONString(out);
        } catch (IOException ex) {
            System.out.println("ESCRITOR MENSAJE: error realizando el mensaje para chat: " + ex.getMessage());
        }

        String jsonText = out.toString();
        
        return jsonText;
    }

    String escribirMensajeEncender(int idReactor) {
        obj.put("operacion","encender");
        obj.put("reactor",idReactor+"");

        StringWriter out = new StringWriter();
        
        try {
            obj.writeJSONString(out);
        } catch (IOException ex) {
            System.out.println("ESCRITOR MENSAJE: error realizando el mensaje para encender: " + ex.getMessage());
        }

        String jsonText = out.toString();
        
        return jsonText;
    }

    String escribirMensajeApagar(int idReactor) {
        obj.put("operacion","apagar");
        obj.put("reactor",idReactor+"");

        StringWriter out = new StringWriter();
        
        try {
            obj.writeJSONString(out);
        } catch (IOException ex) {
            System.out.println("ESCRITOR MENSAJE: error realizando el mensaje para apagar: " + ex.getMessage());
        }

        String jsonText = out.toString();
        
        return jsonText;
    }

    String escribirMensajeReparar(int idReactor) {
        obj.put("operacion","reparar");
        obj.put("reactor",idReactor+"");

        StringWriter out = new StringWriter();
        
        try {
            obj.writeJSONString(out);
        } catch (IOException ex) {
            System.out.println("ESCRITOR MENSAJE: error realizando el mensaje para reparar: " + ex.getMessage());
        }

        String jsonText = out.toString();
        
        return jsonText;
    }

    String escribirMensajeCargar(int idReactor, double valorCarga) {
        obj.put("operacion","cargar");
        obj.put("reactor",idReactor+"");
        obj.put("carga",valorCarga+"");

        StringWriter out = new StringWriter();
        
        try {
            obj.writeJSONString(out);
        } catch (IOException ex) {
            System.out.println("ESCRITOR MENSAJE: error realizando el mensaje para cargar: " + ex.getMessage());
        }

        String jsonText = out.toString();
        
        return jsonText;
    }
    
    
}
