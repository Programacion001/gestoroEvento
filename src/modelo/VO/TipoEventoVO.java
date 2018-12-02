/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vo;

/**
 *
 * @author fredd
 */
public class TipoEventoVO {
private int _Id;
private String _tipo;

public TipoEventoVO(int _Id, String _tipo){
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
