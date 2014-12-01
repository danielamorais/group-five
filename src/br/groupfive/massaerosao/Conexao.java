/*
 * Este programa é um software livre; você pode redistribuí-lo e/ou 

    modificá-lo dentro dos termos da Licença Pública Geral GNU como 

    publicada pela Fundação do Software Livre (FSF); na versão 2 da 

    Licença.

 */

package br.groupfive.massaerosao;

import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Daniela Marques de Morais
 */
public class Conexao {
    Connection con;
    public boolean conecta(String local, String banco, String usuario, String senha) {
        boolean retorno = false;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://" + local + "/" + banco,
                                               usuario, senha);
            retorno = true;                                   
        }        catch(ClassNotFoundException e){
            System.err.println("Erro de conexao:\n" + e);
        }        catch(SQLException e){
            System.err.println("Erro de conexao:\n" + e);
        }
        return retorno; 
    }
    
    public boolean deletar(){
        boolean retorno = false;
        try{
            PreparedStatement stmt = (PreparedStatement) this.con
                                    .prepareStatement("delete from dados");
            stmt.execute();
            stmt.close();
            retorno = true;
        }        catch(SQLException ex){
            retorno = false;
            System.err.println("Erro deletar: " + ex);
        }
        return retorno;
    }
    
   
    
}
