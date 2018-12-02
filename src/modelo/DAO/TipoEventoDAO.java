
package modelo.DAO;

import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

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

}
