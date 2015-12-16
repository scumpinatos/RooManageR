
package cache.lists;

import entities.AnagraficaMansione;
import java.util.ArrayList;

/**
 * Cache contenente la lista delle anagrafiche delle mansioni
 * @author emanuelegargiulo
 */
public class ListaAnagraficaMansione extends ArrayList<AnagraficaMansione> {
    
    private static ListaAnagraficaMansione istanza;

    /**
     * Restituisce le anagrafiche mansione
     * @return istanza
     */
    public static ListaAnagraficaMansione getIstanza() {
        if(istanza == null)
            istanza = new ListaAnagraficaMansione();
        return istanza;
    }

    /**
     * Imposta le anagrafiche mansione
     * @param istanza
     */
    public static void setIstanza(ListaAnagraficaMansione istanza) {
        ListaAnagraficaMansione.istanza = istanza;
    }
    
    
}
