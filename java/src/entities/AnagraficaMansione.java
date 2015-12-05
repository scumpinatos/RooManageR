
package entities;


public class AnagraficaMansione {
    
    private String codiceFiscaleAnagrafica;
    private String password;
    private String nomeStruttura;
    private String codiceFiscaleProprietario;
    private int tipoMansione;


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

    public String getNomeStruttura() {
        return nomeStruttura;
    }

    public void setNomeStruttura(String nomeStruttura) {
        this.nomeStruttura = nomeStruttura;
    }

    public int getTipoMansione() {
        return tipoMansione;
    }

    public void setTipoMansione(int tipoMansione) {
        this.tipoMansione = tipoMansione;
    }

    public String getCodiceFiscaleProprietario() {
        return codiceFiscaleProprietario;
    }

    public void setCodiceFiscaleProprietario(String codiceFiscaleProprietario) {
        this.codiceFiscaleProprietario = codiceFiscaleProprietario;
    }
    
}
