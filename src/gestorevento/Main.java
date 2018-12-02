
package gestorevento;

import controlador.CoordLogin;
import controlador.CoordTipoEvento;
import modelo.Logica.LogicaLogin;
import modelo.Logica.LogicaTipoEvento;
import vistas.IGCrearEvento;
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
    private static PanelEvento portero;
    private static IGCrearInvitacion invitaciones;
    
    
    public static void main(String[] args) {

/////////// Inicializacion de las intefaces  //////////////////////////////
       login = new IGLogin();
       crearUsuario = new PanelControl();
       
///// Inicializacion de los coordinadores ///////////////////////////////////
        coordLogin = new CoordLogin();
        
/////  inicializacion de la logica  ///////////////////////////////////
       logicaLogin = new LogicaLogin();
       
///////////// enlazar la interfase con el coordinador //////////////////////
         login.setCoordLogin(coordLogin);
         
/////////////coordinador  con la logica/////////////////////////
         coordLogin.setLogica(logicaLogin);
         
//////////// visualizar las ventanas /////////////////////////////////////
//        login.setVisible(true);
          crearUsuario.setVisible(true);
      
    }
  
}
