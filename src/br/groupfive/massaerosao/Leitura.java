/*
 * Este programa é um software livre; você pode redistribuí-lo e/ou 

    modificá-lo dentro dos termos da Licença Pública Geral GNU como 

    publicada pela Fundação do Software Livre (FSF); na versão 2 da 

    Licença.

 */
package br.groupfive.massaerosao;
import java.io.*;
/**
 *
 * @author Daniela Marques de Morais
 */
public class Leitura {
    
    Leitura(){
        
    }
    
    public static String carregar(File arquivo) throws FileNotFoundException, IOException {
        String saida;
        try (BufferedReader br = new BufferedReader(new FileReader(arquivo))) {
            saida = "";
            String linha;
            while((linha = br.readLine()) != null ) {
                saida += linha + "\n";
            }
        } catch(Exception e){
         saida = "Erro ao abrir arquivo!";   
        }
    return saida;
    }
}
