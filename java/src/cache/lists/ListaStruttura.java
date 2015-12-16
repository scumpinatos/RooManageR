
package cache.lists;

import entities.Struttura;
import java.util.ArrayList;

/**
 * Cache relativa alla lista delle strutture
 * @author emanuelegargiulo
 */
public class ListaStruttura extends ArrayList<Struttura> {
 
    private static ListaStruttura istanza;

    /**
     * Restituisce l'istanza della lista delle strutture
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
