package modelo.VO;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class PersonaEventoVO {
private int _Id;
private String _nombre;
private Date _fecha;
private int _cantidadPersona;
private int _tipo;
private String _tipoEvento;
private int mujeres;
private int hombres; 

    public int getMujeres() {
        return mujeres;
    }

    public void setMujeres(int mujeres) {
        this.mujeres = mujeres;
    }

    public int getHombres() {
        return hombres;
    }

    public void setHombres(int hombres) {
        this.hombres = hombres;
    }


    public PersonaEventoVO(){}
    public PersonaEventoVO(int _Id, String _nombre, Date _fecha, int _cantidadPersona, int _tipo, String _tipoEvento) {
        this._Id = _Id;
        this._nombre = _nombre;
        this._fecha = _fecha;
        this._cantidadPersona = _cantidadPersona;
        this._tipo = _tipo;
        this._tipoEvento = _tipoEvento;
    }

    public String getTipoEvento() {
        return _tipoEvento;
    }

    public void setTipoEvento(String _tipoEvento) {
        this._tipoEvento = _tipoEvento;
    }

public PersonaEventoVO(int idevento,String nombre,int tipoevento, Date fecha,int cantidad){
    this._Id = idevento;
    this._nombre = nombre;
    this._fecha = fecha;
    this._tipo = tipoevento;
    this._cantidadPersona = cantidad;
}

    public int getId() {
        return _Id;
    }

    public int getTipo() {
        return _tipo;
    }

    public void setTipo(int _tipo) {
        this._tipo = _tipo;
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
        return _fecha;
    }

    public void setFecha(Date _fecha) {
        this._fecha = _fecha;
    }

    public int getCantidadPersona() {
        return _cantidadPersona;
    }

    public void setCantidadPersona(int _cantidadPersona) {
        this._cantidadPersona = _cantidadPersona;
    }
    
}
