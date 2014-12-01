/*
 * Este programa é um software livre; você pode redistribuí-lo e/ou 

    modificá-lo dentro dos termos da Licença Pública Geral GNU como 

    publicada pela Fundação do Software Livre (FSF); na versão 2 da 

    Licença.

 */
package br.groupfive.massaerosao;

import java.io.File;
/**
 *
 * @author Daniela Marques de Morais
 */
public class FiltroArquivo extends javax.swing.filechooser.FileFilter{
    @Override
        public boolean accept(File file) {
            String filename = file.getName();
            return filename.endsWith(".txt");
        }
        public String getDescription() {
            return ".txt";
        }

}
