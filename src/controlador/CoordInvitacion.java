package controlador;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.Logica.LogicaInvitacion;
import modelo.VO.EventoVO;
import modelo.VO.InvitacionVO;
import modelo.VO.InvitadoVO;
import vistas.IGCrearInvitacion;
public class CoordInvitacion {

  private LogicaInvitacion logicainv;

  public LogicaInvitacion getLogicaInv(){
      return logicainv;
  }
  public void setLogicaInv(LogicaInvitacion logicainv){
      this.logicainv = logicainv;
  }
 ///////////////////////////////////////////////////////////////////////////////
  
  public void registrarInvitacion(EventoVO evento, InvitadoVO invitado) throws SQLException{
      logicainv.validarInvitacion(evento, invitado);
  }
  public InvitacionVO buscarInvitacion(EventoVO evento, InvitadoVO invitado) throws SQLException{
      return logicainv.validarBuscarInvitacion(evento, invitado);
  }
  
  public void modificarStatusInvitacion(EventoVO evento, InvitadoVO invitado, String status) throws SQLException{
      logicainv.validarModificarStatusInvitacion(evento, invitado, status);
  } 
  
  public void eliminarInvitacion(EventoVO evento, InvitadoVO invitado) throws SQLException{
      logicainv.validarEliminarInvitacion(evento, invitado);
  }
  
  public ArrayList<InvitadoVO> listaInvitacion(int idevento) throws SQLException{
      return logicainv.validadListaInvitacion(idevento);
  }
  
  public ArrayList<InvitadoVO> listaInvitacionAusente(int idevento) throws SQLException{
       return logicainv.verificarListaInvitacionAusente(idevento);
  }
}
