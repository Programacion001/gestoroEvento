
package modelo.DAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import modelo.VO.PersonaEventoVO;
import modelo.VO.DiaAsistenciaVO;
import modelo.conexion.Conexion;


public class ReporteDAO {
    Connection con = Conexion.getConnection();
    
    //REPORTE DE TOTAL PERSONAS ASISTIDAS
    public ArrayList<PersonaEventoVO> numPersonaEvento() throws SQLException{
        ArrayList<PersonaEventoVO> listaReporte = new ArrayList<PersonaEventoVO>();
        PersonaEventoVO reportes = null;
        try{
    PreparedStatement consulta = con.prepareStatement("select E.id_evento, E.Nombre,E.Tipo_Evento, E.Fecha, Count(I.id_evento)'Cantidad', tp.tipo from asisten I \n" +
        "inner join evento E \n" +
        "on I.id_evento  = E.id_evento \n" +
        "inner join tipo_evento tp \n" +
        "on  E.Tipo_Evento = tp.id_Tipo\n" +
        "where I.status = 'Presente'\n" +
        "Group by I.id_evento");
      ResultSet response = consulta.executeQuery();
        while(response.next()){
        int idevento = response.getInt(1);
        String nombre = response.getString(2);
        int tipoevento = response.getInt(3);
        Date fecha = response.getDate(4);
        int cantidad = response.getInt(5);
        String tipoEventoString = response.getString(6);
        reportes = new PersonaEventoVO(idevento,nombre,fecha,tipoevento,cantidad,tipoEventoString);
        listaReporte.add(reportes);        
    }
        response.close();
  }catch(SQLException e){
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "Error 402 de consulta");       
        }
    return listaReporte;
    }
//// REPORTE POR SEXO 
    public ArrayList<PersonaEventoVO> eventoSexo(int num) throws SQLException{
        ArrayList<PersonaEventoVO> listaReporte = new ArrayList<PersonaEventoVO>();
      
        try{
            PreparedStatement consulta = con.prepareStatement("select E.id_evento, E.Nombre,E.Tipo_Evento, E.Fecha,count(case when inv.sexo = 'F' then 1 else null end) Mujeres,\n" +
            "count(case when inv.sexo = 'M' then 1 else null end) Hombres,count(i.id_evento)Total, tp.tipo from asisten I left join \n" +
            "invitados inv on inv.id_invitados = i.id_invitado inner join evento E on e.id_evento = i.id_evento inner join tipo_evento tp\n" +
            "on E.tipo_evento = tp.id_tipo\n" +
            "where I.status = 'Presente' group by i.id_evento ");
        ResultSet response = consulta.executeQuery();
        while(response.next()){
                PersonaEventoVO reportes = new PersonaEventoVO(); 
         
                reportes.setId(response.getInt(1));
                reportes.setNombre(response.getString(2));
                reportes.setTipo(response.getInt(3));
                reportes.setFecha(response.getDate(4));
                reportes.setCantidadPersona(response.getInt(7));
                reportes.setMujeres(response.getInt(5));
                reportes.setHombres(response.getInt(6));
                reportes.setTipoEvento(response.getString(8));
                listaReporte.add(reportes);       
               
                
          
        }response.close();}
        catch(SQLException e){
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "Error 402 de consulta");    
        }
        System.out.println(listaReporte);
        return listaReporte;
    }
    
    //////// REPORTE POR DIA  Y PORCIENTO
    public ArrayList<DiaAsistenciaVO> diaMayorAsistencia() throws SQLException{
       ArrayList<DiaAsistenciaVO> listDiaMasAsistencia = new ArrayList<DiaAsistenciaVO>();
        DiaAsistenciaVO diaAsistencia = null;  
        int total = 0;
        float porciento = 0;
        try{
            PreparedStatement consulta = con.prepareStatement("select E.id_evento, E.Nombre,E.Tipo_Evento,(ELT(WEEKDAY(fecha) + 1, 'Lunes', 'Martes', 'Miercoles', 'Jueves', 'Viernes', 'Sabado', 'Domingo')) Dia, Count(I.id_evento)'Cantidad'from asisten I inner join\n" +
"Evento E on i.id_evento = e.id_evento left join invitados inv on inv.id_invitados = i.id_invitado\n" +
"group by e.fecha;");
            PreparedStatement consultaTotal = con.prepareStatement("select SUM(Cantidad) 'Total'\n" +
"FROM (select E.id_evento as ID, E.Nombre as Nombre,E.Tipo_Evento as Tipo,(ELT(WEEKDAY(fecha) + 1, 'Lunes', 'Martes', 'Miercoles', 'Jueves', 'Viernes', 'Sabado', 'Domingo'))as Dia, Count(I.id_evento) As Cantidad from asisten I inner join\n" +
"Evento E on i.id_evento = e.id_evento left join invitados inv on inv.id_invitados = i.id_invitado\n" +
"group by e.fecha) as Total;");
     ResultSet totalrp = consultaTotal.executeQuery();
        ResultSet response = consulta.executeQuery();
        while(response.next()){
        String fecha = response.getString(4);
        int cantidad = response.getInt(5);
        while(totalrp.next()){ 
        total = totalrp.getInt(1);}
        porciento = ((float)cantidad/total*100);
        
        diaAsistencia = new DiaAsistenciaVO(fecha,cantidad,porciento);
        listDiaMasAsistencia.add(diaAsistencia);         
        }response.close();}
        catch(SQLException e){
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "Error 403: Favor contacte al desarrollador");    
        }                       
        return listDiaMasAsistencia;
    }
}