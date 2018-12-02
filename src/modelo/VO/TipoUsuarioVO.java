
package vo;

public class TipoUsuarioVO {
private int _Id;
private String _tipo;
public TipoUsuarioVO(int _id, String _tipo){
    this._Id = _Id;
    this._tipo = _tipo;
}

    public int getId() {
        return _Id;
    }

    public void setId(int _Id) {
        this._Id = _Id;
    }

    public String getTipo() {
        return _tipo;
    }

    public void setTipo(String _tipo) {
        this._tipo = _tipo;
    }

}
