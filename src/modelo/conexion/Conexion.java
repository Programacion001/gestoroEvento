
package modelo.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {
  private  String driver;
  private  String url;
  private  String usuario;
  private  String password;
  private  static Connection con;
  
  
 public Conexion(){
  driver = "com.mysql.cj.jdbc.Driver";
  url = "jdbc:mysql://127.0.1/gestorevento";
  usuario= "root";
  password= "123456";
    try{
        // NOMBRE DEL DRIVER
        Class.forName(driver);
        // REALIZAR CONEXION
        con = (Connection) DriverManager.getConnection(url,usuario, password);
//        JOptionPane.showMessageDialog(null, "Conectado la base de datos ");    
        
    }catch(ClassNotFoundException | SQLException e){
        e.printStackTrace();
    }
  }
  
 public static Connection getConnection()
 {
     if (con == null){
         new Conexion();
     }
     return con;
 }  
 

}
