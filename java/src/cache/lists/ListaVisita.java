
package cache.lists;

import entities.Visita;
import java.util.ArrayList;


public class ListaVisita extends ArrayList<Visita> {
    
    private static ListaVisita istanza;

    public static ListaVisita getIstanza() {
        if(istanza == null)
            istanza = new ListaVisita();
        return istanza;
    }

    public static void setIstanza(ListaVisita istanza) {
        ListaVisita.istanza = istanza;
    }
    
    
}
