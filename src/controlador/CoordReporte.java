
package controlador;

import java.sql.SQLException;
import java.util.ArrayList;
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
     
 
     
    /// GET LOGICA
    public LogicaReporte getLogicaReporte(){
        return reportelogic;
    }
    // SET LOGICA
    public void setLogicaReporte(LogicaReporte logicareporte){
        this.reportelogic = logicareporte;
    }
    /////////////////////////////////////////////////////////////////////////////
    
    public ArrayList<DiaAsistenciaVO>  realizarReporteDiaVisitado() throws SQLException{
        return reportelogic.verificarDiaMasAsistencia();
    }
    
    public ArrayList<PersonaEventoVO>  realizarReporteEventoSexo(int num) throws SQLException{
        return reportelogic.verificarEventoSexo(num);
    }
    
    public ArrayList<PersonaEventoVO> numPersona() throws SQLException{
        return reportelogic.verificarNumPersona();
    }
}
