
package gestorevento;

import vistas.IGLogin;
import vistas.IGLIstaEventoActuales;
import vistas.PanelControl;
public class Main {

    private static IGLogin login;
    private static IGLIstaEventoActuales eventoActual; 
    private static PanelControl crearUsuario;
    public static void main(String[] args) {
       login = new IGLogin();
       login.setVisible(false);
        crearUsuario = new PanelControl();
       crearUsuario.setVisible(true);
    }
    
}
