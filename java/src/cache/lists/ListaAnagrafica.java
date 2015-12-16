
package cache.lists;

import entities.Anagrafica;
import java.util.ArrayList;

/**
 * Cache contenente la lista delle anagrafiche
 * @author emanuelegargiulo
 */
public class ListaAnagrafica extends ArrayList<Anagrafica> {
    
    private static ListaAnagrafica istanza;

    /**
     * Restituisce la lista di anagrafiche
     * @return istanza
     */
    public static ListaAnagrafica getIstanza() {
        if(istanza == null)
            istanza = new ListaAnagrafica();
        return istanza;
    }

    /**
     * Setta la lista di anagrafiche
     * @param istanza
     */
    public static void setIstanza(ListaAnagrafica istanza) {
        ListaAnagrafica.istanza = istanza;
    }
    
    
}
