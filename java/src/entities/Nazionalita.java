
package entities;

/**
 * Classe che rappresenta la nazionalita' di un'Anagrafica
 * @author emanuelegargiulo
 */
public class Nazionalita {
    
    private String abbreviazione;
    private String valore;

    /**
     *
     */
    public Nazionalita() {
    }

    /**
     *
     * @return
     */
    public String getAbbreviazione() {
        return abbreviazione;
    }

    /**
     *
     * @param abbreviazione
     */
    public void setAbbreviazione(String abbreviazione) {
        this.abbreviazione = abbreviazione;
    }

    /**
     *
     * @return
     */
    public String getValore() {
        return valore;
    }

    /**
     *
     * @param valore
     */
    public void setValore(String valore) {
        this.valore = valore;
    }
    
}
