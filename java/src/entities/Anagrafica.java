
package entities;

/**
 * Classe che implementa l'entita' Anagrafica 
 * @author emanuelegargiulo
 * @author giandomenicoizzo
 */
public class Anagrafica {
    
    private String codiceFiscale;
    private String nome;
    private String cognome;
    private String dataNascita;
    private String indirizzo;
    private String nazionalita;
    private String numeroDocumento;
    private int tipoDocumento;
    private String telefono;
    private String cellulare;
    private String email;

    /**
     * Costruttore vuoto
     */
    public Anagrafica() {
    }

    /**
     * Restituisce il codice fiscale dell'anagrafica
     * @return codice fiscale
     */
    public String getCodiceFiscale() {
        return codiceFiscale;
    }

    /**
     * Setta il codice fiscale dell'anagrafica
     * @param codiceFiscale
     */
    public void setCodiceFiscale(String codiceFiscale) {
        this.codiceFiscale = codiceFiscale;
    }

    /**
     * Restituisce il nome dell'anagrafica
     * @return nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * Setta il nome dell'anagrafica
     * @param nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Restituisce il cognome dell'anagrafica
     * @return cognome
     */
    public String getCognome() {
        return cognome;
    }

    /**
     * Setta il cognome dell'anagrafica
     * @param cognome
     */
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    /**
     * Restituisce la data di nascita dell'anagrafica
     * @return data di nascita
     */
    public String getDataNascita() {
        return dataNascita;
    }

    /**
     * Setta la data di nascita dell'anagrafica
     * @param dataNascita
     */
    public void setDataNascita(String dataNascita) {
        this.dataNascita = dataNascita;
    }

    /**
     * Restituisce l'indirizzo dell'anagrafica
     * @return indirizzo
     */
    public String getIndirizzo() {
        return indirizzo;
    }

    /**
     * Setta l'indirizzo dell'anagrafica
     * @param indirizzo
     */
    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    /**
     * Restituisce la nazionalità dell'anagrafica
     * @return nazionalita
     */
    public String getNazionalita() {
        return nazionalita;
    }

    /**
     * Setta la nazionalita dell'anagrafica
     * @param nazionalita
     */
    public void setNazionalita(String nazionalita) {
        this.nazionalita = nazionalita;
    }

    /**
     * Restituisce il numero del documento dell'anagrafica
     * @return numero documento
     */
    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    /**
     * Setta il numero del documento dell'anagrafica
     * @param numeroDocumento
     */
    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    /**
     * Restituisce il tipo di documento dell'anagrafica
     * @return tipo documento
     */
    public int getTipoDocumento() {
        return tipoDocumento;
    }

    /**
     * Setta il tipo di documento dell'anagrafica
     * @param tipoDocumento
     */
    public void setTipoDocumento(int tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    /**
     * Restituisce il numero di telefono dell'anagrafica
     * @return telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Setta il numero di telefono dell'anagrafica
     * @param telefono
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * Restituisce il numero di cellulare dell'anagrafica
     * @return cellulare
     */
    public String getCellulare() {
        return cellulare;
    }

    /**
     * Setta il numero di cellulare dell'anagrafica
     * @param cellulare
     */
    public void setCellulare(String cellulare) {
        this.cellulare = cellulare;
    }

    /**
     * Restituisce l'email dell'anagrafica
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Setta l'email dell'anagrafica
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

}
