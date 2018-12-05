
package modelo.VO;

import java.util.Date;

public class DiaAsistenciaVO {

private String _dia;
private int _cantidad;
private float _porciento;

public DiaAsistenciaVO(){}
public DiaAsistenciaVO(String dia, int cantidad,float porciento){
    this._porciento = porciento;
    this._dia = dia;
    this._cantidad = cantidad;
}

    public float getPorciento() {
        return _porciento;
    }

    public void setPorciento(float _porciento) {
        this._porciento = _porciento;
    }



    public String getDia() {
        return _dia;
    }

    public void setDia(String _dia) {
        this._dia = _dia;
    }

    public int getCantidad() {
        return _cantidad;
    }

    public void setCantidad(int _cantidad) {
        this._cantidad = _cantidad;
    }

}
