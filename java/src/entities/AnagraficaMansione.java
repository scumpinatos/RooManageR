
package entities;

/**
 * Classe che implementa una mansione all'interno di una struttura
 * @author emanuelegargiulo
 * @author giandomenicoizzo
 */
public class AnagraficaMansione {
    
    private String codiceFiscaleAnagrafica;
    private String password;
    private String nomeStruttura;
    private String codiceFiscaleProprietario;
    private int tipoMansione;

    /**
     * Costrutture vuoto
     */
    public AnagraficaMansione() {
    }
    
    /**
     * Restituisce il codice fiscale dell'anagrafica che svolge la mansione
     * @return codice fiscale
     */
    public String getCodiceFiscaleAnagrafica() {
        return codiceFiscaleAnagrafica;
    }

    /**
     * Setta il codice fiscale dell'anagrafica che svolge la mansione
     * @param codiceFiscaleAnagrafica
     */
    public void setCodiceFiscaleAnagrafica(String codiceFiscaleAnagrafica) {
        this.codiceFiscaleAnagrafica = codiceFiscaleAnagrafica;
    }

    /**
     * Restituisce la password per accedere al programma scelta dall'anagrafica
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Setta la password scelta dall'utente
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Restituisce il nome della struttura in cui viene svolta la mansione
     * @return nome struttura
     */
    public String getNomeStruttura() {
        return nomeStruttura;
    }

    /**
     * Setta il nome della struttura in cui viene svolta la mansione
     * @param nomeStruttura
     */
    public void setNomeStruttura(String nomeStruttura) {
        this.nomeStruttura = nomeStruttura;
    }

    /**
     * Restituisce il tipo di mansione svolta
     * @return tipo mansione
     */
    public int getTipoMansione() {
        return tipoMansione;
    }

    /**
     * Setta il tipo di mansione svolta
     * @param tipoMansione
     */
    public void setTipoMansione(int tipoMansione) {
        this.tipoMansione = tipoMansione;
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
    
}
