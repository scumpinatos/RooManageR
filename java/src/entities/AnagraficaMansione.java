/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author giandomenico
 */
public class AnagraficaMansione {
    
    private int id;
    private String codiceFiscaleAnagrafica;
    private String password;
    private int idStruttura;
    private int tipoMansione;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodiceFiscaleAnagrafica() {
        return codiceFiscaleAnagrafica;
    }

    public void setCodiceFiscaleAnagrafica(String codiceFiscaleAnagrafica) {
        this.codiceFiscaleAnagrafica = codiceFiscaleAnagrafica;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getIdStruttura() {
        return idStruttura;
    }

    public void setIdStruttura(int idStruttura) {
        this.idStruttura = idStruttura;
    }

    public int getTipoMansione() {
        return tipoMansione;
    }

    public void setTipoMansione(int tipoMansione) {
        this.tipoMansione = tipoMansione;
    }
    
}
