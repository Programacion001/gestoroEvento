/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.Logica;
import controlador.CoordUsuario;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelo.DAO.UsuarioDAO;
import modelo.VO.UsuarioVO;
/**
 *
 * @author Bill Aponte
 */
public class LogicaUsuario {
private CoordUsuario coordUsuario;
private UsuarioDAO Usuario;   

    public void setCoordUsuario(CoordUsuario coordUsuario) {
        this.coordUsuario = coordUsuario;
    }
public void validarREsgistrarUsuario(UsuarioVO invitado)throws SQLException{
 if(invitado.getId()==0)   {
JOptionPane.showMessageDialog(null, "Debe de completar llenar el campo");
} 
else{ 
 Usuario = new UsuarioDAO();
 Usuario.AgregarUsuario(invitado);
 }
}
 public void ValidarEliminarUsuario(int id)throws SQLException{
 Usuario = new UsuarioDAO();
 Usuario.EliminarUsuario(id);

 }  
 public void ValidarMOdificarUsuario(UsuarioVO invitado )throws SQLException{
 
 if(invitado.getNomUser().compareTo("")==0)   {
JOptionPane.showMessageDialog(null, "Debe de completar llenar el campo");
} 
else{ 
 
 Usuario.modificarUsuario(invitado);
 }
 }
    
 public UsuarioVO buscarUsuario(UsuarioVO usuario){
    
     if(usuario.getNomUser().compareTo("")==0){
      Usuario = new UsuarioDAO();
     return Usuario.listaUsuarios(usuario);
     }else{
    return null;
     }
   
     
     
 
 
 }   
    
    
}

  
    
    
    
    
    
    
    
    
    
    
    
    
    

