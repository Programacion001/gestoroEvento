
package controlador;

import java.util.ArrayList;
import modelo.Logica.LogicaUsuario;
import modelo.VO.UsuarioVO;


public class CoordUsuario {
    LogicaUsuario logicaUsuario;

    public void setLogicaUsuario(LogicaUsuario logicaUsuario) {
        this.logicaUsuario = logicaUsuario;
    }
    public void agregarUsuario(UsuarioVO Usuario){
         logicaUsuario.validarAgregarUsuario(Usuario);
    }
      public ArrayList<UsuarioVO> listaUsuario(){
        return logicaUsuario.listaUsuario();
    }
    public void eliminarUsuario (int id){
        logicaUsuario.verificarEliminarUsuario(id);
    }
    
    public void modificarUsuario (UsuarioVO usuario){
        logicaUsuario.verificarModificarUsuario(usuario);
    }
    
    public UsuarioVO infoUsuario(int id){
        System.out.println("Desde el DAO");
        return logicaUsuario.infoUsuario(id);
    }
    
}
