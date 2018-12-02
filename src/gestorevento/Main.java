
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
<<<<<<< HEAD
//<<<<<<< HEAD
=======

>>>>>>> 76878e994511950e225c4d111f6c4f5df3affb65
        
       login = new IGLogin();

       login.setVisible(true);
<<<<<<< HEAD
//=======
//>>>>>>> a137888a5968ad7c804a0c46876b8a272029b5d5
=======
>>>>>>> 76878e994511950e225c4d111f6c4f5df3affb65

/////////// Inicializacion de las intefaces  //////////////////////////////
       login = new IGLogin();
       crearUsuario = new PanelControl();
<<<<<<< HEAD
       
//<<<<<<< HEAD
//=======
       coordLogin = new CoordLogin();
//=======
=======
       coordLogin = new CoordLogin();
>>>>>>> 76878e994511950e225c4d111f6c4f5df3affb65
///// Inicializacion de los coordinadores ///////////////////////////////////
        coordLogin = new CoordLogin();
        
/////  inicializacion de la logica  ///////////////////////////////////
<<<<<<< HEAD
//>>>>>>> a137888a5968ad7c804a0c46876b8a272029b5d5
=======
>>>>>>> 76878e994511950e225c4d111f6c4f5df3affb65
       logicaLogin = new LogicaLogin();
       
///////////// enlazar la interfase con el coordinador //////////////////////
         login.setCoordLogin(coordLogin);
         
/////////////coordinador  con la logica/////////////////////////
         coordLogin.setLogica(logicaLogin);
         
//////////// visualizar las ventanas /////////////////////////////////////
//        login.setVisible(true);
          crearUsuario.setVisible(true);
<<<<<<< HEAD

=======
      
>>>>>>> 76878e994511950e225c4d111f6c4f5df3affb65
    }
  
}
