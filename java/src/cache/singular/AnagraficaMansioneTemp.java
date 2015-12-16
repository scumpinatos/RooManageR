
package cache.singular;

import entities.AnagraficaMansione;

/**
 * Cache relativa all'anagrafica mansione che ha effettuato il login
 * @author emanuelegargiulo
 */
public class AnagraficaMansioneTemp {
    
    private static AnagraficaMansione istanza;

    /**
     * Restituisce l'anagrafica mansione che ha effettuato il login
     * @return istanza
     */
    public static AnagraficaMansione getIstanza() {
        if(istanza == null)
            istanza = new AnagraficaMansione();
        return istanza;
    }

    /**
     * Setta l'anagrafica mansione che ha effettuato il login
     * @param istanza
     */
    public static void setIstanza(AnagraficaMansione istanza) {
        AnagraficaMansioneTemp.istanza = istanza;
    }

    
}
