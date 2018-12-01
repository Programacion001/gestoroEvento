
package gestorevento;

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
       crearUsuario = new PanelControl();
       crearUsuario.setVisible(false);
       portero = new PanelEvento();
       portero.setVisible(false);
       eventoActual = new IGLIstaEventoActuales();
       eventoActual.setVisible(false);
              
    }
  
}
