
package controlador;

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
}
