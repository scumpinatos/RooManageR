
package cache.lists;

import entities.AnagraficaStanza;
import java.util.ArrayList;

/**
 * Cache contenente la lista delle anagrafiche delle varie stanze
 * @author emanuelegargiulo
 */
public class ListaAnagraficaStanza extends ArrayList<AnagraficaStanza> {
    
    private static ListaAnagraficaStanza istanza;

    /**
     * Restituisce la lista delle anagrafiche relative alle stanze
     * @return istanza
     */
    public static ListaAnagraficaStanza getIstanza() {
        if(istanza == null)
            istanza = new ListaAnagraficaStanza();
        return istanza;
    }

    /**
     * Setta l'istanza della lista delle anagrafiche relative alle stanze
     * @param istanza
     */
    public static void setIstanza(ListaAnagraficaStanza istanza) {
        ListaAnagraficaStanza.istanza = istanza;
    }
    
    
}
