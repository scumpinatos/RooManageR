package entities;


public class Visita {
    
    private String numerostanza;
    private String nomeStruttura;
    private String codiceFiscaleProprietario;
    private String codiceFiscaleAnagrafica;
    private String ingresso;
    private String uscita;

    public Visita() {
        
    }

    public String getNumerostanza() {
        return numerostanza;
    }

    public void setNumerostanza(String numerostanza) {
        this.numerostanza = numerostanza;
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
