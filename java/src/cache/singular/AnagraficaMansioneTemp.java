
package cache.singular;

import entities.AnagraficaMansione;


public class AnagraficaMansioneTemp {
    
    private static AnagraficaMansione istanza;

    public static AnagraficaMansione getIstanza() {
        if(istanza == null)
            istanza = new AnagraficaMansione();
        return istanza;
    }

    public static void setIstanza(AnagraficaMansione istanza) {
        AnagraficaMansioneTemp.istanza = istanza;
    }

    
}
