/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.Logica;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelo.VO.InvitadoVO;
import modelo.VO.EventoVO;
import modelo.DAO.InvitacionDAO;
import modelo.VO.InvitacionVO;
public class LogicaInvitacion {
        InvitacionDAO invDAO;
    public void validarInvitacion(EventoVO evento,InvitadoVO invitado) throws SQLException{
        if(invitado.getId()>0 && evento.getId()>0){
            invDAO = new InvitacionDAO();
            invDAO.registrarInvitacion(evento, invitado);
        }else{	
    JOptionPane.showMessageDialog(null,"No se pudo invitar a esta persona","Advertencia",JOptionPane.WARNING_MESSAGE);
        }
    }
    
    
    public InvitacionVO validarBuscarInvitacion(EventoVO evento,InvitadoVO invitado) throws SQLException{
    boolean filtroInvitacion = false;
        try{
         if (evento.getId()>0 && invitado.getId()>0){
             invDAO = new InvitacionDAO();
             filtroInvitacion = true;
             return invDAO.buscarInvitacion(evento, invitado);
         }else{
	filtroInvitacion=false;}}
    catch (Exception e) {
			JOptionPane.showMessageDialog(null,"Se ha presentado un Error","Error",JOptionPane.ERROR_MESSAGE);
			filtroInvitacion=false;
    }return null;
	}
    
    public void validarModificarStatusInvitacion(EventoVO evento, InvitadoVO invitado,String status) throws SQLException{
        boolean modificaInvitacion = false;
        if(status.equalsIgnoreCase("Ausente") || status.equalsIgnoreCase("Presente")){
            invDAO = new InvitacionDAO();
            invDAO.modificarInvitacionStatus(evento, invitado, status);
            modificaInvitacion = true;
        }else{
            modificaInvitacion = false;
	JOptionPane.showMessageDialog(null,"El status debe ser Ausente o Presente","Advertencia",JOptionPane.WARNING_MESSAGE); }    
    }
    
    public void validarEliminarInvitacion(EventoVO evento,InvitadoVO invitado) throws SQLException{
        invDAO = new InvitacionDAO();
        invDAO.eliminarInvitacion(evento, invitado);   
    }
    
    public void validadListaInvitacion(InvitacionVO invitacion){
        invDAO = new InvitacionDAO();
        invDAO.listaInvitaciones(invitacion);
    }
    }

