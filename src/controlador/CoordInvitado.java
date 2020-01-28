
package controlador;

import java.util.ArrayList;
import modelo.Logica.LogicaInvitado;
import modelo.VO.InvitadoVO;


public class CoordInvitado {
    private LogicaInvitado logicaInvitado;

    public void setLogicaInvitado(LogicaInvitado logicaInvitado) {
        this.logicaInvitado = logicaInvitado;
    }
    
    public void RegistrarInvitado (InvitadoVO invitado){
        logicaInvitado.verificarRegistrarInvitado(invitado);
    }
    public  ArrayList<InvitadoVO> listaInvitado(){
        return logicaInvitado.listaInvitado();
    }
    public InvitadoVO verificarInfoInvitado(int id){
        return logicaInvitado.verificarInfoInvitado(id);
    }
    public void modificarInvitado(InvitadoVO invitado){
        logicaInvitado.verificarModificarInvitado(invitado);
    }
    
    public void eiminarInvitado(int id){
        logicaInvitado.verificarEliminarInvitado(id);
    }
}
