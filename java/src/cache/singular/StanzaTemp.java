
package cache.singular;

import entities.Stanza;


public class StanzaTemp {
    
    private static Stanza istanza;

    public static Stanza getIstanza() {
        if(istanza == null)
            istanza = new Stanza();
        return istanza;
    }

    public static void setIstanza(Stanza istanza) {
        StanzaTemp.istanza = istanza;
    }
    
    
}
