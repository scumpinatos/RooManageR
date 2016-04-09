
package entities;

/**
 * Classe che implementa la nazionalita' di un'Anagrafica
 * @author emanuelegargiulo
 * @author giandomenicoizzo
 */
public class Nazionalita {
    
    private String abbreviazione;
    private String valore;

    /**
     * Costruttore vuota
     */
    public Nazionalita() {
    }

    /**
     * Restituisce la sigla che indica la nazionalità
     * @return abbreviazione
     */
    public String getAbbreviazione() {
        return abbreviazione;
    }

    /**
     * Setta la sigla che indica la nazionalità
     * @param abbreviazione
     */
    public void setAbbreviazione(String abbreviazione) {
        this.abbreviazione = abbreviazione;
    }

    /**
     * Restituisce la nazionalità in esteso
     * @return valore
     */
    public String getValore() {
        return valore;
    }

    /**
     * Setta la nazionalità in esteso
     * @param valore
     */
    public void setValore(String valore) {
        this.valore = valore;
    }
    
}
