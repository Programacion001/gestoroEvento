/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.DAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.VO.InvitadoVO;
import modelo.VO.UsuarioVO;
import modelo.conexion.Conexion;

/**
 *
 * @author Bill Aponte
 */
public class InvitadoDAO {
 private InvitadoVO invitado;    

    public InvitadoVO getInvitado() {
        return invitado;
    }
    
 public void  RegistrarInvitado (InvitadoVO invitado){
 
 Conexion conex= new Conexion();
		
		try {
			Statement estatuto = conex.getConnection().createStatement();
			estatuto.executeUpdate("INSERT INTO Invitados VALUES ('"+invitado.getId()+"', '"
					+invitado.getApellido()+"', '"+invitado.getSexo()+"', '"
					+invitado.getDireccion()+"', '"+invitado.getNombre()+"', '"
                                        +invitado.getEmail()+"', '"+invitado.getTelefono()+"')");
			JOptionPane.showMessageDialog(null, "Se ha registrado Exitosamente","Información",JOptionPane.INFORMATION_MESSAGE);
			estatuto.close();
			conex.desconetar();
			
		} catch (SQLException e) {
            System.out.println(e.getMessage());
			JOptionPane.showMessageDialog(null, "No se Registro");
		}
 }
 
 
    public void EliminarInvitado(InvitadoVO id){
    
      Conexion conex= new Conexion();
		try {
			Statement estatuto = conex.getConnection().createStatement();
			estatuto.executeUpdate("DELETE FROM Invitados WHERE id_Invitados='"+id+"'");
            JOptionPane.showMessageDialog(null, " Se ha Eliminado Correctamente","Información",JOptionPane.INFORMATION_MESSAGE);
			estatuto.close();
			conex.desconetar();
			
		} catch (SQLException e) {
            System.out.println(e.getMessage());
			JOptionPane.showMessageDialog(null, "No se Elimino");
		}
    
    
    
    
    }            
                
                
    public void  modificarInvitado(InvitadoVO invitado){
		
		Conexion conex= new Conexion();
		try{
			String consulta="UPDATE invitados SET id_Usuario = ? ,Contraseña = ? , Nombre=? ,Apellido=? , Nom_usuario= ?,Tipo_user =? WHERE id_Usuario= ? ";
			PreparedStatement estatuto = conex.getConnection().prepareStatement(consulta);
			
            estatuto.setInt(1, invitado.getId());
            estatuto.setString(2, invitado.getApellido());
            estatuto.setString(3, invitado.getSexo());
            estatuto.setString(4,invitado.getDireccion());
            estatuto.setString(5,invitado.getNombre());
            estatuto.setString(5,invitado.getEmail());
            estatuto.setString(5,invitado.getTelefono());      
            estatuto.executeUpdate();

          JOptionPane.showMessageDialog(null, " Se ha Modificado Correctamente ","Confirmación",JOptionPane.INFORMATION_MESSAGE);
         

        }catch(SQLException	 e){

            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Error al Modificar","Error",JOptionPane.ERROR_MESSAGE);

        }
	}            
                
                
            public void listaInvitado(InvitadoVO invitados){
    ArrayList<InvitadoVO> invitadoList = new ArrayList<InvitadoVO>();
    for (InvitadoVO x: invitadoList ){
        invitadoList.add(invitados);
    }
   
}    
                
          public InvitadoVO eventoActuarPersonas(int idEvento){
     return null;
     

    }
        
                
 
 
 
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
