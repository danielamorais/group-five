package br.groupfive.massaerosao.forms;

import java.io.*;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Daniela Marques de Morais
 */
public class WindowFirst extends javax.swing.JFrame {
    static final String IP = System.getProperty("myapplication.ip");
    static final String URL = "http://" + IP + "/projects/mysite/";
   
    public WindowFirst(){
        initComponents();      
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelLogo = new javax.swing.JPanel();
        jPanelTempoReal = new javax.swing.JPanel();
        jButtonGraficos = new javax.swing.JButton();
        jButtonWeb = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Controle de Massa e Erosão");
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        jPanelLogo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelTempoReal.setBorder(javax.swing.BorderFactory.createTitledBorder("Tempo Real"));

        jButtonGraficos.setText("Índices/Gráficos");
        jButtonGraficos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonGraficosMouseClicked(evt);
            }
        });

        jButtonWeb.setText("Via web");
        jButtonWeb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonWebMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelTempoRealLayout = new javax.swing.GroupLayout(jPanelTempoReal);
        jPanelTempoReal.setLayout(jPanelTempoRealLayout);
        jPanelTempoRealLayout.setHorizontalGroup(
            jPanelTempoRealLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTempoRealLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelTempoRealLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonGraficos, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonWeb, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanelTempoRealLayout.setVerticalGroup(
            jPanelTempoRealLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTempoRealLayout.createSequentialGroup()
                .addComponent(jButtonGraficos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonWeb)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelLogo.add(jPanelTempoReal, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 190, -1));

        getContentPane().add(jPanelLogo);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonGraficosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonGraficosMouseClicked
        Graficos grafico = new Graficos();
        grafico.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        grafico.setAlwaysOnTop(true);
        
        grafico.setResizable(false);
        grafico.pack();
        grafico.setVisible(true);
    }//GEN-LAST:event_jButtonGraficosMouseClicked

    private void jButtonWebMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonWebMouseClicked
        try {
            methodTry();
        } catch (URISyntaxException ex) {
            Logger.getLogger(WindowFirst.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonWebMouseClicked

    private void methodTry() throws URISyntaxException{
        try {
                java.awt.Desktop.getDesktop().browse( new java.net.URI(URL) );
            } catch (IOException ex) {
                Logger.getLogger(WindowFirst.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
   
    public static void main() {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new WindowFirst().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonGraficos;
    private javax.swing.JButton jButtonWeb;
    private javax.swing.JPanel jPanelLogo;
    private javax.swing.JPanel jPanelTempoReal;
    // End of variables declaration//GEN-END:variables
}
