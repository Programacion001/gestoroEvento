
package modelo.DAO;

import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.VO.TipoEventoVO;
import modelo.conexion.Conexion;


public class TipoEventoDAO {


  public void agregarTipoEvento( String tipoEvento){
        Connection con = Conexion.getConnection();
      try {
         String query = "INSERT INTO tipo_evento (tipo) VALUE (?)";
         PreparedStatement prepareStmt = con.prepareStatement(query);
         prepareStmt.setString(1, tipoEvento);

         prepareStmt.executeUpdate();
         prepareStmt.close();
         
      } catch (SQLException ex) {
          Logger.getLogger(TipoEventoDAO.class.getName()).log(Level.SEVERE, null, ex);
      }
        
    }
  public ArrayList<TipoEventoVO> consultarEvento(){
     Connection con = Conexion.getConnection();
     ArrayList<TipoEventoVO> tipos = new ArrayList<TipoEventoVO>();
     
      try {
          Statement stm = con.createStatement();
          ResultSet rs = stm.executeQuery("SELECT * FROM tipo_evento");
          
          while(rs.next()){
              TipoEventoVO tipoEvento = new TipoEventoVO();
              tipoEvento.setId(rs.getInt(1));
              tipoEvento.setTipo(rs.getString(2));
              tipos.add(tipoEvento);
              
          }
          stm.close();
      } catch (SQLException ex) {
          Logger.getLogger(TipoEventoDAO.class.getName()).log(Level.SEVERE, null, ex);
      }
     
      return tipos;
  }
}
