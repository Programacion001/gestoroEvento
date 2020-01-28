
package controlador;

import java.util.ArrayList;
import modelo.Logica.LogicaTipoUsuario;

import modelo.VO.TipoUsuarioVO;


public class CoordTipoUsuario {
    private LogicaTipoUsuario logicaTipoUsuario;

    public void setLogicaTipoUsuario(LogicaTipoUsuario logicaTipoUsuario) {
        this.logicaTipoUsuario = logicaTipoUsuario;
    }
    
    public void validarAgregarTipoEvento(TipoUsuarioVO usuario){
        logicaTipoUsuario.validarAgregarTipoEvento(usuario);
    }
    
    public ArrayList<TipoUsuarioVO> validarConsultaTipoEvento(){
       return logicaTipoUsuario.validarConsultaTipoUsuario();

   }
    public int BusquedaTipoUsuario(String tipoUsuario){
        return logicaTipoUsuario.verificarBusquedaTipo(tipoUsuario);
    }

}
