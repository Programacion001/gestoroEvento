
package modelo.Logica;

import controlador.CoordTipoEvento;
import javax.swing.JOptionPane;
import modelo.DAO.TipoEventoDAO;


public class LogicaTipoEvento {
    private CoordTipoEvento coordTipoEvento;
    private TipoEventoDAO tipoEventoConsulta;
    
    public void setCoordTipoEvento(CoordTipoEvento coordTipoEvento) {
        this.coordTipoEvento = coordTipoEvento;
    }
    
    
    public void validarAgregarTipoEvento(String tipoEvento){

        if(tipoEvento.compareTo("") == 0){
            JOptionPane.showMessageDialog(null, "Debe de completar llenar el campo");
        }
        else{
            tipoEventoConsulta = new TipoEventoDAO();
            tipoEventoConsulta.agregarTipoEvento(tipoEvento);

        }
    }
}
