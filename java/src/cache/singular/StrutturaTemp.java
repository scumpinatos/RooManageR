
package cache.singular;

import entities.Struttura;

/**
 * Cache contenente una struttura
 * @author emanuelegargiulo
 */
public class StrutturaTemp {
    
    private static Struttura istanza;

    /**
     * Restituisce la struttura in cache
     * @return istanza
     */
    public static Struttura getIstanza() {
        if(istanza == null)
            istanza = new Struttura();
        return istanza;
    }

    /**
     * Setta la struttura in cache
     * @param istanza
     */
    public static void setIstanza(Struttura istanza) {
        StrutturaTemp.istanza = istanza;
    }
    
    
}
