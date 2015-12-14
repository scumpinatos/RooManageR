
package cache.lists;

import entities.Struttura;
import java.util.ArrayList;

public class ListaStruttura extends ArrayList<Struttura> {
 
    private static ListaStruttura istanza;

    public static ListaStruttura getIstanza() {
        if(istanza == null)
            istanza = new ListaStruttura();
        return istanza;
    }

    public static void setIstanza(ListaStruttura istanza) {
        ListaStruttura.istanza = istanza;
    }
}
