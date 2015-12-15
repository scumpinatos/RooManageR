
package entities;

/**
 * Questa Classe identifica l'entita' Anagrafica 
 * @author emanuelegargiulo
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
     *
     */
    public Anagrafica() {
    }

    /**
     * Ritorna il codice fiscale dell'anagrafica
     * @return String
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
     *
     * @return
     */
    public String getNome() {
        return nome;
    }

    /**
     *
     * @param nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     *
     * @return
     */
    public String getCognome() {
        return cognome;
    }

    /**
     *
     * @param cognome
     */
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    /**
     *
     * @return
     */
    public String getDataNascita() {
        return dataNascita;
    }

    /**
     *
     * @param dataNascita
     */
    public void setDataNascita(String dataNascita) {
        this.dataNascita = dataNascita;
    }

    /**
     *
     * @return
     */
    public String getIndirizzo() {
        return indirizzo;
    }

    /**
     *
     * @param indirizzo
     */
    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    /**
     *
     * @return
     */
    public String getNazionalita() {
        return nazionalita;
    }

    /**
     *
     * @param nazionalita
     */
    public void setNazionalita(String nazionalita) {
        this.nazionalita = nazionalita;
    }

    /**
     *
     * @return
     */
    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    /**
     *
     * @param numeroDocumento
     */
    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    /**
     *
     * @return
     */
    public int getTipoDocumento() {
        return tipoDocumento;
    }

    /**
     *
     * @param tipoDocumento
     */
    public void setTipoDocumento(int tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    /**
     *
     * @return
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     *
     * @param telefono
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     *
     * @return
     */
    public String getCellulare() {
        return cellulare;
    }

    /**
     *
     * @param cellulare
     */
    public void setCellulare(String cellulare) {
        this.cellulare = cellulare;
    }

    /**
     *
     * @return
     */
    public String getEmail() {
        return email;
    }

    /**
     *
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

}
