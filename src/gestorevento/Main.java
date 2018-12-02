
package gestorevento;

import controlador.CoordLogin;
import modelo.DAO.LoginDAO;
import modelo.Logica.LogicaLogin;
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
    private static PanelEvento portero;
    private static IGCrearInvitacion invitaciones;
    
    
    public static void main(String[] args) {
        
       login = new IGLogin();
<<<<<<< HEAD
       login.setVisible(true);

       crearUsuario = new PanelControl();
       crearUsuario.setVisible(true);
       portero = new PanelEvento();
       portero.setVisible(false);
       eventoActual = new IGLIstaEventoActuales();
       eventoActual.setVisible(false);
           

       
       CoordLogin coordLogin = new CoordLogin();
       login.setCoordLogin(coordLogin);
       
=======
       coordLogin = new CoordLogin();
       logicaLogin = new LogicaLogin();
//       logicaLogin.setCoordinador(coordLogin);   
//        invitaciones = new IGCrearInvitacion();
//       invitaciones.setVisible(true); 

///////////// enlazar la interfase con el coordinador //////////////////////
         login.setCoordLogin(coordLogin);

/////////////coordinador  con la logica/////////////////////////
         coordLogin.setLogica(logicaLogin);
      
//////////// visualizar las ventanas /////////////////////////////////////
//        login.setVisible(true);
          crearUsuario.setVisible(true);
>>>>>>> 94d1796052000d8a704902bb318a639453abc7e1
      

    }
  
}
