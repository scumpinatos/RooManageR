
package cache.singular;

import entities.Struttura;


public class StrutturaTemp {
    
    private static Struttura istanza;

    public static Struttura getIstanza() {
        if(istanza == null)
            istanza = new Struttura();
        return istanza;
    }

    public static void setIstanza(Struttura istanza) {
        StrutturaTemp.istanza = istanza;
    }
    
    
}
