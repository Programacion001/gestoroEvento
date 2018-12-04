
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
import modelo.VO.UsuarioVO;
import modelo.conexion.Conexion;


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
    
    public ArrayList<UsuarioVO> listaUsuario(){
       Connection con = Conexion.getConnection();
       ArrayList<UsuarioVO>  eventos = new ArrayList<UsuarioVO>();
        try {
            String query = 
                "select u.id_Usuario, u.`Contraseña`, u.Nombre, u.Apellido, u.Nom_usuario, tu.Tipo\n" +
                "from usuario as u\n" +
                "join tipo_user as tu\n" +
                "on u.Tipo_user = tu.id_Tipo";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            
            while(rs.next()){
                UsuarioVO usuario = new UsuarioVO();
                usuario.setId(rs.getInt(1));
                usuario.setPassword(rs.getString(2));
                usuario.setNombre(rs.getString(3));
                usuario.setApellido(rs.getString(4));
                usuario.setNomUser(rs.getString(5));
                usuario.setTipoUsuario(rs.getString(6));
                eventos.add(usuario);
            }
            rs.close();
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(EventoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
       return eventos; 
    }

     
    public void eliminarUsuario (int id){
        Conexion conex= new Conexion();
        try {
	        Statement estatuto = conex.getConnection().createStatement();
		estatuto.executeUpdate("DELETE FROM usuario WHERE id_Usuario='"+id+"'");
                JOptionPane.showMessageDialog(null, " Se ha Eliminado Correctamente","Información",JOptionPane.INFORMATION_MESSAGE);
	        estatuto.close();
			
			
	} catch (SQLException e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "No se Elimino");
	}
    }
    public void modificarUsuario(UsuarioVO usuario) {
           
            Conexion conex= new Conexion();
            try{
		String consulta = "UPDATE usuario SET  `Contraseña`= ? , Nombre = ? , Apellido = ? , Nom_Usuario = ?, Tipo_User = ? WHERE id_usuario = ? ";
		PreparedStatement estatuto = conex.getConnection().prepareStatement(consulta);
		              System.out.println(usuario.getId());	
                estatuto.setString(1, usuario.getPassword());
                estatuto.setString(2, usuario.getNombre());
                estatuto.setString(3, usuario.getApellido());
                estatuto.setString(4, usuario.getNomUser());
                estatuto.setInt(5, usuario.getIntTipoUsuario());
                estatuto.setInt(6, usuario.getId());
            estatuto.executeUpdate();
             ;
          JOptionPane.showMessageDialog(null, " Se ha Modificado Correctamente ","Confirmación",JOptionPane.INFORMATION_MESSAGE);
          estatuto.close();

        }catch(SQLException	 e){

            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Error al Modificar","Error",JOptionPane.ERROR_MESSAGE);

        }
    }
    
      public UsuarioVO InfoUsuario(int id){
       Connection con = Conexion.getConnection();
       UsuarioVO usuario = new UsuarioVO();
          
            String query = "SELECT * FROM usuario WHERE id_Usuario = ?" ;
           try (
              PreparedStatement stmt = con.prepareStatement(query)) {
               stmt.setInt(1, id);
               ResultSet rs = stmt.executeQuery();
               while(rs.next()){
                   usuario.setId(rs.getInt(1));
                   usuario.setPassword(rs.getString(2));
                   usuario.setNombre(rs.getString(3));
                   usuario.setApellido(rs.getString(4));
                   usuario.setNomUser(rs.getString(5));
                   usuario.setIntTipoUsuario(rs.getInt(6));
               }
               rs.close();
           
        } catch (SQLException ex) {
            Logger.getLogger(EventoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
       return usuario; 
    }


}

     
     
     
     
     
     
     
    
    
    
    
    
    
    
    
    
    
    
    
    
    
