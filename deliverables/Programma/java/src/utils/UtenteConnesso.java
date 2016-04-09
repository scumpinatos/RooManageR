
package utils;

import entities.Anagrafica;
import entities.AnagraficaMansione;

/**
 * Questa implementa e salva in memoria un oggetto contenente le informazioni dell'utente connesso
 * @author emanuelegargiulo
 * @author giandomenicoizzo
 */
public class UtenteConnesso {

    private static AnagraficaMansione utente;
    private static Anagrafica infoUtente;
    
    /**
     * Restituisce l'oggetto AnagraficaMansione legato all'utente connesso
     * @return utente
     */
    public static AnagraficaMansione getUtente() {
        if(utente == null)
            utente = new AnagraficaMansione();
        return utente;
    }

    /**
     * Setta l'oggetto AnagraficaMansione legato all'utente connesso
     * @param input
     */
    public static void setUtente(AnagraficaMansione input) {
        utente = input;
    }

    /**
     * Restituisce l'oggetto Anagrafica legato all'utente connesso
     * @return infoUtente
     */
    public static Anagrafica getInfoUtente() {
        if(infoUtente == null)
            infoUtente = new Anagrafica();
        return infoUtente;
    }

    /**
     * Setta l'oggetto Anagrafica legato all'utente connesso
     * @param input
     */
    public static void setInfoUtente(Anagrafica input) {
        infoUtente = input;
    }

}
