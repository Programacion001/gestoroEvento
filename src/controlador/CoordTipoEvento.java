
package controlador;

import modelo.Logica.LogicaTipoEvento;


public class CoordTipoEvento {
    private LogicaTipoEvento logicaTipoEvento;

    public void setLogicaTipoEvento(LogicaTipoEvento logicaTipoEvento) {
        this.logicaTipoEvento = logicaTipoEvento;
    }
    
    public void validarAgregarTipoEvento(String tipoEvento){
        logicaTipoEvento.validarAgregarTipoEvento(tipoEvento);
    }
}
