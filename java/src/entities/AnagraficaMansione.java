
package entities;

/**
 * Classe che rappresenta l'associazione tra un'Anagrafica e la rispettiva mansione all'interno di una struttura
 * @author emanuelegargiulo
 */
public class AnagraficaMansione {
    
    private String codiceFiscaleAnagrafica;
    private String password;
    private String nomeStruttura;
    private String codiceFiscaleProprietario;
    private int tipoMansione;

    /**
     *
     */
    public AnagraficaMansione() {
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
    public String getPassword() {
        return password;
    }

    /**
     *
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
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
    public int getTipoMansione() {
        return tipoMansione;
    }

    /**
     *
     * @param tipoMansione
     */
    public void setTipoMansione(int tipoMansione) {
        this.tipoMansione = tipoMansione;
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
    
}
