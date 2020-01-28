/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.DAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.VO.TipoEventoVO;
import modelo.VO.TipoUsuarioVO;
import modelo.conexion.Conexion;
   
public class TipoUsuarioDAO {
    
     private TipoUsuarioVO tipoUsuarioID;
     public TipoUsuarioVO getTipoUsuario() {
        return tipoUsuarioID;
    }
    public void AgregarTipoUsuario( TipoUsuarioVO tipoUsuario ){
               Connection conex = Conexion.getConnection();
               try {
			Statement estatuto = Conexion.getConnection().createStatement();
		  	estatuto.executeUpdate("INSERT INTO Tipo_user (Tipo) VALUES ('"
					+ tipoUsuario.getTipo()+"')");
			JOptionPane.showMessageDialog(null, "Se ha registrado Exitosamente","Información",JOptionPane.INFORMATION_MESSAGE);
			estatuto.close();
			
			
		} catch (SQLException e) {
            System.out.println(e.getMessage());
			JOptionPane.showMessageDialog(null, "No se ha Registrado");
		}
    }
    
    public ArrayList<TipoUsuarioVO> consultarTipoUsuario(){
        Connection con = Conexion.getConnection();
        ArrayList<TipoUsuarioVO> tipos = new ArrayList<TipoUsuarioVO>();

         try {
             Statement stm = con.createStatement();
             ResultSet rs = stm.executeQuery("SELECT * FROM tipo_user");

             while(rs.next()){
                 TipoUsuarioVO tipoUsuario = new TipoUsuarioVO();
                 tipoUsuario.setId(rs.getInt(1));
                 tipoUsuario.setTipo(rs.getString(2));
                 tipos.add(tipoUsuario);

             }
             stm.close();
         } catch (SQLException ex) {
             Logger.getLogger(TipoEventoDAO.class.getName()).log(Level.SEVERE, null, ex);
         }

         return tipos;
    }
    
    public int buscarEvento(String tipoUsuario){
       Connection con = Conexion.getConnection();
       int id = -1;
      try {
          String query = "SELECT id_Tipo from tipo_user WHERE Tipo = ?";
          PreparedStatement prepareStmt = con.prepareStatement(query);
          prepareStmt.setString(1, tipoUsuario);
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
            

}

            
  
         

