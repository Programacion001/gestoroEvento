
package controlador;

import java.sql.SQLException;
import java.util.ArrayList;
import modelo.Logica.LogicaEvento;
import modelo.VO.EventoVO;

public class CoordEvento {
    private LogicaEvento logicaEvento;
    
    public void setLogicaEvento(LogicaEvento logicaEvento) {
        this.logicaEvento = logicaEvento;
    }
    
    public void AgregarEvento(EventoVO evento){
        logicaEvento.validarAgregarEvento(evento);
    }
    
    public ArrayList<EventoVO> validarListaEventos(){
          
        return logicaEvento.validarListaEventos();
         
    }
    
    public ArrayList<EventoVO> listaEventosActuales(){
          
        return logicaEvento.validarListaEventosActuales();
         
    }
    
    public ArrayList<EventoVO> validarListaEventosFiltrado(String status){
         
        return logicaEvento.validarListaEventosFiltrado(status);
         
    }
    // 
    public EventoVO validarInfoEvento(int id){
        
        return logicaEvento.validarInfoEvento(id);
    }
    public void modificar(EventoVO evento){
        
         logicaEvento.validarModificar(evento);
    }
    public void eliminarEvento(int id){
         logicaEvento.verificarEliminarEvento(id);
    }
    
    public int busquedaEvento(String evento){
        return logicaEvento.verificarBusquedaEvento(evento);
    }
    
    public void modificarEstatusEvento(int id, String status) throws SQLException{
        logicaEvento.modificarEstatusEvento(id, status);
    }
    
    
}
