
package cache.singular;

import entities.AnagraficaStanza;

public class AnagraficaStanzaTemp {

    private static AnagraficaStanza istanza;

    public static AnagraficaStanza getIstanza() {
        if(istanza == null)
            istanza = new AnagraficaStanza();
        return istanza;
    }

    public static void setIstanza(AnagraficaStanza istanza) {
        AnagraficaStanzaTemp.istanza = istanza;
    }
    
    
}
