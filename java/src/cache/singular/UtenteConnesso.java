
package cache.singular;

import entities.Anagrafica;
import entities.AnagraficaMansione;


public class UtenteConnesso {

    private static AnagraficaMansione utente;
    private static Anagrafica infoUtente;
    

    public static AnagraficaMansione getUtente() {
        if(utente == null)
            utente = new AnagraficaMansione();
        return utente;
    }

    public static void setUtente(AnagraficaMansione input) {
        utente = input;
    }

    public static Anagrafica getInfoUtente() {
        if(infoUtente == null)
            infoUtente = new Anagrafica();
        return infoUtente;
    }

    public static void setInfoUtente(Anagrafica input) {
        infoUtente = input;
    }

}
