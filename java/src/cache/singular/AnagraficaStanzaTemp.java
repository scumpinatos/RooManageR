
package cache.singular;

import entities.AnagraficaStanza;

/**
 * Cache relativa all'anagrafica della stanza 
 * @author emanuelegargiulo
 */
public class AnagraficaStanzaTemp {

    private static AnagraficaStanza istanza;

    /**
     * Restituisce l'istanza dell'anagrafica della stanza
     * @return istanza
     */
    public static AnagraficaStanza getIstanza() {
        if(istanza == null)
            istanza = new AnagraficaStanza();
        return istanza;
    }

    /**
     * Setta l'istanza dell'anagrafica della stanza
     * @param istanza
     */
    public static void setIstanza(AnagraficaStanza istanza) {
        AnagraficaStanzaTemp.istanza = istanza;
    }
    
    
}
