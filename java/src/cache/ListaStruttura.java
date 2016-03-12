
package cache;

import entities.Struttura;
import java.util.ArrayList;

/**
 * Cache contenente la lista delle strutture
 * @author emanuelegargiulo
 */
public class ListaStruttura extends ArrayList<Struttura> {
 
    private static ListaStruttura istanza;

    /**
     * Restituisce la lista delle strutture
     * @return istanza
     */
    public static ListaStruttura getIstanza() {
        if(istanza == null)
            istanza = new ListaStruttura();
        return istanza;
    }

    /**
     * Setta l'istanza della lista delle strutture
     * @param istanza
     */
    public static void setIstanza(ListaStruttura istanza) {
        ListaStruttura.istanza = istanza;
    }
}
