/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class EventoVO {
private int _Id;
private String _nombre;
private Date _Fecha;
private String _Ubicacion;
private String _Status;
private TipoEventoVO _Tipo;
static SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");

public EventoVO(int _Id, String _nombre, String _fch, String _Ubicacion, String _Status, TipoEventoVO _Tipo) throws ParseException{
    this._Id = _Id;
    this._nombre = _nombre;
    this._Fecha = formato.parse(_fch);
    this._Ubicacion = _Ubicacion;
    this._Status = _Status;
    this._Tipo = _Tipo;
    
}

    public int getId() {
        return _Id;
    }

    public void setId(int _Id) {
        this._Id = _Id;
    }

    public String getNombre() {
        return _nombre;
    }

    public void setNombre(String _nombre) {
        this._nombre = _nombre;
    }

    public Date getFecha() {
        return _Fecha;
    }

    public void setFecha(Date _Fecha) {
        this._Fecha = _Fecha;
    }

    public String getUbicacion() {
        return _Ubicacion;
    }

    public void setUbicacion(String _Ubicacion) {
        this._Ubicacion = _Ubicacion;
    }

    public String getStatus() {
        return _Status;
    }

    public void setStatus(String _Status) {
        this._Status = _Status;
    }

    public TipoEventoVO getTipo() {
        return _Tipo;
    }

    public void setTipo(TipoEventoVO _Tipo) {
        this._Tipo = _Tipo;
    }

    public static SimpleDateFormat getFormato() {
        return formato;
    }

    public static void setFormato(SimpleDateFormat formato) {
        EventoVO.formato = formato;
    }

}
