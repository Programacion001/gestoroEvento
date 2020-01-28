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
        reportes = new ReporteDAO();
        return reportes.numPersonaEvento();
    }
   
   public ArrayList<PersonaEventoVO> verificarEventoSexo(int num) throws SQLException{
        reportes = new ReporteDAO();
        return reportes.eventoSexo(num);
    }
   
   public ArrayList<DiaAsistenciaVO> verificarDiaMasAsistencia() throws SQLException{
       reportes = new ReporteDAO();
        return reportes.diaMayorAsistencia();
   }
}
