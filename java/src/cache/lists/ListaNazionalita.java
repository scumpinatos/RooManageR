
package cache.lists;

import entities.Nazionalita;
import java.util.ArrayList;


public class ListaNazionalita extends ArrayList<Nazionalita> {
    
    private static ListaNazionalita istanza;

    public static ListaNazionalita getIstanza() {
        if(istanza == null)
            istanza = new ListaNazionalita();
        return istanza;
    }

    public static void setIstanza(ListaNazionalita istanza) {
        ListaNazionalita.istanza = istanza;
    }
    
}
