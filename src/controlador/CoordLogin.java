
package controlador;


import modelo.Logica.LogicaLogin;
import modelo.VO.UsuarioVO;

public class CoordLogin {
   
    private LogicaLogin logicaLogin;
    
    public UsuarioVO login(UsuarioVO usuario){
        try{
        return logicaLogin.verificarLogicar(usuario);
        }
        catch(Exception e){
            e.printStackTrace();
            return logicaLogin.verificarLogicar(usuario);
        }
    }
}
