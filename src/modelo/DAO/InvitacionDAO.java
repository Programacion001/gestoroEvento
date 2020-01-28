
package modelo.DAO;
import java.sql.Connection;
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
       String consulta = "insert into asisten (id_Evento, id_invitado, Status) values (?,?,? )";
       String status = "Ausente";
    try{
        PreparedStatement stm = con.prepareStatement(consulta);
        stm.setInt(1, evento.getId());
        stm.setInt(2, invitado.getId());
        stm.setString(3, status);
        stm.executeUpdate();
        JOptionPane.showMessageDialog(null, "Se ha registrado la invitacion","Información",JOptionPane.INFORMATION_MESSAGE);
        stm.close();
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
 
    public ArrayList<InvitadoVO> listaInvitacion(int idevento) throws SQLException{
      ArrayList<InvitadoVO> listainvitados = new ArrayList<InvitadoVO>();
     PreparedStatement consulta = con.prepareStatement(
             "select i.id_evento,inv.id_invitados,inv.apellido,inv.nombre,inv.sexo,inv.email,inv.telefono,"
             + "i.Status from invitados inv inner join\n" +
              "asisten I on i.id_invitado = inv.id_invitados where i.id_evento = ? ORDER BY i.id_evento ASC;");
    consulta.setInt(1,idevento );
        ResultSet response = consulta.executeQuery();
        while(response.next()){
        InvitadoVO invitados = new InvitadoVO();
        invitados.setId(response.getInt(2));
        invitados.setApellido(response.getString(3));
        invitados.setNombre(response.getString(4));
        invitados.setSexo(response.getString(5));
        invitados.setEmail(response.getString(6));
        invitados.setTelefono(response.getString(7));
        invitados.setStatus(response.getString(8));
        listainvitados.add(invitados);
        
        }

        return listainvitados;

      }
    
      public ArrayList<InvitadoVO> listaInvitacionAusente(int idevento) throws SQLException{
      ArrayList<InvitadoVO> listainvitados = new ArrayList<InvitadoVO>();
         
     PreparedStatement consulta = con.prepareStatement(
             "select i.id_evento,inv.id_invitados,inv.apellido,inv.nombre,inv.sexo,inv.email,inv.telefono,"
             + "i.Status from invitados inv inner join\n" +
              "asisten I on i.id_invitado = inv.id_invitados where i.id_evento = ? and i.Status = ? ORDER BY i.id_evento ASC;");
    consulta.setInt(1,idevento );
    consulta.setString(2,"Ausente");
        ResultSet response = consulta.executeQuery();
        while(response.next()){
        InvitadoVO invitados = new InvitadoVO();
        invitados.setId(response.getInt(2));
        invitados.setApellido(response.getString(3));
        invitados.setNombre(response.getString(4));
        invitados.setSexo(response.getString(5));
        invitados.setEmail(response.getString(6));
        invitados.setTelefono(response.getString(7));
        invitados.setStatus(response.getString(8));
        listainvitados.add(invitados);
        
        }

        return listainvitados;

      }
    }