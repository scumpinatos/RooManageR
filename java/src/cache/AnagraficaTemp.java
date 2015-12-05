
package cache;

import entities.Anagrafica;

public class AnagraficaTemp {

    private static AnagraficaTemp istanza;
    private static Anagrafica anagrafica;

    public static AnagraficaTemp getInstance() {
        if (istanza == null) {
            istanza = new AnagraficaTemp();
        }

        return istanza;
    }
    
    public void setAnagraficaTemp(Anagrafica anagrafica) {
        this.anagrafica = anagrafica;
    }
    
    public Anagrafica getAnagraficaTemp() {
        return anagrafica;
    }
}
