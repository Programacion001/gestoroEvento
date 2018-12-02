
package vo;

public class UsuarioVO extends Persona {
private String _nomUser;
private String _password;
private TipoUsuarioVO _tipo;

public UsuarioVO(String _nomUser, String _password, TipoUsuarioVO _tipo){
    this._nomUser = _nomUser;
    this._password = _password;
    this._tipo = _tipo;
    
}

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
