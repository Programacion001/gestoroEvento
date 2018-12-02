
package modelo.Logica;
import controlador.CoordLogin;
import javax.swing.JOptionPane;
import modelo.DAO.LoginDAO;
import modelo.VO.UsuarioVO;


public class LogicaLogin {
    
    private  LoginDAO consultaUsuario;
    private CoordLogin coordLogin;
   
    public void setCoordinador(CoordLogin coordLogin) {
       this.coordLogin = coordLogin;
		
    }
    public UsuarioVO verificarLogin(UsuarioVO usuario){
        if(usuario.getNomUser().compareTo("") == 0 || usuario.getPassword().compareTo("") == 0){
            JOptionPane.showMessageDialog(null, "Debe de completar los campos");
            usuario = null;
        }
        else{
          consultaUsuario =  new LoginDAO();
          usuario = consultaUsuario.confirmarUsuario(usuario);
        }
       return usuario;
    }
}
