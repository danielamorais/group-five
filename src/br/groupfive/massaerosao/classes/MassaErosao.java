package br.groupfive.massaerosao.classes;

import br.groupfive.massaerosao.forms.WindowFirst;
import javax.swing.JFrame;
/**
 *
 * @author Daniela Marques de Morais
 */
public class MassaErosao {      
    
    public static void main(String[] args){
        
        WindowFirst window = new WindowFirst();         
        
        window.setLocationRelativeTo(null);  
        window.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); 
        window.setResizable(false);
        window.setVisible(true); 
    }
    
}
