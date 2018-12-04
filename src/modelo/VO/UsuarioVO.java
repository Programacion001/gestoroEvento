
package modelo.VO;

public class UsuarioVO extends Persona {
private String _nomUser;
private String _password;
private TipoUsuarioVO _tipo;
private String tipoUsuario;
private int intTipoUsuario;

    public int getIntTipoUsuario() {
        return intTipoUsuario;
    }

    public void setIntTipoUsuario(int intTipoUsuario) {
        this.intTipoUsuario = intTipoUsuario;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public UsuarioVO(){}

    public String getNomUser() {
        return _nomUser;
    }

    public void setNomUser(String _nomUser) {
        this._nomUser = _nomUser;
    }

    public String getPassword() {
        return _password;
    }

    public void setPassword(String _password) {
        this._password = _password;
    }

    public TipoUsuarioVO getTipo() {
        return _tipo;
    }

    public void setTipo(TipoUsuarioVO _tipo) {
        this._tipo = _tipo;
    }

}
