/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.DAO;

import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.VO.InvitadoVO;
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
		estatuto.executeUpdate("INSERT INTO invitados  (Apellido, Sexo, Direccion, Nombre, Email, telefono) VALUES ('"
			+invitado.getApellido()+"', '"+invitado.getSexo()+"', '"
			+invitado.getDireccion()+"', '"+invitado.getNombre()+"', '"
                        +invitado.getEmail()+"', '"+invitado.getTelefono()+"')");
		JOptionPane.showMessageDialog(null, "Se ha registrado Exitosamente","Información",JOptionPane.INFORMATION_MESSAGE);
		estatuto.close();	
	} catch (SQLException e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "No se Registro");
	}
 }

 
 
    public void EliminarInvitado(int id){
    
      Conexion conex = new Conexion();
		try {
			Statement estatuto = conex.getConnection().createStatement();
			estatuto.executeUpdate("DELETE FROM Invitados WHERE id_Invitados='"+id+"'");
            JOptionPane.showMessageDialog(null, " Se ha Eliminado Correctamente","Información",JOptionPane.INFORMATION_MESSAGE);
			estatuto.close();
			
			
		} catch (SQLException e) {
            System.out.println(e.getMessage());
			JOptionPane.showMessageDialog(null, "No se Elimino");
		}

    }            
                
                
    public void  modificarInvitado(InvitadoVO invitado){
		
	Conexion conex = new Conexion();
	try{
	   String consulta=" UPDATE invitados SET Apellido = ? , Sexo=? , Direccion = ? ,"
                + " Nombre = ?, Email = ?, Telefono =?"
                + "WHERE id_Invitados = ? ";
	    PreparedStatement estatuto = conex.getConnection().prepareStatement(consulta);
			
               estatuto.setString(1, invitado.getApellido());
               estatuto.setString(2, invitado.getSexo());
               estatuto.setString(3, invitado.getDireccion());
               estatuto.setString(4, invitado.getNombre());
               estatuto.setString(5, invitado.getEmail());
               estatuto.setString(6, invitado.getTelefono());
               estatuto.setInt(7, invitado.getId());
               
            estatuto.executeUpdate();

          JOptionPane.showMessageDialog(null, " Se ha Modificado Correctamente ","Confirmación",JOptionPane.INFORMATION_MESSAGE);
          estatuto.close();

        }catch(SQLException e){

            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Error al Modificar","Error",JOptionPane.ERROR_MESSAGE);

        }
}            
                
               
    
    public ArrayList<InvitadoVO> listaInvitado(){
       Connection con = Conexion.getConnection();
       ArrayList<InvitadoVO>  invitados = new ArrayList<InvitadoVO>();
        try {
            String query = "select * from invitados";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            
            while(rs.next()){
                InvitadoVO invitado = new InvitadoVO();
                invitado.setId(rs.getInt(1));
                invitado.setApellido(rs.getString(2));
                invitado.setSexo(rs.getString(3));
                invitado.setDireccion(rs.getString(4));
                invitado.setNombre(rs.getString(5));
                invitado.setEmail(rs.getString(6));
                invitado.setTelefono(rs.getString(7));
                invitados.add(invitado);
                
            }
            rs.close();
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(EventoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
       return invitados; 
    }
    
   public InvitadoVO infoInvitado(int id){
       Connection con = Conexion.getConnection();
       InvitadoVO invitado = new InvitadoVO();
          
            String query = "SELECT * FROM invitados WHERE id_Invitados = ?" ;
           try (
              PreparedStatement stmt = con.prepareStatement(query)) {
               stmt.setInt(1, id);
               ResultSet rs = stmt.executeQuery();
               while(rs.next()){
                invitado.setId(rs.getInt(1));
                invitado.setApellido(rs.getString(2));
                invitado.setSexo(rs.getString(3));
                invitado.setDireccion(rs.getString(4));
                invitado.setNombre(rs.getString(5));
                invitado.setEmail(rs.getString(6));
                invitado.setTelefono(rs.getString(7));
               
               }
               rs.close();
           
        } catch (SQLException ex) {
            Logger.getLogger(EventoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
       return invitado; 
    }

}

                
 
 
 
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

