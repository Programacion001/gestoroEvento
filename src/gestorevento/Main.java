
package gestorevento;

import controlador.CoordLogin;
import java.util.Date;
import modelo.DAO.EventoDAO;
import modelo.DAO.TipoEventoDAO;
import modelo.DAO.TipoUsuarioDAO;
import modelo.DAO.UsuarioDAO;
import modelo.Logica.LogicaLogin;
import modelo.VO.EventoVO;
import modelo.VO.TipoUsuarioVO;
import modelo.VO.UsuarioVO;
import vistas.IGLogin;
import vistas.IGCrearInvitacion;
import vistas.IGLIstaEventoActuales;
import vistas.PanelControl;
import vistas.PanelEvento;
public class Main {

    //// interfaces
    private static IGLogin login;
    //// logicas
    static LogicaLogin logicaLogin;
    
    ////Coordinadores
    static CoordLogin  coordLogin;
    // demas variable
    private static IGLIstaEventoActuales eventoActual; 
    private static PanelControl crearUsuario;
    private static IGCrearInvitacion invitaciones;
   
    
    
    public static void main(String[] args) {

/////////// Inicializacion de las intefaces  //////////////////////////////
       login = new IGLogin();
       eventoActual = new IGLIstaEventoActuales();
       crearUsuario = new PanelControl();
       
///// Inicializacion de los coordinadores ///////////////////////////////////
        coordLogin = new CoordLogin();
        
/////  inicializacion de la logica  ///////////////////////////////////
       logicaLogin = new LogicaLogin();
       
///////////// enlazar la interfase con el coordinador //////////////////////
         login.setCoordLogin(coordLogin);
         
///////////coordinador  con la logica/////////////////////////
         coordLogin.setLogica(logicaLogin);
         
//////////// visualizar las ventanas /////////////////////////////////////
        login.setVisible(true);
//        eventoActual.setVisible(true);
//      crearUsuario.setVisible(true);
    
    }

}
