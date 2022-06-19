/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sql;

import dao.Conexao;
import dao.UsuarioDAO;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Objects;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import model.Usuario;
import model.UsuarioUP;
import view.Inicio;
import view.LoginView;
import view.Mostrar;

/**
 *
 * @author Administrador
 */
public class LoginController {
    private LoginView view;

    public LoginController(LoginView view) {
        this.view = view;
    }

    public void autenticar() throws SQLException {
        
        //buscar um Usuario da View
        String usuario =  view.getjTextFieldUsuario().getText();
        String senha = view.getjPasswordFieldSenha().getText();
        
        Usuario usuarioAutenticar = new Usuario(usuario, senha);
        
        // verificar se existe no banco de dados
        
        Connection conexao = new Conexao().getConnection();
        UsuarioDAO usuarioDao = new UsuarioDAO(conexao);
        
        boolean existe = usuarioDao.existePorUsuarioESenha(usuarioAutenticar);
        
        
        // Se existir Direciona para Menu 
       if(existe){
           crudsql crud = new crudsql();
            UsuarioUP var = new UsuarioUP();
            view.getjTextFieldUsuario().setVisible(false);
      
       }else{
           JOptionPane.showMessageDialog(view, "Usuario ou senha invalidos");
       }
    
    
    
    }
     
     }

