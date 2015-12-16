
package cache.lists;

import entities.Anagrafica;
import java.util.ArrayList;

/**
 * Cache relativa alla lista delle anagrafiche
 * @author emanuelegargiulo
 */
public class ListaAnagrafica extends ArrayList<Anagrafica> {
    
    private static ListaAnagrafica istanza;

    /**
     * Restituisce l'istanza di ListaAnagrafica
     * @return istanza
     */
    public static ListaAnagrafica getIstanza() {
        if(istanza == null)
            istanza = new ListaAnagrafica();
        return istanza;
    }

    /**
     * Setta l'istanza di ListaAnagrafica
     * @param istanza
     */
    public static void setIstanza(ListaAnagrafica istanza) {
        ListaAnagrafica.istanza = istanza;
    }
    
    
}
