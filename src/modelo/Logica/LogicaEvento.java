
package modelo.Logica;

import controlador.CoordEvento;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import modelo.DAO.EventoDAO;
import modelo.VO.EventoVO;

public class LogicaEvento {
    private EventoDAO consultaEvento;
    private CoordEvento coordEvento;
   
    public void setCoordinador(CoordEvento coordLogin) {
       this.coordEvento = coordLogin;	
    }
    
    public void validarAgregarEvento(EventoVO evento){
        
        if(evento.getNombre().compareTo("") == 0 || evento.getHora().compareTo("") == 0 ||
            evento.getFecha().compareTo(new Date(4))  == 0  || evento.getUbicacion().compareTo("") == 0
               ){
            JOptionPane.showMessageDialog(null,"Debe de llenar todos los campos","Advertencia",JOptionPane.WARNING_MESSAGE);      
        }else{
           
            consultaEvento = new EventoDAO();
            consultaEvento.crearEvento(evento);
        }
    }
    
    public ArrayList<EventoVO> validarListaEventos(){
        
        consultaEvento = new EventoDAO();
        return consultaEvento.listaEventos();
         
    }
    public ArrayList<EventoVO> validarListaEventosActuales(){
        
        Date fechaActual = new Date(System.currentTimeMillis());
        SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
        String fechaHoy = formatoFecha.format(fechaActual);
        
        consultaEvento = new EventoDAO();
        ArrayList<EventoVO> eventosCansulta = consultaEvento.listaEventos();
        ArrayList<EventoVO> eventos = new ArrayList<EventoVO>();
        
        for (int i = 0; i < eventosCansulta.size(); i++) {
            if(eventosCansulta.get(i).getFecha().toString().compareTo(fechaHoy) == 0 &&
                    eventosCansulta.get(i).getStatus().compareTo("Proximamente") == 0){
                eventos.add(eventosCansulta.get(i));
            }
        }
        if(eventos.size() == 0){
            JOptionPane.showMessageDialog(null, "No hay evento para el día de hoy :)","Información",JOptionPane.INFORMATION_MESSAGE);
        }
        return eventos;
    }
    
     public ArrayList<EventoVO> validarListaEventosFiltrado(String status){
               consultaEvento = new EventoDAO();
        return consultaEvento.listaEventosFiltrado(status);
         
    }
     
     public EventoVO validarInfoEvento(int id){
        consultaEvento = new EventoDAO();
        return consultaEvento.InfoEvento(id);
     }
     public void validarModificar(EventoVO evento){
         if (evento.getId() > 0) {
              consultaEvento = new EventoDAO();
         consultaEvento.modificar(evento);
         }
        
     }
     
    public void verificarEliminarEvento(int id){
         consultaEvento = new EventoDAO();
         consultaEvento.eliminarEvento(id);
    }
    
    
}
