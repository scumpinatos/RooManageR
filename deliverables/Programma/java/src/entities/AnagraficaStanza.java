package entities;

/**
 * Classe che implementa l'associazione fra l'entità Anagrafica e l'entità Stanza
 * @author emanuelegargiulo
 * @author giandomenicoizzo
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
     * Costruttore vuoto
     */
    public AnagraficaStanza() {
    
    }

    /**
     * Restituisce il codice fiscale dell'anagrafica che occupa o che visita la stanza
     * @return codice fiscale
     */
    public String getCodiceFiscaleAnagrafica() {
        return codiceFiscaleAnagrafica;
    }

    /**
     * Setta il codice fiscale dell'anagrafica che occupa o che visita la stanza
     * @param codiceFiscaleAnagrafica
     */
    public void setCodiceFiscaleAnagrafica(String codiceFiscaleAnagrafica) {
        this.codiceFiscaleAnagrafica = codiceFiscaleAnagrafica;
    }

    /**
     * Restituisce il numero della stanza
     * @return numero stanza
     */
    public String getNumeroStanza() {
        return numeroStanza;
    }

    /**
     * Setta il numero della stanza
     * @param numeroStanza
     */
    public void setNumeroStanza(String numeroStanza) {
        this.numeroStanza = numeroStanza;
    }

    /**
     * Restituisce il nome della struttura a cui appartiene la stanza
     * @return nome struttura
     */
    public String getNomeStruttura() {
        return nomeStruttura;
    }

    /**
     * Setta il nome della struttura a cui appartiene la stanza
     * @param nomeStruttura
     */
    public void setNomeStruttura(String nomeStruttura) {
        this.nomeStruttura = nomeStruttura;
    }

    /**
     * Restituisce la data e l'ora di inizio della permanenza o della visita
     * @return data e ora ingresso
     */
    public String getIngresso() {
        return ingresso;
    }

    /**
     * Setta la data e l'ora di inizio della permanenza o della visita
     * @param ingresso
     */
    public void setIngresso(String ingresso) {
        this.ingresso = ingresso;
    }

    /**
     * Restituisce la data e l'ora di fine della permanenza o della visita
     * @return data e ora uscita
     */
    public String getUscita() {
        return uscita;
    }

    /**
     * Setta la data e l'ora di fine della permanenza o della visita
     * @param uscita
     */
    public void setUscita(String uscita) {
        this.uscita = uscita;
    }

    /**
     * Restituisce l'importo pagato dal cliente per la permanenza
     * @return costo
     */
    public float getCosto() {
        return costo;
    }

    /**
     * Setta l'importo pagato dal cliente per la permanenza
     * @param costo
     */
    public void setCosto(float costo) {
        this.costo = costo;
    }

    /**
     * Restituisce il codice fiscale del proprietario della struttura
     * @return codice fiscale proprietario
     */
    public String getCodiceFiscaleProprietario() {
        return codiceFiscaleProprietario;
    }

    /**
     * Setta il codice fiscale del proprietario della struttura
     * @param codiceFiscaleProprietario
     */
    public void setCodiceFiscaleProprietario(String codiceFiscaleProprietario) {
        this.codiceFiscaleProprietario = codiceFiscaleProprietario;
    }

    /**
     * Restituisce un intero che indica se è una permanenza o una visita
     * @return tipo
     */
    public int getTipo() {
        return tipo;
    }

    /**
     * Setta se è una permanenza o una visita
     * @param tipo
     */
    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    
}
