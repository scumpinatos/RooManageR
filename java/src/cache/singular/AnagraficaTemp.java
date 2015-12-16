
package cache.singular;

import entities.Anagrafica;

/**
 * Cache di un'anagrafica
 * @author emanuelegargiulo
 */
public class AnagraficaTemp {

    private static Anagrafica istanza;

    /**
     * Restituisce l'istanza dell'anagrafica
     * @return istanza
     */
    public static Anagrafica getIstanza() {
        if(istanza == null)
            istanza = new Anagrafica();
        return istanza;
    }

    /**
     * Setta l'istanza dell'anagrafica
     * @param istanza
     */
    public static void setIstanza(Anagrafica istanza) {
        AnagraficaTemp.istanza = istanza;
    }
    
    
}
