package entities;


public class Visita {
    
    private String numeroStanza;
    private String nomeStruttura;
    private String codiceFiscaleProprietario;
    private String codiceFiscaleAnagrafica;
    private String ingresso;
    private String uscita;

    public Visita() {
        
    }

    public String getNumeroStanza() {
        return numeroStanza;
    }

    public void setNumeroStanza(String numeroStanza) {
        this.numeroStanza = numeroStanza;
    }

    public String getNomeStruttura() {
        return nomeStruttura;
    }

    public void setNomeStruttura(String nomeStruttura) {
        this.nomeStruttura = nomeStruttura;
    }

    public String getCodiceFiscaleProprietario() {
        return codiceFiscaleProprietario;
    }

    public void setCodiceFiscaleProprietario(String codiceFiscaleProprietario) {
        this.codiceFiscaleProprietario = codiceFiscaleProprietario;
    }

    public String getCodiceFiscaleAnagrafica() {
        return codiceFiscaleAnagrafica;
    }

    public void setCodiceFiscaleAnagrafica(String codiceFiscaleAnagrafica) {
        this.codiceFiscaleAnagrafica = codiceFiscaleAnagrafica;
    }

    public String getIngresso() {
        return ingresso;
    }

    public void setIngresso(String ingresso) {
        this.ingresso = ingresso;
    }

    public String getUscita() {
        return uscita;
    }

    public void setUscita(String uscita) {
        this.uscita = uscita;
    }

}
