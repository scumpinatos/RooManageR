
package cache.lists;

import entities.Anagrafica;
import java.util.ArrayList;


public class ListaAnagrafica extends ArrayList<Anagrafica> {
    
    private static ListaAnagrafica istanza;

    public static ListaAnagrafica getIstanza() {
        if(istanza == null)
            istanza = new ListaAnagrafica();
        return istanza;
    }

    public static void setIstanza(ListaAnagrafica istanza) {
        ListaAnagrafica.istanza = istanza;
    }
    
    
}
