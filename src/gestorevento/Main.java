
package gestorevento;

import controlador.CoordLogin;
import modelo.DAO.LoginDAO;
import modelo.VO.UsuarioVO;
import vistas.IGLogin;
import vistas.IGLIstaEventoActuales;
import vistas.PanelControl;
import vistas.PanelEvento;
public class Main {

    private static IGLogin login;
    private static IGLIstaEventoActuales eventoActual; 
    private static PanelControl crearUsuario;
    private static PanelEvento portero;
    
    public static void main(String[] args) {
       login = new IGLogin();
       login.setVisible(true);
       CoordLogin coordLogin = new CoordLogin();
       login.setCoordLogin(coordLogin);
       
      
    }
  
}
