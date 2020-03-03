/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.autonoma.gui;

import co.edu.autonoma.interfaces.InterfazPanelControl;
import co.edu.autonoma.actores.Operario;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Manuela Cardona
 */
public class PanelControlPlantaN extends javax.swing.JFrame implements InterfazPanelControl{

    private Operario operario;
    private final ImageIcon ICONO_R_ENCENDIDO;
    private final ImageIcon ICONO_R_APAGADO;
    private final ImageIcon ICONO_R_AVERIADO;
    
    /**
     * Creates new form Principal
     * @param operario
     */
    public PanelControlPlantaN(Operario operario) {
        initComponents();
        
        taNotificaciones.setLineWrap(true);
        taNotificaciones.setWrapStyleWord(true);
        
        this.operario = operario;
        
        this.ICONO_R_ENCENDIDO = new javax.swing.ImageIcon(getClass().getResource("/imagenes/ReactorEncendido.png"));
        this.ICONO_R_APAGADO = new javax.swing.ImageIcon(getClass().getResource("/imagenes/ReactorApagado.png"));
        this.ICONO_R_AVERIADO = new javax.swing.ImageIcon(getClass().getResource("/imagenes/ReactorDanado.png"));
        
        this.labelBienvenida.setText(this.labelBienvenida.getText() + this.operario.getNombre());
        this.txtFChat.requestFocusInWindow();        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        labelBienvenida = new javax.swing.JLabel();
        BtnEncender = new javax.swing.JButton();
        BtnApagar = new javax.swing.JButton();
        BtnReparar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        labelR1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtFEstadoR1 = new javax.swing.JTextField();
        txtFCargaR1 = new javax.swing.JTextField();
        selecR1 = new javax.swing.JRadioButton();
        progressBarR1 = new javax.swing.JProgressBar();
        labelR2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtFEstadoR2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtFCargaR2 = new javax.swing.JTextField();
        selecR2 = new javax.swing.JRadioButton();
        progressBarR2 = new javax.swing.JProgressBar();
        labelR3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtFEstadoR3 = new javax.swing.JTextField();
        txtFCargaR3 = new javax.swing.JTextField();
        progressBarR3 = new javax.swing.JProgressBar();
        selecR3 = new javax.swing.JRadioButton();
        BtnCargar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        taNotificaciones = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        txtFChat = new javax.swing.JTextField();
        BtnEnviarChat = new javax.swing.JButton();
        porcCarga = new javax.swing.JSpinner();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(null);

        labelBienvenida.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelBienvenida.setText("BIENVENIDO: ");
        jPanel1.add(labelBienvenida);
        labelBienvenida.setBounds(110, 20, 310, 22);

        BtnEncender.setBackground(new java.awt.Color(255, 255, 255));
        BtnEncender.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BtnEncender.setText("Encender");
        BtnEncender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEncenderActionPerformed(evt);
            }
        });
        jPanel1.add(BtnEncender);
        BtnEncender.setBounds(70, 280, 100, 23);

        BtnApagar.setBackground(new java.awt.Color(255, 255, 255));
        BtnApagar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BtnApagar.setText("Apagar");
        BtnApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnApagarActionPerformed(evt);
            }
        });
        jPanel1.add(BtnApagar);
        BtnApagar.setBounds(70, 310, 100, 23);

        BtnReparar.setBackground(new java.awt.Color(255, 255, 255));
        BtnReparar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BtnReparar.setText("Reparar");
        BtnReparar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRepararActionPerformed(evt);
            }
        });
        jPanel1.add(BtnReparar);
        BtnReparar.setBounds(70, 340, 100, 23);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Carga:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 240, 40, 14);

        labelR1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ReactorApagado.png"))); // NOI18N
        jPanel1.add(labelR1);
        labelR1.setBounds(50, 130, 70, 70);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Estado: ");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20, 210, 50, 14);

        txtFEstadoR1.setText("APAGADO");
        txtFEstadoR1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFEstadoR1ActionPerformed(evt);
            }
        });
        jPanel1.add(txtFEstadoR1);
        txtFEstadoR1.setBounds(70, 210, 80, 19);

        txtFCargaR1.setText("0");
        jPanel1.add(txtFCargaR1);
        txtFCargaR1.setBounds(70, 240, 80, 19);

        selecR1.setBackground(new java.awt.Color(204, 204, 204));
        buttonGroup1.add(selecR1);
        jPanel1.add(selecR1);
        selecR1.setBounds(73, 100, 20, 21);

        progressBarR1.setOrientation(1);
        jPanel1.add(progressBarR1);
        progressBarR1.setBounds(120, 70, 20, 130);

        labelR2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ReactorApagado.png"))); // NOI18N
        jPanel1.add(labelR2);
        labelR2.setBounds(210, 130, 70, 70);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Estado:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(180, 210, 50, 14);

        txtFEstadoR2.setText("APAGADO");
        jPanel1.add(txtFEstadoR2);
        txtFEstadoR2.setBounds(230, 210, 80, 19);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Carga:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(180, 240, 40, 14);

        txtFCargaR2.setText("0");
        jPanel1.add(txtFCargaR2);
        txtFCargaR2.setBounds(230, 240, 80, 19);

        selecR2.setBackground(new java.awt.Color(204, 204, 204));
        buttonGroup1.add(selecR2);
        jPanel1.add(selecR2);
        selecR2.setBounds(234, 100, 20, 21);

        progressBarR2.setOrientation(1);
        jPanel1.add(progressBarR2);
        progressBarR2.setBounds(280, 70, 20, 130);

        labelR3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ReactorApagado.png"))); // NOI18N
        jPanel1.add(labelR3);
        labelR3.setBounds(370, 130, 70, 70);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Estado: ");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(340, 210, 50, 14);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Carga:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(340, 240, 40, 14);

        txtFEstadoR3.setText("APAGADO");
        jPanel1.add(txtFEstadoR3);
        txtFEstadoR3.setBounds(390, 210, 80, 19);

        txtFCargaR3.setText("0");
        jPanel1.add(txtFCargaR3);
        txtFCargaR3.setBounds(390, 240, 80, 19);

        progressBarR3.setOrientation(1);
        jPanel1.add(progressBarR3);
        progressBarR3.setBounds(440, 70, 20, 130);

        selecR3.setBackground(new java.awt.Color(204, 204, 204));
        buttonGroup1.add(selecR3);
        jPanel1.add(selecR3);
        selecR3.setBounds(394, 100, 20, 21);

        BtnCargar.setBackground(new java.awt.Color(255, 255, 255));
        BtnCargar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BtnCargar.setText("Cargar");
        BtnCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCargarActionPerformed(evt);
            }
        });
        jPanel1.add(BtnCargar);
        BtnCargar.setBounds(240, 300, 90, 40);

        taNotificaciones.setColumns(20);
        taNotificaciones.setRows(5);
        jScrollPane1.setViewportView(taNotificaciones);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(500, 60, 220, 240);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("NOTIFICACIONES");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(540, 30, 130, 17);
        jPanel1.add(txtFChat);
        txtFChat.setBounds(500, 330, 140, 30);

        BtnEnviarChat.setBackground(new java.awt.Color(255, 255, 255));
        BtnEnviarChat.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BtnEnviarChat.setText("Enviar");
        BtnEnviarChat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEnviarChatActionPerformed(evt);
            }
        });
        jPanel1.add(BtnEnviarChat);
        BtnEnviarChat.setBounds(640, 330, 80, 23);
        jPanel1.add(porcCarga);
        porcCarga.setBounds(330, 300, 80, 40);

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(0, 270, 490, 100);

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator2);
        jSeparator2.setBounds(490, 0, 260, 390);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 729, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnEnviarChatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEnviarChatActionPerformed
        // TODO add your handling code here:
        String mensajeParaChat = txtFChat.getText().trim();
        
        txtFChat.setText("");
        
        this.operario.enviarMensajeChat(mensajeParaChat);
    }//GEN-LAST:event_BtnEnviarChatActionPerformed

    private void BtnEncenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEncenderActionPerformed
        // TODO add your handling code here:
        boolean operacionExitosa;
        int idReactor = -1;
        
        if(selecR1.isSelected()){
            idReactor = 0;
        }
        if(selecR2.isSelected()){
            idReactor = 1;
        }
        if(selecR3.isSelected()){
            idReactor = 2;
        }
        
        if(idReactor>=0)
            this.operario.enviarMensajeEncender(idReactor);
        else
            JOptionPane.showMessageDialog(this, "Seleccione un reactor");
    }//GEN-LAST:event_BtnEncenderActionPerformed

    private void BtnApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnApagarActionPerformed
        // TODO add your handling code here:
        boolean operacionExitosa;
        int idReactor = -1;
        
        if(selecR1.isSelected()){
            idReactor = 0;
        }
        if(selecR2.isSelected()){
            idReactor = 1;
        }
        if(selecR3.isSelected()){
            idReactor = 2;
        }
        
        if(idReactor>=0)
            this.operario.enviarMensajeApagar(idReactor);
        else
            JOptionPane.showMessageDialog(this, "Seleccione un reactor");
    }//GEN-LAST:event_BtnApagarActionPerformed

    private void BtnRepararActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRepararActionPerformed
        // TODO add your handling code here:
        boolean operacionExitosa;
        int idReactor = -1;
        
        if(selecR1.isSelected()){
            idReactor = 0;
        }
        if(selecR2.isSelected()){
            idReactor = 1;
        }
        if(selecR3.isSelected()){
            idReactor = 2;
        }
        
        if(idReactor>=0)
            this.operario.enviarMensajeReparar(idReactor);
        else
            JOptionPane.showMessageDialog(this, "Seleccione un reactor");
    }//GEN-LAST:event_BtnRepararActionPerformed

    private void BtnCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCargarActionPerformed
        // TODO add your handling code here:
        boolean operacionExitosa;
        int idReactor = -1;
        double valorCarga = (int)porcCarga.getValue();
        
        if(selecR1.isSelected()){
            idReactor = 0;
        }
        if(selecR2.isSelected()){
            idReactor = 1;
        }
        if(selecR3.isSelected()){
            idReactor = 2;
        }
        
        if(idReactor>=0)
            this.operario.enviarMensajeCargar(idReactor,valorCarga);
        else
            JOptionPane.showMessageDialog(this, "Seleccione un reactor");
    }//GEN-LAST:event_BtnCargarActionPerformed

    private void txtFEstadoR1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFEstadoR1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFEstadoR1ActionPerformed

    @Override
    public void encenderReactor(int idReactor){
        switch(idReactor){
            case 0:
                this.labelR1.setIcon(this.ICONO_R_ENCENDIDO);
                this.txtFEstadoR1.setText("ENCENDIDO");
                break;
            case 1:
                this.labelR2.setIcon(this.ICONO_R_ENCENDIDO);
                this.txtFEstadoR2.setText("ENCENDIDO");
                break;
            case 2:
                this.labelR3.setIcon(this.ICONO_R_ENCENDIDO);
                this.txtFEstadoR3.setText("ENCENDIDO");
                break;
            default:
                break;
        }
    }    

    @Override
    public void apagarReactor(int idReactor){
        switch(idReactor){
            case 0:
                this.labelR1.setIcon(this.ICONO_R_APAGADO);
                this.txtFEstadoR1.setText("APAGADO");
                this.txtFCargaR1.setText("0");
                this.progressBarR1.setValue(0);
                break;
            case 1:
                this.labelR2.setIcon(this.ICONO_R_APAGADO);
                this.txtFEstadoR2.setText("APAGADO");
                this.txtFCargaR2.setText("0");
                this.progressBarR1.setValue(0);
                break;
            case 2:
                this.labelR3.setIcon(this.ICONO_R_APAGADO);
                this.txtFEstadoR3.setText("APAGADO");
                this.txtFCargaR2.setText("0");
                this.progressBarR1.setValue(0);
                break;
            default:
                break;
        }
    }    

    @Override
    public void repararReactor(int idReactor){
        switch(idReactor){
            case 0:
                this.labelR1.setIcon(this.ICONO_R_APAGADO);
                this.txtFEstadoR1.setText("APAGADO");
                this.txtFCargaR1.setText("0");
                this.progressBarR1.setValue(0);
                break;
            case 1:
                this.labelR2.setIcon(this.ICONO_R_APAGADO);
                this.txtFEstadoR2.setText("APAGADO");
                this.txtFCargaR1.setText("0");
                this.progressBarR1.setValue(0);
                break;
            case 2:
                this.labelR3.setIcon(this.ICONO_R_APAGADO);
                this.txtFEstadoR3.setText("APAGADO");
                this.txtFCargaR1.setText("0");
                this.progressBarR1.setValue(0);
                break;
            default:
                break;
        }
    }    

    @Override
    public void danarReactor(int idReactor){
        switch(idReactor){
            case 0:
                this.labelR1.setIcon(this.ICONO_R_AVERIADO);
                this.txtFEstadoR1.setText("DAÑADO");
                this.progressBarR1.setValue(100);
                break;
            case 1:
                this.labelR2.setIcon(this.ICONO_R_AVERIADO);
                this.txtFEstadoR2.setText("DAÑADO");
                this.progressBarR1.setValue(100);
                break;
            case 2:
                this.labelR3.setIcon(this.ICONO_R_AVERIADO);
                this.txtFEstadoR3.setText("DAÑADO");
                this.progressBarR1.setValue(100);
                break;
            default:
                break;
        }
    }    

    @Override
    public void cargarReactor(int idReactor, double carga){
        switch(idReactor){
            case 0:
                this.txtFCargaR1.setText(carga+"");
                this.progressBarR1.setValue((int)carga);
                break;
            case 1:
                this.txtFCargaR2.setText(carga+"");
                this.progressBarR2.setValue((int)carga);
                break;
            case 2:
                this.txtFCargaR3.setText(carga+"");
                this.progressBarR3.setValue((int)carga);
                break;
            default:
                break;
        }
    }

    @Override
    public void mensajeChat(String chat){
        this.taNotificaciones.append(chat+System.lineSeparator());
    }
    
    public void iniciarEntrada(){   
        this.operario.iniciarRedEntrada(this);
    }
    
    /**
     * @param args the command line arguments
     */
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnApagar;
    private javax.swing.JButton BtnCargar;
    private javax.swing.JButton BtnEncender;
    private javax.swing.JButton BtnEnviarChat;
    private javax.swing.JButton BtnReparar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel labelBienvenida;
    private javax.swing.JLabel labelR1;
    private javax.swing.JLabel labelR2;
    private javax.swing.JLabel labelR3;
    private javax.swing.JSpinner porcCarga;
    private javax.swing.JProgressBar progressBarR1;
    private javax.swing.JProgressBar progressBarR2;
    private javax.swing.JProgressBar progressBarR3;
    private javax.swing.JRadioButton selecR1;
    private javax.swing.JRadioButton selecR2;
    private javax.swing.JRadioButton selecR3;
    private javax.swing.JTextArea taNotificaciones;
    private javax.swing.JTextField txtFCargaR1;
    private javax.swing.JTextField txtFCargaR2;
    private javax.swing.JTextField txtFCargaR3;
    private javax.swing.JTextField txtFChat;
    private javax.swing.JTextField txtFEstadoR1;
    private javax.swing.JTextField txtFEstadoR2;
    private javax.swing.JTextField txtFEstadoR3;
    // End of variables declaration//GEN-END:variables
}
