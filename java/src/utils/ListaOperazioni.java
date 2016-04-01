
package utils;

import java.util.ArrayList;

/**
 * Questa classe implementa il registro di operazioni effettuate durante l'esecuzione del programma
 * @author emanuelegargiulo
 * @author giandomenicoizzo
 */
public class ListaOperazioni extends ArrayList<String> {
    
    private static ListaOperazioni istanza;

    /**
     * Restituisce la lista delle operazioni
     * @return istanza
     */
    public static ListaOperazioni getListaOperazioni() {
        if(istanza == null)
            istanza = new ListaOperazioni();
        return istanza;
    }

    /**
     * Setta l'istanza della lista delle operazioni
     * @param istanza
     */
    public static void setListaOperazioni(ListaOperazioni istanza) {
        ListaOperazioni.istanza = istanza;
    }

    
}
