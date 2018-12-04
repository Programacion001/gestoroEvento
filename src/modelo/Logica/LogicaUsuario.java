
package modelo.Logica;

import controlador.CoordUsuario;
import javax.swing.JOptionPane;
import modelo.DAO.UsuarioDAO;
import modelo.VO.UsuarioVO;

public class LogicaUsuario {
    UsuarioDAO usuarioConsulta;
    CoordUsuario coordUsuario;

    public void setCoordUsuario(CoordUsuario coordUsuario) {
        this.coordUsuario = coordUsuario;
    }
    public void validarAgregarUsuario( UsuarioVO usuario){
        if(usuario.getNomUser().compareTo("") == 0 || usuario.getNombre().compareTo("") == 0
                || usuario.getPassword().compareTo("") == 0 || usuario.getApellido().compareTo("") == 0){
            JOptionPane.showMessageDialog(null,"Debe de llenar todos los campos","Advertencia",JOptionPane.WARNING_MESSAGE); 
        }else{
            usuarioConsulta = new UsuarioDAO();
            usuarioConsulta.AgregarUsuario(usuario);
        }
    }
   
}
