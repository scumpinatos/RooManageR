
package cache.singular;

import entities.Anagrafica;
import entities.AnagraficaMansione;

/**
 * Cache contenente l'anagrafica dell'utente connesso
 * @author emanuelegargiulo
 */
public class UtenteConnesso {

    private static AnagraficaMansione utente;
    private static Anagrafica infoUtente;
    
    /**
     * Restituisce l'utente connesso contenuto nella cache
     * @return utente
     */
    public static AnagraficaMansione getUtente() {
        if(utente == null)
            utente = new AnagraficaMansione();
        return utente;
    }

    /**
     * Setta l'utente nella cache
     * @param input
     */
    public static void setUtente(AnagraficaMansione input) {
        utente = input;
    }

    /**
     * Restituisce informazioni sull'utente contenuto in cache
     * @return infoUtente
     */
    public static Anagrafica getInfoUtente() {
        if(infoUtente == null)
            infoUtente = new Anagrafica();
        return infoUtente;
    }

    /**
     * Imposta le informazioni relative all'utente in cache
     * @param input
     */
    public static void setInfoUtente(Anagrafica input) {
        infoUtente = input;
    }

}
