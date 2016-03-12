
package cache;

import java.util.ArrayList;

/**
 * Cache contenente la lista delle operazioni
 * @author emanuelegargiulo
 */
public class ListaOperazioni extends ArrayList<String> {
    
    private static ListaOperazioni istanza;

    /**
     * Restituisce la lista delle operazioni
     * @return istanza
     */
    public static ListaOperazioni getListaOperazioni() {
        if(istanza == null)
            istanza = new ListaOperazioni();
        return istanza;
    }

    /**
     * Setta l'istanza della lista delle iperazioni
     * @param istanza
     */
    public static void setListaOperazioni(ListaOperazioni istanza) {
        ListaOperazioni.istanza = istanza;
    }

    
}
