/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.Logica;

import controlador.CoordTipoUsuario;
import java.sql.SQLException;
import javax.swing.JOptionPane;

import modelo.DAO.TipoUsuarioDAO;
import modelo.VO.TipoUsuarioVO;

/**
 *
 * @author Bill Aponte
 */
public class LogicaTipoUsuario {
private CoordTipoUsuario coordUsuario;
private TipoUsuarioDAO tipoUsuario;

    public void setCoordUsuario(CoordTipoUsuario coordUsuario) {
        this.coordUsuario = coordUsuario;
    }
 public void validarAgregarTipoUsuario(TipoUsuarioVO tipo)throws SQLException{

if(tipo.getTipo().compareTo("")==0)   {
JOptionPane.showMessageDialog(null, "Debe de completar llenar el campo");
} 
else{
tipoUsuario = new TipoUsuarioDAO();
tipoUsuario.AgregarTipoUsuario(tipo);

}
 }

   
    }

   

