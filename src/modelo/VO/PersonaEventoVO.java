package modelo.VO;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class PersonaEventoVO {
private int _Id;
private String _nombre;
private Date _fecha;
private int _cantidadPersona;
static SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");

public PersonaEventoVO(){} 

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
