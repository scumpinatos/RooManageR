
package utils;

import entities.Struttura;
import java.util.ArrayList;

/**
 * Questa classe implementa e salva in memoria una lista di oggetti Stanza
 * @author emanuelegargiulo
 * @author giandomenicoizzo
 */
public class ListaStruttura extends ArrayList<Struttura> {
 
    private static ListaStruttura istanza;

    /**
     * Restituisce la lista delle strutture
     * @return istanza
     */
    public static ListaStruttura getIstanza() {
        if(istanza == null)
            istanza = new ListaStruttura();
        return istanza;
    }

    /**
     * Setta l'istanza della lista delle strutture
     * @param istanza
     */
    public static void setIstanza(ListaStruttura istanza) {
        ListaStruttura.istanza = istanza;
    }
}
