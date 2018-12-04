
package modelo.Logica;

import controlador.CoordTipoEvento;
import controlador.CoordTipoUsuario;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.DAO.TipoUsuarioDAO;
import modelo.VO.TipoUsuarioVO;


public class LogicaTipoUsuario {
    private CoordTipoUsuario coordTipoUsuario;
    private TipoUsuarioDAO tipoUsuarioConsulta;
    
    public void setCoordTipoUsuario(CoordTipoEvento coordTipoEvento) {
        this.coordTipoUsuario = coordTipoUsuario;
    }
    
    public void validarAgregarTipoEvento(TipoUsuarioVO tipoUsuario){

        if(tipoUsuario.getTipo().compareTo("") == 0){
            JOptionPane.showMessageDialog(null, "Debe de llenar el campo");
        }
        else{
            tipoUsuarioConsulta = new TipoUsuarioDAO();
            tipoUsuarioConsulta.AgregarTipoUsuario(tipoUsuario);
        }
    }
    
   public ArrayList<TipoUsuarioVO> validarConsultaTipoUsuario(){
      
       tipoUsuarioConsulta = new TipoUsuarioDAO();
       return tipoUsuarioConsulta.consultarTipoUsuario();
   }
   
     public int verificarBusquedaTipo(String tipoUsuario){
       
       if (tipoUsuario.compareTo("Sel. tipo de evento") == 0) {
           JOptionPane.showMessageDialog(null, "Debe de elegir un tipo de evento");
           return -1;
           
       }
       else{
           tipoUsuarioConsulta = new TipoUsuarioDAO();
           return tipoUsuarioConsulta.buscarEvento(tipoUsuario);
       }
       
   }
   
//   public int verificarBusquedaTipo(String tipoEvento){
//       
//       if (tipoEvento.compareTo("Sel. tipo de evento") == 0) {
//           JOptionPane.showMessageDialog(null, "Debe de elegir un tipo de evento");
//           return -1;
//           
//       }
//       else{
//           tipoEventoConsulta = new TipoEventoDAO();
//           return tipoEventoConsulta.buscarEvento(tipoEvento);
//       }
//       
//   }
   
//   public String veriFicarBuscarEventoPorId(int id){
//       tipoEventoConsulta = new TipoEventoDAO();
//       return tipoEventoConsulta.buscarEventoPorId(id);
//   }
}
