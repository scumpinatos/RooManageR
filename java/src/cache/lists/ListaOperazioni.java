
package cache.lists;

import java.util.ArrayList;


public class ListaOperazioni extends ArrayList<String> {
    
    private static ListaOperazioni istanza;

    public static ListaOperazioni getListaOperazioni() {
        if(istanza == null)
            istanza = new ListaOperazioni();
        return istanza;
    }

    public static void setListaOperazioni(ListaOperazioni istanza) {
        ListaOperazioni.istanza = istanza;
    }

    
}
