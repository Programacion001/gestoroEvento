/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vo;

public class InvitacionVO {
private int _id;
private InvitadoVO _invitado;
private EventoVO _Evento;
private String _Status;

public InvitacionVO(int _id, InvitadoVO _invitado, EventoVO _Evento, String _status){
    this._id = _id;
    this._invitado = _invitado;
    this._Evento = _Evento;
    this._Status = _status;
}

    public int getId() {
        return _id;
    }

    public void setId(int _id) {
        this._id = _id;
    }

    public InvitadoVO getInvitado() {
        return _invitado;
    }

    public void setInvitado(InvitadoVO _invitado) {
        this._invitado = _invitado;
    }

    public EventoVO getEvento() {
        return _Evento;
    }

    public void setEvento(EventoVO _Evento) {
        this._Evento = _Evento;
    }

    public String getStatus() {
        return _Status;
    }

    public void setStatus(String _Status) {
        this._Status = _Status;
    }

}
