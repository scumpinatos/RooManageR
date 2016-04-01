
package entities;

/**
 * Classe che implementa l'entità Stanza
 * @author emanuelegargiulo
 * @author giandomenicoizzo
 */
public class Stanza {
    
    private String numero;
    private String nomeStruttura;
    private String codiceFiscaleProprietario;
    private int tipo;
    private String descrizione;
    private float mq;
    private int agibile;
    private int permanenza;
    private int visita;

    /**
     * Costruttore della classe vuoto 
     * Inizializza agibile = 1, permanenza = 0, visita = 0
     */
    public Stanza() {
        agibile = 1;
        permanenza = 0;
        visita = 0;
    }

    /**
     * Restituisce il nome della struttura in cui si trova la stanza
     * @return nome struttura
     */
    public String getNomeStruttura() {
        return nomeStruttura;
    }

    /**
     * Setta il nome della struttura in cui si trova la stanza
     * @param nomeStruttura
     */
    public void setNomeStruttura(String nomeStruttura) {
        this.nomeStruttura = nomeStruttura;
    }

    /**
     * Restituisce il numero che indica la stanza
     * @return numero stanza
     */
    public String getNumero() {
        return numero;
    }

    /**
     * Setta il numero che indica la stanza
     * @param numero
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }

    /**
     * Restituisce il tipo della stanza
     * @return tipo
     */
    public int getTipo() {
        return tipo;
    }

    /**
     * Setta il tipo della stanza
     * @param tipo
     */
    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    /**
     * Restituisce la descrizione della stanza
     * @return
     */
    public String getDescrizione() {
        return descrizione;
    }

    /**
     * Setta la descrizione della stanza
     * @param descrizione
     */
    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    /**
     * Restituisce i metri quadrati della stanza
     * @return metri quadrati
     */
    public float getMq() {
        return mq;
    }

    /**
     * Setta i metri quadrati della stanza
     * @param mq
     */
    public void setMq(float mq) {
        this.mq = mq;
    }

    /**
     * Restituisce un intero che indica se la stanza è agibile oppure no
     * @return agibile
     */
    public int getAgibile() {
        return agibile;
    }

    /**
     * Setta un intero che indica se la stanza è agibile oppure no
     * @param agibile
     */
    public void setAgibile(int agibile) {
        this.agibile = agibile;
    }

    /**
     * Restituisce un intero che indica se nella stanza vi è una permanenza oppure no
     * @return permanenza
     */
    public int getPermanenza() {
        return permanenza;
    }

    /**
     * Setta un intero che indica se nella stanza vi è una permanenza oppure no
     * @param permanenza
     */
    public void setPermanenza(int permanenza) {
        this.permanenza = permanenza;
    }

    /**
     * Restituisce un intero che indica se nella stanza vi è una visita oppure no
     * @return visita
     */
    public int getVisita() {
        return visita;
    }

     /**
     * Setta un intero che indica se nella stanza vi è una visita oppure no
     * @param visita
     */
    public void setVisita(int visita) {
        this.visita = visita;
    }
    
    /**
     * Restitusce il codice fiscale del proprietario della struttura
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

}
