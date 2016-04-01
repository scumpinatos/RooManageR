
package entities;

/**
 * Classe che implementa l'entità Struttura
 * @author emanuelegargiulo
 * @author giandomenicoizzo
 */
public class Struttura {
 
    private String nome;
    private String indirizzo;
    private String codiceFiscaleAnagrafica;
    private int nStanze;
    private String descrizione;
    private int agibile;

    /**
     * Costruttore vuoto
     * Inizializza nStanze = 0
     */
    public Struttura() {
        nStanze = 0;
    }

    /**
     * Restituisce l'indirizzo della struttura
     * @return indirizzo
     */
    public String getIndirizzo() {
        return indirizzo;
    }

    /**
     * Setta l'indirizzo della struttura
     * @param indirizzo
     */
    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    /**
     * Restituisce il codice fiscale del proprietario della struttura
     * @return codice fiscale
     */
    public String getCodiceFiscaleAnagrafica() {
        return codiceFiscaleAnagrafica;
    }

    /**
     * Setta il codice fiscale del proprietario
     * @param codiceFiscaleAnagrafica
     */
    public void setCodiceFiscaleAnagrafica(String codiceFiscaleAnagrafica) {
        this.codiceFiscaleAnagrafica = codiceFiscaleAnagrafica;
    }

    /**
     * Restituisce la descrizione della struttura
     * @return descrizione
     */
    public String getDescrizione() {
        return descrizione;
    }

    /**
     * Setta la descrizione della struttura
     * @param descrizione
     */
    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    /**
     * Restituisce il nome della struttura
     * @return nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * Setta il nome della struttura
     * @param nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Restituisce un intero che indica se la struttura è agibile oppure no
     * @return
     */
    public int getAgibile() {
        return agibile;
    }

    /**
     * Setta un intero che indica se la struttura è agibile oppure no
     * @param agibile
     */
    public void setAgibile(int agibile) {
        this.agibile = agibile;
    }

    /**
     * Restituisce il numero di stanze presenti nella struttura
     * @return numero stanze
     */
    public int getnStanze() {
        return nStanze;
    }

    /**
     * Setta il numero di stanze presenti nella struttura
     * @param nStanze 
     */
    public void setnStanze(int nStanze) {
        this.nStanze = nStanze;
    }
    
}
