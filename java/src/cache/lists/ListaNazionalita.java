
package cache.lists;

import entities.Nazionalita;
import java.util.ArrayList;

/**
 * Cache contenente la lista delle nazionalità
 * @author emanuelegargiulo
 */
public class ListaNazionalita extends ArrayList<Nazionalita> {
    
    private static ListaNazionalita istanza;

    /**
     * Restituisce la lista delle nazionalità
     * @return istanza
     */
    public static ListaNazionalita getIstanza() {
        if(istanza == null)
            istanza = new ListaNazionalita();
        return istanza;
    }

    /**
     * Setta l'istanza della lista delle nazionalità
     * @param istanza
     */
    public static void setIstanza(ListaNazionalita istanza) {
        ListaNazionalita.istanza = istanza;
    }
    
}
