
package controlador;

import java.util.ArrayList;
import modelo.Logica.LogicaTipoEvento;
import modelo.VO.TipoEventoVO;


public class CoordTipoEvento {
    private LogicaTipoEvento logicaTipoEvento;

    public void setLogicaTipoEvento(LogicaTipoEvento logicaTipoEvento) {
        this.logicaTipoEvento = logicaTipoEvento;
    }
    
    public void validarAgregarTipoEvento(String tipoEvento){
        logicaTipoEvento.validarAgregarTipoEvento(tipoEvento);
    }
    
    public ArrayList<TipoEventoVO> validarConsultaTipoEvento(){
       return logicaTipoEvento.validarConsultaTipoEvento();
//         return null;
   }
}
