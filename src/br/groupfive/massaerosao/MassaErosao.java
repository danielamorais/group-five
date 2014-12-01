/*
 * Este programa é um software livre; você pode redistribuí-lo e/ou 

    modificá-lo dentro dos termos da Licença Pública Geral GNU como 

    publicada pela Fundação do Software Livre (FSF); na versão 2 da 

    Licença.

 */
package br.groupfive.massaerosao;

import javax.swing.JFrame;
/**
 *
 * @author Daniela Marques de Morais
 */

public class MassaErosao {
    
  MassaErosao(){
      
  }  
    
    public static void main(String[] args){
        
        JanelaPrincipal janelaprincipal = new JanelaPrincipal();         
        
        janelaprincipal.setLocationRelativeTo(null);  
        janelaprincipal.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); 
        janelaprincipal.setResizable(false);
        janelaprincipal.setVisible(true); 
    }
    
}
