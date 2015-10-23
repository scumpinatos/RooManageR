package entities;

/**
 *
 * @author Giandomenico
 */
public class AnagraficaStanza {
    
    private String codicefiscaleanagrafica;
    private String numerostanza;
    private int idstruttura;
    private long ingresso;
    private long uscita;
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

    public long getIngresso() {
        return ingresso;
    }

    public void setIngresso(long ingresso) {
        this.ingresso = ingresso;
    }

    public long getUscita() {
        return uscita;
    }

    public void setUscita(long uscita) {
        this.uscita = uscita;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }
    
    
}
