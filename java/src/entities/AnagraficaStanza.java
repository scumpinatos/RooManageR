package entities;


public class AnagraficaStanza {
    
    private String codicefiscaleanagrafica;
    private String numerostanza;
    private String nomeStruttura;
    private String ingresso;
    private String uscita;
    private float costo;

    public AnagraficaStanza() {
    
    }

    public String getCodicefiscaleanagrafica() {
        return codicefiscaleanagrafica;
    }

    public void setCodicefiscaleanagrafica(String codicefiscaleanagrafica) {
        this.codicefiscaleanagrafica = codicefiscaleanagrafica;
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

    

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }
    
    
}
