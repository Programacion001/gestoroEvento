
package vistas.table;
import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;


/**
 * se usa para renderizar la tabla 
 * y de esta manera se a;adan los botones 
 */
public class Render extends DefaultTableCellRenderer{

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value,
        boolean isSelected, boolean hasFocus, int row, int column) {
        
        //para que se agrege el boton
        if (value instanceof JButton){
            JButton btn = (JButton) value;
            return btn; 
        }
        
        return super.getTableCellRendererComponent(table, value,
                isSelected, hasFocus, row, column); //To change body of generated methods, choose Tools | Templates.
    }
    
  
}
