
package modelo.Logica;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.DAO.InvitadoDAO;
import modelo.VO.InvitadoVO;

public class LogicaInvitado {
    InvitadoDAO consultaInvitado;
    
   public void verificarRegistrarInvitado (InvitadoVO invitado){
       if (invitado.getApellido().compareTo("") == 0 || 
               invitado.getSexo().compareTo("") == 0 || 
               invitado.getDireccion().compareTo("") == 0 ||
               invitado.getNombre().compareTo("") == 0 ||
               invitado.getEmail().compareTo("") == 0 ||
               invitado.getTelefono().compareTo("") == 0) {
           JOptionPane.showMessageDialog(null,"Debe de llenar todos los campos","Advertencia",JOptionPane.WARNING_MESSAGE);      
       }else{
            consultaInvitado = new InvitadoDAO();
            consultaInvitado.RegistrarInvitado(invitado);
       }
   }
   
   public  ArrayList<InvitadoVO> listaInvitado(){
       consultaInvitado = new InvitadoDAO();
        return consultaInvitado.listaInvitado();
       
   }
   
   public InvitadoVO verificarInfoInvitado(int id){
       consultaInvitado = new InvitadoDAO();
       return consultaInvitado.infoInvitado(id);
   }
   
   public void verificarModificarInvitado(InvitadoVO invitado){
        if (invitado.getApellido().compareTo("") == 0 || 
               invitado.getSexo().compareTo("") == 0 || 
               invitado.getDireccion().compareTo("") == 0 ||
               invitado.getNombre().compareTo("") == 0 ||
               invitado.getEmail().compareTo("") == 0 ||
               invitado.getTelefono().compareTo("") == 0) {
           JOptionPane.showMessageDialog(null,"Debe de llenar todos los campos","Advertencia",JOptionPane.WARNING_MESSAGE);      
       }
        else{
            consultaInvitado = new InvitadoDAO();
            consultaInvitado.modificarInvitado(invitado);
       }
   }
   public void verificarEliminarInvitado(int id){
       consultaInvitado = new InvitadoDAO();
       consultaInvitado.EliminarInvitado(id);
   }
}
