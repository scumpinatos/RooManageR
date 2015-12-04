package cache;

import entities.Stanza;
import java.util.ArrayList;

public class ListaStanze extends ArrayList<Stanza> {
    
    private static ListaStanze istanza;
    

    private ListaStanze() {
    }

    public static ListaStanze getInstance() {
        if (istanza == null) {
            istanza = new ListaStanze();
        }

        return istanza;
    }

    public static void setIstanza(ListaStanze istanza) {
        ListaStanze.istanza = istanza;
    }
}
