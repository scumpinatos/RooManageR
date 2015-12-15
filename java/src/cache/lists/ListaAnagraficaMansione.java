
package cache.lists;

import entities.AnagraficaMansione;
import java.util.ArrayList;


public class ListaAnagraficaMansione extends ArrayList<AnagraficaMansione> {
    
    private static ListaAnagraficaMansione istanza;

    public static ListaAnagraficaMansione getIstanza() {
        if(istanza == null)
            istanza = new ListaAnagraficaMansione();
        return istanza;
    }

    public static void setIstanza(ListaAnagraficaMansione istanza) {
        ListaAnagraficaMansione.istanza = istanza;
    }
    
    
}
