package cache;

import java.util.HashMap;

/**
 * Gestore dell'Application Cache
 * @author ScumpinatoS
 */
public class CacheManager extends HashMap<String, Object> {

    /**
     * Costante che identifica la struttura ListaAngrafica
     */
    public static final String LISTA_ANAGRAFICE = "lista_anagrafica";

    /**
     * Costante che identifica la struttura ListaAngraficaMansione
     */
    public static final String LISTA_ANAGRAFICE_MANSIONE = "lista_anagrafica_mansione";

    /**
     *
     */
    public static final String LISTA_ANAGRAFICE_STANZA = "lista_anagrafica_stanza";

    /**
     * Costante che identifica la struttura ListaNazionalita
     */
    public static final String LISTA_NAZIONALITA = "lista_nazionalita";

    /**
     * Costante che identifica la struttura ListaOperazioni
     */
    public static final String LISTA_OPERAZIONI = "lista_operazioni";

    /**
     * Costante che identifica la struttura ListaStanze
     */
    public static final String LISTA_STANZE = "lista_stanze";

    /**
     * Costante che identifica la struttura ListaStrutture
     */
    public static final String LISTA_STRUTTURE = "lista_strutture";

    /**
     * Costante che identifica l'Anagrafica Mansione
     */
    public static final String ANAGRAFICA_MANSIONE = "anagrafica_mansione";

    /**
     * Costante che identifica l'Anagrafica Stanza
     */
    public static final String ANAGRAFICA_STANZA = "anagrafica_stanza";

    /**
     * Costante che identifica l'Anagrafica
     */
    public static final String ANAGRAFICA = "anagrafica";

    /**
     * Costante che identifica la stanza
     */
    public static final String STANZA = "stanza";

    /**
     * Costante che identifica la Struttura
     */
    public static final String STRUTTURA = "struttura";

    /**
     * Costante che identifica l'utente
     */
    public static final String UTENTE = "utente";
    
    
    private static CacheManager istanza;

    /**
     * Costruttore della classe. Utilizza il pattern singleton.
     * @return
     */
    public static CacheManager getIstanza() {
        if (istanza == null) {
            istanza = new CacheManager();
        }
        return istanza;
    }

    private CacheManager() {
    }

}
