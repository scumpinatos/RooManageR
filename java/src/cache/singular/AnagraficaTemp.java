
package cache.singular;

import entities.Anagrafica;

public class AnagraficaTemp {

    private static Anagrafica istanza;

    public static Anagrafica getIstanza() {
        if(istanza == null)
            istanza = new Anagrafica();
        return istanza;
    }

    public static void setIstanza(Anagrafica istanza) {
        AnagraficaTemp.istanza = istanza;
    }
    
    
}
