
package vo;

public class DiaAsistenciaVO {
private int _Id;
private String _dia;
private int _cantidad;

public DiaAsistenciaVO(int _Id, String _dia, int _cantidad){
    this._Id = _Id;
    this._dia = _dia;
    this._cantidad = _cantidad;
}

    public int getId() {
        return _Id;
    }

    public void setId(int _Id) {
        this._Id = _Id;
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
