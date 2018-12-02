
package modelo.VO;

/**
 *
 * @author fredd
 */
public class Persona {
private int _Id;
 private String _nombre;
 private String _apellido;
 
 public Persona(){   }

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

    public String getApellido() {
        return _apellido;
    }

    public void setApellido(String _apellido) {
        this._apellido = _apellido;
    }

}
