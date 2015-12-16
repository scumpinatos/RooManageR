package cache.lists;

import entities.Stanza;
import java.util.ArrayList;

/**
 * Cache relativa alla lista delle stanze
 * @author emanuelegargiulo
 */
public class ListaStanza extends ArrayList<Stanza> {
    
    private static ListaStanza istanza;

    /**
     * Restituisce l'istanza della lista delle stanze
     * @return istanza
     */
    public static ListaStanza getIstanza() {
        if(istanza == null)
            istanza = new ListaStanza();
        return istanza;
    }

    /**
     * Setta l'istanza della lista delle stanze
     * @param istanza
     */
    public static void setIstanza(ListaStanza istanza) {
        ListaStanza.istanza = istanza;
    }
}
