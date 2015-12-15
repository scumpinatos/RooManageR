package entities;

/**
 * Classe che rappresenta l'associazione tra un'Anagrafica e una stanza
 * @author emanuelegargiulo
 */
public class AnagraficaStanza {
    
    private String codiceFiscaleAnagrafica;
    private String numeroStanza;
    private String nomeStruttura;
    private String codiceFiscaleProprietario;
    private int tipo;
    private String ingresso;
    private String uscita;
    private float costo;

    /**
     *
     */
    public AnagraficaStanza() {
    
    }

    /**
     *
     * @return
     */
    public String getCodiceFiscaleAnagrafica() {
        return codiceFiscaleAnagrafica;
    }

    /**
     *
     * @param codiceFiscaleAnagrafica
     */
    public void setCodiceFiscaleAnagrafica(String codiceFiscaleAnagrafica) {
        this.codiceFiscaleAnagrafica = codiceFiscaleAnagrafica;
    }

    /**
     *
     * @return
     */
    public String getNumeroStanza() {
        return numeroStanza;
    }

    /**
     *
     * @param numeroStanza
     */
    public void setNumeroStanza(String numeroStanza) {
        this.numeroStanza = numeroStanza;
    }

    /**
     *
     * @return
     */
    public String getNomeStruttura() {
        return nomeStruttura;
    }

    /**
     *
     * @param nomeStruttura
     */
    public void setNomeStruttura(String nomeStruttura) {
        this.nomeStruttura = nomeStruttura;
    }

    /**
     *
     * @return
     */
    public String getIngresso() {
        return ingresso;
    }

    /**
     *
     * @param ingresso
     */
    public void setIngresso(String ingresso) {
        this.ingresso = ingresso;
    }

    /**
     *
     * @return
     */
    public String getUscita() {
        return uscita;
    }

    /**
     *
     * @param uscita
     */
    public void setUscita(String uscita) {
        this.uscita = uscita;
    }

    /**
     *
     * @return
     */
    public float getCosto() {
        return costo;
    }

    /**
     *
     * @param costo
     */
    public void setCosto(float costo) {
        this.costo = costo;
    }

    /**
     *
     * @return
     */
    public String getCodiceFiscaleProprietario() {
        return codiceFiscaleProprietario;
    }

    /**
     *
     * @param codiceFiscaleProprietario
     */
    public void setCodiceFiscaleProprietario(String codiceFiscaleProprietario) {
        this.codiceFiscaleProprietario = codiceFiscaleProprietario;
    }

    /**
     *
     * @return
     */
    public int getTipo() {
        return tipo;
    }

    /**
     *
     * @param tipo
     */
    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    
}
