/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.sql.SQLException;
import modelo.DAO.TipoUsuarioDAO;
import modelo.Logica.LogicaTipoUsuario;
import modelo.VO.TipoUsuarioVO;

/**
 *
 * @author Bill Aponte
 */
public class CoordTipoUsuario {
 LogicaTipoUsuario  LogTipoUsuario; 
 public LogicaTipoUsuario getLogTipoUsuario() {
        return LogTipoUsuario;
    }


public void AgregarTipoUsuario( TipoUsuarioVO tipoUsuario ) throws SQLException{
LogTipoUsuario.validarAgregarTipoUsuario(tipoUsuario);


}

  




}
