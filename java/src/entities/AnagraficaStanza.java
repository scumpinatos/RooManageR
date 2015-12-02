package entities;

/**
 *
 * @author Giandomenico
 */
public class AnagraficaStanza {
    
    private String codicefiscaleanagrafica;
    private String numerostanza;
    private int idstruttura;
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

    public int getIdstruttura() {
        return idstruttura;
    }

    public void setIdstruttura(int idstruttura) {
        this.idstruttura = idstruttura;
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
