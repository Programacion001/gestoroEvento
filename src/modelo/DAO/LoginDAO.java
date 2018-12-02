
package modelo.DAO;
import com.mysql.jdbc.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import modelo.VO.UsuarioVO;
import modelo.conexion.Conexion;


public class LoginDAO {
    
    private UsuarioVO usuarioID;

    public  UsuarioVO getUsuarioID() {
        return usuarioID;
    }
    
    public UsuarioVO confirmarUsuario(UsuarioVO usuario){
         Connection con = Conexion.getConnection();
         System.out.println(usuario.getPassword());
         boolean usuarioActivo = false;
         try{
             Statement stm = con.createStatement();
             ResultSet rs =  stm.executeQuery("SELECT* FROM usuario ");
             ArrayList<UsuarioVO> listaUsuarios = new ArrayList<UsuarioVO>();
             while(rs.next()){
                 UsuarioVO usuarios = new UsuarioVO();
                 usuarios.setId(rs.getInt(1));
                 usuarios.setPassword(rs.getString(2));
                 usuarios.setNombre(rs.getString(3));
                 usuarios.setApellido(rs.getString(4));
                 usuarios.setNomUser(rs.getString(5));
                 System.out.println(rs.getString(3));
                 listaUsuarios.add(usuarios);
             }
             
             for (int i = 0; i < listaUsuarios.size(); i++) {
                 
                 if(listaUsuarios.get(i).getNomUser().compareTo(usuario.getNomUser()) == 0 && 
                     listaUsuarios.get(i).getPassword().compareTo(usuario.getPassword()) == 0){
                     usuario = listaUsuarios.get(i);
                     usuarioActivo = true;
                    break;  
     
                 } 
                 
             }
             
             if(usuarioActivo == false){
                 usuario = null;
             }
             rs.close();
             stm.close();
             
         }catch(SQLException e){
             e.printStackTrace();
         }
        return usuario;
    }
    
}
