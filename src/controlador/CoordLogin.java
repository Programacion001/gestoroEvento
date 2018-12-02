
package controlador;


import modelo.Logica.LogicaLogin;
import modelo.VO.UsuarioVO;

public class CoordLogin {
   
    private LogicaLogin logicaLogin;
 
    public void setLogica(LogicaLogin logicaLogin ){
        this.logicaLogin = logicaLogin;
    }
    public UsuarioVO login(UsuarioVO usuario){
        return logicaLogin.verificarLogin(usuario);
    }
}
