
package modelo.DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.VO.EventoVO;
import modelo.VO.UsuarioVO;
import modelo.conexion.Conexion;


public class EventoDAO{
    
    public void crearEvento(EventoVO evento){
        Connection con = Conexion.getConnection();
        try {
             String query = "Insert into evento (Ubicacion, fecha, Nombre, Status, Tipo_Evento, id_Usuario,  hora)"
                + "value(?, ?, ?, ?, ?, ?, ?)";
           PreparedStatement prepareStmt = con.prepareStatement(query);
           prepareStmt.setString(1,evento.getUbicacion());
           prepareStmt.setDate(2, evento.getFecha());
           prepareStmt.setString(3, evento.getNombre());
           prepareStmt.setString(4, evento.getStatus());
           prepareStmt.setInt(5, evento.getTipo());
           prepareStmt.setInt(6, evento.getIdUsuario());
           prepareStmt.setString(7,  evento.getHora());
           prepareStmt.executeUpdate();
           JOptionPane.showMessageDialog(null, "Se ha registrado Exitosamente","Información",JOptionPane.INFORMATION_MESSAGE);
           prepareStmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(EventoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }
    
    public ArrayList<EventoVO> listaEventos(){
       Connection con = Conexion.getConnection();
       ArrayList<EventoVO>  eventos = new ArrayList<EventoVO>();
        try {
            String query = 
                "select  e.id_Evento, e.Ubicacion, e.Fecha, e.nombre, Status, Tipo_Evento, id_Usuario, hora, te.tipo \n" +
                "from evento as e \n" +
                "join tipo_Evento as te\n" +
                "on e.tipo_evento = te.id_Tipo";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            
            while(rs.next()){
                EventoVO evento = new EventoVO();
                evento.setTipo(rs.getInt(6));
                evento.setId(rs.getInt(1));
                evento.setStatus(rs.getString(5));
                evento.setUbicacion(rs.getString(2));
                evento.setNombre(rs.getString(4));
                evento.setHora(rs.getString(8));
                evento.setFecha(rs.getDate(3));
                evento.setTipoEvento(rs.getString(9));
                eventos.add(evento);
            }
            rs.close();
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(EventoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
       return eventos; 
    }
    
    public ArrayList<EventoVO> listaEventosFiltrado(String status){
       Connection con = Conexion.getConnection();
       ArrayList<EventoVO>  eventos = new ArrayList<EventoVO>();
       
            String query =  
                "select  e.id_Evento, e.Ubicacion, e.Fecha, e.nombre, Status, Tipo_Evento, id_Usuario, hora, te.tipo \n" +
                "from evento as e \n" +
                "join tipo_Evento as te\n" +
                "on e.tipo_evento = te.id_Tipo\n" +
                "where Status = ?" ;
           try (
              PreparedStatement stmt = con.prepareStatement(query)) {
               stmt.setString(1, status);
               ResultSet rs = stmt.executeQuery();
               while(rs.next()){
                   
                   EventoVO evento = new EventoVO();
                    evento.setTipo(rs.getInt(6));
                    evento.setId(rs.getInt(1));
                    evento.setStatus(rs.getString(5));
                    evento.setUbicacion(rs.getString(2));
                    evento.setNombre(rs.getString(4));
                    evento.setHora(rs.getString(8));
                    evento.setFecha(rs.getDate(3));
                    evento.setTipoEvento(rs.getString(9));

                   eventos.add(evento);
               }
               rs.close();
           
        } catch (SQLException ex) {
            Logger.getLogger(EventoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
       return eventos; 
    }
    
     public EventoVO InfoEvento(int id){
       Connection con = Conexion.getConnection();
       EventoVO evento = new EventoVO();
            String query = "SELECT * FROM evento WHERE id_Evento = ?" ;
           try (
              PreparedStatement stmt = con.prepareStatement(query)) {
               stmt.setInt(1, id);
               ResultSet rs = stmt.executeQuery();
               while(rs.next()){
                   evento.setTipo(rs.getInt(6));
                   evento.setId(rs.getInt(1));
                   evento.setStatus(rs.getString(5));
                   evento.setUbicacion(rs.getString(2));
                   evento.setNombre(rs.getString(4));
                   evento.setHora(rs.getString(8));
                   evento.setFecha(rs.getDate(3));
               }
               rs.close();
           
        } catch (SQLException ex) {
            Logger.getLogger(EventoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
       return evento; 
    }
     
     /// update Evento 
     public void modificar(EventoVO evento){
        Connection con = Conexion.getConnection();
       
        try {
             String query = "UPDATE evento SET ubicacion = ?, Fecha = ?,  Nombre = ?, Tipo_evento = ?, id_Usuario = ?, hora = ? WHERE id_Evento = ?";
           PreparedStatement prepareStmt = con.prepareStatement(query);
           prepareStmt.setString(1, evento.getUbicacion());
           prepareStmt.setDate(2, evento.getFecha());
           prepareStmt.setString(3, evento.getNombre());
           prepareStmt.setInt(4, evento.getTipo());
           prepareStmt.setInt(5,  1); ///usuario() enlazar
           prepareStmt.setString(6,  evento.getHora());
           prepareStmt.setInt(7,  evento.getId());
           prepareStmt.executeUpdate();
           JOptionPane.showMessageDialog(null, "Se ha modificado exitosamente","Información",JOptionPane.INFORMATION_MESSAGE);
           prepareStmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(EventoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }  
     }
     
    public void eliminarEvento(int id){
         Connection con = Conexion.getConnection();
       
        try {
           String query = "DELETE FROM evento WHERE id_evento = ?";
           PreparedStatement prepareStmt = con.prepareStatement(query);
           prepareStmt.setInt(1, id);
           prepareStmt.executeUpdate();
           JOptionPane.showMessageDialog(null, "Se ha eliminado exitosamente","Información",JOptionPane.INFORMATION_MESSAGE);
           prepareStmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(EventoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }  
     }
     
    public int busquedaEvento(String evento){
       Connection con = Conexion.getConnection();
       int id = -1;
      try {
          String query = "SELECT  id_evento  from  evento WHERE Nombre = ?";
          PreparedStatement prepareStmt = con.prepareStatement(query);
          prepareStmt.setString(1, evento);
          ResultSet rs = prepareStmt.executeQuery();
          while(rs.next()){
              id = rs.getInt(1); 
          }
          prepareStmt.close();
      } catch (SQLException ex) {
          Logger.getLogger(TipoEventoDAO.class.getName()).log(Level.SEVERE, null, ex);
      }
      return id;
    }
    public void  modificarEstatusEvento(int id, String status) throws SQLException{
        Connection con = Conexion.getConnection();
        System.out.println(id);
        System.out.println(status);
        String query = "UPDATE evento SET Status = ? where id_Evento = ?";
        PreparedStatement stmt = con.prepareStatement(query);
        stmt.setInt(2, id);
        stmt.setString(1, status);
        stmt.executeUpdate();
        JOptionPane.showMessageDialog(null, "Este evento ha cerrado correctamente","Información",JOptionPane.INFORMATION_MESSAGE);
    }
}
