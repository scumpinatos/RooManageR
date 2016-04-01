package utils;

import entities.Stanza;
import java.util.ArrayList;

/**
 * Questa classe implementa e salva in memoria una lista di oggetti Stanza
 * @author emanuelegargiulo
 * @author giandomenicoizzo
 */
public class ListaStanza extends ArrayList<Stanza> {
    
    private static ListaStanza istanza;

    /**
     * Restituisce la lista delle stanze
     * @return istanza
     */
    public static ListaStanza getIstanza() {
        if(istanza == null)
            istanza = new ListaStanza();
        return istanza;
    }

    /**
     * Setta l'istanza della lista delle stanze
     * @param istanza
     */
    public static void setIstanza(ListaStanza istanza) {
        ListaStanza.istanza = istanza;
    }
}
