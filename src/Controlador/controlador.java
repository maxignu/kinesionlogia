/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Usuario;
import Modelo.metodosUsuario;
import Vista.Inicio;
import Vista.Login;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;



public class controlador implements ActionListener{
    
    
    private Login view;
    private metodosUsuario modelo = new metodosUsuario();
    Inicio inicio = new Inicio();
    
    public void eventos(){
        view.btn_enter.addActionListener(this);
        view.btn_exit.addActionListener(this);
        view.checkviewpass.addActionListener(this);
    }
    
    public controlador(Login vista){
        this.view=vista;
        eventos();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        Object evt = e.getSource();
        
        if(evt.equals(view.btn_enter)){
            
            char p [] =view.txt_pass.getPassword();
            String pass = new String(p);
            
            if(view.txt_user.getText().isEmpty() || pass.isEmpty()){
                
                JOptionPane.showMessageDialog(null, "Debe digitar un Usuario y una Contraseña", "Error en la Operación", JOptionPane.ERROR_MESSAGE);                
                
            }else{
                
                String user=view.txt_user.getText();
                ArrayList<Usuario> list;
                list = modelo.login(user, pass);
                
                if(list.size()>0){
                    
                    JOptionPane.showMessageDialog(null, "Bienvenido al sistema");
                    view.dispose();
                    inicio.setVisible(true);
                    
                }else{
                    JOptionPane.showMessageDialog(null, "Acceso Denegado", "Error", JOptionPane.ERROR_MESSAGE);
                }
                
                
                
            }
            
        }else if(evt.equals(view.btn_exit)){
            
            int confirmar = JOptionPane.showConfirmDialog(null, "Esta seguro que desea salir del sistema?");
            
            if(confirmar==JOptionPane.YES_OPTION){
                System.exit(0);
            }
            
        }else if(evt.equals(view.checkviewpass)){
            if(view.checkviewpass.isSelected()){
                view.txt_pass.setEchoChar((char) 0);
            }else{
                view.txt_pass.setEchoChar('*'); 
            }
        }
        
    }
    
}
