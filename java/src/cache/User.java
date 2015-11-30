
package cache;

import entities.Anagrafica;
import entities.AnagraficaMansione;

/**
 *
 * @author giandomenico
 */
public class User {

    private static User istanza;
    private AnagraficaMansione utente;
    private Anagrafica infoUtente;

    private User() {
    }

    public static User getInstance() {
        if (istanza == null) {
            istanza = new User();
        }

        return istanza;
    }

    public AnagraficaMansione getUtente() {
        return utente;
    }

    public void setUtente(AnagraficaMansione utente) {
        this.utente = utente;
    }

    public Anagrafica getInfoUtente() {
        return infoUtente;
    }

    public void setInfoUtente(Anagrafica infoUtente) {
        this.infoUtente = infoUtente;
    }

}
