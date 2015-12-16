
package cache.singular;

import entities.Stanza;

/**
 * Cache di una stanza
 * @author emanuelegargiulo
 */
public class StanzaTemp {
    
    private static Stanza istanza;

    /**
     * Restituisce l'istanza della stanza in cache
     * @return istanza
     */
    public static Stanza getIstanza() {
        if(istanza == null)
            istanza = new Stanza();
        return istanza;
    }

    /**
     * Setta l'istanza della stanza in cache
     * @param istanza
     */
    public static void setIstanza(Stanza istanza) {
        StanzaTemp.istanza = istanza;
    }
    
    
}
