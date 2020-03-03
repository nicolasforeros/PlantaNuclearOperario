/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.autonoma.interfaces;

/**
 *
 * @author nikof
 */
public interface InterfazPanelControl {
    public void encenderReactor(int idReactor);  

    public void apagarReactor(int idReactor);  

    public void repararReactor(int idReactor);

    public void danarReactor(int idReactor);  

    public void cargarReactor(int idReactor, double carga);

    public void mensajeChat(String chat);
}
