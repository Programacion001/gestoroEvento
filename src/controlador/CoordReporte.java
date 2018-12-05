
package controlador;

import java.sql.SQLException;
import modelo.VO.PersonaEventoVO;
import modelo.VO.DiaAsistenciaVO;
import vistas.reportePanel.pnlDiaMasVisitado;
import vistas.reportePanel.pnlEventoVisitado;
import vistas.reportePanel.pnlInvitadoEvento;
import modelo.Logica.LogicaReporte;

public class CoordReporte {
    private LogicaReporte reportelogic;
    private pnlDiaMasVisitado iGDiaVisitado;
    private pnlEventoVisitado iGEventoVisitado;
    private pnlInvitadoEvento iGInvitadoEvento;
    
// GET INTERFAZ DIA VISITADO
    public pnlDiaMasVisitado getDiaIG(){
       return iGDiaVisitado;
    }
        // SET INTERFAZ DIA VISITADO
    public void setIGDiaVisitado(pnlDiaMasVisitado diavisitado){
        this.iGDiaVisitado = diavisitado;
    }
        // GET INTERFAZ Evento VISITADO
        public pnlEventoVisitado getEventoIG(){
       return iGEventoVisitado;
    }
        // SET INTERFAZ Evento VISITADO
    public void setIGEventoVisitado(pnlEventoVisitado eventovisitado){
        this.iGEventoVisitado = eventovisitado;
    }
           // GET INTERFAZ Invitados Eventos
        public pnlInvitadoEvento getInvitadoEventoIG(){
       return iGInvitadoEvento;
    }
        // SET INTERFAZ Invitados Eventos
    public void setIGinvitadoEvento(pnlInvitadoEvento invitadoevento){
        this.iGInvitadoEvento = invitadoevento;
    } 
    
    /// GET LOGICA
    public LogicaReporte getLogicaReporte(){
        return reportelogic;
    }
    // SET LOGICA
    public void setLogicaReporte(LogicaReporte logicareporte){
        this.reportelogic = logicareporte;
    }
    /////////////////////////////////////////////////////////////////////////////
    
    public void realizarReporteDiaVisitado() throws SQLException{
        reportelogic.verificarDiaMasAsistencia();
    }
    
    public void realizarReporteEventoSexo(String dato, int num) throws SQLException{
        reportelogic.verificarEventoSexo(dato, num);
    }
    
    public void realizaReportePersonas() throws SQLException{
        reportelogic.verificarNumPersona();
    }
}
