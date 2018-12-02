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
public class TipoEventoVO {
private int _Id;
private String _tipo;

public TipoEventoVO(){}

   
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

    @Override
    public String toString() {
        return _tipo;
    }
    
    

}
