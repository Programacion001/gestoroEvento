/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.VO;

/**
 *
 * @author fredd
 */
public class InvitadoVO extends Persona {
private String _direccion;
private String _telefono;
private String _sexo;
private String _email;

public InvitadoVO(){}

    public String getDireccion() {
        return _direccion;
    }

    public void setDireccion(String _direccion) {
        this._direccion = _direccion;
    }

    public String getTelefono() {
        return _telefono;
    }

    public void setTelefono(String _telefono) {
        this._telefono = _telefono;
    }

    public String getSexo() {
        return _sexo;
    }

    public void setSexo(String _sexo) {
        this._sexo = _sexo;
    }

    public String getEmail() {
        return _email;
    }

    public void setEmail(String _email) {
        this._email = _email;
    }

}
