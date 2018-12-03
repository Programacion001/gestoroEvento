/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.DAO;
import com.mysql.jdbc.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import modelo.VO.TipoUsuarioVO;
import modelo.conexion.Conexion;
   
public class TipoUsuarioDAO {
    
     private TipoUsuarioVO tipoUsuarioID;
     public TipoUsuarioVO getTipoUsuario() {
        return tipoUsuarioID;
    }

   
            public void AgregarTipoUsuario( TipoUsuarioVO tipoUsuario ){
                    Conexion conex= new Conexion();
               try {
			Statement estatuto = Conexion.getConnection().createStatement();
		  	estatuto.executeUpdate("INSERT INTO Tipo_user VALUES ('"+tipoUsuario.getId()+"', '"
					+tipoUsuario.getTipo()+"')");
			JOptionPane.showMessageDialog(null, "Se ha registrado Exitosamente","Información",JOptionPane.INFORMATION_MESSAGE);
			estatuto.close();
			conex.desconetar();
			
		} catch (SQLException e) {
            System.out.println(e.getMessage());
			JOptionPane.showMessageDialog(null, "No se Registro");
		}
	}

    
            

}

            
  
         

