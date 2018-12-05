package modelo.Logica;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.VO.PersonaEventoVO;
import modelo.VO.DiaAsistenciaVO;
import modelo.DAO.ReporteDAO;
public class LogicaReporte {
   ReporteDAO reportes;
   
   public ArrayList<PersonaEventoVO> verificarNumPersona() throws SQLException{
    ArrayList<PersonaEventoVO> listareporte = new ArrayList<PersonaEventoVO>();
   
   reportes = new ReporteDAO();
   reportes.numPersonaEvento();
   return null;
}
   
   public ArrayList<PersonaEventoVO> verificarEventoSexo(String dato, int num) throws SQLException{
    reportes = new ReporteDAO();
    reportes.eventoSexo(dato, num);
    
    return null;   }
   
   public ArrayList<DiaAsistenciaVO> verificarDiaMasAsistencia() throws SQLException{
       reportes = new ReporteDAO();
       reportes.diaMayorAsistencia();
    return null;
   }
}
