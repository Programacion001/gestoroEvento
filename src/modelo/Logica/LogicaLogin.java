
package modelo.Logica;
import javax.swing.JOptionPane;
import modelo.DAO.LoginDAO;
import modelo.VO.UsuarioVO;


public class LogicaLogin {
    
    public UsuarioVO verificarLogicar(UsuarioVO usuario){
        
        if(usuario.getNomUser().equals("") || usuario.getNomUser().equals("")){
            JOptionPane.showMessageDialog(null, "Debe de completar los campos");
            usuario = null;
        }
        else{
          LoginDAO consultaUsuario =   new LoginDAO();
          usuario = consultaUsuario.confirmarUsuario(usuario);
        }
       return usuario;
    }
}
