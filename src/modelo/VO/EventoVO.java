/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.VO;



import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.sql.Date;

public class EventoVO {
    
private int _Id;
private String _nombre;
private Date _Fecha;
private String _Ubicacion;
private String _Status;
private int _Tipo;
private int _IdUsuario;
private String hora;
private String _tipoEvento;

    public String getTipoEvento() {
        return _tipoEvento;
    }

    public void setTipoEvento(String _tipoEvento) {
        this._tipoEvento = _tipoEvento;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

  
static SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");


public EventoVO(){}

  public int getIdUsuario() {
        return _IdUsuario;
    }

    public void setIdUsuario(int _IdUsuario) {
        this._IdUsuario = _IdUsuario;
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

    public int getTipo() {
        return _Tipo;
    }

    public void setTipo(int _Tipo) {
        this._Tipo = _Tipo;
    }

    public static SimpleDateFormat getFormato() {
        return formato;
    }

    public static void setFormato(SimpleDateFormat formato) {
        EventoVO.formato = formato;
    }

}
