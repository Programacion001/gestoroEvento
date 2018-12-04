
package modelo.Logica;

import controlador.CoordUsuario;
import java.util.ArrayList;
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
    public ArrayList<UsuarioVO> listaUsuario(){
        usuarioConsulta = new UsuarioDAO();
        return usuarioConsulta.listaUsuario();
    }
    public void verificarEliminarUsuario (int id){
        usuarioConsulta = new UsuarioDAO();
        usuarioConsulta.eliminarUsuario(id);
    }
    
    public void verificarModificarUsuario(UsuarioVO usuario){
        if (usuario.getId() > 0) {
            usuarioConsulta = new UsuarioDAO();
            usuarioConsulta.modificarUsuario(usuario);
         }
    }
    
    public UsuarioVO infoUsuario(int id){
        System.out.println("Desde el DAO");
        usuarioConsulta = new UsuarioDAO();
        return usuarioConsulta.InfoUsuario(id);
    }
    
}
