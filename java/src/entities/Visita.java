package entities;

/**
 *
 * @author Giandomenico
 */
public class Visita {
    
    private int id;
    private String numerostanza;
    private int idstruttura;
    private String codicefiscaleanagrafica;
    private long ingresso;
    private long uscita;

    public Visita() {
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getCodicefiscaleanagrafica() {
        return codicefiscaleanagrafica;
    }

    public void setCodicefiscaleanagrafica(String codicefiscaleanagrafica) {
        this.codicefiscaleanagrafica = codicefiscaleanagrafica;
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

}
