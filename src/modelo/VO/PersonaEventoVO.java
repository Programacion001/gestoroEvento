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
public PersonaEventoVO(){} 
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
