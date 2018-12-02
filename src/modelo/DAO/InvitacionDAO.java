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
import javax.swing.JOptionPane;
import modelo.VO.EventoVO;
import modelo.VO.InvitadoVO;
import modelo.VO.InvitacionVO;
import modelo.conexion.Conexion;

public class InvitacionDAO {
    
    Connection con = Conexion.getConnection();
    public void registrarInvitacion(EventoVO evento,InvitadoVO invitado) throws SQLException{
    try{
        Statement query = con.createStatement();
        query.executeUpdate("insert into asisten (id_Evento,id_invitado,Status) values ('"+evento.getId()+"','"+ invitado.getId()+"','Ausente')");
        JOptionPane.showMessageDialog(null, "Se ha registrado la invtiacion","Información",JOptionPane.INFORMATION_MESSAGE);
			query.close();
    }catch(SQLException e){
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "No se Registro");
}
    }
   public InvitacionVO buscarInvitacion(EventoVO evento,InvitadoVO invitado) throws SQLException{
       InvitacionVO invitaciones = null;
       boolean existe = false;
      try{
       PreparedStatement consulta = con.prepareStatement("Select * from asisten where id_evento = ? and id_invitado = ?");
       consulta.setInt(1, evento.getId());
       consulta.setInt(2, invitado.getId());
       ResultSet response = consulta.executeQuery();
    while(response.next()){
        existe = true;
        invitaciones.setEvento(evento);
        invitaciones.setInvitado(invitado);
        invitaciones.setStatus("Ausente");}
    response.close();}
      catch(SQLException e){
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "No se encontro");
    }
     if (existe) {
	return invitaciones;
			}
	else return null;				
	}  
   public void modificarInvitacionStatus(EventoVO evento,InvitadoVO invitado,String status) throws SQLException{
       try{
           PreparedStatement consulta = con.prepareStatement("Update asisten set id_evento=?,id_invitado=?,Status=? where id_evento=? and id_invitado=?");
           consulta.setInt(1,evento.getId());
           consulta.setInt(2,invitado.getId());
           consulta.setString(3,status);
           consulta.setInt(4,evento.getId());
           consulta.setInt(5,invitado.getId());
           consulta.executeUpdate();
       } catch(SQLException	 e){

            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Error al cambiar Status","Error",JOptionPane.ERROR_MESSAGE);

        }
   }
 public void eliminarInvitacion(EventoVO evento, InvitadoVO invitado) throws SQLException{
    try{
     Statement query = con.createStatement();
     query.executeUpdate("Delete from asisten where id_evento='"+ evento.getId() +"' and id_invitado='"+invitado.getId()+"'");
       JOptionPane.showMessageDialog(null, " Se ha Eliminado la invitacion Correctamente","Información",JOptionPane.INFORMATION_MESSAGE);
   query.close();}
 catch (SQLException e) {
            System.out.println(e.getMessage());
			JOptionPane.showMessageDialog(null, "No se pudo eliminar la invitacion");
 
}
 }
}