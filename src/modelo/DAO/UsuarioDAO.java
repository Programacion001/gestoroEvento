/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.DAO;
import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import modelo.VO.UsuarioVO;
import modelo.conexion.Conexion;
/**
 *
 * @author Bill Aponte
 */
public class UsuarioDAO {
    
 private UsuarioVO usuario;

    public UsuarioVO getUsuario() {
        return usuario;
    }
    
    public void AgregarUsuario( UsuarioVO usuario ){
     
        Connection conex = Conexion.getConnection();
        
        try {
            Statement estatuto = Conexion.getConnection().createStatement();
            estatuto.executeUpdate("INSERT INTO usuario (Contraseña, Nombre, Apellido, Nom_usuario, Tipo_user) VALUES ('"
				+usuario.getPassword()+"', '"+usuario.getNombre()+"', '"
				+usuario.getApellido()+"', '"+usuario.getNomUser()+"','"+usuario.getIntTipoUsuario()+"')");
            JOptionPane.showMessageDialog(null, "Se ha registrado Exitosamente","Información",JOptionPane.INFORMATION_MESSAGE);
            estatuto.close();
	
        }catch (SQLException e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "No se Registro");
	}
    }

     
     public void EliminarUsuario ( int id){
     Conexion conex= new Conexion();
		try {
			Statement estatuto = conex.getConnection().createStatement();
			estatuto.executeUpdate("DELETE FROM persona WHERE id='"+id+"'");
            JOptionPane.showMessageDialog(null, " Se ha Eliminado Correctamente","Información",JOptionPane.INFORMATION_MESSAGE);
			estatuto.close();
			
			
		} catch (SQLException e) {
            System.out.println(e.getMessage());
			JOptionPane.showMessageDialog(null, "No se Elimino");
		}
	}
     public void modificarUsuario(UsuarioVO invitado) {
		
		Conexion conex= new Conexion();
		try{
			String consulta="UPDATE persona SET id= ? ,nombre = ? , edad=? , profesion=? , telefono= ? WHERE id= ? ";
			PreparedStatement estatuto = conex.getConnection().prepareStatement(consulta);
			
            estatuto.setInt(1, invitado.getId());
            estatuto.setString(2, invitado.getPassword());
            estatuto.setString(3, invitado.getNombre());
            estatuto.setString(4,invitado.getApellido());
            estatuto.setString(5,invitado.getNomUser());
            estatuto.executeUpdate();

          JOptionPane.showMessageDialog(null, " Se ha Modificado Correctamente ","Confirmación",JOptionPane.INFORMATION_MESSAGE);
         

        }catch(SQLException	 e){

            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Error al Modificar","Error",JOptionPane.ERROR_MESSAGE);

        }
	}


}

     
     
     
     
     
     
     
    
    
    
    
    
    
    
    
    
    
    
    
    
    
