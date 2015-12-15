package cache.lists;

import entities.Stanza;
import java.util.ArrayList;

public class ListaStanza extends ArrayList<Stanza> {
    
    private static ListaStanza istanza;

    public static ListaStanza getIstanza() {
        if(istanza == null)
            istanza = new ListaStanza();
        return istanza;
    }

    public static void setIstanza(ListaStanza istanza) {
        ListaStanza.istanza = istanza;
    }
}
