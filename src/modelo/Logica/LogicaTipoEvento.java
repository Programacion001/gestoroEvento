
package modelo.Logica;

import controlador.CoordTipoEvento;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.DAO.TipoEventoDAO;
import modelo.VO.TipoEventoVO;


public class LogicaTipoEvento {
    private CoordTipoEvento coordTipoEvento;
    private TipoEventoDAO tipoEventoConsulta;
    
    public void setCoordTipoEvento(CoordTipoEvento coordTipoEvento) {
        this.coordTipoEvento = coordTipoEvento;
    }
    
    public void validarAgregarTipoEvento(String tipoEvento){

        if(tipoEvento.compareTo("") == 0){
            JOptionPane.showMessageDialog(null, "Debe de llenar el campo");
        }
        else{
            tipoEventoConsulta = new TipoEventoDAO();
            tipoEventoConsulta.agregarTipoEvento(tipoEvento);
            JOptionPane.showMessageDialog(null, "Tipo de evento agregado");

        }
    }
    
   public ArrayList<TipoEventoVO> validarConsultaTipoEvento(){
      
       tipoEventoConsulta = new TipoEventoDAO();
       return tipoEventoConsulta.consultarEvento();
   }
   
   public int verificarBusquedaTipo(String tipoEvento){
       
       if (tipoEvento.compareTo("Sel. tipo de evento") == 0) {
           JOptionPane.showMessageDialog(null, "Debe de elegir un tipo de evento");
           return -1;
           
       }
       else{
           tipoEventoConsulta = new TipoEventoDAO();
           return tipoEventoConsulta.buscarEvento(tipoEvento);
       }
       
   }
   
   public String veriFicarBuscarEventoPorId(int id){
       tipoEventoConsulta = new TipoEventoDAO();
       return tipoEventoConsulta.buscarEventoPorId(id);
   }
}
