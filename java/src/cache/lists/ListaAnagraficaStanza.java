
package cache.lists;

import entities.AnagraficaStanza;
import java.util.ArrayList;


public class ListaAnagraficaStanza extends ArrayList<AnagraficaStanza> {
    
    private static ListaAnagraficaStanza istanza;

    public static ListaAnagraficaStanza getIstanza() {
        if(istanza == null)
            istanza = new ListaAnagraficaStanza();
        return istanza;
    }

    public static void setIstanza(ListaAnagraficaStanza istanza) {
        ListaAnagraficaStanza.istanza = istanza;
    }
    
    
}
